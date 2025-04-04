package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountBindingImpl extends FragmentAccountBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 19);
        sViewsWithIds.put(R.id.tv_title, 20);
        sViewsWithIds.put(R.id.layout_profile, 21);
        sViewsWithIds.put(R.id.img_account_icon, 22);
        sViewsWithIds.put(R.id.img_group_transaction, 23);
        sViewsWithIds.put(R.id.img_group_service, 24);
        sViewsWithIds.put(R.id.img_signin, 25);
        sViewsWithIds.put(R.id.img_tag, 26);
        sViewsWithIds.put(R.id.img_debit, 27);
        sViewsWithIds.put(R.id.img_organization, 28);
        sViewsWithIds.put(R.id.img_project, 29);
        sViewsWithIds.put(R.id.img_category, 30);
        sViewsWithIds.put(R.id.img_department, 31);
        sViewsWithIds.put(R.id.img_service, 32);
        sViewsWithIds.put(R.id.img_notification, 33);
        sViewsWithIds.put(R.id.img_change_password, 34);
        sViewsWithIds.put(R.id.img_request_key, 35);
        sViewsWithIds.put(R.id.img_signout, 36);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView18;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.RelativeLayout mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback188;
    @Nullable
    private final android.view.View.OnClickListener mCallback192;
    @Nullable
    private final android.view.View.OnClickListener mCallback189;
    @Nullable
    private final android.view.View.OnClickListener mCallback193;
    @Nullable
    private final android.view.View.OnClickListener mCallback186;
    @Nullable
    private final android.view.View.OnClickListener mCallback198;
    @Nullable
    private final android.view.View.OnClickListener mCallback199;
    @Nullable
    private final android.view.View.OnClickListener mCallback187;
    @Nullable
    private final android.view.View.OnClickListener mCallback191;
    @Nullable
    private final android.view.View.OnClickListener mCallback190;
    @Nullable
    private final android.view.View.OnClickListener mCallback196;
    @Nullable
    private final android.view.View.OnClickListener mCallback197;
    @Nullable
    private final android.view.View.OnClickListener mCallback185;
    @Nullable
    private final android.view.View.OnClickListener mCallback194;
    @Nullable
    private final android.view.View.OnClickListener mCallback200;
    @Nullable
    private final android.view.View.OnClickListener mCallback195;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvAccountEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.profile.get().email
            //         is vm.profile.get().setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvAccountEmail);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;
            // vm.profile.get()
            com.finance.data.model.api.response.account.AccountResponse vmProfileGet = null;
            // vm.profile.get() != null
            boolean vmProfileGetJavaLangObjectNull = false;
            // vm.profile != null
            boolean vmProfileJavaLangObjectNull = false;
            // vm.profile
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmProfile = null;
            // vm.profile.get().email
            java.lang.String vmProfileEmail = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProfile = vm.profile;

                vmProfileJavaLangObjectNull = (vmProfile) != (null);
                if (vmProfileJavaLangObjectNull) {


                    vmProfileGet = vmProfile.get();

                    vmProfileGetJavaLangObjectNull = (vmProfileGet) != (null);
                    if (vmProfileGetJavaLangObjectNull) {




                        vmProfileGet.setEmail(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvAccountFullNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.profile.get().fullName
            //         is vm.profile.get().setFullName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvAccountFullName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.profile.get().fullName
            java.lang.String vmProfileFullName = null;
            // vm
            com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;
            // vm.profile.get()
            com.finance.data.model.api.response.account.AccountResponse vmProfileGet = null;
            // vm.profile.get() != null
            boolean vmProfileGetJavaLangObjectNull = false;
            // vm.profile != null
            boolean vmProfileJavaLangObjectNull = false;
            // vm.profile
            androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmProfile = null;



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

    public FragmentAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private FragmentAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[22]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[20]
            );
        this.imgArrowRightLayoutProfile.setTag(null);
        this.layoutCategory.setTag(null);
        this.layoutChangePassword.setTag(null);
        this.layoutDebitManagement.setTag(null);
        this.layoutDepartment.setTag(null);
        this.layoutGroupService.setTag(null);
        this.layoutGroupTransaction.setTag(null);
        this.layoutLogout.setTag(null);
        this.layoutNotification.setTag(null);
        this.layoutOrganizationManagement.setTag(null);
        this.layoutProjectManagement.setTag(null);
        this.layoutRequestKey.setTag(null);
        this.layoutService.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView18 = (android.widget.ImageView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.tvAccountEmail.setTag(null);
        this.tvAccountFullName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback188 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback192 = new com.finance.generated.callback.OnClickListener(this, 8);
        mCallback189 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback193 = new com.finance.generated.callback.OnClickListener(this, 9);
        mCallback186 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback198 = new com.finance.generated.callback.OnClickListener(this, 14);
        mCallback199 = new com.finance.generated.callback.OnClickListener(this, 15);
        mCallback187 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback191 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback190 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback196 = new com.finance.generated.callback.OnClickListener(this, 12);
        mCallback197 = new com.finance.generated.callback.OnClickListener(this, 13);
        mCallback185 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback194 = new com.finance.generated.callback.OnClickListener(this, 10);
        mCallback200 = new com.finance.generated.callback.OnClickListener(this, 16);
        mCallback195 = new com.finance.generated.callback.OnClickListener(this, 11);
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
        if (BR.vm == variableId) {
            setVm((com.finance.ui.fragment.account.AccountFragmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.account.AccountFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.account.AccountFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.account.AccountFragment A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmProfile((androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmProfile(androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> VmProfile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST = false;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONDEBITLIST = null;
        int vmCheckPermissionConstantsPERMISSIONDEBITLISTViewVISIBLEViewGONE = 0;
        com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST = false;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONSERVICELIST = false;
        com.finance.ui.fragment.account.AccountFragment a = mA;
        int vmCheckPermissionConstantsPERMISSIONSERVICELISTViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONCATEGORYLIST = null;
        int vmCheckPermissionConstantsPERMISSIONDEPARTMENTLISTViewVISIBLEViewGONE = 0;
        int vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = false;
        java.lang.String vmProfileFullName = null;
        int vmCheckPermissionConstantsPERMISSIONTRANSACTIONLISTViewVISIBLEViewGONE = 0;
        int vmCheckPermissionConstantsPERMISSIONCATEGORYLISTViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONSERVICELIST = null;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONCATEGORYLIST = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.account.AccountResponse> vmProfile = null;
        int vmCheckPermissionConstantsPERMISSIONGROUPSERVICELISTViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST = null;
        int vmCheckPermissionConstantsPERMISSIONORGANIZATIONLISTViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST = false;
        java.lang.String vmProfileEmail = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST = false;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST = null;
        java.lang.Boolean vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = null;
        int vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLISTViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEBITLIST = false;
        int vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLISTViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.account.AccountResponse vmProfileGet = null;

        if ((dirtyFlags & 0xbL) != 0) {


            if ((dirtyFlags & 0xaL) != 0) {

                    if (vm != null) {
                        // read vm.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)
                        vmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_DEBIT_LIST)
                        vmCheckPermissionConstantsPERMISSIONDEBITLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_DEBIT_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_ORGANIZATION_LIST)
                        vmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_ORGANIZATION_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_NOTIFICATION_LIST)
                        vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_NOTIFICATION_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_CATEGORY_LIST)
                        vmCheckPermissionConstantsPERMISSIONCATEGORYLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_CATEGORY_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_SERVICE_LIST)
                        vmCheckPermissionConstantsPERMISSIONSERVICELIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_GROUP_SERVICE_LIST)
                        vmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_GROUP_SERVICE_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_LIST)
                        vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_GROUP_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_DEPARTMENT_LIST)
                        vmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_DEPARTMENT_LIST);
                        // read vm.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)
                        vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = vm.checkPermission(com.finance.constant.Constants.PERMISSION_GROUP_TRANSACTION_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_TRANSACTION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEBIT_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEBITLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONDEBITLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_ORGANIZATION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_NOTIFICATION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_CATEGORY_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONCATEGORYLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONCATEGORYLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_SERVICE_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONSERVICELIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONSERVICELIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_SERVICE_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEPARTMENT_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST);
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEBITLIST) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONCATEGORYLIST) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONSERVICELIST) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONTRANSACTIONLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONTRANSACTIONLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEBIT_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONDEBITLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEBITLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_ORGANIZATION_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONORGANIZATIONLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONORGANIZATIONLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_NOTIFICATION_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONNOTIFICATIONLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_CATEGORY_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONCATEGORYLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONCATEGORYLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_SERVICE_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONSERVICELISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONSERVICELIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_SERVICE_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONGROUPSERVICELISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPSERVICELIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEPARTMENT_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONDEPARTMENTLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONDEPARTMENTLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
                    vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (vm != null) {
                    // read vm.profile
                    vmProfile = vm.profile;
                }
                updateRegistration(0, vmProfile);


                if (vmProfile != null) {
                    // read vm.profile.get()
                    vmProfileGet = vmProfile.get();
                }


                if (vmProfileGet != null) {
                    // read vm.profile.get().fullName
                    vmProfileFullName = vmProfileGet.getFullName();
                    // read vm.profile.get().email
                    vmProfileEmail = vmProfileGet.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.imgArrowRightLayoutProfile.setOnClickListener(mCallback185);
            this.layoutCategory.setOnClickListener(mCallback193);
            this.layoutChangePassword.setOnClickListener(mCallback197);
            this.layoutDebitManagement.setOnClickListener(mCallback190);
            this.layoutDepartment.setOnClickListener(mCallback194);
            this.layoutGroupService.setOnClickListener(mCallback187);
            this.layoutGroupTransaction.setOnClickListener(mCallback186);
            this.layoutLogout.setOnClickListener(mCallback199);
            this.layoutNotification.setOnClickListener(mCallback196);
            this.layoutOrganizationManagement.setOnClickListener(mCallback191);
            this.layoutProjectManagement.setOnClickListener(mCallback192);
            this.layoutRequestKey.setOnClickListener(mCallback198);
            this.layoutService.setOnClickListener(mCallback195);
            this.mboundView18.setOnClickListener(mCallback200);
            this.mboundView6.setOnClickListener(mCallback188);
            this.mboundView7.setOnClickListener(mCallback189);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvAccountEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvAccountEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvAccountFullName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvAccountFullNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.layoutCategory.setVisibility(vmCheckPermissionConstantsPERMISSIONCATEGORYLISTViewVISIBLEViewGONE);
            this.layoutDebitManagement.setVisibility(vmCheckPermissionConstantsPERMISSIONDEBITLISTViewVISIBLEViewGONE);
            this.layoutDepartment.setVisibility(vmCheckPermissionConstantsPERMISSIONDEPARTMENTLISTViewVISIBLEViewGONE);
            this.layoutGroupService.setVisibility(vmCheckPermissionConstantsPERMISSIONGROUPSERVICELISTViewVISIBLEViewGONE);
            this.layoutGroupTransaction.setVisibility(vmCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTViewVISIBLEViewGONE);
            this.layoutNotification.setVisibility(vmCheckPermissionConstantsPERMISSIONNOTIFICATIONLISTViewVISIBLEViewGONE);
            this.layoutOrganizationManagement.setVisibility(vmCheckPermissionConstantsPERMISSIONORGANIZATIONLISTViewVISIBLEViewGONE);
            this.layoutService.setVisibility(vmCheckPermissionConstantsPERMISSIONSERVICELISTViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(vmCheckPermissionConstantsPERMISSIONKEYINFOGROUPLISTViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(vmCheckPermissionConstantsPERMISSIONTRANSACTIONLISTViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountEmail, vmProfileEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccountFullName, vmProfileFullName);
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
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToKey();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToProject();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToTag();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToCategory();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToGroupTransaction();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.AccountFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.checkFilePermission();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.logOut();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToGroupService();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToOrganization();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToDebit();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToNotification();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToChangePassword();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.account.AccountFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.goToUpdateProfile();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToDepartment();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.logOut();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.account.AccountFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.navigateToService();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.profile
        flag 1 (0x2L): vm
        flag 2 (0x3L): a
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEBIT_LIST)) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEBIT_LIST)) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_SERVICE_LIST)) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_SERVICE_LIST)) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEPARTMENT_LIST)) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_DEPARTMENT_LIST)) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_CATEGORY_LIST)) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_CATEGORY_LIST)) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_SERVICE_LIST)) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_GROUP_SERVICE_LIST)) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_ORGANIZATION_LIST)) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_ORGANIZATION_LIST)) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_NOTIFICATION_LIST)) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_NOTIFICATION_LIST)) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_LIST)) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_LIST)) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}