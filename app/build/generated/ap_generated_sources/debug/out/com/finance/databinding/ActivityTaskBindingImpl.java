package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTaskBindingImpl extends ActivityTaskBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data"},
            new int[] {10},
            new int[] {com.finance.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 11);
        sViewsWithIds.put(R.id.img_back_activity, 12);
        sViewsWithIds.put(R.id.img_back, 13);
        sViewsWithIds.put(R.id.img_search, 14);
        sViewsWithIds.put(R.id.swipe_layout, 15);
        sViewsWithIds.put(R.id.rcv_tasks, 16);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
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
            com.finance.ui.task.TaskViewModel vm = mVm;
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

    public ActivityTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[1]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[15]
            , (android.widget.TextView) bindings[2]
            );
        this.btnAdd.setTag(null);
        this.edtSearch.setTag(null);
        this.layoutBack.setTag(null);
        this.layoutBackActivity.setTag(null);
        setContainedBinding(this.layoutEmpty);
        this.layoutMain.setTag(null);
        this.layoutSearch.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback28 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback24 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback25 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback29 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback26 = new com.finance.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
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
        if (layoutEmpty.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.task.TaskViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.task.TaskActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.task.TaskViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.task.TaskActivity A) {
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
        layoutEmpty.setLifecycleOwner(lifecycleOwner);
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
                return onChangeVmIsSearch((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeLayoutEmpty((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
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
    private boolean onChangeVmIsSearch(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
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
        int vmIsSearchViewVISIBLEViewGONE = 0;
        boolean vmIsSearch = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        com.finance.ui.task.TaskViewModel vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmTextName = null;
        java.lang.Boolean vmIsSearchGet = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        java.lang.String vmTextNameGet = null;
        com.finance.ui.task.TaskActivity a = mA;
        java.lang.Integer vmTotalElementsGet = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        java.lang.String vmIsSearchEmptyGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTASKLIST = null;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        int vmTotalElementsInt0ViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST = false;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTASKCREATE = null;
        boolean vmTotalElementsInt0 = false;
        boolean vmIsSearchEmptyEmpty = false;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse = false;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKCREATE = false;

        if ((dirtyFlags & 0x1dfL) != 0) {


            if ((dirtyFlags & 0x1c1L) != 0) {

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
                if((dirtyFlags & 0x1c1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x142L) != 0) {

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
            if ((dirtyFlags & 0x144L) != 0) {

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
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmTotalElementsInt0) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
                    vmTotalElementsInt0ViewVISIBLEViewGONE = ((vmTotalElementsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x148L) != 0) {

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
                if((dirtyFlags & 0x148L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1d1L) != 0) {

                    if (vm != null) {
                        // read vm.isSearch
                        VmIsSearch1 = vm.isSearch;
                    }
                    updateRegistration(4, VmIsSearch1);


                    if (VmIsSearch1 != null) {
                        // read vm.isSearch.get()
                        vmIsSearchGet = VmIsSearch1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSearchGet);
                if((dirtyFlags & 0x150L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x20000L;
                    }
                }

                if ((dirtyFlags & 0x150L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
                        vmIsSearchViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
                        vmIsSearchViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    vmIsSearch = !androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet;
                if((dirtyFlags & 0x1d1L) != 0) {
                    if(vmIsSearch) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

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
            if((dirtyFlags & 0x1c1L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }
        }

        if ((dirtyFlags & 0x1d1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x1d1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4400000L) != 0) {


            if ((dirtyFlags & 0x400000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TASK_LIST)
                        aCheckPermissionConstantsPERMISSIONTASKLIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_TASK_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTASKLIST);
            }
            if ((dirtyFlags & 0x4000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TASK_CREATE)
                        aCheckPermissionConstantsPERMISSIONTASKCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_TASK_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTASKCREATE);
            }
        }

        if ((dirtyFlags & 0x1d1L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKLIST) : (false));
            if((dirtyFlags & 0x1d1L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1c1L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTASKCREATE) : (false));
            if((dirtyFlags & 0x1c1L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1c1L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONTASKCREATEBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback29);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtSearchandroidTextAttrChanged);
            this.layoutBack.setOnClickListener(mCallback25);
            this.layoutBackActivity.setOnClickListener(mCallback24);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.mboundView6.setOnClickListener(mCallback26);
            this.mboundView7.setOnClickListener(mCallback27);
            this.mboundView8.setOnClickListener(mCallback28);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtSearch, vmTextNameGet);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            this.layoutBackActivity.setVisibility(vmIsSearchViewGONEViewVISIBLE);
            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmTotalElementsInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1d1L) != 0) {
            // api target 1

            this.mboundView8.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTASKLISTBooleanFalseViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutEmpty);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.TaskActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.task.TaskViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.TaskActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm
                com.finance.ui.task.TaskViewModel vm = mVm;
                // a
                com.finance.ui.task.TaskActivity a = mA;



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
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.TaskActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.addNewTask();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.TaskActivity a = mA;



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
        flag 4 (0x5L): vm.isSearch
        flag 5 (0x6L): layoutEmpty
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 14 (0xfL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 15 (0x10L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 16 (0x11L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false
        flag 23 (0x18L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_LIST)) : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TASK_CREATE)) : false
    flag mapping end*/
    //end
}