package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityServiceGroupBindingImpl extends ActivityServiceGroupBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data", "layout_invalid_key"},
            new int[] {2, 3, 4},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipe_layout, 5);
        sViewsWithIds.put(R.id.rcv_group_services, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityServiceGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityServiceGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[2]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[4]
            , (android.widget.RelativeLayout) bindings[0]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            );
        this.btnAdd.setTag(null);
        setContainedBinding(this.layoutHeader);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        setContainedBinding(this.layoutNoData);
        setRootTag(root);
        // listeners
        mCallback20 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        layoutHeader.invalidateAll();
        layoutNoData.invalidateAll();
        layoutInvalidKey.invalidateAll();
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
        if (layoutNoData.hasPendingBindings()) {
            return true;
        }
        if (layoutInvalidKey.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.service.group.ServiceGroupViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.service.group.ServiceGroupActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.service.group.ServiceGroupViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.service.group.ServiceGroupActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutHeader.setLifecycleOwner(lifecycleOwner);
        layoutNoData.setLifecycleOwner(lifecycleOwner);
        layoutInvalidKey.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 2 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmTotalElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeLayoutNoData((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
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
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsValidKey(androidx.databinding.ObservableField<java.lang.Boolean> VmIsValidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNoData(com.finance.databinding.LayoutEmptyDataBinding LayoutNoData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        boolean VmIsValidKey1 = false;
        com.finance.ui.service.group.ServiceGroupViewModel vm = mVm;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONGROUPSERVICECREATE = null;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalse = false;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        com.finance.ui.service.group.ServiceGroupActivity a = mA;
        java.lang.Integer vmTotalElementsGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPSERVICECREATE = false;
        boolean vmTotalElementsInt0 = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = false;

        if ((dirtyFlags & 0xecL) != 0) {



                if (vm != null) {
                    // read vm.isValidKey
                    vmIsValidKey = vm.isValidKey;
                }
                updateRegistration(2, vmIsValidKey);


                if (vmIsValidKey != null) {
                    // read vm.isValidKey.get()
                    vmIsValidKeyGet = vmIsValidKey.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
            if((dirtyFlags & 0xecL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xe4L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }

            if ((dirtyFlags & 0xa4L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                    VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                if((dirtyFlags & 0xa4L) != 0) {
                    if(VmIsValidKey1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                    vmIsValidKeyViewVISIBLEViewGONE = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x8800L) != 0) {


            if ((dirtyFlags & 0x800L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)
                        aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_GROUP_TRANSACTION_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST);
            }
            if ((dirtyFlags & 0x8000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)
                        aCheckPermissionConstantsPERMISSIONGROUPSERVICECREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_GROUP_SERVICE_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPSERVICECREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONGROUPSERVICECREATE);
            }
        }

        if ((dirtyFlags & 0xecL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLIST) : (false));
            if((dirtyFlags & 0xecL) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
        }
        if ((dirtyFlags & 0xe4L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPSERVICECREATE) : (false));
            if((dirtyFlags & 0xe4L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

                if (vm != null) {
                    // read vm.totalElements
                    vmTotalElements = vm.totalElements;
                }
                updateRegistration(3, vmTotalElements);


                if (vmTotalElements != null) {
                    // read vm.totalElements.get()
                    vmTotalElementsGet = vmTotalElements.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementsGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0
                vmTotalElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet) == (0);
        }

        if ((dirtyFlags & 0xecL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalse = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalse) ? (vmTotalElementsInt0) : (false));
            if((dirtyFlags & 0xecL) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback20);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.group_service_management));
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
        }
        if ((dirtyFlags & 0xe4L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPSERVICECREATEBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xecL) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutNoData);
        executeBindingsOn(layoutInvalidKey);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        com.finance.ui.service.group.ServiceGroupActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.addNewGroupService();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): layoutInvalidKey
        flag 2 (0x3L): vm.isValidKey
        flag 3 (0x4L): vm.totalElements
        flag 4 (0x5L): layoutNoData
        flag 5 (0x6L): vm
        flag 6 (0x7L): a
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_SERVICE_CREATE)) : false
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
    flag mapping end*/
    //end
}