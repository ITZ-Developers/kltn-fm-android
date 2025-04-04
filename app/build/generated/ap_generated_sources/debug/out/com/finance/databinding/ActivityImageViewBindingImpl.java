package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityImageViewBindingImpl extends ActivityImageViewBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button_back, 5);
        sViewsWithIds.put(R.id.tv_image_name, 6);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityImageViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityImageViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RelativeLayout) bindings[4]
            , (com.github.chrisbanes.photoview.PhotoView) bindings[1]
            , (android.widget.TextView) bindings[6]
            );
        this.layoutBack.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.photoView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback58 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback57 = new com.finance.generated.callback.OnClickListener(this, 1);
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
        if (BR.a == variableId) {
            setA((com.finance.ui.image.ImageActivity) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.finance.ui.image.ImageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setA(@Nullable com.finance.ui.image.ImageActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }
    public void setVm(@Nullable com.finance.ui.image.ImageViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmShowHeader((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmShowHeader(androidx.databinding.ObservableField<java.lang.Boolean> VmShowHeader, int fieldId) {
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
        com.finance.ui.image.ImageActivity a = mA;
        androidx.databinding.ObservableField<java.lang.Boolean> vmShowHeader = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmShowHeaderGet = false;
        int vmShowHeaderViewVISIBLEViewGONE = 0;
        com.finance.ui.image.ImageViewModel vm = mVm;
        java.lang.Boolean vmShowHeaderGet = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (vm != null) {
                    // read vm.showHeader
                    vmShowHeader = vm.showHeader;
                }
                updateRegistration(0, vmShowHeader);


                if (vmShowHeader != null) {
                    // read vm.showHeader.get()
                    vmShowHeaderGet = vmShowHeader.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.showHeader.get())
                androidxDatabindingViewDataBindingSafeUnboxVmShowHeaderGet = androidx.databinding.ViewDataBinding.safeUnbox(vmShowHeaderGet);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmShowHeaderGet) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.showHeader.get()) ? View.VISIBLE : View.GONE
                vmShowHeaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmShowHeaderGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.layoutBack.setOnClickListener(mCallback58);
            this.photoView.setOnClickListener(mCallback57);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(vmShowHeaderViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(vmShowHeaderViewVISIBLEViewGONE);
        }
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
                com.finance.ui.image.ImageActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.image.ImageViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowHeader();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.showHeader
        flag 1 (0x2L): a
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(vm.showHeader.get()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.showHeader.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}