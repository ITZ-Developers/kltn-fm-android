package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDebitDetailBindingImpl extends ActivityDebitDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {14},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_name, 15);
        sViewsWithIds.put(R.id.color_tag, 16);
        sViewsWithIds.put(R.id.tv_title_category, 17);
        sViewsWithIds.put(R.id.tv_title_content, 18);
        sViewsWithIds.put(R.id.rcv_documents, 19);
    }
    // views
    @NonNull
    private final kr.co.prnd.readmore.ReadMoreTextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDebitDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityDebitDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[1]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[14]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.imgState.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView12 = (kr.co.prnd.readmore.ReadMoreTextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.tvState.setTag(null);
        this.tvTag.setTag(null);
        this.tvTotalMoney.setTag(null);
        this.tvTransactionAddedBy.setTag(null);
        this.tvTransactionCategory.setTag(null);
        this.tvTransactionDateCreated.setTag(null);
        this.tvTransactionGroup.setTag(null);
        this.tvTransactionKind.setTag(null);
        this.tvTransactionName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        layoutHeader.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutHeader.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.debit.detail.DebitDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.debit.detail.DebitDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.debit.detail.DebitDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.debit.detail.DebitDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutHeader.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsHaveDocument((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 2 :
                return onChangeVmDebit((androidx.databinding.ObservableField<com.finance.data.model.api.response.debit.DebitResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsHaveDocument(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveDocument, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDebit(androidx.databinding.ObservableField<com.finance.data.model.api.response.debit.DebitResponse> VmDebit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        int vmDebitKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange = 0;
        java.lang.String vmDebitAddedByFullName = null;
        com.finance.ui.debit.detail.DebitDetailViewModel vm = mVm;
        com.finance.data.model.api.response.transaction.Category vmDebitCategory = null;
        boolean vmDebitKindInt1 = false;
        com.finance.data.model.api.response.debit.DebitResponse vmDebitGet = null;
        com.finance.ui.debit.detail.DebitDetailActivity a = mA;
        java.lang.String aDecryptVmDebitTransactionGroupName = null;
        java.lang.String aDecryptVmDebitName = null;
        java.lang.String vmDebitStateInt1TvStateAndroidStringState1VmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        java.lang.String dateUtilsConvertFromUTCToDefaultVmDebitTransactionDate = null;
        com.finance.data.model.api.response.transaction.group.TransactionGroupResponse vmDebitTransactionGroup = null;
        boolean vmDebitStateInt3 = false;
        java.lang.String vmDebitTransactionGroupName = null;
        int vmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        int vmIsHaveDocumentViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.account.AccountResponse vmDebitAddedBy = null;
        java.lang.String vmDebitName = null;
        java.lang.Integer vmDebitKind = null;
        java.lang.String vmDebitMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKindTvTotalMoneyAndroidStringMoneyDefaultMin = null;
        android.graphics.drawable.Drawable vmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        java.lang.String vmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmDebitKind = 0;
        boolean vmDebitStateInt1 = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveDocument = null;
        java.lang.Boolean vmIsHaveDocumentGet = null;
        android.graphics.drawable.Drawable vmDebitStateInt1ImgStateAndroidDrawableIcCreatedVmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        double doubleParseDoubleADecryptVmDebitMoney = 0.0;
        android.graphics.drawable.Drawable vmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.debit.DebitResponse> vmDebit = null;
        int vmDebitTagJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.Integer vmDebitState = null;
        boolean vmDebitMoneyJavaLangObjectNull = false;
        int vmDebitStateInt1TvStateAndroidColorCreatedVmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        int vmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        java.lang.String vmDebitCategoryName = null;
        java.lang.String aDecryptVmDebitCategoryName = null;
        java.lang.String vmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        java.lang.String aDecryptVmDebitNote = null;
        java.lang.String vmDebitMoney = null;
        boolean vmDebitStateInt2 = false;
        java.lang.String vmDebitTagName = null;
        boolean vmDebitTagJavaLangObjectNull = false;
        java.lang.String numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKind = null;
        java.lang.String vmDebitNote = null;
        java.lang.String aDecryptVmDebitMoney = null;
        java.lang.String aDecryptVmDebitTagName = null;
        java.lang.String vmDebitTransactionDate = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveDocumentGet = false;
        java.lang.String vmDebitKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2 = null;
        com.finance.data.model.api.response.tag.TagResponse vmDebitTag = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmDebitState = 0;

        if ((dirtyFlags & 0x3dL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveDocument
                        vmIsHaveDocument = vm.isHaveDocument;
                    }
                    updateRegistration(0, vmIsHaveDocument);


                    if (vmIsHaveDocument != null) {
                        // read vm.isHaveDocument.get()
                        vmIsHaveDocumentGet = vmIsHaveDocument.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveDocument.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveDocumentGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveDocumentGet);
                if((dirtyFlags & 0x29L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveDocumentGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveDocument.get()) ? View.VISIBLE : View.GONE
                    vmIsHaveDocumentViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveDocumentGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3cL) != 0) {

                    if (vm != null) {
                        // read vm.debit
                        vmDebit = vm.debit;
                    }
                    updateRegistration(2, vmDebit);


                    if (vmDebit != null) {
                        // read vm.debit.get()
                        vmDebitGet = vmDebit.get();
                    }


                    if (vmDebitGet != null) {
                        // read vm.debit.get().category
                        vmDebitCategory = vmDebitGet.getCategory();
                        // read vm.debit.get().transactionGroup
                        vmDebitTransactionGroup = vmDebitGet.getTransactionGroup();
                        // read vm.debit.get().name
                        vmDebitName = vmDebitGet.getName();
                        // read vm.debit.get().money
                        vmDebitMoney = vmDebitGet.getMoney();
                        // read vm.debit.get().note
                        vmDebitNote = vmDebitGet.getNote();
                        // read vm.debit.get().tag
                        vmDebitTag = vmDebitGet.getTag();
                    }


                    if (vmDebitCategory != null) {
                        // read vm.debit.get().category.name
                        vmDebitCategoryName = vmDebitCategory.getName();
                    }
                    if (vmDebitTransactionGroup != null) {
                        // read vm.debit.get().transactionGroup.name
                        vmDebitTransactionGroupName = vmDebitTransactionGroup.getName();
                    }
                    // read vm.debit.get().money != null
                    vmDebitMoneyJavaLangObjectNull = (vmDebitMoney) != (null);
                if((dirtyFlags & 0x3cL) != 0) {
                    if(vmDebitMoneyJavaLangObjectNull) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                    if (vmDebitTag != null) {
                        // read vm.debit.get().tag.name
                        vmDebitTagName = vmDebitTag.getName();
                    }
                if ((dirtyFlags & 0x2cL) != 0) {

                        // read vm.debit.get().tag != null
                        vmDebitTagJavaLangObjectNull = (vmDebitTag) != (null);
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmDebitTagJavaLangObjectNull) {
                                dirtyFlags |= 0x2000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000L;
                        }
                    }


                        // read vm.debit.get().tag != null ? View.VISIBLE : View.GONE
                        vmDebitTagJavaLangObjectNullViewVISIBLEViewGONE = ((vmDebitTagJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x2cL) != 0) {

                        if (vmDebitGet != null) {
                            // read vm.debit.get().addedBy
                            vmDebitAddedBy = vmDebitGet.getAddedBy();
                            // read vm.debit.get().kind
                            vmDebitKind = vmDebitGet.getKind();
                            // read vm.debit.get().state
                            vmDebitState = vmDebitGet.getState();
                            // read vm.debit.get().transactionDate
                            vmDebitTransactionDate = vmDebitGet.getTransactionDate();
                        }


                        if (vmDebitAddedBy != null) {
                            // read vm.debit.get().addedBy.fullName
                            vmDebitAddedByFullName = vmDebitAddedBy.getFullName();
                        }
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind)
                        androidxDatabindingViewDataBindingSafeUnboxVmDebitKind = androidx.databinding.ViewDataBinding.safeUnbox(vmDebitKind);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state)
                        androidxDatabindingViewDataBindingSafeUnboxVmDebitState = androidx.databinding.ViewDataBinding.safeUnbox(vmDebitState);
                        // read DateUtils.convertFromUTCToDefault(vm.debit.get().transactionDate)
                        dateUtilsConvertFromUTCToDefaultVmDebitTransactionDate = com.finance.utils.DateUtils.convertFromUTCToDefault(vmDebitTransactionDate);


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1
                        vmDebitKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmDebitKind) == (1);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1
                        vmDebitStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmDebitState) == (1);
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmDebitKindInt1) {
                                dirtyFlags |= 0x80L;
                                dirtyFlags |= 0x200000000L;
                        }
                        else {
                                dirtyFlags |= 0x40L;
                                dirtyFlags |= 0x100000000L;
                        }
                    }
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmDebitStateInt1) {
                                dirtyFlags |= 0x200L;
                                dirtyFlags |= 0x200000L;
                                dirtyFlags |= 0x8000000L;
                        }
                        else {
                                dirtyFlags |= 0x100L;
                                dirtyFlags |= 0x100000L;
                                dirtyFlags |= 0x4000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:color/black : @android:color/red_orange
                        vmDebitKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange = ((vmDebitKindInt1) ? (getColorFromResource(tvTotalMoney, R.color.black)) : (getColorFromResource(tvTotalMoney, R.color.red_orange)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
                        vmDebitKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2 = ((vmDebitKindInt1) ? (tvTransactionKind.getResources().getString(R.string.kind_1)) : (tvTransactionKind.getResources().getString(R.string.kind_2)));
                }
            }
        }
        if ((dirtyFlags & 0x3cL) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.debit.get().transactionGroup.name)
                    aDecryptVmDebitTransactionGroupName = a.decrypt(vmDebitTransactionGroupName);
                    // read a.decrypt(vm.debit.get().name)
                    aDecryptVmDebitName = a.decrypt(vmDebitName);
                    // read a.decrypt(vm.debit.get().category.name)
                    aDecryptVmDebitCategoryName = a.decrypt(vmDebitCategoryName);
                    // read a.decrypt(vm.debit.get().note)
                    aDecryptVmDebitNote = a.decrypt(vmDebitNote);
                    // read a.decrypt(vm.debit.get().tag.name)
                    aDecryptVmDebitTagName = a.decrypt(vmDebitTagName);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x4108100L) != 0) {



                if (vm != null) {
                    // read vm.debit
                    vmDebit = vm.debit;
                }
                updateRegistration(2, vmDebit);


                if (vmDebit != null) {
                    // read vm.debit.get()
                    vmDebitGet = vmDebit.get();
                }

            if ((dirtyFlags & 0x8000L) != 0) {

                    if (vmDebitGet != null) {
                        // read vm.debit.get().kind
                        vmDebitKind = vmDebitGet.getKind();
                    }
            }
            if ((dirtyFlags & 0x4100100L) != 0) {

                    if (vmDebitGet != null) {
                        // read vm.debit.get().state
                        vmDebitState = vmDebitGet.getState();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state)
                    androidxDatabindingViewDataBindingSafeUnboxVmDebitState = androidx.databinding.ViewDataBinding.safeUnbox(vmDebitState);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2
                    vmDebitStateInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmDebitState) == (2);
                if((dirtyFlags & 0x100000L) != 0) {
                    if(vmDebitStateInt2) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x100L) != 0) {
                    if(vmDebitStateInt2) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x4000000L) != 0) {
                    if(vmDebitStateInt2) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (a != null) {
                    // read a.decrypt(vm.debit.get().money)
                    aDecryptVmDebitMoney = a.decrypt(vmDebitMoney);
                }


                // read Double.parseDouble(a.decrypt(vm.debit.get().money))
                doubleParseDoubleADecryptVmDebitMoney = java.lang.Double.parseDouble(aDecryptVmDebitMoney);


                // read NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.debit.get().money)), vm.debit.get().kind)
                numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKind = com.finance.utils.NumberUtils.custom_money_my_tran(doubleParseDoubleADecryptVmDebitMoney, vmDebitKind);
        }

        if ((dirtyFlags & 0x3cL) != 0) {

                // read vm.debit.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.debit.get().money)), vm.debit.get().kind) : @android:string/money_default_min
                vmDebitMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKindTvTotalMoneyAndroidStringMoneyDefaultMin = ((vmDebitMoneyJavaLangObjectNull) ? (numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKind) : (tvTotalMoney.getResources().getString(R.string.money_default_min)));
        }
        // batch finished

        if ((dirtyFlags & 0x10050000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3
                vmDebitStateInt3 = (androidxDatabindingViewDataBindingSafeUnboxVmDebitState) == (3);
            if((dirtyFlags & 0x10000000L) != 0) {
                if(vmDebitStateInt3) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x10000L) != 0) {
                if(vmDebitStateInt3) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0x40000L) != 0) {
                if(vmDebitStateInt3) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }

            if ((dirtyFlags & 0x10000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
                    vmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmDebitStateInt3) ? (getColorFromResource(tvState, R.color.reject)) : (getColorFromResource(tvState, R.color.paid)));
            }
            if ((dirtyFlags & 0x10000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                    vmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmDebitStateInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_reject)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_paid)));
            }
            if ((dirtyFlags & 0x40000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                    vmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmDebitStateInt3) ? (tvState.getResources().getString(R.string.state_3)) : (tvState.getResources().getString(R.string.state_4)));
            }
        }

        if ((dirtyFlags & 0x100000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                vmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmDebitStateInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_accept)) : (vmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid));
        }
        if ((dirtyFlags & 0x100L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                vmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmDebitStateInt2) ? (tvState.getResources().getString(R.string.state_2)) : (vmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4));
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
                vmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmDebitStateInt2) ? (getColorFromResource(tvState, R.color.accept)) : (vmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid));
        }

        if ((dirtyFlags & 0x2cL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                vmDebitStateInt1TvStateAndroidStringState1VmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmDebitStateInt1) ? (tvState.getResources().getString(R.string.state_1)) : (vmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                vmDebitStateInt1ImgStateAndroidDrawableIcCreatedVmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmDebitStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_created)) : (vmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
                vmDebitStateInt1TvStateAndroidColorCreatedVmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmDebitStateInt1) ? (getColorFromResource(tvState, R.color.created)) : (vmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid));
        }
        // batch finished
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgState, vmDebitStateInt1ImgStateAndroidDrawableIcCreatedVmDebitStateInt2ImgStateAndroidDrawableIcAcceptVmDebitStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid);
            this.mboundView8.setVisibility(vmDebitTagJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvState, vmDebitStateInt1TvStateAndroidStringState1VmDebitStateInt2TvStateAndroidStringState2VmDebitStateInt3TvStateAndroidStringState3TvStateAndroidStringState4);
            this.tvState.setTextColor(vmDebitStateInt1TvStateAndroidColorCreatedVmDebitStateInt2TvStateAndroidColorAcceptVmDebitStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid);
            this.tvTotalMoney.setTextColor(vmDebitKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionAddedBy, vmDebitAddedByFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionDateCreated, dateUtilsConvertFromUTCToDefaultVmDebitTransactionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionKind, vmDebitKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.transaction_detail));
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x3cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, aDecryptVmDebitNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTag, aDecryptVmDebitTagName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalMoney, vmDebitMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmDebitMoneyVmDebitKindTvTotalMoneyAndroidStringMoneyDefaultMin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionCategory, aDecryptVmDebitCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionGroup, aDecryptVmDebitTransactionGroupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionName, aDecryptVmDebitName);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(vmIsHaveDocumentViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isHaveDocument
        flag 1 (0x2L): layoutHeader
        flag 2 (0x3L): vm.debit
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:color/black : @android:color/red_orange
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:color/black : @android:color/red_orange
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveDocument.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveDocument.get()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): vm.debit.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.debit.get().money)), vm.debit.get().kind) : @android:string/money_default_min
        flag 15 (0x10L): vm.debit.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.debit.get().money)), vm.debit.get().kind) : @android:string/money_default_min
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 24 (0x19L): vm.debit.get().tag != null ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): vm.debit.get().tag != null ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(vm.debit.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
    flag mapping end*/
    //end
}