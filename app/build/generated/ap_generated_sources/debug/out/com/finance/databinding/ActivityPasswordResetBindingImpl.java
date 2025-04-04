package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPasswordResetBindingImpl extends ActivityPasswordResetBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {8},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_content, 9);
        sViewsWithIds.put(R.id.tv_username, 10);
        sViewsWithIds.put(R.id.tv_email, 11);
        sViewsWithIds.put(R.id.layout_password, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editNewPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editNewPassword);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;
            // vm.password != null
            boolean vmPasswordJavaLangObjectNull = false;
            // vm.password
            androidx.databinding.ObservableField<java.lang.String> vmPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPassword = vm.password;

                vmPasswordJavaLangObjectNull = (vmPassword) != (null);
                if (vmPasswordJavaLangObjectNull) {




                    vmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editOtpandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.otp.get()
            //         is vm.otp.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editOtp);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;
            // vm.otp.get()
            java.lang.String vmOtpGet = null;
            // vm.otp != null
            boolean vmOtpJavaLangObjectNull = false;
            // vm.otp
            androidx.databinding.ObservableField<java.lang.String> vmOtp = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOtp = vm.otp;

                vmOtpJavaLangObjectNull = (vmOtp) != (null);
                if (vmOtpJavaLangObjectNull) {




                    vmOtp.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPasswordConfirmandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.passwordConfirm.get()
            //         is vm.passwordConfirm.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPasswordConfirm);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;
            // vm.passwordConfirm
            androidx.databinding.ObservableField<java.lang.String> vmPasswordConfirm = null;
            // vm.passwordConfirm != null
            boolean vmPasswordConfirmJavaLangObjectNull = false;
            // vm.passwordConfirm.get()
            java.lang.String vmPasswordConfirmGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPasswordConfirm = vm.passwordConfirm;

                vmPasswordConfirmJavaLangObjectNull = (vmPasswordConfirm) != (null);
                if (vmPasswordConfirmJavaLangObjectNull) {




                    vmPasswordConfirm.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityPasswordResetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityPasswordResetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[8]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            );
        this.btnSend.setTag(null);
        this.editNewPassword.setTag(null);
        this.editOtp.setTag(null);
        this.editPasswordConfirm.setTag(null);
        this.imgShowNewPassword.setTag(null);
        this.imgShowPassword.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback42 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback40 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback41 = new com.finance.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        layoutHeader.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutHeader.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.password.reset.ResetPasswordViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.password.reset.ResetPasswordActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.password.reset.ResetPasswordViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.password.reset.ResetPasswordActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutHeader.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmOtp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmIsShowPasswordCf((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeVmPasswordConfirm((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOtp(androidx.databinding.ObservableField<java.lang.String> VmOtp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowPasswordCf(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPasswordCf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPasswordConfirm(androidx.databinding.ObservableField<java.lang.String> VmPasswordConfirm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        android.graphics.drawable.Drawable vmIsShowPasswordCfImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = null;
        java.lang.String vmPasswordGet = null;
        java.lang.Boolean vmIsShowPasswordCfGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPassword = null;
        androidx.databinding.ObservableField<java.lang.String> vmOtp = null;
        java.lang.String vmPasswordConfirmGet = null;
        com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        android.graphics.drawable.Drawable vmIsShowPasswordImgShowNewPasswordAndroidDrawableIcEyeImgShowNewPasswordAndroidDrawableIcEyeOff = null;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPasswordCf = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet = false;
        com.finance.ui.password.reset.ResetPasswordActivity a = mA;
        java.lang.Boolean vmIsShowPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordConfirm = null;
        java.lang.String vmOtpGet = null;

        if ((dirtyFlags & 0x17eL) != 0) {


            if ((dirtyFlags & 0x142L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPassword
                        vmIsShowPassword = vm.isShowPassword;
                    }
                    updateRegistration(1, vmIsShowPassword);


                    if (vmIsShowPassword != null) {
                        // read vm.isShowPassword.get()
                        vmIsShowPasswordGet = vmIsShowPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordGet);
                if((dirtyFlags & 0x142L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordImgShowNewPasswordAndroidDrawableIcEyeImgShowNewPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowNewPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowNewPassword.getContext(), R.drawable.ic_eye_off)));
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.otp
                        vmOtp = vm.otp;
                    }
                    updateRegistration(2, vmOtp);


                    if (vmOtp != null) {
                        // read vm.otp.get()
                        vmOtpGet = vmOtp.get();
                    }
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.password;
                    }
                    updateRegistration(3, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPasswordCf
                        vmIsShowPasswordCf = vm.isShowPasswordCf;
                    }
                    updateRegistration(4, vmIsShowPasswordCf);


                    if (vmIsShowPasswordCf != null) {
                        // read vm.isShowPasswordCf.get()
                        vmIsShowPasswordCfGet = vmIsShowPasswordCf.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordCfGet);
                if((dirtyFlags & 0x150L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordCfImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye_off)));
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (vm != null) {
                        // read vm.passwordConfirm
                        vmPasswordConfirm = vm.passwordConfirm;
                    }
                    updateRegistration(5, vmPasswordConfirm);


                    if (vmPasswordConfirm != null) {
                        // read vm.passwordConfirm.get()
                        vmPasswordConfirmGet = vmPasswordConfirm.get();
                    }
            }
        }
        if ((dirtyFlags & 0x180L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnSend.setOnClickListener(mCallback42);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editNewPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editNewPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editOtp, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editOtpandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPasswordConfirm, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordConfirmandroidTextAttrChanged);
            this.imgShowNewPassword.setOnClickListener(mCallback40);
            this.imgShowPassword.setOnClickListener(mCallback41);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.reset_password));
            this.mboundView1.setOnClickListener(mCallback39);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editNewPassword, vmPasswordGet);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editOtp, vmOtpGet);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPasswordConfirm, vmPasswordConfirmGet);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowNewPassword, vmIsShowPasswordImgShowNewPasswordAndroidDrawableIcEyeImgShowNewPasswordAndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowPassword, vmIsShowPasswordCfImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.password.reset.ResetPasswordActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.resetPassword();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.reset.ResetPasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPasswordCf();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isShowPassword
        flag 2 (0x3L): vm.otp
        flag 3 (0x4L): vm.password
        flag 4 (0x5L): vm.isShowPasswordCf
        flag 5 (0x6L): vm.passwordConfirm
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
    flag mapping end*/
    //end
}