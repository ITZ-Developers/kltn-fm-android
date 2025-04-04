package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 9);
        sViewsWithIds.put(R.id.tv_subtitle, 10);
        sViewsWithIds.put(R.id.tv_tenant, 11);
        sViewsWithIds.put(R.id.tv_username, 12);
        sViewsWithIds.put(R.id.tv_email, 13);
        sViewsWithIds.put(R.id.layout_password, 14);
        sViewsWithIds.put(R.id.tv_forgot_password, 15);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback223;
    @Nullable
    private final android.view.View.OnClickListener mCallback221;
    @Nullable
    private final android.view.View.OnClickListener mCallback222;
    @Nullable
    private final android.view.View.OnClickListener mCallback220;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.login.LoginViewModel vm = mVm;
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
    private androidx.databinding.InverseBindingListener editTenantandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.tenantId.get()
            //         is vm.tenantId.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTenant);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.login.LoginViewModel vm = mVm;
            // vm.tenantId.get()
            java.lang.String vmTenantIdGet = null;
            // vm.tenantId
            androidx.databinding.ObservableField<java.lang.String> vmTenantId = null;
            // vm.tenantId != null
            boolean vmTenantIdJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTenantId = vm.tenantId;

                vmTenantIdJavaLangObjectNull = (vmTenantId) != (null);
                if (vmTenantIdJavaLangObjectNull) {




                    vmTenantId.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.username.get()
            //         is vm.username.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editUsername);
            // localize variables for thread safety
            // vm.username.get()
            java.lang.String vmUsernameGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.login.LoginViewModel vm = mVm;
            // vm.username
            androidx.databinding.ObservableField<java.lang.String> vmUsername = null;
            // vm.username != null
            boolean vmUsernameJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUsername = vm.username;

                vmUsernameJavaLangObjectNull = (vmUsername) != (null);
                if (vmUsernameJavaLangObjectNull) {




                    vmUsername.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[8]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            );
        this.btnSignin.setTag(null);
        this.editPassword.setTag(null);
        this.editTenant.setTag(null);
        this.editUsername.setTag(null);
        this.imgShowPassword.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback223 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback221 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback222 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback220 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.vm == variableId) {
            setVm((com.finance.ui.login.LoginViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.login.LoginActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.login.LoginViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.login.LoginActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmTenantId((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmUsername((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTenantId(androidx.databinding.ObservableField<java.lang.String> VmTenantId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUsername(androidx.databinding.ObservableField<java.lang.String> VmUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String vmPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPassword = null;
        com.finance.ui.login.LoginViewModel vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmTenantId = null;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        android.graphics.drawable.Drawable vmIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = null;
        java.lang.String vmUsernameGet = null;
        com.finance.ui.login.LoginActivity a = mA;
        java.lang.Boolean vmIsShowPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmUsername = null;
        java.lang.String vmTenantIdGet = null;

        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPassword
                        vmIsShowPassword = vm.isShowPassword;
                    }
                    updateRegistration(0, vmIsShowPassword);


                    if (vmIsShowPassword != null) {
                        // read vm.isShowPassword.get()
                        vmIsShowPasswordGet = vmIsShowPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordGet);
                if((dirtyFlags & 0x51L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye_off)));
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.tenantId
                        vmTenantId = vm.tenantId;
                    }
                    updateRegistration(1, vmTenantId);


                    if (vmTenantId != null) {
                        // read vm.tenantId.get()
                        vmTenantIdGet = vmTenantId.get();
                    }
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.password;
                    }
                    updateRegistration(2, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (vm != null) {
                        // read vm.username
                        vmUsername = vm.username;
                    }
                    updateRegistration(3, vmUsername);


                    if (vmUsername != null) {
                        // read vm.username.get()
                        vmUsernameGet = vmUsername.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnSignin.setOnClickListener(mCallback223);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTenant, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTenantandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editUsernameandroidTextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback220);
            this.mboundView5.setOnClickListener(mCallback221);
            this.mboundView7.setOnClickListener(mCallback222);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword, vmPasswordGet);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTenant, vmTenantIdGet);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editUsername, vmUsernameGet);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowPassword, vmIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.login.LoginViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.doLogin();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.login.LoginViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.login.LoginActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToForgetPassword();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.login.LoginActivity a = mA;



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
        flag 0 (0x1L): vm.isShowPassword
        flag 1 (0x2L): vm.tenantId
        flag 2 (0x3L): vm.password
        flag 3 (0x4L): vm.username
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
    flag mapping end*/
    //end
}