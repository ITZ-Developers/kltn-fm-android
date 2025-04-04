package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNotificationBindingImpl extends ItemNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRevealLayout, 6);
        sViewsWithIds.put(R.id.img_delete, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[2]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.cardView.setTag(null);
        this.layoutDelete.setTag(null);
        this.layoutNotification.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvContent.setTag(null);
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
            setIvm((com.finance.data.model.api.response.notification.NotificationResponse) variable);
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
    public void setIvm(@Nullable com.finance.data.model.api.response.notification.NotificationResponse Ivm) {
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
        boolean ivmStateConstantsNOTIFICATIONSTATEREAD = false;
        boolean ivmStateInt1 = false;
        java.lang.Integer ivmState = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmState = 0;
        java.lang.String ivmMessage = null;
        int permissionDeleteViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable ivmStateInt1LayoutNotificationAndroidDrawableBgTranLayoutNotificationAndroidDrawableBgNotificationRectangle = null;
        com.finance.data.model.api.response.notification.NotificationResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;
        android.graphics.drawable.Drawable ivmStateInt1CardViewAndroidDrawableBgNotificationBeReadCardViewAndroidDrawableBgNotification = null;
        int ivmStateConstantsNOTIFICATIONSTATEREADViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0xaL) != 0) {



                if (ivm != null) {
                    // read ivm.state
                    ivmState = ivm.getState();
                    // read ivm.message
                    ivmMessage = ivm.getMessage();
                }


                // read ivm.state == Constants.NOTIFICATION_STATE_READ
                ivmStateConstantsNOTIFICATIONSTATEREAD = (ivmState) == (com.finance.constant.Constants.NOTIFICATION_STATE_READ);
                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);
            if((dirtyFlags & 0xaL) != 0) {
                if(ivmStateConstantsNOTIFICATIONSTATEREAD) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read ivm.state == Constants.NOTIFICATION_STATE_READ ? View.GONE : View.VISIBLE
                ivmStateConstantsNOTIFICATIONSTATEREADViewGONEViewVISIBLE = ((ivmStateConstantsNOTIFICATIONSTATEREAD) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
            if((dirtyFlags & 0xaL) != 0) {
                if(ivmStateInt1) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_tran : @android:drawable/bg_notification_rectangle
                ivmStateInt1LayoutNotificationAndroidDrawableBgTranLayoutNotificationAndroidDrawableBgNotificationRectangle = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutNotification.getContext(), R.drawable.bg_tran)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutNotification.getContext(), R.drawable.bg_notification_rectangle)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_notification_be_read : @android:drawable/bg_notification
                ivmStateInt1CardViewAndroidDrawableBgNotificationBeReadCardViewAndroidDrawableBgNotification = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cardView.getContext(), R.drawable.bg_notification_be_read)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cardView.getContext(), R.drawable.bg_notification)));
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
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cardView, ivmStateInt1CardViewAndroidDrawableBgNotificationBeReadCardViewAndroidDrawableBgNotification);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.layoutNotification, ivmStateInt1LayoutNotificationAndroidDrawableBgTranLayoutNotificationAndroidDrawableBgNotificationRectangle);
            this.mboundView5.setVisibility(ivmStateConstantsNOTIFICATIONSTATEREADViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContent, ivmMessage);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteViewVISIBLEViewGONE);
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
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_tran : @android:drawable/bg_notification_rectangle
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_tran : @android:drawable/bg_notification_rectangle
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_notification_be_read : @android:drawable/bg_notification
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/bg_notification_be_read : @android:drawable/bg_notification
        flag 10 (0xbL): ivm.state == Constants.NOTIFICATION_STATE_READ ? View.GONE : View.VISIBLE
        flag 11 (0xcL): ivm.state == Constants.NOTIFICATION_STATE_READ ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}