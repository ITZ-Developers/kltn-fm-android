package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTagKindBindingImpl extends ItemTagKindBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTagKindBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemTagKindBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            );
        this.layoutMain.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.tagName == variableId) {
            setTagName((java.lang.String) variable);
        }
        else if (BR.selectedName == variableId) {
            setSelectedName((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTagName(@Nullable java.lang.String TagName) {
        this.mTagName = TagName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tagName);
        super.requestRebind();
    }
    public void setSelectedName(@Nullable java.lang.String SelectedName) {
        this.mSelectedName = SelectedName;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.selectedName);
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
        java.lang.String tagName = mTagName;
        int tagNameSelectedNameMboundView1AndroidColorWhiteMboundView1AndroidColorColorTheme = 0;
        boolean tagNameSelectedName = false;
        android.graphics.drawable.Drawable tagNameSelectedNameLayoutMainAndroidDrawableBgTagKindSelectLayoutMainAndroidDrawableBgTagKind = null;
        java.lang.String selectedName = mSelectedName;

        if ((dirtyFlags & 0x7L) != 0) {



                // read tagName == selectedName
                tagNameSelectedName = (tagName) == (selectedName);
            if((dirtyFlags & 0x7L) != 0) {
                if(tagNameSelectedName) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read tagName == selectedName ? @android:color/white : @android:color/color_theme
                tagNameSelectedNameMboundView1AndroidColorWhiteMboundView1AndroidColorColorTheme = ((tagNameSelectedName) ? (getColorFromResource(mboundView1, R.color.white)) : (getColorFromResource(mboundView1, R.color.color_theme)));
                // read tagName == selectedName ? @android:drawable/bg_tag_kind_select : @android:drawable/bg_tag_kind
                tagNameSelectedNameLayoutMainAndroidDrawableBgTagKindSelectLayoutMainAndroidDrawableBgTagKind = ((tagNameSelectedName) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutMain.getContext(), R.drawable.bg_tag_kind_select)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutMain.getContext(), R.drawable.bg_tag_kind)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.layoutMain, tagNameSelectedNameLayoutMainAndroidDrawableBgTagKindSelectLayoutMainAndroidDrawableBgTagKind);
            this.mboundView1.setTextColor(tagNameSelectedNameMboundView1AndroidColorWhiteMboundView1AndroidColorColorTheme);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, tagName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tagName
        flag 1 (0x2L): selectedName
        flag 2 (0x3L): null
        flag 3 (0x4L): tagName == selectedName ? @android:color/white : @android:color/color_theme
        flag 4 (0x5L): tagName == selectedName ? @android:color/white : @android:color/color_theme
        flag 5 (0x6L): tagName == selectedName ? @android:drawable/bg_tag_kind_select : @android:drawable/bg_tag_kind
        flag 6 (0x7L): tagName == selectedName ? @android:drawable/bg_tag_kind_select : @android:drawable/bg_tag_kind
    flag mapping end*/
    //end
}