package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogDeleteBindingImpl extends DialogDeleteBinding implements com.finance.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback162;
    @Nullable
    private final android.view.View.OnClickListener mCallback161;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogDeleteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private DialogDeleteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            );
        this.btnCancel.setTag(null);
        this.btnDelete.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback162 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback161 = new com.finance.generated.callback.OnClickListener(this, 1);
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
        if (BR.dialog == variableId) {
            setDialog((com.finance.ui.dialog.DeleteDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDialog(@Nullable com.finance.ui.dialog.DeleteDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogTitle(androidx.databinding.ObservableField<java.lang.String> DialogTitle, int fieldId) {
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
        java.lang.String mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangStringMboundView1AndroidStringThat = null;
        com.finance.ui.dialog.DeleteDialog dialog = mDialog;
        java.lang.String mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitle = null;
        java.lang.String mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangString = null;
        java.lang.String dialogTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> dialogTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (dialog != null) {
                    // read dialog.title
                    dialogTitle = dialog.title;
                }
                updateRegistration(0, dialogTitle);


                if (dialogTitle != null) {
                    // read dialog.title.get()
                    dialogTitleGet = dialogTitle.get();
                }


                // read ((@android:string/confirm_delete) + (" ")) + (dialog.title.get())
                mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitle = ((mboundView1.getResources().getString(R.string.confirm_delete)) + (" ")) + (dialogTitleGet);


                // read (((@android:string/confirm_delete) + (" ")) + (dialog.title.get())) + (" ")
                mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangString = (mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitle) + (" ");


                // read ((((@android:string/confirm_delete) + (" ")) + (dialog.title.get())) + (" ")) + (@android:string/that)
                mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangStringMboundView1AndroidStringThat = (mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangString) + (mboundView1.getResources().getString(R.string.that));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback161);
            this.btnDelete.setOnClickListener(mCallback162);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringConfirmDeleteJavaLangStringDialogTitleJavaLangStringMboundView1AndroidStringThat);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.DeleteDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.confirmDelete();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // dialog
                com.finance.ui.dialog.DeleteDialog dialog = mDialog;
                // dialog != null
                boolean dialogJavaLangObjectNull = false;



                dialogJavaLangObjectNull = (dialog) != (null);
                if (dialogJavaLangObjectNull) {


                    dialog.cancelDelete();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dialog.title
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}