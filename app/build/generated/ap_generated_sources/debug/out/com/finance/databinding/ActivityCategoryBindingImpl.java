package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryBindingImpl extends ActivityCategoryBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data", "layout_invalid_key"},
            new int[] {5, 6, 7},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_filter, 8);
        sViewsWithIds.put(R.id.rcCategories, 9);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[5]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[3]
            );
        this.btnAdd.setTag(null);
        setContainedBinding(this.layoutEmpty);
        setContainedBinding(this.layoutHeader);
        setContainedBinding(this.layoutInvalidKey);
        this.layoutMain.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.swipeLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback21 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback22 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setVm((com.finance.ui.category.CategoryViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.category.CategoryActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.category.CategoryViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.category.CategoryActivity A) {
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
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmTotalElement((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 4 :
                return onChangeVmKind((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 5 :
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
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmKind(androidx.databinding.ObservableField<java.lang.Integer> VmKind, int fieldId) {
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
        boolean vmKindInt2 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        boolean VmIsValidKey1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementGet = 0;
        com.finance.ui.category.CategoryViewModel vm = mVm;
        android.graphics.drawable.Drawable vmKindInt2MboundView2AndroidDrawableBgWhiteCornerMboundView2AndroidDrawableBgBlank = null;
        com.finance.ui.category.CategoryActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElement = null;
        int vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = 0;
        int aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYCREATE = false;
        boolean aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalse = false;
        boolean vmIsValidKeyVmTotalElementInt0BooleanFalse = false;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONCATEGORYCREATE = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmKind = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmKindGet = 0;
        java.lang.Integer vmTotalElementGet = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        int VmIsValidKeyViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean vmKindInt1 = false;
        android.graphics.drawable.Drawable vmKindInt1MboundView1AndroidDrawableBgWhiteCornerMboundView1AndroidDrawableBgBlank = null;
        boolean vmTotalElementInt0 = false;
        java.lang.Integer vmKindGet = null;

        if ((dirtyFlags & 0x156L) != 0) {


            if ((dirtyFlags & 0x146L) != 0) {

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
                if((dirtyFlags & 0x146L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x142L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }

                if ((dirtyFlags & 0x142L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                        VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        vmIsValidKeyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    if((dirtyFlags & 0x142L) != 0) {
                        if(VmIsValidKey1) {
                                dirtyFlags |= 0x400000L;
                        }
                        else {
                                dirtyFlags |= 0x200000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        VmIsValidKeyViewVISIBLEViewGONE1 = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.kind
                        vmKind = vm.kind;
                    }
                    updateRegistration(4, vmKind);


                    if (vmKind != null) {
                        // read vm.kind.get()
                        vmKindGet = vmKind.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmKindGet = androidx.databinding.ViewDataBinding.safeUnbox(vmKindGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2
                    vmKindInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (2);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1
                    vmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (1);
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmKindInt2) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmKindInt1) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt2MboundView2AndroidDrawableBgWhiteCornerMboundView2AndroidDrawableBgBlank = ((vmKindInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt1MboundView1AndroidDrawableBgWhiteCornerMboundView1AndroidDrawableBgBlank = ((vmKindInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.bg_blank)));
            }
        }
        if ((dirtyFlags & 0x1c2L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)
                    aCheckPermissionConstantsPERMISSIONCATEGORYCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_CATEGORY_CREATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONCATEGORYCREATE);
            if((dirtyFlags & 0x1c2L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYCREATE) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {



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
            if((dirtyFlags & 0x146L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
            if((dirtyFlags & 0x142L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }

        if ((dirtyFlags & 0x1c2L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYCREATE) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x1c2L) != 0) {
                if(aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalseViewVISIBLEViewGONE = ((aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

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

        if ((dirtyFlags & 0x146L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
                vmIsValidKeyVmTotalElementInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (vmTotalElementInt0) : (false));
            if((dirtyFlags & 0x146L) != 0) {
                if(vmIsValidKeyVmTotalElementInt0BooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
                vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyVmTotalElementInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback23);
            this.layoutEmpty.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.category_management));
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
            this.mboundView1.setOnClickListener(mCallback21);
            this.mboundView2.setOnClickListener(mCallback22);
        }
        if ((dirtyFlags & 0x1c2L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(aCheckPermissionConstantsPERMISSIONCATEGORYCREATEVmIsValidKeyBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x146L) != 0) {
            // api target 1

            this.layoutEmpty.getRoot().setVisibility(vmIsValidKeyVmTotalElementInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(VmIsValidKeyViewVISIBLEViewGONE1);
            this.swipeLayout.setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, vmKindInt1MboundView1AndroidDrawableBgWhiteCornerMboundView1AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, vmKindInt2MboundView2AndroidDrawableBgWhiteCornerMboundView2AndroidDrawableBgBlank);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutEmpty);
        executeBindingsOn(layoutInvalidKey);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.category.CategoryActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToDetails();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.category.CategoryActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.setKind(1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.category.CategoryActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.setKind(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isValidKey
        flag 2 (0x3L): vm.totalElement
        flag 3 (0x4L): layoutInvalidKey
        flag 4 (0x5L): vm.kind
        flag 5 (0x6L): layoutEmpty
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_CREATE)) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElement.get()) == 0 : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
    flag mapping end*/
    //end
}