package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityServiceBindingImpl extends ActivityServiceBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data", "layout_invalid_key"},
            new int[] {12, 13},
            new int[] {com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 14);
        sViewsWithIds.put(R.id.img_back, 15);
        sViewsWithIds.put(R.id.edt_search, 16);
        sViewsWithIds.put(R.id.img_search, 17);
        sViewsWithIds.put(R.id.rcv_services, 18);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback217;
    @Nullable
    private final android.view.View.OnClickListener mCallback213;
    @Nullable
    private final android.view.View.OnClickListener mCallback214;
    @Nullable
    private final android.view.View.OnClickListener mCallback218;
    @Nullable
    private final android.view.View.OnClickListener mCallback215;
    @Nullable
    private final android.view.View.OnClickListener mCallback216;
    @Nullable
    private final android.view.View.OnClickListener mCallback212;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (android.widget.EditText) bindings[16]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[7]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[13]
            , (android.widget.RelativeLayout) bindings[0]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[12]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[10]
            , (android.widget.TextView) bindings[2]
            );
        this.btnAdd.setTag(null);
        this.layoutBack.setTag(null);
        this.layoutFilter.setTag(null);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        setContainedBinding(this.layoutNoData);
        this.layoutSearch.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback217 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback213 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback214 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback218 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback215 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback216 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback212 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
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
            setVm((com.finance.ui.service.ServiceViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.service.ServiceActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.service.ServiceViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.service.ServiceActivity A) {
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
        layoutNoData.setLifecycleOwner(lifecycleOwner);
        layoutInvalidKey.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmTotalElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeVmIsSearchEmpty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmSort((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 5 :
                return onChangeVmIsSearch((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeLayoutNoData((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsValidKey(androidx.databinding.ObservableField<java.lang.Boolean> VmIsValidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearchEmpty(androidx.databinding.ObservableField<java.lang.String> VmIsSearchEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSort(androidx.databinding.ObservableField<java.lang.Integer> VmSort, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearch(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNoData(com.finance.databinding.LayoutEmptyDataBinding LayoutNoData, int fieldId) {
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
        int vmIsSearchViewVISIBLEViewGONE = 0;
        boolean vmIsSearch = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE = 0;
        boolean VmIsValidKey1 = false;
        boolean vmSortInt3 = false;
        boolean vmSortInt0 = false;
        com.finance.ui.service.ServiceViewModel vm = mVm;
        java.lang.Boolean vmIsSearchGet = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE = 0;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = 0;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalseViewVISIBLEViewGONE = 0;
        com.finance.ui.service.ServiceActivity a = mA;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONSERVICECREATE = null;
        java.lang.Integer vmTotalElementsGet = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICECREATE = false;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        java.lang.String vmIsSearchEmptyGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONSERVICELIST = null;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable vmSortInt0MboundView9AndroidDrawableBgWhiteCornerMboundView9AndroidDrawableBgBlank = null;
        android.graphics.drawable.Drawable vmSortInt3MboundView8AndroidDrawableBgWhiteCornerMboundView8AndroidDrawableBgBlank = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICELIST = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        androidx.databinding.ObservableField<java.lang.Integer> vmSort = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmSortGet = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        java.lang.Integer vmSortGet = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse = false;
        boolean vmTotalElementsInt0 = false;
        boolean vmIsSearchEmptyEmpty = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalse = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalse = false;

        if ((dirtyFlags & 0x3afL) != 0) {


            if ((dirtyFlags & 0x383L) != 0) {

                    if (vm != null) {
                        // read vm.isValidKey
                        vmIsValidKey = vm.isValidKey;
                    }
                    updateRegistration(0, vmIsValidKey);


                    if (vmIsValidKey != null) {
                        // read vm.isValidKey.get()
                        vmIsValidKeyGet = vmIsValidKey.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
                if((dirtyFlags & 0x383L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
                if((dirtyFlags & 0x381L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }

                if ((dirtyFlags & 0x281L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                        VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                    if((dirtyFlags & 0x281L) != 0) {
                        if(VmIsValidKey1) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        vmIsValidKeyViewVISIBLEViewGONE = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (vm != null) {
                        // read vm.isSearchEmpty
                        vmIsSearchEmpty = vm.isSearchEmpty;
                    }
                    updateRegistration(2, vmIsSearchEmpty);


                    if (vmIsSearchEmpty != null) {
                        // read vm.isSearchEmpty.get()
                        vmIsSearchEmptyGet = vmIsSearchEmpty.get();
                    }


                    if (vmIsSearchEmptyGet != null) {
                        // read vm.isSearchEmpty.get().empty
                        vmIsSearchEmptyEmpty = vmIsSearchEmptyGet.isEmpty();
                    }
                if((dirtyFlags & 0x284L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x288L) != 0) {

                    if (vm != null) {
                        // read vm.sort
                        vmSort = vm.sort;
                    }
                    updateRegistration(3, vmSort);


                    if (vmSort != null) {
                        // read vm.sort.get()
                        vmSortGet = vmSort.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmSortGet = androidx.databinding.ViewDataBinding.safeUnbox(vmSortGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 3
                    vmSortInt3 = (androidxDatabindingViewDataBindingSafeUnboxVmSortGet) == (3);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 0
                    vmSortInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmSortGet) == (0);
                if((dirtyFlags & 0x288L) != 0) {
                    if(vmSortInt3) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
                if((dirtyFlags & 0x288L) != 0) {
                    if(vmSortInt0) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmSortInt3MboundView8AndroidDrawableBgWhiteCornerMboundView8AndroidDrawableBgBlank = ((vmSortInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView8.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmSortInt0MboundView9AndroidDrawableBgWhiteCornerMboundView9AndroidDrawableBgBlank = ((vmSortInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView9.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView9.getContext(), R.drawable.bg_blank)));
            }
            if ((dirtyFlags & 0x3a1L) != 0) {

                    if (vm != null) {
                        // read vm.isSearch
                        VmIsSearch1 = vm.isSearch;
                    }
                    updateRegistration(5, VmIsSearch1);


                    if (VmIsSearch1 != null) {
                        // read vm.isSearch.get()
                        vmIsSearchGet = VmIsSearch1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSearchGet);
                if((dirtyFlags & 0x2a0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000000L;
                    }
                }

                if ((dirtyFlags & 0x2a0L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
                        vmIsSearchViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
                        vmIsSearchViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    vmIsSearch = !androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet;
                if((dirtyFlags & 0x3a1L) != 0) {
                    if(vmIsSearch) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200000L) != 0) {

                if (vm != null) {
                    // read vm.isValidKey
                    vmIsValidKey = vm.isValidKey;
                }
                updateRegistration(0, vmIsValidKey);


                if (vmIsValidKey != null) {
                    // read vm.isValidKey.get()
                    vmIsValidKeyGet = vmIsValidKey.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
            if((dirtyFlags & 0x383L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }
            if((dirtyFlags & 0x381L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x3a1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x3a1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8a00000000L) != 0) {


            if ((dirtyFlags & 0x8000000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)
                        aCheckPermissionConstantsPERMISSIONSERVICECREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICECREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONSERVICECREATE);
            }
            if ((dirtyFlags & 0xa00000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_SERVICE_LIST)
                        aCheckPermissionConstantsPERMISSIONSERVICELIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICELIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONSERVICELIST);
            }
        }

        if ((dirtyFlags & 0x3a1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICELIST) : (false));
            if((dirtyFlags & 0x3a1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x383L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICELIST) : (false));
            if((dirtyFlags & 0x381L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x383L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }

            if ((dirtyFlags & 0x381L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
                    vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x381L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICECREATE) : (false));
            if((dirtyFlags & 0x381L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x2000000000L) != 0) {

                if (vm != null) {
                    // read vm.totalElements
                    vmTotalElements = vm.totalElements;
                }
                updateRegistration(1, vmTotalElements);


                if (vmTotalElements != null) {
                    // read vm.totalElements.get()
                    vmTotalElementsGet = vmTotalElements.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementsGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0
                vmTotalElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet) == (0);
        }

        if ((dirtyFlags & 0x383L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalse = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalse) ? (vmTotalElementsInt0) : (false));
            if((dirtyFlags & 0x383L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalse) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x381L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICECREATEBooleanFalseViewVISIBLEViewGONE);
            this.swipeLayout.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback218);
            this.layoutBack.setOnClickListener(mCallback212);
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
            this.mboundView4.setOnClickListener(mCallback213);
            this.mboundView5.setOnClickListener(mCallback214);
            this.mboundView6.setOnClickListener(mCallback215);
            this.mboundView8.setOnClickListener(mCallback216);
            this.mboundView9.setOnClickListener(mCallback217);
        }
        if ((dirtyFlags & 0x3a1L) != 0) {
            // api target 1

            this.layoutFilter.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x383L) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONSERVICELISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView8, vmSortInt3MboundView8AndroidDrawableBgWhiteCornerMboundView8AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView9, vmSortInt0MboundView9AndroidDrawableBgWhiteCornerMboundView9AndroidDrawableBgBlank);
        }
        executeBindingsOn(layoutNoData);
        executeBindingsOn(layoutInvalidKey);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.sortServiceByCreatedDate();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.addNewService();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.service.ServiceViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.sortServiceByExpirationDate();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.ServiceActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isValidKey
        flag 1 (0x2L): vm.totalElements
        flag 2 (0x3L): vm.isSearchEmpty
        flag 3 (0x4L): vm.sort
        flag 4 (0x5L): layoutInvalidKey
        flag 5 (0x6L): vm.isSearch
        flag 6 (0x7L): layoutNoData
        flag 7 (0x8L): vm
        flag 8 (0x9L): a
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 22 (0x17L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 23 (0x18L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.sort.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 30 (0x1fL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
        flag 33 (0x22L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_CREATE)) : false
    flag mapping end*/
    //end
}