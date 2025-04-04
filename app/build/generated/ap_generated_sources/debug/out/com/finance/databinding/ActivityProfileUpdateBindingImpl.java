package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileUpdateBindingImpl extends ActivityProfileUpdateBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(32);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {23},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_name, 24);
        sViewsWithIds.put(R.id.tv_address, 25);
        sViewsWithIds.put(R.id.tv_email, 26);
        sViewsWithIds.put(R.id.tv_username, 27);
        sViewsWithIds.put(R.id.tv_phone, 28);
        sViewsWithIds.put(R.id.tv_department, 29);
        sViewsWithIds.put(R.id.tv_password, 30);
        sViewsWithIds.put(R.id.layout_password, 31);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.RelativeLayout mboundView20;
    @NonNull
    private final android.widget.FrameLayout mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback148;
    @Nullable
    private final android.view.View.OnClickListener mCallback144;
    @Nullable
    private final android.view.View.OnClickListener mCallback152;
    @Nullable
    private final android.view.View.OnClickListener mCallback149;
    @Nullable
    private final android.view.View.OnClickListener mCallback145;
    @Nullable
    private final android.view.View.OnClickListener mCallback146;
    @Nullable
    private final android.view.View.OnClickListener mCallback150;
    @Nullable
    private final android.view.View.OnClickListener mCallback147;
    @Nullable
    private final android.view.View.OnClickListener mCallback151;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editDepartmentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.accountResponseFromIntent.get().department.name
            //         is vm.accountResponseFromIntent.get().department.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editDepartment);
            // localize variables for thread safety
            // vm.accountResponseFromIntent
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmAccountResponseFromIntent = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get() != null
            boolean vmAccountResponseFromIntentGetJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get()
            com.finance.data.model.api.response.account.AccountResponse vmAccountResponseFromIntentGet = null;
            // vm.accountResponseFromIntent.get().department
            com.finance.data.model.api.response.account.DepartmentResponse vmAccountResponseFromIntentDepartment = null;
            // vm.accountResponseFromIntent.get().department.name
            java.lang.String vmAccountResponseFromIntentDepartmentName = null;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.accountResponseFromIntent.get().department
            com.finance.data.model.api.response.account.DepartmentResponse vmAccountResponseFromIntentGetDepartment = null;
            // vm.accountResponseFromIntent != null
            boolean vmAccountResponseFromIntentJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get().department != null
            boolean vmAccountResponseFromIntentGetDepartmentJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmAccountResponseFromIntent = vm.accountResponseFromIntent;

                vmAccountResponseFromIntentJavaLangObjectNull = (vmAccountResponseFromIntent) != (null);
                if (vmAccountResponseFromIntentJavaLangObjectNull) {


                    vmAccountResponseFromIntentGet = vmAccountResponseFromIntent.get();

                    vmAccountResponseFromIntentGetJavaLangObjectNull = (vmAccountResponseFromIntentGet) != (null);
                    if (vmAccountResponseFromIntentGetJavaLangObjectNull) {


                        vmAccountResponseFromIntentGetDepartment = vmAccountResponseFromIntentGet.getDepartment();

                        vmAccountResponseFromIntentGetDepartmentJavaLangObjectNull = (vmAccountResponseFromIntentGetDepartment) != (null);
                        if (vmAccountResponseFromIntentGetDepartmentJavaLangObjectNull) {




                            vmAccountResponseFromIntentGetDepartment.setName(((java.lang.String) (callbackArg_0)));
                        }
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.accountResponseFromIntent.get().email
            //         is vm.accountResponseFromIntent.get().setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editEmail);
            // localize variables for thread safety
            // vm.accountResponseFromIntent
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmAccountResponseFromIntent = null;
            // vm.accountResponseFromIntent.get().email
            java.lang.String vmAccountResponseFromIntentEmail = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.accountResponseFromIntent.get() != null
            boolean vmAccountResponseFromIntentGetJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get()
            com.finance.data.model.api.response.account.AccountResponse vmAccountResponseFromIntentGet = null;
            // vm.accountResponseFromIntent != null
            boolean vmAccountResponseFromIntentJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmAccountResponseFromIntent = vm.accountResponseFromIntent;

                vmAccountResponseFromIntentJavaLangObjectNull = (vmAccountResponseFromIntent) != (null);
                if (vmAccountResponseFromIntentJavaLangObjectNull) {


                    vmAccountResponseFromIntentGet = vmAccountResponseFromIntent.get();

                    vmAccountResponseFromIntentGetJavaLangObjectNull = (vmAccountResponseFromIntentGet) != (null);
                    if (vmAccountResponseFromIntentGetJavaLangObjectNull) {




                        vmAccountResponseFromIntentGet.setEmail(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.profile.get().fullName
            //         is vm.profile.get().setFullName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.profile.get().fullName
            java.lang.String vmProfileFullName = null;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.profile.get()
            com.finance.data.model.api.request.account.UpdateProfileRequest vmProfileGet = null;
            // vm.profile.get() != null
            boolean vmProfileGetJavaLangObjectNull = false;
            // vm.profile != null
            boolean vmProfileJavaLangObjectNull = false;
            // vm.profile
            androidx.databinding.ObservableField<com.finance.data.model.api.request.account.UpdateProfileRequest> vmProfile = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProfile = vm.profile;

                vmProfileJavaLangObjectNull = (vmProfile) != (null);
                if (vmProfileJavaLangObjectNull) {


                    vmProfileGet = vmProfile.get();

                    vmProfileGetJavaLangObjectNull = (vmProfileGet) != (null);
                    if (vmProfileGetJavaLangObjectNull) {




                        vmProfileGet.setFullName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.profile.get().oldPassword
            //         is vm.profile.get().setOldPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.profile.get().oldPassword
            java.lang.String vmProfileOldPassword = null;
            // vm.profile.get()
            com.finance.data.model.api.request.account.UpdateProfileRequest vmProfileGet = null;
            // vm.profile.get() != null
            boolean vmProfileGetJavaLangObjectNull = false;
            // vm.profile != null
            boolean vmProfileJavaLangObjectNull = false;
            // vm.profile
            androidx.databinding.ObservableField<com.finance.data.model.api.request.account.UpdateProfileRequest> vmProfile = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProfile = vm.profile;

                vmProfileJavaLangObjectNull = (vmProfile) != (null);
                if (vmProfileJavaLangObjectNull) {


                    vmProfileGet = vmProfile.get();

                    vmProfileGetJavaLangObjectNull = (vmProfileGet) != (null);
                    if (vmProfileGetJavaLangObjectNull) {




                        vmProfileGet.setOldPassword(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.accountResponseFromIntent.get().phone
            //         is vm.accountResponseFromIntent.get().setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPhone);
            // localize variables for thread safety
            // vm.accountResponseFromIntent
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmAccountResponseFromIntent = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.accountResponseFromIntent.get() != null
            boolean vmAccountResponseFromIntentGetJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get()
            com.finance.data.model.api.response.account.AccountResponse vmAccountResponseFromIntentGet = null;
            // vm.accountResponseFromIntent != null
            boolean vmAccountResponseFromIntentJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get().phone
            java.lang.String vmAccountResponseFromIntentPhone = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmAccountResponseFromIntent = vm.accountResponseFromIntent;

                vmAccountResponseFromIntentJavaLangObjectNull = (vmAccountResponseFromIntent) != (null);
                if (vmAccountResponseFromIntentJavaLangObjectNull) {


                    vmAccountResponseFromIntentGet = vmAccountResponseFromIntent.get();

                    vmAccountResponseFromIntentGetJavaLangObjectNull = (vmAccountResponseFromIntentGet) != (null);
                    if (vmAccountResponseFromIntentGetJavaLangObjectNull) {




                        vmAccountResponseFromIntentGet.setPhone(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.accountResponseFromIntent.get().username
            //         is vm.accountResponseFromIntent.get().setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editUsername);
            // localize variables for thread safety
            // vm.accountResponseFromIntent
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmAccountResponseFromIntent = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
            // vm.accountResponseFromIntent.get() != null
            boolean vmAccountResponseFromIntentGetJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get()
            com.finance.data.model.api.response.account.AccountResponse vmAccountResponseFromIntentGet = null;
            // vm.accountResponseFromIntent != null
            boolean vmAccountResponseFromIntentJavaLangObjectNull = false;
            // vm.accountResponseFromIntent.get().username
            java.lang.String vmAccountResponseFromIntentUsername = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmAccountResponseFromIntent = vm.accountResponseFromIntent;

                vmAccountResponseFromIntentJavaLangObjectNull = (vmAccountResponseFromIntent) != (null);
                if (vmAccountResponseFromIntentJavaLangObjectNull) {


                    vmAccountResponseFromIntentGet = vmAccountResponseFromIntent.get();

                    vmAccountResponseFromIntentGetJavaLangObjectNull = (vmAccountResponseFromIntentGet) != (null);
                    if (vmAccountResponseFromIntentGetJavaLangObjectNull) {




                        vmAccountResponseFromIntentGet.setUsername(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityProfileUpdateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private ActivityProfileUpdateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[22]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[19]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (android.widget.ImageView) bindings[21]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[23]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[27]
            );
        this.btnUpdate.setTag(null);
        this.editAddress.setTag(null);
        this.editDepartment.setTag(null);
        this.editEmail.setTag(null);
        this.editName.setTag(null);
        this.editPassword.setTag(null);
        this.editPhone.setTag(null);
        this.editUsername.setTag(null);
        this.imgAvatar.setTag(null);
        this.imgShowPassword.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView20 = (android.widget.RelativeLayout) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView3 = (android.widget.FrameLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.pickBirthDay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback148 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback144 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback152 = new com.finance.generated.callback.OnClickListener(this, 9);
        mCallback149 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback145 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback146 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback150 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback147 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback151 = new com.finance.generated.callback.OnClickListener(this, 8);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setVm((com.finance.ui.fragment.account.update.UpdateProfileViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.account.update.UpdateProfileActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.account.update.UpdateProfileViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.account.update.UpdateProfileActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeVmProfile((androidx.databinding.ObservableField<com.finance.data.model.api.request.account.UpdateProfileRequest>) object, fieldId);
            case 2 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmAccountResponseFromIntent((androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse>) object, fieldId);
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
    private boolean onChangeVmProfile(androidx.databinding.ObservableField<com.finance.data.model.api.request.account.UpdateProfileRequest> VmProfile, int fieldId) {
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
    private boolean onChangeVmAccountResponseFromIntent(androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> VmAccountResponseFromIntent, int fieldId) {
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
        java.lang.String vmAccountResponseFromIntentEmail = null;
        com.finance.data.model.api.response.account.DepartmentResponse vmAccountResponseFromIntentDepartment = null;
        java.lang.String vmAccountResponseFromIntentDepartmentName = null;
        com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;
        boolean vmAccountResponseFromIntentBirthDateJavaLangObjectNull = false;
        java.lang.String dateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.request.account.UpdateProfileRequest> vmProfile = null;
        android.graphics.drawable.Drawable vmIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = null;
        com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;
        java.lang.String vmAccountResponseFromIntentUsername = null;
        java.lang.String vmAccountResponseFromIntentPhone = null;
        java.lang.String vmAccountResponseFromIntentBirthDate = null;
        com.finance.data.model.api.response.account.AccountResponse vmAccountResponseFromIntentGet = null;
        java.lang.String dateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPassword = null;
        java.lang.String vmProfileFullName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmAccountResponseFromIntent = null;
        java.lang.String vmAccountResponseFromIntentAddress = null;
        java.lang.Boolean vmIsShowPasswordGet = null;
        java.lang.String vmAccountResponseFromIntentBirthDateJavaLangObjectNullDateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDateJavaLangObjectNull = null;
        java.lang.String vmProfileOldPassword = null;
        com.finance.data.model.api.request.account.UpdateProfileRequest vmProfileGet = null;

        if ((dirtyFlags & 0x5eL) != 0) {


            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.profile
                        vmProfile = vm.profile;
                    }
                    updateRegistration(1, vmProfile);


                    if (vmProfile != null) {
                        // read vm.profile.get()
                        vmProfileGet = vmProfile.get();
                    }


                    if (vmProfileGet != null) {
                        // read vm.profile.get().fullName
                        vmProfileFullName = vmProfileGet.getFullName();
                        // read vm.profile.get().oldPassword
                        vmProfileOldPassword = vmProfileGet.getOldPassword();
                    }
            }
            if ((dirtyFlags & 0x54L) != 0) {

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
                if((dirtyFlags & 0x54L) != 0) {
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
            if ((dirtyFlags & 0x58L) != 0) {

                    if (vm != null) {
                        // read vm.accountResponseFromIntent
                        vmAccountResponseFromIntent = vm.accountResponseFromIntent;
                    }
                    updateRegistration(3, vmAccountResponseFromIntent);


                    if (vmAccountResponseFromIntent != null) {
                        // read vm.accountResponseFromIntent.get()
                        vmAccountResponseFromIntentGet = vmAccountResponseFromIntent.get();
                    }


                    if (vmAccountResponseFromIntentGet != null) {
                        // read vm.accountResponseFromIntent.get().email
                        vmAccountResponseFromIntentEmail = vmAccountResponseFromIntentGet.getEmail();
                        // read vm.accountResponseFromIntent.get().department
                        vmAccountResponseFromIntentDepartment = vmAccountResponseFromIntentGet.getDepartment();
                        // read vm.accountResponseFromIntent.get().username
                        vmAccountResponseFromIntentUsername = vmAccountResponseFromIntentGet.getUsername();
                        // read vm.accountResponseFromIntent.get().phone
                        vmAccountResponseFromIntentPhone = vmAccountResponseFromIntentGet.getPhone();
                        // read vm.accountResponseFromIntent.get().birthDate
                        vmAccountResponseFromIntentBirthDate = vmAccountResponseFromIntentGet.getBirthDate();
                        // read vm.accountResponseFromIntent.get().address
                        vmAccountResponseFromIntentAddress = vmAccountResponseFromIntentGet.getAddress();
                    }


                    if (vmAccountResponseFromIntentDepartment != null) {
                        // read vm.accountResponseFromIntent.get().department.name
                        vmAccountResponseFromIntentDepartmentName = vmAccountResponseFromIntentDepartment.getName();
                    }
                    // read vm.accountResponseFromIntent.get().birthDate != null
                    vmAccountResponseFromIntentBirthDateJavaLangObjectNull = (vmAccountResponseFromIntentBirthDate) != (null);
                if((dirtyFlags & 0x58L) != 0) {
                    if(vmAccountResponseFromIntentBirthDateJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                // read DateUtils.convertFromUTCToDefaultApi(vm.accountResponseFromIntent.get().birthDate)
                dateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate = com.finance.utils.DateUtils.convertFromUTCToDefaultApi(vmAccountResponseFromIntentBirthDate);


                // read DateUtils.getDayMonthYear(DateUtils.convertFromUTCToDefaultApi(vm.accountResponseFromIntent.get().birthDate))
                dateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate = com.finance.utils.DateUtils.getDayMonthYear(dateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate);
        }

        if ((dirtyFlags & 0x58L) != 0) {

                // read vm.accountResponseFromIntent.get().birthDate != null ? DateUtils.getDayMonthYear(DateUtils.convertFromUTCToDefaultApi(vm.accountResponseFromIntent.get().birthDate)) : null
                vmAccountResponseFromIntentBirthDateJavaLangObjectNullDateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDateJavaLangObjectNull = ((vmAccountResponseFromIntentBirthDateJavaLangObjectNull) ? (dateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDate) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnUpdate.setOnClickListener(mCallback152);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editDepartment, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editDepartmentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPhoneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editUsernameandroidTextAttrChanged);
            this.imgAvatar.setOnClickListener(mCallback146);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.profile_update));
            this.mboundView0.setOnClickListener(mCallback144);
            this.mboundView1.setOnClickListener(mCallback145);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, (" ") + (mboundView10.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, (" ") + (mboundView12.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, (" ") + (mboundView14.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, (" ") + (mboundView16.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, (" ") + (mboundView18.getResources().getString(R.string.asterisk)));
            this.mboundView20.setOnClickListener(mCallback151);
            this.mboundView3.setOnClickListener(mCallback147);
            this.mboundView4.setOnClickListener(mCallback148);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, (" ") + (mboundView5.getResources().getString(R.string.asterisk)));
            this.mboundView8.setOnClickListener(mCallback150);
            this.pickBirthDay.setOnClickListener(mCallback149);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editAddress, vmAccountResponseFromIntentAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editDepartment, vmAccountResponseFromIntentDepartmentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editEmail, vmAccountResponseFromIntentEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPhone, vmAccountResponseFromIntentPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editUsername, vmAccountResponseFromIntentUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pickBirthDay, vmAccountResponseFromIntentBirthDateJavaLangObjectNullDateUtilsGetDayMonthYearDateUtilsConvertFromUTCToDefaultApiVmAccountResponseFromIntentBirthDateJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editName, vmProfileFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword, vmProfileOldPassword);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowPassword, vmIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.updateProfile();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickBirthDay();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickBirthDay();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.update.UpdateProfileActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.update.UpdateProfileViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.profile
        flag 2 (0x3L): vm.isShowPassword
        flag 3 (0x4L): vm.accountResponseFromIntent
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 9 (0xaL): vm.accountResponseFromIntent.get().birthDate != null ? DateUtils.getDayMonthYear(DateUtils.convertFromUTCToDefaultApi(vm.accountResponseFromIntent.get().birthDate)) : null
        flag 10 (0xbL): vm.accountResponseFromIntent.get().birthDate != null ? DateUtils.getDayMonthYear(DateUtils.convertFromUTCToDefaultApi(vm.accountResponseFromIntent.get().birthDate)) : null
    flag mapping end*/
    //end
}