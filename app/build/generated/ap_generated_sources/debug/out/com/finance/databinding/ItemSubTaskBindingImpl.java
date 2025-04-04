package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSubTaskBindingImpl extends ItemSubTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_change_state, 6);
        sViewsWithIds.put(R.id.img_delete, 7);
        sViewsWithIds.put(R.id.column_state, 8);
        sViewsWithIds.put(R.id.layout_item, 9);
        sViewsWithIds.put(R.id.layout_content, 10);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSubTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ItemSubTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.FrameLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[9]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            );
        this.layoutChangeState.setTag(null);
        this.layoutDelete.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        else if (BR.permissionChangeState == variableId) {
            setPermissionChangeState((java.lang.Boolean) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.task.TaskResponse) variable);
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
    public void setPermissionChangeState(@Nullable java.lang.Boolean PermissionChangeState) {
        this.mPermissionChangeState = PermissionChangeState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.permissionChangeState);
        super.requestRebind();
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.task.TaskResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.ivm);
        super.requestRebind();
    }
    public void setPermissionDelete(@Nullable java.lang.Boolean PermissionDelete) {
        this.mPermissionDelete = PermissionDelete;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        android.graphics.drawable.Drawable ivmStateInt1MboundView5AndroidDrawableIcProcessingMboundView5AndroidDrawableIcCompleted = null;
        java.lang.String ivmName = null;
        android.graphics.drawable.Drawable ivmStateInt1MboundView3AndroidDrawableIcCircleMboundView3AndroidDrawableIcCircleFull = null;
        boolean ivmStateInt1 = false;
        boolean permissionChangeStateIvmStateInt1BooleanFalse = false;
        java.lang.Integer ivmState = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmState = 0;
        int permissionDeleteViewVISIBLEViewGONE = 0;
        java.lang.Boolean permissionChangeState = mPermissionChangeState;
        com.finance.data.model.api.response.task.TaskResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState = false;
        int permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x16L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState)
                androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState = androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState);
            if((dirtyFlags & 0x16L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (ivm != null) {
                    // read ivm.name
                    ivmName = ivm.getName();
                    // read ivm.state
                    ivmState = ivm.getState();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
            if((dirtyFlags & 0x14L) != 0) {
                if(ivmStateInt1) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
                ivmStateInt1MboundView5AndroidDrawableIcProcessingMboundView5AndroidDrawableIcCompleted = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.ic_processing)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.ic_completed)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_circle : @android:drawable/ic_circle_full
                ivmStateInt1MboundView3AndroidDrawableIcCircleMboundView3AndroidDrawableIcCircleFull = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.ic_circle)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.ic_circle_full)));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete)
                androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete);
            if((dirtyFlags & 0x18L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
                permissionDeleteViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {



                if (ivm != null) {
                    // read ivm.state
                    ivmState = ivm.getState();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
            if((dirtyFlags & 0x14L) != 0) {
                if(ivmStateInt1) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }
        }

        if ((dirtyFlags & 0x16L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
                permissionChangeStateIvmStateInt1BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState) ? (ivmStateInt1) : (false));
            if((dirtyFlags & 0x16L) != 0) {
                if(permissionChangeStateIvmStateInt1BooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
                permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE = ((permissionChangeStateIvmStateInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.layoutChangeState.setVisibility(permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView3, ivmStateInt1MboundView3AndroidDrawableIcCircleMboundView3AndroidDrawableIcCircleFull);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView5, ivmStateInt1MboundView5AndroidDrawableIcProcessingMboundView5AndroidDrawableIcCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, ivmName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): permissionChangeState
        flag 2 (0x3L): ivm
        flag 3 (0x4L): permissionDelete
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_circle : @android:drawable/ic_circle_full
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_circle : @android:drawable/ic_circle_full
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}