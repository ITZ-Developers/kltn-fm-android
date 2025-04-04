package com.finance;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.finance.databinding.ActivityCategoryBindingImpl;
import com.finance.databinding.ActivityCategoryDetailBindingImpl;
import com.finance.databinding.ActivityDebitBindingImpl;
import com.finance.databinding.ActivityDebitDetailBindingImpl;
import com.finance.databinding.ActivityDebitUpdateBindingImpl;
import com.finance.databinding.ActivityDepartmentBindingImpl;
import com.finance.databinding.ActivityDepartmentDetailBindingImpl;
import com.finance.databinding.ActivityDocumentBindingImpl;
import com.finance.databinding.ActivityImageViewBindingImpl;
import com.finance.databinding.ActivityKeyFilterBindingImpl;
import com.finance.databinding.ActivityKeyGroupBindingImpl;
import com.finance.databinding.ActivityKeyGroupDetailsBindingImpl;
import com.finance.databinding.ActivityKeyInfoBindingImpl;
import com.finance.databinding.ActivityKeyInfoDetailBindingImpl;
import com.finance.databinding.ActivityLoginBindingImpl;
import com.finance.databinding.ActivityMainBindingImpl;
import com.finance.databinding.ActivityNotificationBindingImpl;
import com.finance.databinding.ActivityOrganizationBindingImpl;
import com.finance.databinding.ActivityOrganizationDetailBindingImpl;
import com.finance.databinding.ActivityPasswordChangeBindingImpl;
import com.finance.databinding.ActivityPasswordForgetBindingImpl;
import com.finance.databinding.ActivityPasswordResetBindingImpl;
import com.finance.databinding.ActivityProfileUpdateBindingImpl;
import com.finance.databinding.ActivityProjectBindingImpl;
import com.finance.databinding.ActivityProjectDetailBindingImpl;
import com.finance.databinding.ActivityServiceBindingImpl;
import com.finance.databinding.ActivityServiceDetailBindingImpl;
import com.finance.databinding.ActivityServiceGroupBindingImpl;
import com.finance.databinding.ActivityServiceGroupDetailBindingImpl;
import com.finance.databinding.ActivityServiceScheduleBindingImpl;
import com.finance.databinding.ActivityStatisticsDetailBindingImpl;
import com.finance.databinding.ActivitySubTaskBindingImpl;
import com.finance.databinding.ActivityTagBindingImpl;
import com.finance.databinding.ActivityTagDetailBindingImpl;
import com.finance.databinding.ActivityTaskBindingImpl;
import com.finance.databinding.ActivityTaskCreateUpdateBindingImpl;
import com.finance.databinding.ActivityTaskDetailBindingImpl;
import com.finance.databinding.ActivityTaskFilterBindingImpl;
import com.finance.databinding.ActivityTransactionCreateUpdateBindingImpl;
import com.finance.databinding.ActivityTransactionDetailBindingImpl;
import com.finance.databinding.ActivityTransactionGroupBindingImpl;
import com.finance.databinding.ActivityTransactionGroupDetailBindingImpl;
import com.finance.databinding.DialogAprroveBindingImpl;
import com.finance.databinding.DialogConfirmBindingImpl;
import com.finance.databinding.DialogDeleteBindingImpl;
import com.finance.databinding.DialogDownloadBindingImpl;
import com.finance.databinding.DialogInputKeyBindingImpl;
import com.finance.databinding.DialogMoreTextBindingImpl;
import com.finance.databinding.DialogPayBindingImpl;
import com.finance.databinding.DialogRecalculateBindingImpl;
import com.finance.databinding.DialogRequestKeyBindingImpl;
import com.finance.databinding.DialogYesNoBindingImpl;
import com.finance.databinding.FragmentAccountBindingImpl;
import com.finance.databinding.FragmentHomeBindingImpl;
import com.finance.databinding.FragmentKeyBindingImpl;
import com.finance.databinding.FragmentProjectBindingImpl;
import com.finance.databinding.FragmentStatisticsBindingImpl;
import com.finance.databinding.FragmentTaskBindingImpl;
import com.finance.databinding.ItemCategoryBindingImpl;
import com.finance.databinding.ItemDebitBindingImpl;
import com.finance.databinding.ItemDepartmentBindingImpl;
import com.finance.databinding.ItemDocumentBindingImpl;
import com.finance.databinding.ItemDocumentDownloadBindingImpl;
import com.finance.databinding.ItemGroupBindingImpl;
import com.finance.databinding.ItemGroupServiceBindingImpl;
import com.finance.databinding.ItemGroupTransactionBindingImpl;
import com.finance.databinding.ItemKeyBindingImpl;
import com.finance.databinding.ItemKeyGroupBindingImpl;
import com.finance.databinding.ItemKindSelectBindingImpl;
import com.finance.databinding.ItemNotificationBindingImpl;
import com.finance.databinding.ItemOrganizationBindingImpl;
import com.finance.databinding.ItemOrganizationSelectBindingImpl;
import com.finance.databinding.ItemProjectBindingImpl;
import com.finance.databinding.ItemProjectSelectBindingImpl;
import com.finance.databinding.ItemServiceBindingImpl;
import com.finance.databinding.ItemServicePayBindingImpl;
import com.finance.databinding.ItemServiceScheduleBindingImpl;
import com.finance.databinding.ItemStatisticsBindingImpl;
import com.finance.databinding.ItemSubTaskBindingImpl;
import com.finance.databinding.ItemTagBindingImpl;
import com.finance.databinding.ItemTagKindBindingImpl;
import com.finance.databinding.ItemTagSelectBindingImpl;
import com.finance.databinding.ItemTaskBindingImpl;
import com.finance.databinding.ItemTransactionBindingImpl;
import com.finance.databinding.LayoutEmptyDataBindingImpl;
import com.finance.databinding.LayoutEmptyNotificationBindingImpl;
import com.finance.databinding.LayoutHeaderTitleBindingImpl;
import com.finance.databinding.LayoutInvalidKeyBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCATEGORY = 1;

  private static final int LAYOUT_ACTIVITYCATEGORYDETAIL = 2;

  private static final int LAYOUT_ACTIVITYDEBIT = 3;

  private static final int LAYOUT_ACTIVITYDEBITDETAIL = 4;

  private static final int LAYOUT_ACTIVITYDEBITUPDATE = 5;

  private static final int LAYOUT_ACTIVITYDEPARTMENT = 6;

  private static final int LAYOUT_ACTIVITYDEPARTMENTDETAIL = 7;

  private static final int LAYOUT_ACTIVITYDOCUMENT = 8;

  private static final int LAYOUT_ACTIVITYIMAGEVIEW = 9;

  private static final int LAYOUT_ACTIVITYKEYFILTER = 10;

  private static final int LAYOUT_ACTIVITYKEYGROUP = 11;

  private static final int LAYOUT_ACTIVITYKEYGROUPDETAILS = 12;

  private static final int LAYOUT_ACTIVITYKEYINFO = 13;

  private static final int LAYOUT_ACTIVITYKEYINFODETAIL = 14;

  private static final int LAYOUT_ACTIVITYLOGIN = 15;

  private static final int LAYOUT_ACTIVITYMAIN = 16;

  private static final int LAYOUT_ACTIVITYNOTIFICATION = 17;

  private static final int LAYOUT_ACTIVITYORGANIZATION = 18;

  private static final int LAYOUT_ACTIVITYORGANIZATIONDETAIL = 19;

  private static final int LAYOUT_ACTIVITYPASSWORDCHANGE = 20;

  private static final int LAYOUT_ACTIVITYPASSWORDFORGET = 21;

  private static final int LAYOUT_ACTIVITYPASSWORDRESET = 22;

  private static final int LAYOUT_ACTIVITYPROFILEUPDATE = 23;

  private static final int LAYOUT_ACTIVITYPROJECT = 24;

  private static final int LAYOUT_ACTIVITYPROJECTDETAIL = 25;

  private static final int LAYOUT_ACTIVITYSERVICE = 26;

  private static final int LAYOUT_ACTIVITYSERVICEDETAIL = 27;

  private static final int LAYOUT_ACTIVITYSERVICEGROUP = 28;

  private static final int LAYOUT_ACTIVITYSERVICEGROUPDETAIL = 29;

  private static final int LAYOUT_ACTIVITYSERVICESCHEDULE = 30;

  private static final int LAYOUT_ACTIVITYSTATISTICSDETAIL = 31;

  private static final int LAYOUT_ACTIVITYSUBTASK = 32;

  private static final int LAYOUT_ACTIVITYTAG = 33;

  private static final int LAYOUT_ACTIVITYTAGDETAIL = 34;

  private static final int LAYOUT_ACTIVITYTASK = 35;

  private static final int LAYOUT_ACTIVITYTASKCREATEUPDATE = 36;

  private static final int LAYOUT_ACTIVITYTASKDETAIL = 37;

  private static final int LAYOUT_ACTIVITYTASKFILTER = 38;

  private static final int LAYOUT_ACTIVITYTRANSACTIONCREATEUPDATE = 39;

  private static final int LAYOUT_ACTIVITYTRANSACTIONDETAIL = 40;

  private static final int LAYOUT_ACTIVITYTRANSACTIONGROUP = 41;

  private static final int LAYOUT_ACTIVITYTRANSACTIONGROUPDETAIL = 42;

  private static final int LAYOUT_DIALOGAPRROVE = 43;

  private static final int LAYOUT_DIALOGCONFIRM = 44;

  private static final int LAYOUT_DIALOGDELETE = 45;

  private static final int LAYOUT_DIALOGDOWNLOAD = 46;

  private static final int LAYOUT_DIALOGINPUTKEY = 47;

  private static final int LAYOUT_DIALOGMORETEXT = 48;

  private static final int LAYOUT_DIALOGPAY = 49;

  private static final int LAYOUT_DIALOGRECALCULATE = 50;

  private static final int LAYOUT_DIALOGREQUESTKEY = 51;

  private static final int LAYOUT_DIALOGYESNO = 52;

  private static final int LAYOUT_FRAGMENTACCOUNT = 53;

  private static final int LAYOUT_FRAGMENTHOME = 54;

  private static final int LAYOUT_FRAGMENTKEY = 55;

  private static final int LAYOUT_FRAGMENTPROJECT = 56;

  private static final int LAYOUT_FRAGMENTSTATISTICS = 57;

  private static final int LAYOUT_FRAGMENTTASK = 58;

  private static final int LAYOUT_ITEMCATEGORY = 59;

  private static final int LAYOUT_ITEMDEBIT = 60;

  private static final int LAYOUT_ITEMDEPARTMENT = 61;

  private static final int LAYOUT_ITEMDOCUMENT = 62;

  private static final int LAYOUT_ITEMDOCUMENTDOWNLOAD = 63;

  private static final int LAYOUT_ITEMGROUP = 64;

  private static final int LAYOUT_ITEMGROUPSERVICE = 65;

  private static final int LAYOUT_ITEMGROUPTRANSACTION = 66;

  private static final int LAYOUT_ITEMKEY = 67;

  private static final int LAYOUT_ITEMKEYGROUP = 68;

  private static final int LAYOUT_ITEMKINDSELECT = 69;

  private static final int LAYOUT_ITEMNOTIFICATION = 70;

  private static final int LAYOUT_ITEMORGANIZATION = 71;

  private static final int LAYOUT_ITEMORGANIZATIONSELECT = 72;

  private static final int LAYOUT_ITEMPROJECT = 73;

  private static final int LAYOUT_ITEMPROJECTSELECT = 74;

  private static final int LAYOUT_ITEMSERVICE = 75;

  private static final int LAYOUT_ITEMSERVICEPAY = 76;

  private static final int LAYOUT_ITEMSERVICESCHEDULE = 77;

  private static final int LAYOUT_ITEMSTATISTICS = 78;

  private static final int LAYOUT_ITEMSUBTASK = 79;

  private static final int LAYOUT_ITEMTAG = 80;

  private static final int LAYOUT_ITEMTAGKIND = 81;

  private static final int LAYOUT_ITEMTAGSELECT = 82;

  private static final int LAYOUT_ITEMTASK = 83;

  private static final int LAYOUT_ITEMTRANSACTION = 84;

  private static final int LAYOUT_LAYOUTEMPTYDATA = 85;

  private static final int LAYOUT_LAYOUTEMPTYNOTIFICATION = 86;

  private static final int LAYOUT_LAYOUTHEADERTITLE = 87;

  private static final int LAYOUT_LAYOUTINVALIDKEY = 88;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(88);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_category, LAYOUT_ACTIVITYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_category_detail, LAYOUT_ACTIVITYCATEGORYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_debit, LAYOUT_ACTIVITYDEBIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_debit_detail, LAYOUT_ACTIVITYDEBITDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_debit_update, LAYOUT_ACTIVITYDEBITUPDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_department, LAYOUT_ACTIVITYDEPARTMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_department_detail, LAYOUT_ACTIVITYDEPARTMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_document, LAYOUT_ACTIVITYDOCUMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_image_view, LAYOUT_ACTIVITYIMAGEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_key_filter, LAYOUT_ACTIVITYKEYFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_key_group, LAYOUT_ACTIVITYKEYGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_key_group_details, LAYOUT_ACTIVITYKEYGROUPDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_key_info, LAYOUT_ACTIVITYKEYINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_key_info_detail, LAYOUT_ACTIVITYKEYINFODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_notification, LAYOUT_ACTIVITYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_organization, LAYOUT_ACTIVITYORGANIZATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_organization_detail, LAYOUT_ACTIVITYORGANIZATIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_password_change, LAYOUT_ACTIVITYPASSWORDCHANGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_password_forget, LAYOUT_ACTIVITYPASSWORDFORGET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_password_reset, LAYOUT_ACTIVITYPASSWORDRESET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_profile_update, LAYOUT_ACTIVITYPROFILEUPDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_project, LAYOUT_ACTIVITYPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_project_detail, LAYOUT_ACTIVITYPROJECTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_service, LAYOUT_ACTIVITYSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_service_detail, LAYOUT_ACTIVITYSERVICEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_service_group, LAYOUT_ACTIVITYSERVICEGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_service_group_detail, LAYOUT_ACTIVITYSERVICEGROUPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_service_schedule, LAYOUT_ACTIVITYSERVICESCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_statistics_detail, LAYOUT_ACTIVITYSTATISTICSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_sub_task, LAYOUT_ACTIVITYSUBTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_tag, LAYOUT_ACTIVITYTAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_tag_detail, LAYOUT_ACTIVITYTAGDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_task, LAYOUT_ACTIVITYTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_task_create_update, LAYOUT_ACTIVITYTASKCREATEUPDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_task_detail, LAYOUT_ACTIVITYTASKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_task_filter, LAYOUT_ACTIVITYTASKFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_transaction_create_update, LAYOUT_ACTIVITYTRANSACTIONCREATEUPDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_transaction_detail, LAYOUT_ACTIVITYTRANSACTIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_transaction_group, LAYOUT_ACTIVITYTRANSACTIONGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.activity_transaction_group_detail, LAYOUT_ACTIVITYTRANSACTIONGROUPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_aprrove, LAYOUT_DIALOGAPRROVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_confirm, LAYOUT_DIALOGCONFIRM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_delete, LAYOUT_DIALOGDELETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_download, LAYOUT_DIALOGDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_input_key, LAYOUT_DIALOGINPUTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_more_text, LAYOUT_DIALOGMORETEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_pay, LAYOUT_DIALOGPAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_recalculate, LAYOUT_DIALOGRECALCULATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_request_key, LAYOUT_DIALOGREQUESTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.dialog_yes_no, LAYOUT_DIALOGYESNO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_key, LAYOUT_FRAGMENTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_project, LAYOUT_FRAGMENTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_statistics, LAYOUT_FRAGMENTSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.fragment_task, LAYOUT_FRAGMENTTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_debit, LAYOUT_ITEMDEBIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_department, LAYOUT_ITEMDEPARTMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_document, LAYOUT_ITEMDOCUMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_document_download, LAYOUT_ITEMDOCUMENTDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_group, LAYOUT_ITEMGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_group_service, LAYOUT_ITEMGROUPSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_group_transaction, LAYOUT_ITEMGROUPTRANSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_key, LAYOUT_ITEMKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_key_group, LAYOUT_ITEMKEYGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_kind_select, LAYOUT_ITEMKINDSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_notification, LAYOUT_ITEMNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_organization, LAYOUT_ITEMORGANIZATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_organization_select, LAYOUT_ITEMORGANIZATIONSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_project, LAYOUT_ITEMPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_project_select, LAYOUT_ITEMPROJECTSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_service, LAYOUT_ITEMSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_service_pay, LAYOUT_ITEMSERVICEPAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_service_schedule, LAYOUT_ITEMSERVICESCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_statistics, LAYOUT_ITEMSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_sub_task, LAYOUT_ITEMSUBTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_tag, LAYOUT_ITEMTAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_tag_kind, LAYOUT_ITEMTAGKIND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_tag_select, LAYOUT_ITEMTAGSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_task, LAYOUT_ITEMTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.item_transaction, LAYOUT_ITEMTRANSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.layout_empty_data, LAYOUT_LAYOUTEMPTYDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.layout_empty_notification, LAYOUT_LAYOUTEMPTYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.layout_header_title, LAYOUT_LAYOUTHEADERTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.finance.R.layout.layout_invalid_key, LAYOUT_LAYOUTINVALIDKEY);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYCATEGORY: {
        if ("layout/activity_category_0".equals(tag)) {
          return new ActivityCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCATEGORYDETAIL: {
        if ("layout/activity_category_detail_0".equals(tag)) {
          return new ActivityCategoryDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_category_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEBIT: {
        if ("layout/activity_debit_0".equals(tag)) {
          return new ActivityDebitBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_debit is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEBITDETAIL: {
        if ("layout/activity_debit_detail_0".equals(tag)) {
          return new ActivityDebitDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_debit_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEBITUPDATE: {
        if ("layout/activity_debit_update_0".equals(tag)) {
          return new ActivityDebitUpdateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_debit_update is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEPARTMENT: {
        if ("layout/activity_department_0".equals(tag)) {
          return new ActivityDepartmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_department is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEPARTMENTDETAIL: {
        if ("layout/activity_department_detail_0".equals(tag)) {
          return new ActivityDepartmentDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_department_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDOCUMENT: {
        if ("layout/activity_document_0".equals(tag)) {
          return new ActivityDocumentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_document is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYIMAGEVIEW: {
        if ("layout/activity_image_view_0".equals(tag)) {
          return new ActivityImageViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_image_view is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYKEYFILTER: {
        if ("layout/activity_key_filter_0".equals(tag)) {
          return new ActivityKeyFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_key_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYKEYGROUP: {
        if ("layout/activity_key_group_0".equals(tag)) {
          return new ActivityKeyGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_key_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYKEYGROUPDETAILS: {
        if ("layout/activity_key_group_details_0".equals(tag)) {
          return new ActivityKeyGroupDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_key_group_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYKEYINFO: {
        if ("layout/activity_key_info_0".equals(tag)) {
          return new ActivityKeyInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_key_info is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYKEYINFODETAIL: {
        if ("layout/activity_key_info_detail_0".equals(tag)) {
          return new ActivityKeyInfoDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_key_info_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNOTIFICATION: {
        if ("layout/activity_notification_0".equals(tag)) {
          return new ActivityNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORGANIZATION: {
        if ("layout/activity_organization_0".equals(tag)) {
          return new ActivityOrganizationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_organization is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORGANIZATIONDETAIL: {
        if ("layout/activity_organization_detail_0".equals(tag)) {
          return new ActivityOrganizationDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_organization_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPASSWORDCHANGE: {
        if ("layout/activity_password_change_0".equals(tag)) {
          return new ActivityPasswordChangeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_password_change is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPASSWORDFORGET: {
        if ("layout/activity_password_forget_0".equals(tag)) {
          return new ActivityPasswordForgetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_password_forget is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPASSWORDRESET: {
        if ("layout/activity_password_reset_0".equals(tag)) {
          return new ActivityPasswordResetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_password_reset is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROFILEUPDATE: {
        if ("layout/activity_profile_update_0".equals(tag)) {
          return new ActivityProfileUpdateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_profile_update is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROJECT: {
        if ("layout/activity_project_0".equals(tag)) {
          return new ActivityProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_project is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROJECTDETAIL: {
        if ("layout/activity_project_detail_0".equals(tag)) {
          return new ActivityProjectDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_project_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSERVICE: {
        if ("layout/activity_service_0".equals(tag)) {
          return new ActivityServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSERVICEDETAIL: {
        if ("layout/activity_service_detail_0".equals(tag)) {
          return new ActivityServiceDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_service_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSERVICEGROUP: {
        if ("layout/activity_service_group_0".equals(tag)) {
          return new ActivityServiceGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_service_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSERVICEGROUPDETAIL: {
        if ("layout/activity_service_group_detail_0".equals(tag)) {
          return new ActivityServiceGroupDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_service_group_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSERVICESCHEDULE: {
        if ("layout/activity_service_schedule_0".equals(tag)) {
          return new ActivityServiceScheduleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_service_schedule is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSTATISTICSDETAIL: {
        if ("layout/activity_statistics_detail_0".equals(tag)) {
          return new ActivityStatisticsDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_statistics_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSUBTASK: {
        if ("layout/activity_sub_task_0".equals(tag)) {
          return new ActivitySubTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_sub_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTAG: {
        if ("layout/activity_tag_0".equals(tag)) {
          return new ActivityTagBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_tag is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTAGDETAIL: {
        if ("layout/activity_tag_detail_0".equals(tag)) {
          return new ActivityTagDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_tag_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTASK: {
        if ("layout/activity_task_0".equals(tag)) {
          return new ActivityTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTASKCREATEUPDATE: {
        if ("layout/activity_task_create_update_0".equals(tag)) {
          return new ActivityTaskCreateUpdateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_task_create_update is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTASKDETAIL: {
        if ("layout/activity_task_detail_0".equals(tag)) {
          return new ActivityTaskDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_task_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTASKFILTER: {
        if ("layout/activity_task_filter_0".equals(tag)) {
          return new ActivityTaskFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_task_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRANSACTIONCREATEUPDATE: {
        if ("layout/activity_transaction_create_update_0".equals(tag)) {
          return new ActivityTransactionCreateUpdateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_transaction_create_update is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRANSACTIONDETAIL: {
        if ("layout/activity_transaction_detail_0".equals(tag)) {
          return new ActivityTransactionDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_transaction_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRANSACTIONGROUP: {
        if ("layout/activity_transaction_group_0".equals(tag)) {
          return new ActivityTransactionGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_transaction_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRANSACTIONGROUPDETAIL: {
        if ("layout/activity_transaction_group_detail_0".equals(tag)) {
          return new ActivityTransactionGroupDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_transaction_group_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGAPRROVE: {
        if ("layout/dialog_aprrove_0".equals(tag)) {
          return new DialogAprroveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_aprrove is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCONFIRM: {
        if ("layout/dialog_confirm_0".equals(tag)) {
          return new DialogConfirmBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_confirm is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDELETE: {
        if ("layout/dialog_delete_0".equals(tag)) {
          return new DialogDeleteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_delete is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDOWNLOAD: {
        if ("layout/dialog_download_0".equals(tag)) {
          return new DialogDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_download is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGINPUTKEY: {
        if ("layout/dialog_input_key_0".equals(tag)) {
          return new DialogInputKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_input_key is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGMORETEXT: {
        if ("layout/dialog_more_text_0".equals(tag)) {
          return new DialogMoreTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_more_text is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGPAY: {
        if ("layout/dialog_pay_0".equals(tag)) {
          return new DialogPayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_pay is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGRECALCULATE: {
        if ("layout/dialog_recalculate_0".equals(tag)) {
          return new DialogRecalculateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_recalculate is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_DIALOGREQUESTKEY: {
        if ("layout/dialog_request_key_0".equals(tag)) {
          return new DialogRequestKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_request_key is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGYESNO: {
        if ("layout/dialog_yes_no_0".equals(tag)) {
          return new DialogYesNoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_yes_no is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACCOUNT: {
        if ("layout/fragment_account_0".equals(tag)) {
          return new FragmentAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTKEY: {
        if ("layout/fragment_key_0".equals(tag)) {
          return new FragmentKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_key is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROJECT: {
        if ("layout/fragment_project_0".equals(tag)) {
          return new FragmentProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTATISTICS: {
        if ("layout/fragment_statistics_0".equals(tag)) {
          return new FragmentStatisticsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_statistics is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTASK: {
        if ("layout/fragment_task_0".equals(tag)) {
          return new FragmentTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCATEGORY: {
        if ("layout/item_category_0".equals(tag)) {
          return new ItemCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDEBIT: {
        if ("layout/item_debit_0".equals(tag)) {
          return new ItemDebitBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_debit is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDEPARTMENT: {
        if ("layout/item_department_0".equals(tag)) {
          return new ItemDepartmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_department is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOCUMENT: {
        if ("layout/item_document_0".equals(tag)) {
          return new ItemDocumentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_document is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOCUMENTDOWNLOAD: {
        if ("layout/item_document_download_0".equals(tag)) {
          return new ItemDocumentDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_document_download is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGROUP: {
        if ("layout/item_group_0".equals(tag)) {
          return new ItemGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGROUPSERVICE: {
        if ("layout/item_group_service_0".equals(tag)) {
          return new ItemGroupServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_group_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGROUPTRANSACTION: {
        if ("layout/item_group_transaction_0".equals(tag)) {
          return new ItemGroupTransactionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_group_transaction is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMKEY: {
        if ("layout/item_key_0".equals(tag)) {
          return new ItemKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_key is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMKEYGROUP: {
        if ("layout/item_key_group_0".equals(tag)) {
          return new ItemKeyGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_key_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMKINDSELECT: {
        if ("layout/item_kind_select_0".equals(tag)) {
          return new ItemKindSelectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_kind_select is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTIFICATION: {
        if ("layout/item_notification_0".equals(tag)) {
          return new ItemNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORGANIZATION: {
        if ("layout/item_organization_0".equals(tag)) {
          return new ItemOrganizationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_organization is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORGANIZATIONSELECT: {
        if ("layout/item_organization_select_0".equals(tag)) {
          return new ItemOrganizationSelectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_organization_select is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROJECT: {
        if ("layout/item_project_0".equals(tag)) {
          return new ItemProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_project is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROJECTSELECT: {
        if ("layout/item_project_select_0".equals(tag)) {
          return new ItemProjectSelectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_project_select is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSERVICE: {
        if ("layout/item_service_0".equals(tag)) {
          return new ItemServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSERVICEPAY: {
        if ("layout/item_service_pay_0".equals(tag)) {
          return new ItemServicePayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_service_pay is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSERVICESCHEDULE: {
        if ("layout/item_service_schedule_0".equals(tag)) {
          return new ItemServiceScheduleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_service_schedule is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTATISTICS: {
        if ("layout/item_statistics_0".equals(tag)) {
          return new ItemStatisticsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_statistics is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSUBTASK: {
        if ("layout/item_sub_task_0".equals(tag)) {
          return new ItemSubTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_sub_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTAG: {
        if ("layout/item_tag_0".equals(tag)) {
          return new ItemTagBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_tag is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTAGKIND: {
        if ("layout/item_tag_kind_0".equals(tag)) {
          return new ItemTagKindBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_tag_kind is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTAGSELECT: {
        if ("layout/item_tag_select_0".equals(tag)) {
          return new ItemTagSelectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_tag_select is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTASK: {
        if ("layout/item_task_0".equals(tag)) {
          return new ItemTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTRANSACTION: {
        if ("layout/item_transaction_0".equals(tag)) {
          return new ItemTransactionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_transaction is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTEMPTYDATA: {
        if ("layout/layout_empty_data_0".equals(tag)) {
          return new LayoutEmptyDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_empty_data is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTEMPTYNOTIFICATION: {
        if ("layout/layout_empty_notification_0".equals(tag)) {
          return new LayoutEmptyNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_empty_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTHEADERTITLE: {
        if ("layout/layout_header_title_0".equals(tag)) {
          return new LayoutHeaderTitleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_header_title is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTINVALIDKEY: {
        if ("layout/layout_invalid_key_0".equals(tag)) {
          return new LayoutInvalidKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_invalid_key is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new eu.davidea.flexibleadapter.databinding.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(24);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "a");
      sKeys.put(2, "content");
      sKeys.put(3, "date");
      sKeys.put(4, "dateChoose");
      sKeys.put(5, "des");
      sKeys.put(6, "dialog");
      sKeys.put(7, "isBack");
      sKeys.put(8, "ivm");
      sKeys.put(9, "ivmSelectedId");
      sKeys.put(10, "ivmSelectedName");
      sKeys.put(11, "key");
      sKeys.put(12, "num");
      sKeys.put(13, "permissionApprove");
      sKeys.put(14, "permissionChangeState");
      sKeys.put(15, "permissionDelete");
      sKeys.put(16, "permissionReject");
      sKeys.put(17, "permissionResolve");
      sKeys.put(18, "permissionUpdate");
      sKeys.put(19, "secretKey");
      sKeys.put(20, "selectedName");
      sKeys.put(21, "tagName");
      sKeys.put(22, "title");
      sKeys.put(23, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(88);

    static {
      sKeys.put("layout/activity_category_0", com.finance.R.layout.activity_category);
      sKeys.put("layout/activity_category_detail_0", com.finance.R.layout.activity_category_detail);
      sKeys.put("layout/activity_debit_0", com.finance.R.layout.activity_debit);
      sKeys.put("layout/activity_debit_detail_0", com.finance.R.layout.activity_debit_detail);
      sKeys.put("layout/activity_debit_update_0", com.finance.R.layout.activity_debit_update);
      sKeys.put("layout/activity_department_0", com.finance.R.layout.activity_department);
      sKeys.put("layout/activity_department_detail_0", com.finance.R.layout.activity_department_detail);
      sKeys.put("layout/activity_document_0", com.finance.R.layout.activity_document);
      sKeys.put("layout/activity_image_view_0", com.finance.R.layout.activity_image_view);
      sKeys.put("layout/activity_key_filter_0", com.finance.R.layout.activity_key_filter);
      sKeys.put("layout/activity_key_group_0", com.finance.R.layout.activity_key_group);
      sKeys.put("layout/activity_key_group_details_0", com.finance.R.layout.activity_key_group_details);
      sKeys.put("layout/activity_key_info_0", com.finance.R.layout.activity_key_info);
      sKeys.put("layout/activity_key_info_detail_0", com.finance.R.layout.activity_key_info_detail);
      sKeys.put("layout/activity_login_0", com.finance.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.finance.R.layout.activity_main);
      sKeys.put("layout/activity_notification_0", com.finance.R.layout.activity_notification);
      sKeys.put("layout/activity_organization_0", com.finance.R.layout.activity_organization);
      sKeys.put("layout/activity_organization_detail_0", com.finance.R.layout.activity_organization_detail);
      sKeys.put("layout/activity_password_change_0", com.finance.R.layout.activity_password_change);
      sKeys.put("layout/activity_password_forget_0", com.finance.R.layout.activity_password_forget);
      sKeys.put("layout/activity_password_reset_0", com.finance.R.layout.activity_password_reset);
      sKeys.put("layout/activity_profile_update_0", com.finance.R.layout.activity_profile_update);
      sKeys.put("layout/activity_project_0", com.finance.R.layout.activity_project);
      sKeys.put("layout/activity_project_detail_0", com.finance.R.layout.activity_project_detail);
      sKeys.put("layout/activity_service_0", com.finance.R.layout.activity_service);
      sKeys.put("layout/activity_service_detail_0", com.finance.R.layout.activity_service_detail);
      sKeys.put("layout/activity_service_group_0", com.finance.R.layout.activity_service_group);
      sKeys.put("layout/activity_service_group_detail_0", com.finance.R.layout.activity_service_group_detail);
      sKeys.put("layout/activity_service_schedule_0", com.finance.R.layout.activity_service_schedule);
      sKeys.put("layout/activity_statistics_detail_0", com.finance.R.layout.activity_statistics_detail);
      sKeys.put("layout/activity_sub_task_0", com.finance.R.layout.activity_sub_task);
      sKeys.put("layout/activity_tag_0", com.finance.R.layout.activity_tag);
      sKeys.put("layout/activity_tag_detail_0", com.finance.R.layout.activity_tag_detail);
      sKeys.put("layout/activity_task_0", com.finance.R.layout.activity_task);
      sKeys.put("layout/activity_task_create_update_0", com.finance.R.layout.activity_task_create_update);
      sKeys.put("layout/activity_task_detail_0", com.finance.R.layout.activity_task_detail);
      sKeys.put("layout/activity_task_filter_0", com.finance.R.layout.activity_task_filter);
      sKeys.put("layout/activity_transaction_create_update_0", com.finance.R.layout.activity_transaction_create_update);
      sKeys.put("layout/activity_transaction_detail_0", com.finance.R.layout.activity_transaction_detail);
      sKeys.put("layout/activity_transaction_group_0", com.finance.R.layout.activity_transaction_group);
      sKeys.put("layout/activity_transaction_group_detail_0", com.finance.R.layout.activity_transaction_group_detail);
      sKeys.put("layout/dialog_aprrove_0", com.finance.R.layout.dialog_aprrove);
      sKeys.put("layout/dialog_confirm_0", com.finance.R.layout.dialog_confirm);
      sKeys.put("layout/dialog_delete_0", com.finance.R.layout.dialog_delete);
      sKeys.put("layout/dialog_download_0", com.finance.R.layout.dialog_download);
      sKeys.put("layout/dialog_input_key_0", com.finance.R.layout.dialog_input_key);
      sKeys.put("layout/dialog_more_text_0", com.finance.R.layout.dialog_more_text);
      sKeys.put("layout/dialog_pay_0", com.finance.R.layout.dialog_pay);
      sKeys.put("layout/dialog_recalculate_0", com.finance.R.layout.dialog_recalculate);
      sKeys.put("layout/dialog_request_key_0", com.finance.R.layout.dialog_request_key);
      sKeys.put("layout/dialog_yes_no_0", com.finance.R.layout.dialog_yes_no);
      sKeys.put("layout/fragment_account_0", com.finance.R.layout.fragment_account);
      sKeys.put("layout/fragment_home_0", com.finance.R.layout.fragment_home);
      sKeys.put("layout/fragment_key_0", com.finance.R.layout.fragment_key);
      sKeys.put("layout/fragment_project_0", com.finance.R.layout.fragment_project);
      sKeys.put("layout/fragment_statistics_0", com.finance.R.layout.fragment_statistics);
      sKeys.put("layout/fragment_task_0", com.finance.R.layout.fragment_task);
      sKeys.put("layout/item_category_0", com.finance.R.layout.item_category);
      sKeys.put("layout/item_debit_0", com.finance.R.layout.item_debit);
      sKeys.put("layout/item_department_0", com.finance.R.layout.item_department);
      sKeys.put("layout/item_document_0", com.finance.R.layout.item_document);
      sKeys.put("layout/item_document_download_0", com.finance.R.layout.item_document_download);
      sKeys.put("layout/item_group_0", com.finance.R.layout.item_group);
      sKeys.put("layout/item_group_service_0", com.finance.R.layout.item_group_service);
      sKeys.put("layout/item_group_transaction_0", com.finance.R.layout.item_group_transaction);
      sKeys.put("layout/item_key_0", com.finance.R.layout.item_key);
      sKeys.put("layout/item_key_group_0", com.finance.R.layout.item_key_group);
      sKeys.put("layout/item_kind_select_0", com.finance.R.layout.item_kind_select);
      sKeys.put("layout/item_notification_0", com.finance.R.layout.item_notification);
      sKeys.put("layout/item_organization_0", com.finance.R.layout.item_organization);
      sKeys.put("layout/item_organization_select_0", com.finance.R.layout.item_organization_select);
      sKeys.put("layout/item_project_0", com.finance.R.layout.item_project);
      sKeys.put("layout/item_project_select_0", com.finance.R.layout.item_project_select);
      sKeys.put("layout/item_service_0", com.finance.R.layout.item_service);
      sKeys.put("layout/item_service_pay_0", com.finance.R.layout.item_service_pay);
      sKeys.put("layout/item_service_schedule_0", com.finance.R.layout.item_service_schedule);
      sKeys.put("layout/item_statistics_0", com.finance.R.layout.item_statistics);
      sKeys.put("layout/item_sub_task_0", com.finance.R.layout.item_sub_task);
      sKeys.put("layout/item_tag_0", com.finance.R.layout.item_tag);
      sKeys.put("layout/item_tag_kind_0", com.finance.R.layout.item_tag_kind);
      sKeys.put("layout/item_tag_select_0", com.finance.R.layout.item_tag_select);
      sKeys.put("layout/item_task_0", com.finance.R.layout.item_task);
      sKeys.put("layout/item_transaction_0", com.finance.R.layout.item_transaction);
      sKeys.put("layout/layout_empty_data_0", com.finance.R.layout.layout_empty_data);
      sKeys.put("layout/layout_empty_notification_0", com.finance.R.layout.layout_empty_notification);
      sKeys.put("layout/layout_header_title_0", com.finance.R.layout.layout_header_title);
      sKeys.put("layout/layout_invalid_key_0", com.finance.R.layout.layout_invalid_key);
    }
  }
}
