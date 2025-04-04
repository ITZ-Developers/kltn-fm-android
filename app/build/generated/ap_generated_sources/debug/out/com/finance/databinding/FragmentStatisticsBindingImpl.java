package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStatisticsBindingImpl extends FragmentStatisticsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data", "layout_invalid_key"},
            new int[] {2, 3},
            new int[] {com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 4);
        sViewsWithIds.put(R.id.tv_title, 5);
        sViewsWithIds.put(R.id.rcv_statistics, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStatisticsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentStatisticsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[2]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        this.swipeLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
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
            setVm((com.finance.ui.fragment.statistics.StatisticsFragmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.statistics.StatisticsFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.statistics.StatisticsFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.statistics.StatisticsFragment A) {
        this.mA = A;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutEmpty.setLifecycleOwner(lifecycleOwner);
        layoutInvalidKey.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 1 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeLayoutEmpty((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsValidKey(androidx.databinding.ObservableField<java.lang.Boolean> VmIsValidKey, int fieldId) {
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
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyDataBinding LayoutEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        com.finance.ui.fragment.statistics.StatisticsFragmentViewModel vm = mVm;
        java.lang.Integer vmTotalElementGet = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        int VmIsValidKeyViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        int vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmTotalElementInt0 = false;

        if ((dirtyFlags & 0x56L) != 0) {



                if (vm != null) {
                    // read vm.isValidKey
                    vmIsValidKey = vm.isValidKey;
                }
                updateRegistration(1, vmIsValidKey);


                if (vmIsValidKey != null) {
                    // read vm.isValidKey.get()
                    vmIsValidKeyGet = vmIsValidKey.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
            if((dirtyFlags & 0x56L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x52L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }

            if ((dirtyFlags & 0x52L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                    VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                    vmIsValidKeyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x52L) != 0) {
                    if(VmIsValidKey1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                    VmIsValidKeyViewVISIBLEViewGONE1 = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

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

        if ((dirtyFlags & 0x56L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
                vmIsValidKeyVmTotalElementInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (vmTotalElementInt0) : (false));
            if((dirtyFlags & 0x56L) != 0) {
                if(vmIsValidKeyVmTotalElementInt0BooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyVmTotalElementInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x56L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(VmIsValidKeyViewVISIBLEViewGONE1);
            this.swipeLayout.setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutEmpty);
        executeBindingsOn(layoutInvalidKey);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutInvalidKey
        flag 1 (0x2L): vm.isValidKey
        flag 2 (0x3L): vm.totalElement
        flag 3 (0x4L): layoutEmpty
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}