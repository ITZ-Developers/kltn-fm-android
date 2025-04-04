package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemKeyBindingImpl extends ItemKeyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRevealLayout, 3);
        sViewsWithIds.put(R.id.layout_delete, 4);
        sViewsWithIds.put(R.id.img_delete, 5);
        sViewsWithIds.put(R.id.layoutKey, 6);
        sViewsWithIds.put(R.id.img_read_more, 7);
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

    public ItemKeyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemKeyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[6]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[3]
            );
        this.imgKind.setTag(null);
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
                mDirtyFlags = 0x4L;
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
            setIvm((com.finance.data.model.api.response.key.KeyResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecretKey(@Nullable java.lang.String SecretKey) {
        this.mSecretKey = SecretKey;
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.key.KeyResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ivm);
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
        java.lang.Integer ivmKind = null;
        java.lang.String ivmName = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmKind = 0;
        com.finance.data.model.api.response.key.KeyResponse ivm = mIvm;
        android.graphics.drawable.Drawable ivmKindInt1ImgKindAndroidDrawableIcServerImgKindAndroidDrawableIcWeb = null;
        boolean ivmKindInt1 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (ivm != null) {
                    // read ivm.kind
                    ivmKind = ivm.getKind();
                    // read ivm.name
                    ivmName = ivm.getName();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind)
                androidxDatabindingViewDataBindingSafeUnboxIvmKind = androidx.databinding.ViewDataBinding.safeUnbox(ivmKind);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1
                ivmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmKind) == (1);
            if((dirtyFlags & 0x6L) != 0) {
                if(ivmKindInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:drawable/ic_server : @android:drawable/ic_web
                ivmKindInt1ImgKindAndroidDrawableIcServerImgKindAndroidDrawableIcWeb = ((ivmKindInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgKind.getContext(), R.drawable.ic_server)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgKind.getContext(), R.drawable.ic_web)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgKind, ivmKindInt1ImgKindAndroidDrawableIcServerImgKindAndroidDrawableIcWeb);
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
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:drawable/ic_server : @android:drawable/ic_web
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:drawable/ic_server : @android:drawable/ic_web
    flag mapping end*/
    //end
}