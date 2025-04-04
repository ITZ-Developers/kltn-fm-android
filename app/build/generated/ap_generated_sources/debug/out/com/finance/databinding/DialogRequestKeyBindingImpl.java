package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogRequestKeyBindingImpl extends DialogRequestKeyBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_email, 6);
        sViewsWithIds.put(R.id.layout_password, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback159;
    @Nullable
    private final android.view.View.OnClickListener mCallback158;
    @Nullable
    private final android.view.View.OnClickListener mCallback160;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of dialog.password.get()
            //         is dialog.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword);
            // localize variables for thread safety
            // dialog.password.get()
            java.lang.String dialogPasswordGet = null;
            // dialog.password != null
            boolean dialogPasswordJavaLangObjectNull = false;
            // dialog.password
            androidx.databinding.ObservableField<java.lang.String> dialogPassword = null;
            // dialog
            com.finance.ui.dialog.DownLoadDialog dialog = mDialog;
            // dialog != null
            boolean dialogJavaLangObjectNull = false;



            dialogJavaLangObjectNull = (dialog) != (null);
            if (dialogJavaLangObjectNull) {


                dialogPassword = dialog.password;

                dialogPasswordJavaLangObjectNull = (dialogPassword) != (null);
                if (dialogPasswordJavaLangObjectNull) {




                    dialogPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogRequestKeyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DialogRequestKeyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.btnCancel.setTag(null);
        this.btnCreateKey.setTag(null);
        this.editPassword.setTag(null);
        this.imgShowPassword.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback159 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback158 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback160 = new com.finance.generated.callback.OnClickListener(this, 3);
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
        if (BR.dialog == variableId) {
            setDialog((com.finance.ui.dialog.DownLoadDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDialog(@Nullable com.finance.ui.dialog.DownLoadDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDialogIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogPassword(androidx.databinding.ObservableField<java.lang.String> DialogPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDialogIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> DialogIsShowPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String dialogPasswordGet = null;
        android.graphics.drawable.Drawable dialogIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = null;
        androidx.databinding.ObservableField<java.lang.String> dialogPassword = null;
        com.finance.ui.dialog.DownLoadDialog dialog = mDialog;
        java.lang.Boolean dialogIsShowPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> dialogIsShowPassword = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDialogIsShowPasswordGet = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (dialog != null) {
                        // read dialog.password
                        dialogPassword = dialog.password;
                    }
                    updateRegistration(0, dialogPassword);


                    if (dialogPassword != null) {
                        // read dialog.password.get()
                        dialogPasswordGet = dialogPassword.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (dialog != null) {
                        // read dialog.isShowPassword
                        dialogIsShowPassword = dialog.isShowPassword;
                    }
                    updateRegistration(1, dialogIsShowPassword);


                    if (dialogIsShowPassword != null) {
                        // read dialog.isShowPassword.get()
                        dialogIsShowPasswordGet = dialogIsShowPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(dialog.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxDialogIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(dialogIsShowPasswordGet);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDialogIsShowPasswordGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(dialog.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    dialogIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxDialogIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowPassword.getContext(), R.drawable.ic_eye_off)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback159);
            this.btnCreateKey.setOnClickListener(mCallback160);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordandroidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback158);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword, dialogPasswordGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowPassword, dialogIsShowPasswordImgShowPasswordAndroidDrawableIcEyeImgShowPasswordAndroidDrawableIcEyeOff);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.DownLoadDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.cancel();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.DownLoadDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.isShowPassword();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.DownLoadDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.confirm();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dialog.password
        flag 1 (0x2L): dialog.isShowPassword
        flag 2 (0x3L): dialog
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(dialog.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(dialog.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
    flag mapping end*/
    //end
}