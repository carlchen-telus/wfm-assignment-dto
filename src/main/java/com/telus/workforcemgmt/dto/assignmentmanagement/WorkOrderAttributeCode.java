package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.util.LinkedList;

public enum WorkOrderAttributeCode {

	//WorkOrder Attribute managed by generic WorkOrder Attributes JobField JobFieldWorkOrderAttributes
	//These fields doesn't go to Click 
	TOM_CONTRACT(false, false),
	UNSPLITTABLE(false, false), //TODO: should be removed
	BILLING_NUMBER(false, false),
	SCHD_REMARK(false, false),
	SOFT_BOOK(false, false),

	PRIORITY_IDX(false, false),
	LEVEL_1(false, false),
	LEVEL_2(false, false),
	LEVEL_3(false, false),
	TROUBLE_TYPE(false, false),
	CLEC_ID(false, false),

	ECHANGE_ID(true, false),
	ECHANGE_STATUS(false, false),
	ECHANGE_PLAN_START(false, false),
	ECHANGE_PLAN_END(false, false),
	LOCK_MILESTONE(true, false),
	HOST_WO_CATEGORY(false, false),
	HAS_COMPONENT(true, false),
	
	//Fields mapped to task fields in JobFieldWorkOrderAttributes
	WO_PURPOSE(false, false), 
	WO_LISTING_STATUS(false, false), 
	THIRD_PARTY(false, false), 
	BILLABLE_WO_NUM(false, false), 
	EXTERNAL_WO_NUM(false, false), 
	WO_EXECUTION_CODE(false, false), 
	CRTC(false, false), 
	CUST_REQUIRED_DATE(false, false), 
	REPEAT_INDICATOR(false, false), 
	CHRONIC_INDICATOR(false, false), 
	SAP_NETWORK(false, false), 
	SAP_PROJECT(false, false), 
	WBS_CODE(false, false), 
	CUSTOMER_IP(false, false), 
	PARENT_IND(false, false), 
	PATTERN_IND(false, false),
	SLA(false, false),
	HOT_CUT_INDICATOR(false, false),
		
	//WorkOrder Attribute not managed by generic WorkOrder Attributes JobField "JobFieldWorkOrderAttributes"
	SPECIAL_PROJECT(true, false),
	READY_FOR_DISPATCH(true, false),
	ROUTE_TO_AWAS(true, false),
	DISPOSITION(true, false),
	OUT_OF_SERVICE(true, false),
	OVERRIDE(true, false),
	FMS_SHORT_NAME(true, false),
	WORK_GROUP(true, false),
	PRODUCT_CATEGORY(true, false),
	JOB_TYPE(true, false),
	EXTERNAL_GROUPING_ID(true, false),
	TECHNOLOGY(true, false),
	Outage(true, false),
	INVALID_PREF_TECH(true, false),
	INVALID_REQ_TECH(true, false),
	INVALID_PROH_TECH(true, false),
	CNNCT_CMPL_IND(true, false),
	SITE_ACCESS(true, false),
	LOCKDOWN_DURATION(true, false),
	LOCKDOWN(true, false),
	ORIG_CATEGORY(true, false),
	ORIG_TECHNOLOGY(true, false),
	SEVERITY(false, false),
	ENGAGEMENT_LEVEL(false, false),
	REQUIRED_LANGUAGE(false, false),
	
	REROUTE_IND(false, true),
	NOTIFICATION_IND(false, true),
	SAP_NAME(true, false),
	WINBACK(false,false),
	WELCOME_KIT_IND(false, true),	
	ESTIMATED_DURATION(true, false),
	HOST_REQUIRED_SKILLS(true, false),
	HOST_PRIORITY(true, false),
	MULTI_UNIT_IND(true, false),
	RECURRING_JOB_IND(false, false),	
	TQ_IND(true, false),
	SUSPENDED(false, false),
	MULTIJOB(true, false),
	//CSD-4799
	WORK_LIST_CATEGORY(false, false),
	FSA_ID(false, false),
	FSA_BAU_DATE(false, false),
	//CSD-8340
	FIFA_CUSTOMER_STATE (false,false),
	//CSD-8634
	CRITICAL_CUSTOMER(false, false),
	//CSD-8476
	OVERRIDE_FIELD_NM(false,false),
	//CSD-9235
	OBD_IND(false, false),
	//CSD-11490
	LOCATION_SOURCE(false,false),
	//CSD-12437
	AUTO_DISPATCH (false,false),
	DISPATCH_TECH_ID (false,false)
	;
	
	boolean reserved; //attributes are not sent from host in workorderAttribute list and we don't return them to host either
	boolean readOnlyByHost; //attributes are not sent from host in workorderAttribute list, but we return them to host, but host can't update them. 
	
	private WorkOrderAttributeCode(boolean reserved, boolean readOnlyByHost) {
		this.readOnlyByHost = readOnlyByHost;
		this.reserved = reserved;
	}
	
	public boolean isReserved() {
		return reserved;
	}

	public boolean isReadOnlyByHost() {
		return readOnlyByHost;
	}
	
	public static String[] getReservedCodes() {
		LinkedList<String> reserved = new LinkedList<String>();
		for (WorkOrderAttributeCode e :values()){
			if (e.isReserved()) {
				reserved.add(e.name());
			}
		}
		return reserved.toArray(new String[reserved.size()]);
	}
	
	public static String[] getReadOnlyByHostCodes() {
		LinkedList<String> reserved = new LinkedList<String>();
		for (WorkOrderAttributeCode e :values()){
			if (e.isReadOnlyByHost()) {
				reserved.add(e.name());
			}
		}
		return reserved.toArray(new String[reserved.size()]);
	}
	
	public static String[] fieldsExposedToNonDedicatedPartner() {
		String[] EXPOSED_WORKORDER_ATTRIBUTE_CODES ={CRTC.name(), CUST_REQUIRED_DATE.name(), REPEAT_INDICATOR.name(), 
				CHRONIC_INDICATOR.name(), CLEC_ID.name(), PARENT_IND.name(), PATTERN_IND.name(), SLA.name(), 
				HOT_CUT_INDICATOR.name(), SEVERITY.name(), SUSPENDED.name(), ENGAGEMENT_LEVEL.name()};
		return EXPOSED_WORKORDER_ATTRIBUTE_CODES;
	}
	
	/**
	 * Added WorkOrderAttribute fields here when the field is not handling 
	 * through WorkOrderAttributes for convertTo and convertFrom
	 * 
	 */
	public static String[] getExcludedAttributesInJobFieldWorkOrderAttributes() {
		String[] EXCLUDED_WORKORDER_ATTRIBUTE_CODES = {	SPECIAL_PROJECT.name(), READY_FOR_DISPATCH.name(), 
				ROUTE_TO_AWAS.name(), DISPOSITION.name(), OUT_OF_SERVICE.name(), OVERRIDE.name(), 
				FMS_SHORT_NAME.name(), WORK_GROUP.name(), PRODUCT_CATEGORY.name(), JOB_TYPE.name(), 
				EXTERNAL_GROUPING_ID.name(), TECHNOLOGY.name(), Outage.name(), INVALID_PREF_TECH.name(), 
				CNNCT_CMPL_IND.name(), SITE_ACCESS.name(), LOCKDOWN_DURATION.name(), LOCKDOWN.name(),
				ORIG_CATEGORY.name(), ORIG_TECHNOLOGY.name(), SEVERITY.name(), ENGAGEMENT_LEVEL.name(),
				REROUTE_IND.name(), NOTIFICATION_IND.name(), SUSPENDED.name(), FSA_ID.name(), FSA_BAU_DATE.name(),
				ECHANGE_STATUS.name(), ECHANGE_PLAN_START.name(), ECHANGE_PLAN_END.name(),
				ESTIMATED_DURATION.name(), WORK_LIST_CATEGORY.name(), REQUIRED_LANGUAGE.name(),
				LOCATION_SOURCE.name()};
		return EXCLUDED_WORKORDER_ATTRIBUTE_CODES;
	}
}