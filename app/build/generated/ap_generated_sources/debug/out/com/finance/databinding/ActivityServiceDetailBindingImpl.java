package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityServiceDetailBindingImpl extends ActivityServiceDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data"},
            new int[] {22, 23},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_input_kind, 24);
        sViewsWithIds.put(R.id.text_input_service_group, 25);
        sViewsWithIds.put(R.id.layout_color, 26);
        sViewsWithIds.put(R.id.text_input_category, 27);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editServiceDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serviceRequest.get().description
            //         is vm.serviceRequest.get().setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editServiceDescription);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.serviceRequest != null
            boolean vmServiceRequestJavaLangObjectNull = false;
            // vm
            com.finance.ui.service.detail.ServiceDetailViewModel vm = mVm;
            // vm.serviceRequest.get() != null
            boolean vmServiceRequestGetJavaLangObjectNull = false;
            // vm.serviceRequest.get()
            com.finance.data.model.api.request.service.ServiceCreateUpdateRequest vmServiceRequestGet = null;
            // vm.serviceRequest.get().description
            java.lang.String vmServiceRequestDescription = null;
            // vm.serviceRequest
            androidx.databinding.ObservableField<com.finance.data.model.api.request.service.ServiceCreateUpdateRequest> vmServiceRequest = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServiceRequest = vm.serviceRequest;

                vmServiceRequestJavaLangObjectNull = (vmServiceRequest) != (null);
                if (vmServiceRequestJavaLangObjectNull) {


                    vmServiceRequestGet = vmServiceRequest.get();

                    vmServiceRequestGetJavaLangObjectNull = (vmServiceRequestGet) != (null);
                    if (vmServiceRequestGetJavaLangObjectNull) {




                        vmServiceRequestGet.setDescription(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityServiceDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityServiceDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.Button) bindings[21]
            , (android.widget.AutoCompleteTextView) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[4]
            , (android.widget.AutoCompleteTextView) bindings[9]
            , (android.widget.AutoCompleteTextView) bindings[8]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[19]
            , (android.widget.EditText) bindings[18]
            , (android.widget.ImageView) bindings[26]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[23]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[22]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.LinearLayout) bindings[11]
            );
        this.btnEPUpdate.setTag(null);
        this.cbbServiceGroup.setTag(null);
        this.cbbServiceKind.setTag(null);
        this.cbbServicePeriod.setTag(null);
        this.cbbTag.setTag(null);
        this.editServiceDescription.setTag(null);
        this.editServiceMoney.setTag(null);
        this.editServiceName.setTag(null);
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.layoutStartDate.setTag(null);
        this.layoutTitleExpirationDate.setTag(null);
        this.mboundView1 = (android.widget.ScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.tvPickServiceExpirationDate.setTag(null);
        this.tvPickServiceStartDate.setTag(null);
        this.tvStarExpirationDate.setTag(null);
        this.tvTitleExpirationDate.setTag(null);
        this.tvTitleStartDate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback82 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback83 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback87 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback86 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback84 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback85 = new com.finance.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        layoutHeader.invalidateAll();
        layoutEmpty.invalidateAll();
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
        if (layoutEmpty.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.service.detail.ServiceDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.service.detail.ServiceDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.service.detail.ServiceDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.service.detail.ServiceDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutHeader.setLifecycleOwner(lifecycleOwner);
        layoutEmpty.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsCreated((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLayoutEmpty((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
            case 2 :
                return onChangeVmIsHaveTag((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 4 :
                return onChangeVmIsNotFound((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeVmIsHaveGroupService((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeVmIsChoosePeriod((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeVmServiceRequest((androidx.databinding.ObservableField<com.finance.data.model.api.request.service.ServiceCreateUpdateRequest>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsCreated(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveTag(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveTag, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsNotFound(androidx.databinding.ObservableField<java.lang.Boolean> VmIsNotFound, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveGroupService(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveGroupService, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsChoosePeriod(androidx.databinding.ObservableField<java.lang.Boolean> VmIsChoosePeriod, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmServiceRequest(androidx.databinding.ObservableField<com.finance.data.model.api.request.service.ServiceCreateUpdateRequest> VmServiceRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        java.lang.String vmServiceRequestDescription = null;
        int vmServiceRequestPeriodKindInt1TvPickServiceExpirationDateAndroidColorBlackTvPickServiceExpirationDateAndroidColorColorHint = 0;
        java.lang.String vmServiceRequestName = null;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSNUMBERAndroidTextInputTypeTYPENULL = 0;
        com.finance.ui.service.detail.ServiceDetailViewModel vm = mVm;
        boolean vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse = false;
        java.lang.Boolean vmIsChoosePeriodGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreated = null;
        int vmIsCreatedBooleanTrueVmIsChoosePeriodViewVISIBLEViewGONE = 0;
        com.finance.ui.service.detail.ServiceDetailActivity a = mA;
        java.lang.Boolean vmIsCreatedGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = false;
        boolean vmIsCreatedBooleanTrueVmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse = false;
        boolean vmIsCreatedBooleanTrueVmIsHaveGroupService = false;
        java.lang.Boolean vmIsNotFoundGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsChoosePeriodGet = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmServiceRequestPeriodKind = 0;
        boolean vmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse = false;
        java.lang.Boolean vmIsHaveGroupServiceGet = null;
        boolean vmServiceRequestPeriodKindInt1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupServiceGet = false;
        java.lang.Integer vmServiceRequestPeriodKind = null;
        boolean vmIsHaveTagBooleanTrueBooleanFalse = false;
        int vmServiceRequestPeriodKindInt1ViewVISIBLEViewGONE = 0;
        java.lang.String vmIsCreatedAndroidStringAddNewServiceAndroidStringDetailService = null;
        boolean VmIsCreated1 = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveTag = null;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSTEXTAndroidTextInputTypeTYPENULL = 0;
        boolean vmIsCreatedBooleanTrueVmIsChoosePeriod = false;
        java.lang.String vmServiceRequestPeriodKindInt1TvTitleExpirationDateAndroidStringExpirationDateTvTitleExpirationDateAndroidStringExpirationDueDate = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsNotFound = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsNotFoundGet = false;
        android.graphics.drawable.Drawable vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONSERVICEUPDATE = null;
        boolean vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE = false;
        java.lang.Boolean vmIsHaveTagGet = null;
        boolean vmServiceRequestPeriodKindInt1BooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveGroupService = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = false;
        android.graphics.drawable.Drawable vmIsCreatedBooleanTrueVmIsHaveGroupServiceCbbServiceGroupAndroidDrawableBgCbbEnableCbbServiceGroupAndroidDrawableBgCbbDisable = null;
        java.lang.String vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = null;
        int vmIsNotFoundViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE = false;
        boolean VmIsNotFound1 = false;
        com.finance.data.model.api.request.service.ServiceCreateUpdateRequest vmServiceRequestGet = null;
        int VmIsNotFoundViewVISIBLEViewGONE1 = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsChoosePeriod = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.request.service.ServiceCreateUpdateRequest> vmServiceRequest = null;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7f5L) != 0) {


            if ((dirtyFlags & 0x761L) != 0) {

                    if (vm != null) {
                        // read vm.isCreated
                        vmIsCreated = vm.isCreated;
                    }
                    updateRegistration(0, vmIsCreated);


                    if (vmIsCreated != null) {
                        // read vm.isCreated.get()
                        vmIsCreatedGet = vmIsCreated.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreatedGet);
                if((dirtyFlags & 0x721L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x521L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x501L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                }
                if((dirtyFlags & 0x701L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }

                if ((dirtyFlags & 0x501L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_service : @android:string/detail_service
                        vmIsCreatedAndroidStringAddNewServiceAndroidStringDetailService = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (getRoot().getResources().getString(R.string.add_new_service)) : (getRoot().getResources().getString(R.string.detail_service)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
                        vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (btnEPUpdate.getResources().getString(R.string.create)) : (btnEPUpdate.getResources().getString(R.string.save)));
                }
                if ((dirtyFlags & 0x541L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get())
                        VmIsCreated1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet;
                    if((dirtyFlags & 0x541L) != 0) {
                        if(VmIsCreated1) {
                                dirtyFlags |= 0x400000000L;
                        }
                        else {
                                dirtyFlags |= 0x200000000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x504L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveTag
                        vmIsHaveTag = vm.isHaveTag;
                    }
                    updateRegistration(2, vmIsHaveTag);


                    if (vmIsHaveTag != null) {
                        // read vm.isHaveTag.get()
                        vmIsHaveTagGet = vmIsHaveTag.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveTagGet);
                if((dirtyFlags & 0x504L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) {
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
                    vmIsHaveTagBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0x510L) != 0) {

                    if (vm != null) {
                        // read vm.isNotFound
                        vmIsNotFound = vm.isNotFound;
                    }
                    updateRegistration(4, vmIsNotFound);


                    if (vmIsNotFound != null) {
                        // read vm.isNotFound.get()
                        vmIsNotFoundGet = vmIsNotFound.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsNotFoundGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsNotFoundGet);
                if((dirtyFlags & 0x510L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsNotFoundGet) {
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get())
                    VmIsNotFound1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsNotFoundGet;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
                    VmIsNotFoundViewVISIBLEViewGONE1 = ((androidxDatabindingViewDataBindingSafeUnboxVmIsNotFoundGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x510L) != 0) {
                    if(VmIsNotFound1) {
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
                    vmIsNotFoundViewVISIBLEViewGONE = ((VmIsNotFound1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x580L) != 0) {

                    if (vm != null) {
                        // read vm.serviceRequest
                        vmServiceRequest = vm.serviceRequest;
                    }
                    updateRegistration(7, vmServiceRequest);


                    if (vmServiceRequest != null) {
                        // read vm.serviceRequest.get()
                        vmServiceRequestGet = vmServiceRequest.get();
                    }


                    if (vmServiceRequestGet != null) {
                        // read vm.serviceRequest.get().description
                        vmServiceRequestDescription = vmServiceRequestGet.getDescription();
                        // read vm.serviceRequest.get().name
                        vmServiceRequestName = vmServiceRequestGet.getName();
                        // read vm.serviceRequest.get().periodKind
                        vmServiceRequestPeriodKind = vmServiceRequestGet.getPeriodKind();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind)
                    androidxDatabindingViewDataBindingSafeUnboxVmServiceRequestPeriodKind = androidx.databinding.ViewDataBinding.safeUnbox(vmServiceRequestPeriodKind);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1
                    vmServiceRequestPeriodKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmServiceRequestPeriodKind) == (1);
                if((dirtyFlags & 0x580L) != 0) {
                    if(vmServiceRequestPeriodKindInt1) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:color/black : @android:color/color_hint
                    vmServiceRequestPeriodKindInt1TvPickServiceExpirationDateAndroidColorBlackTvPickServiceExpirationDateAndroidColorColorHint = ((vmServiceRequestPeriodKindInt1) ? (getColorFromResource(tvPickServiceExpirationDate, R.color.black)) : (getColorFromResource(tvPickServiceExpirationDate, R.color.color_hint)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? View.VISIBLE : View.GONE
                    vmServiceRequestPeriodKindInt1ViewVISIBLEViewGONE = ((vmServiceRequestPeriodKindInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:string/expiration_date : @android:string/expiration_due_date
                    vmServiceRequestPeriodKindInt1TvTitleExpirationDateAndroidStringExpirationDateTvTitleExpirationDateAndroidStringExpirationDueDate = ((vmServiceRequestPeriodKindInt1) ? (tvTitleExpirationDate.getResources().getString(R.string.expiration_date)) : (tvTitleExpirationDate.getResources().getString(R.string.expiration_due_date)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? true : false
                    vmServiceRequestPeriodKindInt1BooleanTrueBooleanFalse = ((vmServiceRequestPeriodKindInt1) ? (true) : (false));
            }
        }
        if ((dirtyFlags & 0x600L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x8000000000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)
                    aCheckPermissionConstantsPERMISSIONSERVICEUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONSERVICEUPDATE);
        }
        if ((dirtyFlags & 0x280000L) != 0) {

                if (vm != null) {
                    // read vm.isHaveGroupService
                    vmIsHaveGroupService = vm.isHaveGroupService;
                }
                updateRegistration(5, vmIsHaveGroupService);


                if (vmIsHaveGroupService != null) {
                    // read vm.isHaveGroupService.get()
                    vmIsHaveGroupServiceGet = vmIsHaveGroupService.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupServiceGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveGroupServiceGet);
            if((dirtyFlags & 0x80000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupServiceGet) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x200000000L) != 0) {

                if (vm != null) {
                    // read vm.isChoosePeriod
                    vmIsChoosePeriod = vm.isChoosePeriod;
                }
                updateRegistration(6, vmIsChoosePeriod);


                if (vmIsChoosePeriod != null) {
                    // read vm.isChoosePeriod.get()
                    vmIsChoosePeriodGet = vmIsChoosePeriod.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsChoosePeriodGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsChoosePeriodGet);
        }

        if ((dirtyFlags & 0x521L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get())
                vmIsCreatedBooleanTrueVmIsHaveGroupService = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupServiceGet));
            if((dirtyFlags & 0x521L) != 0) {
                if(vmIsCreatedBooleanTrueVmIsHaveGroupService) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                vmIsCreatedBooleanTrueVmIsHaveGroupServiceCbbServiceGroupAndroidDrawableBgCbbEnableCbbServiceGroupAndroidDrawableBgCbbDisable = ((vmIsCreatedBooleanTrueVmIsHaveGroupService) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbServiceGroup.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbServiceGroup.getContext(), R.drawable.bg_cbb_disable)));
        }
        if ((dirtyFlags & 0x541L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get())
                vmIsCreatedBooleanTrueVmIsChoosePeriod = ((VmIsCreated1) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxVmIsChoosePeriodGet));
            if((dirtyFlags & 0x541L) != 0) {
                if(vmIsCreatedBooleanTrueVmIsChoosePeriod) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get()) ? View.VISIBLE : View.GONE
                vmIsCreatedBooleanTrueVmIsChoosePeriodViewVISIBLEViewGONE = ((vmIsCreatedBooleanTrueVmIsChoosePeriod) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x701L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE));
            if((dirtyFlags & 0x701L) != 0) {
                if(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x100000000L;
                        dirtyFlags |= 0x10000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x80000000L;
                        dirtyFlags |= 0x8000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_NUMBER : android.text.InputType.TYPE_NULL
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSNUMBERAndroidTextInputTypeTYPENULL = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) ? (android.text.InputType.TYPE_CLASS_NUMBER) : (android.text.InputType.TYPE_NULL));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) ? (true) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_TEXT : android.text.InputType.TYPE_NULL
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSTEXTAndroidTextInputTypeTYPENULL = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) ? (android.text.InputType.TYPE_CLASS_TEXT) : (android.text.InputType.TYPE_NULL));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? View.VISIBLE : View.GONE
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEViewVISIBLEViewGONE = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x1000000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)
                    aCheckPermissionConstantsPERMISSIONSERVICEUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONSERVICEUPDATE);
        }

        if ((dirtyFlags & 0x80000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
                vmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupServiceGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE) : (false));
        }

        if ((dirtyFlags & 0x721L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
                vmIsCreatedBooleanTrueVmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (vmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse));
        }
        // batch finished
        if ((dirtyFlags & 0x701L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEViewVISIBLEViewGONE);
            this.cbbServiceKind.setEnabled(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE);
            this.cbbServicePeriod.setEnabled(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE);
            this.editServiceDescription.setFocusableInTouchMode(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse);
            this.tvPickServiceStartDate.setClickable(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.editServiceMoney.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSNUMBERAndroidTextInputTypeTYPENULL);
                this.editServiceName.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEAndroidTextInputTypeTYPECLASSTEXTAndroidTextInputTypeTYPENULL);
            }
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback87);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editServiceDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editServiceDescriptionandroidTextAttrChanged);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.not_found));
            this.layoutStartDate.setOnClickListener(mCallback85);
            this.mboundView1.setOnClickListener(mCallback82);
            this.mboundView2.setOnClickListener(mCallback83);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, (" ") + (mboundView3.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, (" ") + (mboundView5.getResources().getString(R.string.asterisk)));
            this.tvTitleStartDate.setOnClickListener(mCallback84);
        }
        if ((dirtyFlags & 0x501L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnEPUpdate, vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave);
            this.layoutHeader.setTitle(vmIsCreatedAndroidStringAddNewServiceAndroidStringDetailService);
        }
        if ((dirtyFlags & 0x721L) != 0) {
            // api target 1

            this.cbbServiceGroup.setEnabled(vmIsCreatedBooleanTrueVmIsHaveGroupServiceACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanFalse);
        }
        if ((dirtyFlags & 0x521L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbServiceGroup, vmIsCreatedBooleanTrueVmIsHaveGroupServiceCbbServiceGroupAndroidDrawableBgCbbEnableCbbServiceGroupAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTag, vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable);
            this.mboundView7.setEnabled(vmIsHaveTagBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x580L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editServiceDescription, vmServiceRequestDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editServiceName, vmServiceRequestName);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.layoutTitleExpirationDate, mCallback86, vmServiceRequestPeriodKindInt1BooleanTrueBooleanFalse);
            this.tvPickServiceExpirationDate.setHintTextColor(vmServiceRequestPeriodKindInt1TvPickServiceExpirationDateAndroidColorBlackTvPickServiceExpirationDateAndroidColorColorHint);
            this.tvStarExpirationDate.setVisibility(vmServiceRequestPeriodKindInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitleExpirationDate, vmServiceRequestPeriodKindInt1TvTitleExpirationDateAndroidStringExpirationDateTvTitleExpirationDateAndroidStringExpirationDueDate);
        }
        if ((dirtyFlags & 0x510L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(VmIsNotFoundViewVISIBLEViewGONE1);
            this.mboundView1.setVisibility(vmIsNotFoundViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x541L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(vmIsCreatedBooleanTrueVmIsChoosePeriodViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutEmpty);
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
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdate();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickExpirationDate();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickStartDate();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.detail.ServiceDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickStartDate();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isCreated
        flag 1 (0x2L): layoutEmpty
        flag 2 (0x3L): vm.isHaveTag
        flag 3 (0x4L): layoutHeader
        flag 4 (0x5L): vm.isNotFound
        flag 5 (0x6L): vm.isHaveGroupService
        flag 6 (0x7L): vm.isChoosePeriod
        flag 7 (0x8L): vm.serviceRequest
        flag 8 (0x9L): vm
        flag 9 (0xaL): a
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:color/black : @android:color/color_hint
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:color/black : @android:color/color_hint
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_NUMBER : android.text.InputType.TYPE_NULL
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_NUMBER : android.text.InputType.TYPE_NULL
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
        flag 17 (0x12L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get())
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get())
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_service : @android:string/detail_service
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_service : @android:string/detail_service
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_TEXT : android.text.InputType.TYPE_NULL
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? android.text.InputType.TYPE_CLASS_TEXT : android.text.InputType.TYPE_NULL
        flag 33 (0x22L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get())
        flag 34 (0x23L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isChoosePeriod.get())
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:string/expiration_date : @android:string/expiration_due_date
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? @android:string/expiration_date : @android:string/expiration_due_date
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? true : false
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.serviceRequest.get().periodKind) == 1 ? true : false
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupService.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 47 (0x30L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
        flag 48 (0x31L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isNotFound.get()) ? View.VISIBLE : View.GONE
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? View.VISIBLE : View.GONE
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}