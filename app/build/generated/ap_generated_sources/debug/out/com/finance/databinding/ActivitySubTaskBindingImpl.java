package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySubTaskBindingImpl extends ActivitySubTaskBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {3},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipe_layout, 4);
        sViewsWithIds.put(R.id.rcv_tasks, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback153;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySubTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivitySubTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[4]
            );
        this.btnAdd.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback153 = new com.finance.generated.callback.OnClickListener(this, 1);
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
        if (BR.a == variableId) {
            setA((com.finance.ui.subtask.SubTaskActivity) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.finance.ui.subtask.SubTaskViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setA(@Nullable com.finance.ui.subtask.SubTaskActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }
    public void setVm(@Nullable com.finance.ui.subtask.SubTaskViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
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
                return onChangeVmTotalSubTaskElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
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
    private boolean onChangeVmTotalSubTaskElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalSubTaskElements, int fieldId) {
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
        int vmTotalSubTaskElementsInt0ViewVISIBLEViewGONE = 0;
        com.finance.ui.subtask.SubTaskActivity a = mA;
        boolean vmTotalSubTaskElementsInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalSubTaskElementsGet = 0;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalSubTaskElements = null;
        com.finance.ui.subtask.SubTaskViewModel vm = mVm;
        java.lang.Integer vmTotalSubTaskElementsGet = null;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                if (vm != null) {
                    // read vm.totalSubTaskElements
                    vmTotalSubTaskElements = vm.totalSubTaskElements;
                }
                updateRegistration(1, vmTotalSubTaskElements);


                if (vmTotalSubTaskElements != null) {
                    // read vm.totalSubTaskElements.get()
                    vmTotalSubTaskElementsGet = vmTotalSubTaskElements.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalSubTaskElements.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalSubTaskElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalSubTaskElementsGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalSubTaskElements.get()) != 0
                vmTotalSubTaskElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalSubTaskElementsGet) != (0);
            if((dirtyFlags & 0x1aL) != 0) {
                if(vmTotalSubTaskElementsInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalSubTaskElements.get()) != 0 ? View.VISIBLE : View.GONE
                vmTotalSubTaskElementsInt0ViewVISIBLEViewGONE = ((vmTotalSubTaskElementsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback153);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.sub_task));
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(vmTotalSubTaskElementsInt0ViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        com.finance.ui.subtask.SubTaskActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.addNewTask();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.totalSubTaskElements
        flag 2 (0x3L): a
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalSubTaskElements.get()) != 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalSubTaskElements.get()) != 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}