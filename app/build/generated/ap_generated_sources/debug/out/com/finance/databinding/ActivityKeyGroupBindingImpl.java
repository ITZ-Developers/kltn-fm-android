package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKeyGroupBindingImpl extends ActivityKeyGroupBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data", "layout_invalid_key"},
            new int[] {3, 4, 5},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rcKeys, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityKeyGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityKeyGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[4]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[3]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[5]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            );
        this.btnAdd.setTag(null);
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutHeader);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        this.swipeLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback93 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        layoutHeader.invalidateAll();
        layoutEmpty.invalidateAll();
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
        if (layoutEmpty.hasPendingBindings()) {
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
            setVm((com.finance.ui.key.group.KeyGroupViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.key.group.KeyGroupActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.key.group.KeyGroupViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.key.group.KeyGroupActivity A) {
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
        layoutEmpty.setLifecycleOwner(lifecycleOwner);
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
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeLayoutEmpty((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
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
    private boolean onChangeVmTotalElement(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElement, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        boolean vmIsValidKeyVmTotalElementInt0BooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        boolean VmIsValidKey1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = 0;
        com.finance.ui.key.group.KeyGroupViewModel vm = mVm;
        java.lang.Integer vmTotalElementGet = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        int VmIsValidKeyViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalse = false;
        com.finance.ui.key.group.KeyGroupActivity a = mA;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        int vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE = false;
        boolean vmTotalElementInt0 = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalseViewVISIBLEViewGONE = 0;

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
            if((dirtyFlags & 0xacL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0xa4L) != 0) {
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
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                    vmIsValidKeyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0xa4L) != 0) {
                    if(VmIsValidKey1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                    VmIsValidKeyViewVISIBLEViewGONE1 = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)
                    aCheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_GROUP_CREATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE);
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (vm != null) {
                    // read vm.totalElement
                    vmTotalElement = vm.totalElement;
                }
                updateRegistration(3, vmTotalElement);


                if (vmTotalElement != null) {
                    // read vm.totalElement.get()
                    vmTotalElementGet = vmTotalElement.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0
                vmTotalElementInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet) == (0);
        }

        if ((dirtyFlags & 0xacL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
                vmIsValidKeyVmTotalElementInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (vmTotalElementInt0) : (false));
            if((dirtyFlags & 0xacL) != 0) {
                if(vmIsValidKeyVmTotalElementInt0BooleanFalse) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyVmTotalElementInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xe4L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATE) : (false));
            if((dirtyFlags & 0xe4L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback93);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.key_group_management));
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
        }
        if ((dirtyFlags & 0xe4L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONKEYINFOGROUPCREATEBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xacL) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(VmIsValidKeyViewVISIBLEViewGONE1);
            this.swipeLayout.setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutEmpty);
        executeBindingsOn(layoutInvalidKey);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        com.finance.ui.key.group.KeyGroupActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.navigateToDetails();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): layoutInvalidKey
        flag 2 (0x3L): vm.isValidKey
        flag 3 (0x4L): vm.totalElement
        flag 4 (0x5L): layoutEmpty
        flag 5 (0x6L): vm
        flag 6 (0x7L): a
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_CREATE)) : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}