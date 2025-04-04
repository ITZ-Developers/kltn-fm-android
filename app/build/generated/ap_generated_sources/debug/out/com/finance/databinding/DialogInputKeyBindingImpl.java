package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogInputKeyBindingImpl extends DialogInputKeyBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout1, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of key.privateKey.get()
            //         is key.privateKey.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // key != null
            boolean keyJavaLangObjectNull = false;
            // key.privateKey != null
            boolean keyPrivateKeyJavaLangObjectNull = false;
            // key.privateKey
            androidx.databinding.ObservableField<java.lang.String> keyPrivateKey = null;
            // key.privateKey.get()
            java.lang.String keyPrivateKeyGet = null;
            // key
            com.finance.ui.dialog.InputKeyDialog key = mKey;



            keyJavaLangObjectNull = (key) != (null);
            if (keyJavaLangObjectNull) {


                keyPrivateKey = key.privateKey;

                keyPrivateKeyJavaLangObjectNull = (keyPrivateKey) != (null);
                if (keyPrivateKeyJavaLangObjectNull) {




                    keyPrivateKey.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of key.secretKey.get()
            //         is key.secretKey.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // key != null
            boolean keyJavaLangObjectNull = false;
            // key.secretKey
            androidx.databinding.ObservableField<java.lang.String> keySecretKey = null;
            // key
            com.finance.ui.dialog.InputKeyDialog key = mKey;
            // key.secretKey.get()
            java.lang.String keySecretKeyGet = null;
            // key.secretKey != null
            boolean keySecretKeyJavaLangObjectNull = false;



            keyJavaLangObjectNull = (key) != (null);
            if (keyJavaLangObjectNull) {


                keySecretKey = key.secretKey;

                keySecretKeyJavaLangObjectNull = (keySecretKey) != (null);
                if (keySecretKeyJavaLangObjectNull) {




                    keySecretKey.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogInputKeyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DialogInputKeyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.btnCancel.setTag(null);
        this.btnPassConfirm.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback51 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.key == variableId) {
            setKey((com.finance.ui.dialog.InputKeyDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKey(@Nullable com.finance.ui.dialog.InputKeyDialog Key) {
        this.mKey = Key;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.key);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeKeyPrivateKey((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeKeySecretKey((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeKeyPrivateKey(androidx.databinding.ObservableField<java.lang.String> KeyPrivateKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeKeySecretKey(androidx.databinding.ObservableField<java.lang.String> KeySecretKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> keyPrivateKey = null;
        androidx.databinding.ObservableField<java.lang.String> keySecretKey = null;
        boolean keyPrivateKeyJavaLangObjectNullKeyPrivateKeyEmptyBooleanFalse = false;
        boolean keyPrivateKeyJavaLangObjectNull = false;
        boolean keyPrivateKeyEmpty = false;
        boolean KeyPrivateKeyEmpty1 = false;
        java.lang.String keyPrivateKeyGet = null;
        com.finance.ui.dialog.InputKeyDialog key = mKey;
        java.lang.String keySecretKeyGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (key != null) {
                        // read key.privateKey
                        keyPrivateKey = key.privateKey;
                    }
                    updateRegistration(0, keyPrivateKey);


                    if (keyPrivateKey != null) {
                        // read key.privateKey.get()
                        keyPrivateKeyGet = keyPrivateKey.get();
                    }


                    // read key.privateKey.get() != null
                    keyPrivateKeyJavaLangObjectNull = (keyPrivateKeyGet) != (null);
                if((dirtyFlags & 0xdL) != 0) {
                    if(keyPrivateKeyJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (key != null) {
                        // read key.secretKey
                        keySecretKey = key.secretKey;
                    }
                    updateRegistration(1, keySecretKey);


                    if (keySecretKey != null) {
                        // read key.secretKey.get()
                        keySecretKeyGet = keySecretKey.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (keyPrivateKeyGet != null) {
                    // read key.privateKey.get().empty
                    keyPrivateKeyEmpty = keyPrivateKeyGet.isEmpty();
                }


                // read !key.privateKey.get().empty
                KeyPrivateKeyEmpty1 = !keyPrivateKeyEmpty;
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read key.privateKey.get() != null ? !key.privateKey.get().empty : false
                keyPrivateKeyJavaLangObjectNullKeyPrivateKeyEmptyBooleanFalse = ((keyPrivateKeyJavaLangObjectNull) ? (KeyPrivateKeyEmpty1) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback50);
            this.btnPassConfirm.setOnClickListener(mCallback51);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.btnPassConfirm.setEnabled(keyPrivateKeyJavaLangObjectNullKeyPrivateKeyEmptyBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, keyPrivateKeyGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, keySecretKeyGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // key != null
                boolean keyJavaLangObjectNull = false;
                // key
                com.finance.ui.dialog.InputKeyDialog key = mKey;



                keyJavaLangObjectNull = (key) != (null);
                if (keyJavaLangObjectNull) {


                    key.cancelInputKey();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // key != null
                boolean keyJavaLangObjectNull = false;
                // key
                com.finance.ui.dialog.InputKeyDialog key = mKey;



                keyJavaLangObjectNull = (key) != (null);
                if (keyJavaLangObjectNull) {


                    key.confirmInputKey();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): key.privateKey
        flag 1 (0x2L): key.secretKey
        flag 2 (0x3L): key
        flag 3 (0x4L): null
        flag 4 (0x5L): key.privateKey.get() != null ? !key.privateKey.get().empty : false
        flag 5 (0x6L): key.privateKey.get() != null ? !key.privateKey.get().empty : false
    flag mapping end*/
    //end
}