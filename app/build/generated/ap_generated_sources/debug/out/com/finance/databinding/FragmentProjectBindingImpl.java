package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProjectBindingImpl extends FragmentProjectBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data", "layout_invalid_key"},
            new int[] {9, 10},
            new int[] {com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 11);
        sViewsWithIds.put(R.id.img_back, 12);
        sViewsWithIds.put(R.id.img_search, 13);
        sViewsWithIds.put(R.id.swipe_layout, 14);
        sViewsWithIds.put(R.id.rcv_projects, 15);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.textName.get()
            //         is vm.textName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtSearch);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.fragment.project.ProjectFragmentViewModel vm = mVm;
            // vm.textName != null
            boolean vmTextNameJavaLangObjectNull = false;
            // vm.textName
            androidx.databinding.ObservableField<java.lang.String> vmTextName = null;
            // vm.textName.get()
            java.lang.String vmTextNameGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTextName = vm.textName;

                vmTextNameJavaLangObjectNull = (vmTextName) != (null);
                if (vmTextNameJavaLangObjectNull) {




                    vmTextName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentProjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentProjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[3]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[10]
            , (android.widget.RelativeLayout) bindings[0]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[9]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[14]
            , (android.widget.TextView) bindings[1]
            );
        this.btnAdd.setTag(null);
        this.edtSearch.setTag(null);
        this.layoutBack.setTag(null);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        setContainedBinding(this.layoutNoData);
        this.layoutSearch.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback56 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback52 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback54 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback53 = new com.finance.generated.callback.OnClickListener(this, 2);
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
            setVm((com.finance.ui.fragment.project.ProjectFragmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.project.ProjectFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.project.ProjectFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.project.ProjectFragment A) {
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
                return onChangeVmTextName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmTotalElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeVmIsSearchEmpty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeVmTextName(androidx.databinding.ObservableField<java.lang.String> VmTextName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearchEmpty(androidx.databinding.ObservableField<java.lang.String> VmIsSearchEmpty, int fieldId) {
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
        boolean VmIsValidKey1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTLIST = false;
        com.finance.ui.fragment.project.ProjectFragmentViewModel vm = mVm;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONPROJECTCREATE = null;
        androidx.databinding.ObservableField<java.lang.String> vmTextName = null;
        java.lang.Boolean vmIsSearchGet = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        java.lang.String vmTextNameGet = null;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalse = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalse = false;
        com.finance.ui.fragment.project.ProjectFragment a = mA;
        java.lang.Integer vmTotalElementsGet = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        java.lang.String vmIsSearchEmptyGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTASKLIST = null;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalse = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONPROJECTLIST = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST = false;
        boolean vmTotalElementsInt0 = false;
        boolean vmIsSearchEmptyEmpty = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTCREATE = false;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse = false;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3afL) != 0) {


            if ((dirtyFlags & 0x385L) != 0) {

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
                if((dirtyFlags & 0x381L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x385L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }

                if ((dirtyFlags & 0x281L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                        VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                    if((dirtyFlags & 0x281L) != 0) {
                        if(VmIsValidKey1) {
                                dirtyFlags |= 0x20000000L;
                        }
                        else {
                                dirtyFlags |= 0x10000000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        vmIsValidKeyViewVISIBLEViewGONE = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x282L) != 0) {

                    if (vm != null) {
                        // read vm.textName
                        vmTextName = vm.textName;
                    }
                    updateRegistration(1, vmTextName);


                    if (vmTextName != null) {
                        // read vm.textName.get()
                        vmTextNameGet = vmTextName.get();
                    }
            }
            if ((dirtyFlags & 0x288L) != 0) {

                    if (vm != null) {
                        // read vm.isSearchEmpty
                        vmIsSearchEmpty = vm.isSearchEmpty;
                    }
                    updateRegistration(3, vmIsSearchEmpty);


                    if (vmIsSearchEmpty != null) {
                        // read vm.isSearchEmpty.get()
                        vmIsSearchEmptyGet = vmIsSearchEmpty.get();
                    }


                    if (vmIsSearchEmptyGet != null) {
                        // read vm.isSearchEmpty.get().empty
                        vmIsSearchEmptyEmpty = vmIsSearchEmptyGet.isEmpty();
                    }
                if((dirtyFlags & 0x288L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
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
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x100000L;
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
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

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
            if((dirtyFlags & 0x381L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x385L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
        }

        if ((dirtyFlags & 0x3a1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x3a1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x82002000L) != 0) {


            if ((dirtyFlags & 0x2000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)
                        aCheckPermissionConstantsPERMISSIONPROJECTCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_PROJECT_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONPROJECTCREATE);
            }
            if ((dirtyFlags & 0x80000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TASK_LIST)
                        aCheckPermissionConstantsPERMISSIONTASKLIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_TASK_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTASKLIST);
            }
            if ((dirtyFlags & 0x2000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_PROJECT_LIST)
                        aCheckPermissionConstantsPERMISSIONPROJECTLIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_PROJECT_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTLIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONPROJECTLIST);
            }
        }

        if ((dirtyFlags & 0x381L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTCREATE) : (false));
            if((dirtyFlags & 0x381L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalse) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x385L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTLIST) : (false));
            if((dirtyFlags & 0x385L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
        }
        if ((dirtyFlags & 0x3a1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST) : (false));
            if((dirtyFlags & 0x3a1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {

                if (vm != null) {
                    // read vm.totalElements
                    vmTotalElements = vm.totalElements;
                }
                updateRegistration(2, vmTotalElements);


                if (vmTotalElements != null) {
                    // read vm.totalElements.get()
                    vmTotalElementsGet = vmTotalElements.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementsGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0
                vmTotalElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet) == (0);
        }

        if ((dirtyFlags & 0x385L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalse = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalse) ? (vmTotalElementsInt0) : (false));
            if((dirtyFlags & 0x385L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback56);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtSearchandroidTextAttrChanged);
            this.layoutBack.setOnClickListener(mCallback52);
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
            this.mboundView5.setOnClickListener(mCallback53);
            this.mboundView6.setOnClickListener(mCallback54);
            this.mboundView7.setOnClickListener(mCallback55);
        }
        if ((dirtyFlags & 0x381L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTCREATEBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtSearch, vmTextNameGet);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x385L) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONPROJECTLISTBooleanFalseVmTotalElementsInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3a1L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutNoData);
        executeBindingsOn(layoutInvalidKey);
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
                com.finance.ui.fragment.project.ProjectFragmentViewModel vm = mVm;



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
                com.finance.ui.fragment.project.ProjectFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.addNewProject();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.project.ProjectFragmentViewModel vm = mVm;
                // a
                com.finance.ui.fragment.project.ProjectFragment a = mA;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();


                    aJavaLangObjectNull = (a) != (null);
                    if (aJavaLangObjectNull) {


                        a.hideKeyboard();




                        a.deleteEditSearch();
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.project.ProjectFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.project.ProjectFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isValidKey
        flag 1 (0x2L): vm.textName
        flag 2 (0x3L): vm.totalElements
        flag 3 (0x4L): vm.isSearchEmpty
        flag 4 (0x5L): layoutInvalidKey
        flag 5 (0x6L): vm.isSearch
        flag 6 (0x7L): layoutNoData
        flag 7 (0x8L): vm
        flag 8 (0x9L): a
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 17 (0x12L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 18 (0x13L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 19 (0x14L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
        flag 31 (0x20L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
        flag 32 (0x21L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
        flag 33 (0x22L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}