package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDepartmentBindingImpl extends ActivityDepartmentBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data"},
            new int[] {2, 3},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipe_layout, 4);
        sViewsWithIds.put(R.id.rcDepartments, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback219;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDepartmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityDepartmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[3]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[2]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[4]
            );
        this.btnAdd.setTag(null);
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        setRootTag(root);
        // listeners
        mCallback219 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setVm((com.finance.ui.department.DepartmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.department.DepartmentActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.department.DepartmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.department.DepartmentActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
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
    private boolean onChangeVmTotalElement(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElement, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEPARTMENTCREATE = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = 0;
        com.finance.ui.department.DepartmentViewModel vm = mVm;
        java.lang.Integer vmTotalElementGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATE = null;
        com.finance.ui.department.DepartmentActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        int vmTotalElementInt0ViewVISIBLEViewGONE = 0;
        boolean vmTotalElementInt0 = false;
        int aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATEViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x2aL) != 0) {



                if (vm != null) {
                    // read vm.totalElement
                    vmTotalElement = vm.totalElement;
                }
                updateRegistration(1, vmTotalElement);


                if (vmTotalElement != null) {
                    // read vm.totalElement.get()
                    vmTotalElementGet = vmTotalElement.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0
                vmTotalElementInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet) == (0);
            if((dirtyFlags & 0x2aL) != 0) {
                if(vmTotalElementInt0) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
                vmTotalElementInt0ViewVISIBLEViewGONE = ((vmTotalElementInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x30L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_DEPARTMENT_CREATE)
                    aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_DEPARTMENT_CREATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEPARTMENT_CREATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEPARTMENTCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATE);
            if((dirtyFlags & 0x30L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEPARTMENTCREATE) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEPARTMENT_CREATE)) ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATEViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEPARTMENTCREATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback219);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.department_management));
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(aCheckPermissionConstantsPERMISSIONDEPARTMENTCREATEViewVISIBLEViewGONE);
            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmTotalElementInt0ViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutEmpty);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        com.finance.ui.department.DepartmentActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.navigateToDetails();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.totalElement
        flag 2 (0x3L): layoutEmpty
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEPARTMENT_CREATE)) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEPARTMENT_CREATE)) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}