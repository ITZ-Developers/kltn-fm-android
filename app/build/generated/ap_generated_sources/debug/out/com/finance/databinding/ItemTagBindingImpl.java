package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTagBindingImpl extends ItemTagBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRevealLayout, 3);
        sViewsWithIds.put(R.id.img_delete, 4);
        sViewsWithIds.put(R.id.layout_main, 5);
        sViewsWithIds.put(R.id.img_tag, 6);
        sViewsWithIds.put(R.id.img_detail, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTagBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemTagBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[5]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[3]
            );
        this.layoutDelete.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.secretKey == variableId) {
            setSecretKey((java.lang.String) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.tag.TagResponse) variable);
        }
        else if (BR.permissionDelete == variableId) {
            setPermissionDelete((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecretKey(@Nullable java.lang.String SecretKey) {
        this.mSecretKey = SecretKey;
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.tag.TagResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ivm);
        super.requestRebind();
    }
    public void setPermissionDelete(@Nullable java.lang.Boolean PermissionDelete) {
        this.mPermissionDelete = PermissionDelete;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.permissionDelete);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String ivmName = null;
        int permissionDeleteViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.tag.TagResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;

        if ((dirtyFlags & 0xaL) != 0) {



                if (ivm != null) {
                    // read ivm.name
                    ivmName = ivm.getName();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete)
                androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
                permissionDeleteViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, ivmName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): ivm
        flag 2 (0x3L): permissionDelete
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}