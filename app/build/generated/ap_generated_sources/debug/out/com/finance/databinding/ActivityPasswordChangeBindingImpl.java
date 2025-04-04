package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPasswordChangeBindingImpl extends ActivityPasswordChangeBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {12},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_username, 13);
        sViewsWithIds.put(R.id.tv_email, 14);
        sViewsWithIds.put(R.id.layout_password, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback132;
    @Nullable
    private final android.view.View.OnClickListener mCallback133;
    @Nullable
    private final android.view.View.OnClickListener mCallback134;
    @Nullable
    private final android.view.View.OnClickListener mCallback135;
    @Nullable
    private final android.view.View.OnClickListener mCallback131;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editNewPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.newPassword.get()
            //         is vm.newPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editNewPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;
            // vm.newPassword.get()
            java.lang.String vmNewPasswordGet = null;
            // vm.newPassword != null
            boolean vmNewPasswordJavaLangObjectNull = false;
            // vm.newPassword
            androidx.databinding.ObservableField<java.lang.String> vmNewPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmNewPassword = vm.newPassword;

                vmNewPasswordJavaLangObjectNull = (vmNewPassword) != (null);
                if (vmNewPasswordJavaLangObjectNull) {




                    vmNewPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editOldPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.oldPassword.get()
            //         is vm.oldPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editOldPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.oldPassword != null
            boolean vmOldPasswordJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;
            // vm.oldPassword.get()
            java.lang.String vmOldPasswordGet = null;
            // vm.oldPassword
            androidx.databinding.ObservableField<java.lang.String> vmOldPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOldPassword = vm.oldPassword;

                vmOldPasswordJavaLangObjectNull = (vmOldPassword) != (null);
                if (vmOldPasswordJavaLangObjectNull) {




                    vmOldPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.confirmNewPassword.get()
            //         is vm.confirmNewPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;
            // vm.confirmNewPassword != null
            boolean vmConfirmNewPasswordJavaLangObjectNull = false;
            // vm.confirmNewPassword.get()
            java.lang.String vmConfirmNewPasswordGet = null;
            // vm.confirmNewPassword
            androidx.databinding.ObservableField<java.lang.String> vmConfirmNewPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmConfirmNewPassword = vm.confirmNewPassword;

                vmConfirmNewPasswordJavaLangObjectNull = (vmConfirmNewPassword) != (null);
                if (vmConfirmNewPasswordJavaLangObjectNull) {




                    vmConfirmNewPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityPasswordChangeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityPasswordChangeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.Button) bindings[11]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[12]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            );
        this.btnConfirm.setTag(null);
        this.editNewPassword.setTag(null);
        this.editOldPassword.setTag(null);
        this.editPassword.setTag(null);
        this.imgShowOldPassword.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback132 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback133 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback134 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback135 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback131 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setVm((com.finance.ui.password.change.ChangePasswordViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.password.change.ChangePasswordActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.password.change.ChangePasswordViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.password.change.ChangePasswordActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
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
                return onChangeVmIsShowPasswordCf((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmNewPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmOldPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmConfirmNewPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmIsShowOldPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmIsShowPasswordCf(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPasswordCf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmNewPassword(androidx.databinding.ObservableField<java.lang.String> VmNewPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOldPassword(androidx.databinding.ObservableField<java.lang.String> VmOldPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmConfirmNewPassword(androidx.databinding.ObservableField<java.lang.String> VmConfirmNewPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowOldPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowOldPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        android.graphics.drawable.Drawable vmIsShowPasswordMboundView7AndroidDrawableIcEyeMboundView7AndroidDrawableIcEyeOff = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowOldPasswordGet = false;
        com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;
        java.lang.String vmOldPasswordGet = null;
        android.graphics.drawable.Drawable vmIsShowPasswordCfMboundView10AndroidDrawableIcEyeMboundView10AndroidDrawableIcEyeOff = null;
        android.graphics.drawable.Drawable vmIsShowOldPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPasswordCf = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet = false;
        com.finance.ui.password.change.ChangePasswordActivity a = mA;
        java.lang.String vmNewPasswordGet = null;
        java.lang.Boolean vmIsShowPasswordCfGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPassword = null;
        androidx.databinding.ObservableField<java.lang.String> vmNewPassword = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmOldPassword = null;
        androidx.databinding.ObservableField<java.lang.String> vmConfirmNewPassword = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowOldPassword = null;
        java.lang.Boolean vmIsShowPasswordGet = null;
        java.lang.String vmConfirmNewPasswordGet = null;
        java.lang.Boolean vmIsShowOldPasswordGet = null;

        if ((dirtyFlags & 0x2feL) != 0) {


            if ((dirtyFlags & 0x282L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPasswordCf
                        vmIsShowPasswordCf = vm.isShowPasswordCf;
                    }
                    updateRegistration(1, vmIsShowPasswordCf);


                    if (vmIsShowPasswordCf != null) {
                        // read vm.isShowPasswordCf.get()
                        vmIsShowPasswordCfGet = vmIsShowPasswordCf.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordCfGet);
                if((dirtyFlags & 0x282L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordCfMboundView10AndroidDrawableIcEyeMboundView10AndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordCfGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView10.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView10.getContext(), R.drawable.ic_eye_off)));
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPassword
                        vmIsShowPassword = vm.isShowPassword;
                    }
                    updateRegistration(2, vmIsShowPassword);


                    if (vmIsShowPassword != null) {
                        // read vm.isShowPassword.get()
                        vmIsShowPasswordGet = vmIsShowPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordGet);
                if((dirtyFlags & 0x284L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordMboundView7AndroidDrawableIcEyeMboundView7AndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.ic_eye_off)));
            }
            if ((dirtyFlags & 0x288L) != 0) {

                    if (vm != null) {
                        // read vm.newPassword
                        vmNewPassword = vm.newPassword;
                    }
                    updateRegistration(3, vmNewPassword);


                    if (vmNewPassword != null) {
                        // read vm.newPassword.get()
                        vmNewPasswordGet = vmNewPassword.get();
                    }
            }
            if ((dirtyFlags & 0x290L) != 0) {

                    if (vm != null) {
                        // read vm.oldPassword
                        vmOldPassword = vm.oldPassword;
                    }
                    updateRegistration(4, vmOldPassword);


                    if (vmOldPassword != null) {
                        // read vm.oldPassword.get()
                        vmOldPasswordGet = vmOldPassword.get();
                    }
            }
            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (vm != null) {
                        // read vm.confirmNewPassword
                        vmConfirmNewPassword = vm.confirmNewPassword;
                    }
                    updateRegistration(5, vmConfirmNewPassword);


                    if (vmConfirmNewPassword != null) {
                        // read vm.confirmNewPassword.get()
                        vmConfirmNewPasswordGet = vmConfirmNewPassword.get();
                    }
            }
            if ((dirtyFlags & 0x2c0L) != 0) {

                    if (vm != null) {
                        // read vm.isShowOldPassword
                        vmIsShowOldPassword = vm.isShowOldPassword;
                    }
                    updateRegistration(6, vmIsShowOldPassword);


                    if (vmIsShowOldPassword != null) {
                        // read vm.isShowOldPassword.get()
                        vmIsShowOldPasswordGet = vmIsShowOldPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowOldPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowOldPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowOldPasswordGet);
                if((dirtyFlags & 0x2c0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowOldPasswordGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowOldPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowOldPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowOldPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowOldPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowOldPassword.getContext(), R.drawable.ic_eye_off)));
            }
        }
        if ((dirtyFlags & 0x300L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnConfirm.setOnClickListener(mCallback135);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editNewPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editNewPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editOldPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editOldPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordandroidTextAttrChanged);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.change_password));
            this.mboundView1.setOnClickListener(mCallback131);
            this.mboundView3.setOnClickListener(mCallback132);
            this.mboundView6.setOnClickListener(mCallback133);
            this.mboundView9.setOnClickListener(mCallback134);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editNewPassword, vmNewPasswordGet);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editOldPassword, vmOldPasswordGet);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword, vmConfirmNewPasswordGet);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowOldPassword, vmIsShowOldPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView10, vmIsShowPasswordCfMboundView10AndroidDrawableIcEyeMboundView10AndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView7, vmIsShowPasswordMboundView7AndroidDrawableIcEyeMboundView7AndroidDrawableIcEyeOff);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showOldPassword();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPasswordCf();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.change.ChangePasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.changePassword();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.password.change.ChangePasswordActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isShowPasswordCf
        flag 2 (0x3L): vm.isShowPassword
        flag 3 (0x4L): vm.newPassword
        flag 4 (0x5L): vm.oldPassword
        flag 5 (0x6L): vm.confirmNewPassword
        flag 6 (0x7L): vm.isShowOldPassword
        flag 7 (0x8L): vm
        flag 8 (0x9L): a
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPasswordCf.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowOldPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowOldPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
    flag mapping end*/
    //end
}