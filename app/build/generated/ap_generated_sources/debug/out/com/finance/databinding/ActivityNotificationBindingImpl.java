package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNotificationBindingImpl extends ActivityNotificationBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_notification"},
            new int[] {5, 6},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_notification});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_option, 7);
        sViewsWithIds.put(R.id.rcNotification, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback102;
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.finance.databinding.LayoutEmptyNotificationBinding) bindings[6]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[4]
            );
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.swipeLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback102 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback100 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback99 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback103 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback101 = new com.finance.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setVm((com.finance.ui.nofication.NotificationViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.nofication.NotificationActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.nofication.NotificationViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.nofication.NotificationActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeVmIsShowFilter((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeLayoutEmpty((com.finance.databinding.LayoutEmptyNotificationBinding) object, fieldId);
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
    private boolean onChangeVmIsShowFilter(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowFilter, int fieldId) {
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
    private boolean onChangeLayoutEmpty(com.finance.databinding.LayoutEmptyNotificationBinding LayoutEmpty, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = 0;
        com.finance.ui.nofication.NotificationViewModel vm = mVm;
        java.lang.Boolean vmIsShowFilterGet = null;
        java.lang.Integer vmTotalElementGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowFilter = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowFilterGet = false;
        com.finance.ui.nofication.NotificationActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        int vmIsShowFilterViewVISIBLEViewGONE = 0;
        int vmTotalElementInt0ViewVISIBLEViewGONE = 0;
        boolean vmTotalElementInt0 = false;

        if ((dirtyFlags & 0x56L) != 0) {


            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.isShowFilter
                        vmIsShowFilter = vm.isShowFilter;
                    }
                    updateRegistration(1, vmIsShowFilter);


                    if (vmIsShowFilter != null) {
                        // read vm.isShowFilter.get()
                        vmIsShowFilterGet = vmIsShowFilter.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowFilter.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowFilterGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowFilterGet);
                if((dirtyFlags & 0x52L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowFilterGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowFilter.get()) ? View.VISIBLE : View.GONE
                    vmIsShowFilterViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowFilterGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x54L) != 0) {

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
                if((dirtyFlags & 0x54L) != 0) {
                    if(vmTotalElementInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
                    vmTotalElementInt0ViewVISIBLEViewGONE = ((vmTotalElementInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmTotalElementInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.no_notification));
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.menu_notification));
            this.layoutHeader.getRoot().setOnClickListener(mCallback100);
            this.layoutMain.setOnClickListener(mCallback99);
            this.mboundView2.setOnClickListener(mCallback101);
            this.mboundView3.setOnClickListener(mCallback102);
            this.swipeLayout.setOnClickListener(mCallback103);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(vmIsShowFilterViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
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
                com.finance.ui.nofication.NotificationActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteAllNotification();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.nofication.NotificationViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.closeFilter();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.nofication.NotificationViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.closeFilter();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.nofication.NotificationViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.closeFilter();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.nofication.NotificationActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.readAllNotification();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isShowFilter
        flag 2 (0x3L): vm.totalElement
        flag 3 (0x4L): layoutEmpty
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowFilter.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowFilter.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}