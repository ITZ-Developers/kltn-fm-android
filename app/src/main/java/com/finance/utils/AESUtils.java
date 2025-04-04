package com.finance.utils;

import static java.util.Base64.*;

import android.os.Build;
import android.util.Base64;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import timber.log.Timber;

public class AESUtils {
    public static String encrypt(String secretKey, String inputStr, boolean zipEnable) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] inputBytes = inputStr.getBytes(StandardCharsets.UTF_8);
            byte[] outputBytes = cipher.doFinal(inputBytes);

            if(zipEnable){
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater();
                DeflaterOutputStream zip = new DeflaterOutputStream(stream, deflater);
                zip.write(outputBytes);
                zip.close();
                deflater.end();
                byte[] outDeflater = stream.toByteArray();
                return Base64.encodeToString(outDeflater, Base64.DEFAULT);
            }else{
                return Base64.encodeToString(outputBytes, Base64.DEFAULT);

            }
        } catch (Exception  ex) {
            Timber.d(ex);
        }
        return null;
    }

    public static String decrypt(String secretKey, String encryptedStr, boolean zipEnable) {
        if(encryptedStr == null){
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] decodedBytes = Base64.decode(encryptedStr, Base64.DEFAULT);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
//            Timber.d(e);
        }
        return null;
    }
    public static String decrypt(String secretKey, String encryptedStr) {
        if(encryptedStr == null){
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] decodedBytes = Base64.decode(encryptedStr, Base64.DEFAULT);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
//            Timber.d(e);
        }
        return null;
    }
    public static String decryptPadding5(String secretKey, String encryptedStr, boolean zipEnable) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] decodedBytes = Base64.decode(encryptedStr, Base64.DEFAULT);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Timber.d(e);
        }
        return null;
    }

    public SecretKey generateAESKey(int keysize) {
        try {
            if (Cipher.getMaxAllowedKeyLength("AES") < keysize) {
                // this may be an issue if unlimited crypto is not installed
                throw new InvalidParameterException("Key size of " + keysize + " not supported in this runtime");
            }
            final KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(keysize);
            return keyGen.generateKey();
        } catch (final NoSuchAlgorithmException e) {
            // AES functionality is a requirement for any Java SE runtime
            Timber.d(e);
            return null;
        }
    }

    public  SecretKey decodeBase64ToAESKey(final String encodedKey){
        try {
            // throws IllegalArgumentException - if src is not in valid Base64
            // scheme
            byte[] keyData = new byte[0];
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                keyData = getDecoder().decode(encodedKey);
            }
            final int keysize = keyData.length * Byte.SIZE;

            // this should be checked by a SecretKeyFactory, but that doesn't exist for AES
            switch (keysize) {
                case 128:
                case 192:
                case 256:
                    break;
                default:
                    throw new IllegalArgumentException("Invalid key size for AES: " + keysize);
            }
            if (Cipher.getMaxAllowedKeyLength("AES") < keysize) {
                // this may be an issue if unlimited crypto is not installed
                throw new IllegalArgumentException("Key size of " + keysize
                        + " not supported in this runtime");
            }

            // throws IllegalArgumentException - if key is empty
            return  new SecretKeySpec(keyData, "AES");
        } catch (final NoSuchAlgorithmException e) {
            // AES functionality is a requirement for any Java SE runtime
            Timber.d(e);
            return null;
        }
    }

    public  String encodeAESKeyToBase64(final SecretKey aesKey){
        if (!aesKey.getAlgorithm().equalsIgnoreCase("AES")) {
            throw new IllegalArgumentException("Not an AES key");
        }
        final byte[] keyData = aesKey.getEncoded();
        return Base64.encodeToString(keyData, Base64.DEFAULT);
    }

}
