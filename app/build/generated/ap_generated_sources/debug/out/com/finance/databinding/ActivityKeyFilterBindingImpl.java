package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKeyFilterBindingImpl extends ActivityKeyFilterBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 8);
        sViewsWithIds.put(R.id.tv_header_title, 9);
        sViewsWithIds.put(R.id.layout_filter, 10);
        sViewsWithIds.put(R.id.swipe_layout, 11);
        sViewsWithIds.put(R.id.rcv_selects, 12);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityKeyFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityKeyFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.HorizontalScrollView) bindings[10]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            );
        this.btnFilter.setTag(null);
        this.layoutMain.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.tvDone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback47 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback45 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback43 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback48 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback46 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback44 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.key.filter.KeyFilterViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.key.filter.KeyFilterActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.key.filter.KeyFilterViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.key.filter.KeyFilterActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCategory((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCategory(androidx.databinding.ObservableField<java.lang.Integer> VmCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        android.graphics.drawable.Drawable vmCategoryInt2MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank = null;
        android.graphics.drawable.Drawable vmCategoryInt4MboundView7AndroidDrawableBgWhiteCornerMboundView7AndroidDrawableBgBlank = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet = 0;
        boolean vmCategoryInt3 = false;
        com.finance.ui.key.filter.KeyFilterViewModel vm = mVm;
        android.graphics.drawable.Drawable vmCategoryInt3MboundView6AndroidDrawableBgWhiteCornerMboundView6AndroidDrawableBgBlank = null;
        android.graphics.drawable.Drawable vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = null;
        com.finance.ui.key.filter.KeyFilterActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Integer> vmCategory = null;
        java.lang.Integer vmCategoryGet = null;
        boolean vmCategoryInt1 = false;
        boolean vmCategoryInt2 = false;
        boolean vmCategoryInt4 = false;

        if ((dirtyFlags & 0xbL) != 0) {



                if (vm != null) {
                    // read vm.category
                    vmCategory = vm.category;
                }
                updateRegistration(0, vmCategory);


                if (vmCategory != null) {
                    // read vm.category.get()
                    vmCategoryGet = vmCategory.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get())
                androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet = androidx.databinding.ViewDataBinding.safeUnbox(vmCategoryGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 3
                vmCategoryInt3 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (3);
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1
                vmCategoryInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2
                vmCategoryInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (2);
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 4
                vmCategoryInt4 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (4);
            if((dirtyFlags & 0xbL) != 0) {
                if(vmCategoryInt3) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0xbL) != 0) {
                if(vmCategoryInt1) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xbL) != 0) {
                if(vmCategoryInt2) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xbL) != 0) {
                if(vmCategoryInt4) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt3MboundView6AndroidDrawableBgWhiteCornerMboundView6AndroidDrawableBgBlank = ((vmCategoryInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.bg_blank)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = ((vmCategoryInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_blank)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt2MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank = ((vmCategoryInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_blank)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 4 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt4MboundView7AndroidDrawableBgWhiteCornerMboundView7AndroidDrawableBgBlank = ((vmCategoryInt4) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.bg_blank)));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnFilter.setOnClickListener(mCallback43);
            this.mboundView3.setOnClickListener(mCallback45);
            this.mboundView4.setOnClickListener(mCallback46);
            this.mboundView5.setOnClickListener(mCallback47);
            this.mboundView6.setOnClickListener(mCallback48);
            this.mboundView7.setOnClickListener(mCallback49);
            this.tvDone.setOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView5, vmCategoryInt2MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView6, vmCategoryInt3MboundView6AndroidDrawableBgWhiteCornerMboundView6AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, vmCategoryInt4MboundView7AndroidDrawableBgWhiteCornerMboundView7AndroidDrawableBgBlank);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.selectCategory(4);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.selectCategory(2);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.clearFilter();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.selectCategory(3);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.selectCategory(1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.filter.KeyFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.filter();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.category
        flag 1 (0x2L): vm
        flag 2 (0x3L): a
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 4 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 4 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 3 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
    flag mapping end*/
    //end
}