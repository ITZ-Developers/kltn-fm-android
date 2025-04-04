package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTaskFilterBindingImpl extends ActivityTaskFilterBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 6);
        sViewsWithIds.put(R.id.tv_header_title, 7);
        sViewsWithIds.put(R.id.layout_filter, 8);
        sViewsWithIds.put(R.id.swipe_layout, 9);
        sViewsWithIds.put(R.id.rcv_selects, 10);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTaskFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityTaskFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            );
        this.btnFilter.setTag(null);
        this.layoutMain.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvDone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback74 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback72 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback76 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback75 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback73 = new com.finance.generated.callback.OnClickListener(this, 2);
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
            setVm((com.finance.ui.task.filter.TaskFilterViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.task.filter.TaskFilterActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.task.filter.TaskFilterViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.task.filter.TaskFilterActivity A) {
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
        int androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet = 0;
        com.finance.ui.task.filter.TaskFilterViewModel vm = mVm;
        android.graphics.drawable.Drawable vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = null;
        com.finance.ui.task.filter.TaskFilterActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Integer> vmCategory = null;
        java.lang.Integer vmCategoryGet = null;
        boolean vmCategoryInt1 = false;
        boolean vmCategoryInt2 = false;

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


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1
                vmCategoryInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2
                vmCategoryInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmCategoryGet) == (2);
            if((dirtyFlags & 0xbL) != 0) {
                if(vmCategoryInt1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
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


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = ((vmCategoryInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_blank)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                vmCategoryInt2MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank = ((vmCategoryInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_blank)));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnFilter.setOnClickListener(mCallback72);
            this.mboundView3.setOnClickListener(mCallback74);
            this.mboundView4.setOnClickListener(mCallback75);
            this.mboundView5.setOnClickListener(mCallback76);
            this.tvDone.setOnClickListener(mCallback73);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, vmCategoryInt1MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView5, vmCategoryInt2MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank);
        }
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
                com.finance.ui.task.filter.TaskFilterActivity a = mA;



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
                com.finance.ui.task.filter.TaskFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.filter.TaskFilterActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.selectCategory(2);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.filter.TaskFilterActivity a = mA;



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
                com.finance.ui.task.filter.TaskFilterActivity a = mA;



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
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.category.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
    flag mapping end*/
    //end
}