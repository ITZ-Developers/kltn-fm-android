package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTransactionDetailBindingImpl extends ActivityTransactionDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {16},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_name, 17);
        sViewsWithIds.put(R.id.color_tag, 18);
        sViewsWithIds.put(R.id.tv_title_category, 19);
        sViewsWithIds.put(R.id.tv_title_content, 20);
        sViewsWithIds.put(R.id.img_document, 21);
        sViewsWithIds.put(R.id.tv_title_document, 22);
        sViewsWithIds.put(R.id.ic_detail_document, 23);
    }
    // views
    @NonNull
    private final kr.co.prnd.readmore.ReadMoreTextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback178;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTransactionDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityTransactionDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[14]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[16]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.imgState.setTag(null);
        this.layoutDocument.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView13 = (kr.co.prnd.readmore.ReadMoreTextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.tvState.setTag(null);
        this.tvTag.setTag(null);
        this.tvTotalMoney.setTag(null);
        this.tvTransactionAddedBy.setTag(null);
        this.tvTransactionApprovedBy.setTag(null);
        this.tvTransactionCategory.setTag(null);
        this.tvTransactionDateCreated.setTag(null);
        this.tvTransactionGroup.setTag(null);
        this.tvTransactionKind.setTag(null);
        this.tvTransactionName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback178 = new com.finance.generated.callback.OnClickListener(this, 1);
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
            setVm((com.finance.ui.transaction.detail.TransactionDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.transaction.detail.TransactionDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.transaction.detail.TransactionDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.transaction.detail.TransactionDetailActivity A) {
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
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmTotalDocuments((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeVmTran((androidx.databinding.ObservableField<com.finance.data.model.api.response.transaction.TransactionResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalDocuments(androidx.databinding.ObservableField<java.lang.Integer> VmTotalDocuments, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTran(androidx.databinding.ObservableField<com.finance.data.model.api.response.transaction.TransactionResponse> VmTran, int fieldId) {
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
        java.lang.Integer vmTranState = null;
        com.finance.ui.transaction.detail.TransactionDetailViewModel vm = mVm;
        java.lang.String aDecryptVmTranCategoryName = null;
        com.finance.ui.transaction.detail.TransactionDetailActivity a = mA;
        boolean vmTranStateInt2 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet = 0;
        double doubleParseDoubleADecryptVmTranMoney = 0.0;
        int vmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        android.graphics.drawable.Drawable vmTranStateInt1ImgStateAndroidDrawableIcCreatedVmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        java.lang.String vmTranCategoryName = null;
        int vmTotalDocumentsInt0ViewVISIBLEViewGONE = 0;
        boolean vmTranStateInt3 = false;
        java.lang.Integer vmTranKind = null;
        java.lang.String vmTranStateInt1TvStateAndroidStringState1VmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        java.lang.String vmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        java.lang.String vmTranName = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmTranState = 0;
        int vmTranTagJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String vmTranMoney = null;
        com.finance.data.model.api.response.account.AccountResponse vmTranApprovedBy = null;
        int vmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        int vmTranStateInt1TvStateAndroidColorCreatedVmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = 0;
        java.lang.String aDecryptVmTranNote = null;
        android.graphics.drawable.Drawable vmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        boolean vmTranTagJavaLangObjectNull = false;
        java.lang.String vmTranMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKindTvTotalMoneyAndroidStringMoneyDefaultMin = null;
        boolean vmTranStateInt1 = false;
        com.finance.data.model.api.response.tag.TagResponse vmTranTag = null;
        java.lang.String aDecryptVmTranMoney = null;
        java.lang.Integer vmTotalDocumentsGet = null;
        java.lang.String vmTranTagName = null;
        java.lang.String numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKind = null;
        boolean vmTranKindInt1 = false;
        java.lang.String vmTranApprovedByFullName = null;
        java.lang.String vmTranAddedByFullName = null;
        com.finance.data.model.api.response.transaction.TransactionResponse vmTranGet = null;
        java.lang.String vmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = null;
        com.finance.data.model.api.response.transaction.Category vmTranCategory = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalDocuments = null;
        int vmTranKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange = 0;
        java.lang.String vmTranKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2 = null;
        java.lang.String vmTranTransactionDate = null;
        java.lang.String dateUtilsConvertFromUTCToDefaultVmTranTransactionDate = null;
        java.lang.String stringValueOfVmTotalDocuments = null;
        com.finance.data.model.api.response.account.AccountResponse vmTranAddedBy = null;
        com.finance.data.model.api.response.transaction.group.TransactionGroupResponse vmTranTransactionGroup = null;
        boolean vmTranMoneyJavaLangObjectNull = false;
        java.lang.String vmTranTransactionGroupName = null;
        java.lang.String aDecryptVmTranTagName = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmTranKind = 0;
        java.lang.String vmTranNote = null;
        boolean vmTotalDocumentsInt0 = false;
        java.lang.String aDecryptVmTranName = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.transaction.TransactionResponse> vmTran = null;
        android.graphics.drawable.Drawable vmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = null;
        java.lang.String aDecryptVmTranTransactionGroupName = null;

        if ((dirtyFlags & 0x3eL) != 0) {


            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.totalDocuments
                        vmTotalDocuments = vm.totalDocuments;
                    }
                    updateRegistration(1, vmTotalDocuments);


                    if (vmTotalDocuments != null) {
                        // read vm.totalDocuments.get()
                        vmTotalDocumentsGet = vmTotalDocuments.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalDocumentsGet);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()))
                    stringValueOfVmTotalDocuments = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0
                    vmTotalDocumentsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet) > (0);
                if((dirtyFlags & 0x2aL) != 0) {
                    if(vmTotalDocumentsInt0) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
                    vmTotalDocumentsInt0ViewVISIBLEViewGONE = ((vmTotalDocumentsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3cL) != 0) {

                    if (vm != null) {
                        // read vm.tran
                        vmTran = vm.tran;
                    }
                    updateRegistration(2, vmTran);


                    if (vmTran != null) {
                        // read vm.tran.get()
                        vmTranGet = vmTran.get();
                    }

                if ((dirtyFlags & 0x2cL) != 0) {

                        if (vmTranGet != null) {
                            // read vm.tran.get().state
                            vmTranState = vmTranGet.getState();
                            // read vm.tran.get().kind
                            vmTranKind = vmTranGet.getKind();
                            // read vm.tran.get().approvedBy
                            vmTranApprovedBy = vmTranGet.getApprovedBy();
                            // read vm.tran.get().transactionDate
                            vmTranTransactionDate = vmTranGet.getTransactionDate();
                            // read vm.tran.get().addedBy
                            vmTranAddedBy = vmTranGet.getAddedBy();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state)
                        androidxDatabindingViewDataBindingSafeUnboxVmTranState = androidx.databinding.ViewDataBinding.safeUnbox(vmTranState);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind)
                        androidxDatabindingViewDataBindingSafeUnboxVmTranKind = androidx.databinding.ViewDataBinding.safeUnbox(vmTranKind);
                        // read DateUtils.convertFromUTCToDefault(vm.tran.get().transactionDate)
                        dateUtilsConvertFromUTCToDefaultVmTranTransactionDate = com.finance.utils.DateUtils.convertFromUTCToDefault(vmTranTransactionDate);
                        if (vmTranApprovedBy != null) {
                            // read vm.tran.get().approvedBy.fullName
                            vmTranApprovedByFullName = vmTranApprovedBy.getFullName();
                        }
                        if (vmTranAddedBy != null) {
                            // read vm.tran.get().addedBy.fullName
                            vmTranAddedByFullName = vmTranAddedBy.getFullName();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1
                        vmTranStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmTranState) == (1);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1
                        vmTranKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmTranKind) == (1);
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmTranStateInt1) {
                                dirtyFlags |= 0x200L;
                                dirtyFlags |= 0x2000L;
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100L;
                                dirtyFlags |= 0x1000L;
                                dirtyFlags |= 0x100000L;
                        }
                    }
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmTranKindInt1) {
                                dirtyFlags |= 0x20000000L;
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x10000000L;
                                dirtyFlags |= 0x40000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:color/black : @android:color/red_orange
                        vmTranKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange = ((vmTranKindInt1) ? (getColorFromResource(tvTotalMoney, R.color.black)) : (getColorFromResource(tvTotalMoney, R.color.red_orange)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
                        vmTranKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2 = ((vmTranKindInt1) ? (tvTransactionKind.getResources().getString(R.string.kind_1)) : (tvTransactionKind.getResources().getString(R.string.kind_2)));
                }

                    if (vmTranGet != null) {
                        // read vm.tran.get().name
                        vmTranName = vmTranGet.getName();
                        // read vm.tran.get().money
                        vmTranMoney = vmTranGet.getMoney();
                        // read vm.tran.get().tag
                        vmTranTag = vmTranGet.getTag();
                        // read vm.tran.get().category
                        vmTranCategory = vmTranGet.getCategory();
                        // read vm.tran.get().transactionGroup
                        vmTranTransactionGroup = vmTranGet.getTransactionGroup();
                        // read vm.tran.get().note
                        vmTranNote = vmTranGet.getNote();
                    }


                    // read vm.tran.get().money != null
                    vmTranMoneyJavaLangObjectNull = (vmTranMoney) != (null);
                if((dirtyFlags & 0x3cL) != 0) {
                    if(vmTranMoneyJavaLangObjectNull) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                    if (vmTranTag != null) {
                        // read vm.tran.get().tag.name
                        vmTranTagName = vmTranTag.getName();
                    }
                    if (vmTranCategory != null) {
                        // read vm.tran.get().category.name
                        vmTranCategoryName = vmTranCategory.getName();
                    }
                    if (vmTranTransactionGroup != null) {
                        // read vm.tran.get().transactionGroup.name
                        vmTranTransactionGroupName = vmTranTransactionGroup.getName();
                    }
                if ((dirtyFlags & 0x2cL) != 0) {

                        // read vm.tran.get().tag != null
                        vmTranTagJavaLangObjectNull = (vmTranTag) != (null);
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmTranTagJavaLangObjectNull) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }


                        // read vm.tran.get().tag != null ? View.VISIBLE : View.GONE
                        vmTranTagJavaLangObjectNullViewVISIBLEViewGONE = ((vmTranTagJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        if ((dirtyFlags & 0x3cL) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.tran.get().category.name)
                    aDecryptVmTranCategoryName = a.decrypt(vmTranCategoryName);
                    // read a.decrypt(vm.tran.get().note)
                    aDecryptVmTranNote = a.decrypt(vmTranNote);
                    // read a.decrypt(vm.tran.get().tag.name)
                    aDecryptVmTranTagName = a.decrypt(vmTranTagName);
                    // read a.decrypt(vm.tran.get().name)
                    aDecryptVmTranName = a.decrypt(vmTranName);
                    // read a.decrypt(vm.tran.get().transactionGroup.name)
                    aDecryptVmTranTransactionGroupName = a.decrypt(vmTranTransactionGroupName);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x2101100L) != 0) {



                if (vm != null) {
                    // read vm.tran
                    vmTran = vm.tran;
                }
                updateRegistration(2, vmTran);


                if (vmTran != null) {
                    // read vm.tran.get()
                    vmTranGet = vmTran.get();
                }

            if ((dirtyFlags & 0x101100L) != 0) {

                    if (vmTranGet != null) {
                        // read vm.tran.get().state
                        vmTranState = vmTranGet.getState();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state)
                    androidxDatabindingViewDataBindingSafeUnboxVmTranState = androidx.databinding.ViewDataBinding.safeUnbox(vmTranState);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2
                    vmTranStateInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmTranState) == (2);
                if((dirtyFlags & 0x1000L) != 0) {
                    if(vmTranStateInt2) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x100000L) != 0) {
                    if(vmTranStateInt2) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x100L) != 0) {
                    if(vmTranStateInt2) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0x2000000L) != 0) {

                    if (vmTranGet != null) {
                        // read vm.tran.get().kind
                        vmTranKind = vmTranGet.getKind();
                    }
            }
        }
        if ((dirtyFlags & 0x2000000L) != 0) {

                if (a != null) {
                    // read a.decrypt(vm.tran.get().money)
                    aDecryptVmTranMoney = a.decrypt(vmTranMoney);
                }


                // read Double.parseDouble(a.decrypt(vm.tran.get().money))
                doubleParseDoubleADecryptVmTranMoney = java.lang.Double.parseDouble(aDecryptVmTranMoney);


                // read NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.tran.get().money)), vm.tran.get().kind)
                numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKind = com.finance.utils.NumberUtils.custom_money_my_tran(doubleParseDoubleADecryptVmTranMoney, vmTranKind);
        }

        if ((dirtyFlags & 0x3cL) != 0) {

                // read vm.tran.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.tran.get().money)), vm.tran.get().kind) : @android:string/money_default_min
                vmTranMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKindTvTotalMoneyAndroidStringMoneyDefaultMin = ((vmTranMoneyJavaLangObjectNull) ? (numberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKind) : (tvTotalMoney.getResources().getString(R.string.money_default_min)));
        }
        // batch finished

        if ((dirtyFlags & 0x444000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3
                vmTranStateInt3 = (androidxDatabindingViewDataBindingSafeUnboxVmTranState) == (3);
            if((dirtyFlags & 0x40000L) != 0) {
                if(vmTranStateInt3) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x4000L) != 0) {
                if(vmTranStateInt3) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
            if((dirtyFlags & 0x400000L) != 0) {
                if(vmTranStateInt3) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }

            if ((dirtyFlags & 0x40000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
                    vmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmTranStateInt3) ? (getColorFromResource(tvState, R.color.reject)) : (getColorFromResource(tvState, R.color.paid)));
            }
            if ((dirtyFlags & 0x4000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                    vmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmTranStateInt3) ? (tvState.getResources().getString(R.string.state_3)) : (tvState.getResources().getString(R.string.state_4)));
            }
            if ((dirtyFlags & 0x400000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                    vmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmTranStateInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_reject)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_paid)));
            }
        }

        if ((dirtyFlags & 0x1000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                vmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmTranStateInt2) ? (tvState.getResources().getString(R.string.state_2)) : (vmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4));
        }
        if ((dirtyFlags & 0x100000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
                vmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmTranStateInt2) ? (getColorFromResource(tvState, R.color.accept)) : (vmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid));
        }
        if ((dirtyFlags & 0x100L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                vmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmTranStateInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_accept)) : (vmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid));
        }

        if ((dirtyFlags & 0x2cL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
                vmTranStateInt1ImgStateAndroidDrawableIcCreatedVmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid = ((vmTranStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_created)) : (vmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
                vmTranStateInt1TvStateAndroidStringState1VmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4 = ((vmTranStateInt1) ? (tvState.getResources().getString(R.string.state_1)) : (vmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
                vmTranStateInt1TvStateAndroidColorCreatedVmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid = ((vmTranStateInt1) ? (getColorFromResource(tvState, R.color.created)) : (vmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid));
        }
        // batch finished
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgState, vmTranStateInt1ImgStateAndroidDrawableIcCreatedVmTranStateInt2ImgStateAndroidDrawableIcAcceptVmTranStateInt3ImgStateAndroidDrawableIcRejectImgStateAndroidDrawableIcPaid);
            this.mboundView8.setVisibility(vmTranTagJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvState, vmTranStateInt1TvStateAndroidStringState1VmTranStateInt2TvStateAndroidStringState2VmTranStateInt3TvStateAndroidStringState3TvStateAndroidStringState4);
            this.tvState.setTextColor(vmTranStateInt1TvStateAndroidColorCreatedVmTranStateInt2TvStateAndroidColorAcceptVmTranStateInt3TvStateAndroidColorRejectTvStateAndroidColorPaid);
            this.tvTotalMoney.setTextColor(vmTranKindInt1TvTotalMoneyAndroidColorBlackTvTotalMoneyAndroidColorRedOrange);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionAddedBy, vmTranAddedByFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionApprovedBy, vmTranApprovedByFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionDateCreated, dateUtilsConvertFromUTCToDefaultVmTranTransactionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionKind, vmTranKindInt1TvTransactionKindAndroidStringKind1TvTransactionKindAndroidStringKind2);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.layoutDocument.setOnClickListener(mCallback178);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.transaction_detail));
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.layoutDocument.setVisibility(vmTotalDocumentsInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, stringValueOfVmTotalDocuments);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x3cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, aDecryptVmTranNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTag, aDecryptVmTranTagName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalMoney, vmTranMoneyJavaLangObjectNullNumberUtilsCustomMoneyMyTranDoubleParseDoubleADecryptVmTranMoneyVmTranKindTvTotalMoneyAndroidStringMoneyDefaultMin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionCategory, aDecryptVmTranCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionGroup, aDecryptVmTranTransactionGroupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionName, aDecryptVmTranName);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // a != null
        boolean aJavaLangObjectNull = false;
        // a
        com.finance.ui.transaction.detail.TransactionDetailActivity a = mA;



        aJavaLangObjectNull = (a) != (null);
        if (aJavaLangObjectNull) {


            a.navigateToDocument();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.totalDocuments
        flag 2 (0x3L): vm.tran
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:drawable/ic_created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:string/state_1 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:string/state_2 : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 16 (0x11L): vm.tran.get().tag != null ? View.VISIBLE : View.GONE
        flag 17 (0x12L): vm.tran.get().tag != null ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 1 ? @android:color/created : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:color/accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:color/reject : @android:color/paid
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 2 ? @android:drawable/ic_accept : androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 24 (0x19L): vm.tran.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.tran.get().money)), vm.tran.get().kind) : @android:string/money_default_min
        flag 25 (0x1aL): vm.tran.get().money != null ? NumberUtils.custom_money_my_tran(Double.parseDouble(a.decrypt(vm.tran.get().money)), vm.tran.get().kind) : @android:string/money_default_min
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:string/state_3 : @android:string/state_4
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:color/black : @android:color/red_orange
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:color/black : @android:color/red_orange
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().kind) == 1 ? @android:string/kind_1 : @android:string/kind_2
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(vm.tran.get().state) == 3 ? @android:drawable/ic_reject : @android:drawable/ic_paid
    flag mapping end*/
    //end
}