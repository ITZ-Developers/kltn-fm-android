package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutHeaderTitleBindingImpl extends LayoutHeaderTitleBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 3);
        sViewsWithIds.put(R.id.button_back, 4);
        sViewsWithIds.put(R.id.layout_other, 5);
        sViewsWithIds.put(R.id.img_other, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback184;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutHeaderTitleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutHeaderTitleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.layoutBack.setTag(null);
        this.layoutMain.setTag(null);
        this.tvHeaderTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback184 = new com.finance.generated.callback.OnClickListener(this, 1);
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
            setA((androidx.appcompat.app.AppCompatActivity) variable);
        }
        else if (BR.isBack == variableId) {
            setIsBack((boolean) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setA(@Nullable androidx.appcompat.app.AppCompatActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }
    public void setIsBack(boolean IsBack) {
        this.mIsBack = IsBack;
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.title);
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
        androidx.appcompat.app.AppCompatActivity a = mA;
        java.lang.String title = mTitle;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.layoutBack.setOnClickListener(mCallback184);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeaderTitle, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        androidx.appcompat.app.AppCompatActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.onBackPressed();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): a
        flag 1 (0x2L): isBack
        flag 2 (0x3L): title
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}