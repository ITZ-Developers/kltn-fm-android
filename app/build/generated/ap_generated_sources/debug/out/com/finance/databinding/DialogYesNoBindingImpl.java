package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogYesNoBindingImpl extends DialogYesNoBinding implements com.finance.generated.callback.OnClickListener.Listener {

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
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogYesNoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private DialogYesNoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            );
        this.btnCancel.setTag(null);
        this.btnSignout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback89 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback88 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setDialog((com.finance.ui.dialog.YesNoDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDialog(@Nullable com.finance.ui.dialog.YesNoDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dialog);
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
        java.lang.String dialogTextConfirm = null;
        com.finance.ui.dialog.YesNoDialog dialog = mDialog;
        java.lang.String dialogTextCancel = null;
        java.lang.String dialogTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dialog != null) {
                    // read dialog.textConfirm
                    dialogTextConfirm = dialog.getTextConfirm();
                    // read dialog.textCancel
                    dialogTextCancel = dialog.getTextCancel();
                    // read dialog.title
                    dialogTitle = dialog.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnCancel, dialogTextCancel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnSignout, dialogTextConfirm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dialogTitle);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback88);
            this.btnSignout.setOnClickListener(mCallback89);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.YesNoDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.confirm();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.YesNoDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.cancel();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dialog
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}