package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentKeyBindingImpl extends FragmentKeyBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data", "layout_invalid_key", "layout_invalid_key"},
            new int[] {12, 13, 14},
            new int[] {com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 15);
        sViewsWithIds.put(R.id.img_back, 16);
        sViewsWithIds.put(R.id.img_search, 17);
        sViewsWithIds.put(R.id.img_filter, 18);
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
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
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
            com.finance.ui.fragment.key.KeyFragmentViewModel vm = mVm;
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

    public FragmentKeyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentKeyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.RelativeLayout) bindings[3]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[12]
            , (android.widget.LinearLayout) bindings[8]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[14]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[9]
            , (android.widget.TextView) bindings[1]
            );
        this.btnAdd.setTag(null);
        this.edtSearch.setTag(null);
        this.layoutBack.setTag(null);
        setContainedBinding(this.layoutEmpty);
        this.layoutFilter.setTag(null);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        setContainedBinding(this.layoutNotPermission);
        this.layoutSearch.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.rcKeys.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback30 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback36 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback32 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback31 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback37 = new com.finance.generated.callback.OnClickListener(this, 8);
        mCallback33 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback38 = new com.finance.generated.callback.OnClickListener(this, 9);
        mCallback34 = new com.finance.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        layoutEmpty.invalidateAll();
        layoutInvalidKey.invalidateAll();
        layoutNotPermission.invalidateAll();
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
        if (layoutInvalidKey.hasPendingBindings()) {
            return true;
        }
        if (layoutNotPermission.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.fragment.key.KeyFragmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.key.KeyFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.key.KeyFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.key.KeyFragment A) {
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
        layoutEmpty.setLifecycleOwner(lifecycleOwner);
        layoutInvalidKey.setLifecycleOwner(lifecycleOwner);
        layoutNotPermission.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmTextName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeVmIsSearchEmpty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeLayoutNotPermission((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 5 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 6 :
                return onChangeVmIsSearch((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 7 :
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
    private boolean onChangeVmTotalElement(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElement, int fieldId) {
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
    private boolean onChangeLayoutNotPermission(com.finance.databinding.LayoutInvalidKeyBinding LayoutNotPermission, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearch(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
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
        int vmIsSearchViewVISIBLEViewGONE = 0;
        boolean vmIsSearch = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOCREATE = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        boolean VmIsValidKey1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = 0;
        com.finance.ui.fragment.key.KeyFragmentViewModel vm = mVm;
        boolean aCheckPermissionConstantsPERMISSIONKEYINFOLIST = false;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> vmTextName = null;
        java.lang.Boolean vmIsSearchGet = null;
        java.lang.String vmTextNameGet = null;
        com.finance.ui.fragment.key.KeyFragment a = mA;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOLIST = false;
        java.lang.String vmIsSearchEmptyGet = null;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean ACheckPermissionConstantsPERMISSIONKEYINFOLIST1 = null;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = 0;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse = false;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        java.lang.Integer vmTotalElementGet = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalse = false;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalse = false;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONKEYINFOCREATE = null;
        int VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE1 = 0;
        boolean vmIsSearchEmptyEmpty = false;
        boolean VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse1 = false;
        boolean vmTotalElementInt0 = false;

        if ((dirtyFlags & 0x74fL) != 0) {


            if ((dirtyFlags & 0x705L) != 0) {

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
                if((dirtyFlags & 0x705L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x701L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                }

                if ((dirtyFlags & 0x501L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                        VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                    if((dirtyFlags & 0x501L) != 0) {
                        if(VmIsValidKey1) {
                                dirtyFlags |= 0x100000000L;
                        }
                        else {
                                dirtyFlags |= 0x80000000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        vmIsValidKeyViewVISIBLEViewGONE = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x502L) != 0) {

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
            if ((dirtyFlags & 0x508L) != 0) {

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
                if((dirtyFlags & 0x508L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x741L) != 0) {

                    if (vm != null) {
                        // read vm.isSearch
                        VmIsSearch1 = vm.isSearch;
                    }
                    updateRegistration(6, VmIsSearch1);


                    if (VmIsSearch1 != null) {
                        // read vm.isSearch.get()
                        vmIsSearchGet = VmIsSearch1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSearchGet);
                if((dirtyFlags & 0x540L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x80000L;
                    }
                }

                if ((dirtyFlags & 0x540L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
                        vmIsSearchViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
                        vmIsSearchViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    vmIsSearch = !androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet;
                if((dirtyFlags & 0x741L) != 0) {
                    if(vmIsSearch) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

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
            if((dirtyFlags & 0x705L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
            if((dirtyFlags & 0x701L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x1000000000L;
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                        dirtyFlags |= 0x8000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x741L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x741L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x11010004000L) != 0) {


            if ((dirtyFlags & 0x10010004000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)
                        ACheckPermissionConstantsPERMISSIONKEYINFOLIST1 = a.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOLIST = androidx.databinding.ViewDataBinding.safeUnbox(ACheckPermissionConstantsPERMISSIONKEYINFOLIST1);

                if ((dirtyFlags & 0x10000000000L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST))
                        aCheckPermissionConstantsPERMISSIONKEYINFOLIST = !androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOLIST;
                }
            }
            if ((dirtyFlags & 0x1000000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)
                        aCheckPermissionConstantsPERMISSIONKEYINFOCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONKEYINFOCREATE);
            }
        }

        if ((dirtyFlags & 0x741L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOLIST) : (false));
            if((dirtyFlags & 0x741L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x705L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOLIST) : (false));
            if((dirtyFlags & 0x705L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }
            if((dirtyFlags & 0x701L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }

            if ((dirtyFlags & 0x701L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
                    VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE1 = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x701L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOCREATE) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
                VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (aCheckPermissionConstantsPERMISSIONKEYINFOLIST) : (false));
            if((dirtyFlags & 0x701L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalse) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }
            if((dirtyFlags & 0x701L) != 0) {
                if(VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse1) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE = ((VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x400000000L) != 0) {

                if (vm != null) {
                    // read vm.totalElement
                    vmTotalElement = vm.totalElement;
                }
                updateRegistration(2, vmTotalElement);


                if (vmTotalElement != null) {
                    // read vm.totalElement.get()
                    vmTotalElementGet = vmTotalElement.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0
                vmTotalElementInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet) == (0);
        }

        if ((dirtyFlags & 0x705L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalse = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalse) ? (vmTotalElementInt0) : (false));
            if((dirtyFlags & 0x705L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x701L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOCREATEBooleanFalseViewVISIBLEViewGONE);
            this.layoutNotPermission.getRoot().setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE);
            this.swipeLayout.setVisibility(VmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback38);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtSearchandroidTextAttrChanged);
            this.layoutBack.setOnClickListener(mCallback31);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutFilter.setOnClickListener(mCallback35);
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
            this.layoutMain.setOnClickListener(mCallback30);
            this.layoutNotPermission.setDes(getRoot().getResources().getString(R.string.not_permission));
            this.mboundView5.setOnClickListener(mCallback32);
            this.mboundView6.setOnClickListener(mCallback33);
            this.mboundView7.setOnClickListener(mCallback34);
            this.rcKeys.setOnClickListener(mCallback37);
            this.swipeLayout.setOnClickListener(mCallback36);
        }
        if ((dirtyFlags & 0x502L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtSearch, vmTextNameGet);
        }
        if ((dirtyFlags & 0x705L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x741L) != 0) {
            // api target 1

            this.layoutFilter.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONKEYINFOLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x501L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x540L) != 0) {
            // api target 1

            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x508L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        executeBindingsOn(layoutEmpty);
        executeBindingsOn(layoutInvalidKey);
        executeBindingsOn(layoutNotPermission);
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
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToFilter();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.closeFilter();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.closeFilter();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
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
                com.finance.ui.fragment.key.KeyFragmentViewModel vm = mVm;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



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
            case 8: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.closeFilter();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.key.KeyFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToDetails();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.key.KeyFragmentViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();
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
        flag 2 (0x3L): vm.totalElement
        flag 3 (0x4L): vm.isSearchEmpty
        flag 4 (0x5L): layoutNotPermission
        flag 5 (0x6L): layoutInvalidKey
        flag 6 (0x7L): vm.isSearch
        flag 7 (0x8L): layoutEmpty
        flag 8 (0x9L): vm
        flag 9 (0xaL): a
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
        flag 14 (0xfL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
        flag 15 (0x10L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 17 (0x12L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 18 (0x13L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_CREATE)) : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false ? View.VISIBLE : View.GONE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_LIST)) : false
    flag mapping end*/
    //end
}