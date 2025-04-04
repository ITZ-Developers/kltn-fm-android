package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTransactionGroupDetailBindingImpl extends ActivityTransactionGroupDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {6},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTransactionGroupDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityTransactionGroupDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[6]
            );
        this.btnEPUpdate.setTag(null);
        this.editGroupTransactionDescription.setTag(null);
        this.editGroupTransactionName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback69 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback70 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback68 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback71 = new com.finance.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.finance.ui.transaction.group.detail.TransactionGroupDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.transaction.group.detail.TransactionGroupDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
                return onChangeVmIsCreate((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmIsCreate(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse = false;
        com.finance.ui.transaction.group.detail.TransactionGroupDetailViewModel vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE = false;
        int vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse = false;
        java.lang.Boolean vmIsCreateGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE = null;
        com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity a = mA;
        java.lang.String vmIsCreateAndroidStringAddNewGroupTransactionAndroidStringDetailGroupTransaction = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreate = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = false;
        boolean VmIsCreate1 = false;

        if ((dirtyFlags & 0x1eL) != 0) {



                if (vm != null) {
                    // read vm.isCreate
                    vmIsCreate = vm.isCreate;
                }
                updateRegistration(1, vmIsCreate);


                if (vmIsCreate != null) {
                    // read vm.isCreate.get()
                    vmIsCreateGet = vmIsCreate.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreateGet);
            if((dirtyFlags & 0x1eL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x16L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }

            if ((dirtyFlags & 0x16L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_group_transaction : @android:string/detail_group_transaction
                    vmIsCreateAndroidStringAddNewGroupTransactionAndroidStringDetailGroupTransaction = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (getRoot().getResources().getString(R.string.add_new_group_transaction)) : (getRoot().getResources().getString(R.string.detail_group_transaction)));
            }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)
                    aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_GROUP_TRANSACTION_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE);
            if((dirtyFlags & 0x200L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {



                if (vm != null) {
                    // read vm.isCreate
                    vmIsCreate = vm.isCreate;
                }
                updateRegistration(1, vmIsCreate);


                if (vmIsCreate != null) {
                    // read vm.isCreate.get()
                    vmIsCreateGet = vmIsCreate.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreateGet);
            if((dirtyFlags & 0x1eL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x16L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get())
                VmIsCreate1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet;
        }

        if ((dirtyFlags & 0x200L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
                aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATE) ? (VmIsCreate1) : (false));
        }

        if ((dirtyFlags & 0x1eL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (true) : (aCheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse));
            if((dirtyFlags & 0x1eL) != 0) {
                if(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false ? View.VISIBLE : View.GONE
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalseViewVISIBLEViewGONE = ((vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback71);
            this.mboundView0.setOnClickListener(mCallback68);
            this.mboundView1.setOnClickListener(mCallback69);
            this.mboundView2.setOnClickListener(mCallback70);
        }
        if ((dirtyFlags & 0x1eL) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalseViewVISIBLEViewGONE);
            this.editGroupTransactionDescription.setEnabled(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse);
            this.editGroupTransactionName.setEnabled(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONGROUPTRANSACTIONUPDATEVmIsCreateBooleanFalse);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.layoutHeader.setTitle(vmIsCreateAndroidStringAddNewGroupTransactionAndroidStringDetailGroupTransaction);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity a = mA;



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
                com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.group.detail.TransactionGroupDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdateTransactionGroup();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isCreate
        flag 2 (0x3L): vm
        flag 3 (0x4L): a
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_GROUP_TRANSACTION_UPDATE)) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_group_transaction : @android:string/detail_group_transaction
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_group_transaction : @android:string/detail_group_transaction
    flag mapping end*/
    //end
}