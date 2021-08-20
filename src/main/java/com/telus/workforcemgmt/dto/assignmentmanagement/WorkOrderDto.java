package com.telus.workforcemgmt.dto.assignmentmanagement;



import java.time.LocalDate;
import java.time.ZonedDateTime;

import com.telus.workforcemgmt.dto.locationmanagement.CivicAddress;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true) 
public class WorkOrderDto  {

	private Long workOrderId;
	private String callId;
	private String caseLevel1Txt;
	private String caseLevel2Txt;
	private String caseLevel3Txt;
	private String engagmentTxt;
	private Boolean customerNotificationIndicator;
	private LocalDate fsaBauDate;
	private String fsaId;
	private Boolean fsaCandidateIndicator;
	private String invalidPreferredTechncianName;
	private String locationSourceCode;
	private Boolean multiUnitAddressIndicator;
	private Integer requiredTechnicianNumber;
	private String originatingSystemExtensionId;
	private String originatingSystemWOGroupId;
	private String originatingSystemWoId;
	private String originatingSystemInternalId;
	private String originatingSystemId;
	private Boolean outOfServiceIndicator;
	private String secondarySystemId;
	private String secondarySystemWoId;
	private String secondarySystemWoInternalId;
	private String serviceAreaCLLI;
	private String serviceAreaCLLIDerived;
	private String serviceLevelAgreementIndicator;
	private String severityCode;
	private String siteAccessCode;
	private String troubleTypeCode;
	private String workGroupTxt;
	private String workOrderActionCode;
	private String workOrderCategoryCode;
	private String workOrderCategoryDerivedCode;
	private String classificationCode; 
	private Double estimatedDurationNum;
	private String jobTypeCode;
	private String locationId;
	private String productCategoryCode;
	private String productCategoryCodeDerived;
	private String serviceClassCode;
	private String subServiceClassCode;
	private String technologyCode;
	private Boolean softBookingInd;
	private String softBookingStatusCode;
	private ZonedDateTime softBookingExpirationDateTime;
	private ZonedDateTime originatingSystemCreateDate;
	private String provinceCode;
	private String regionName;
	private String districtName;
	private String serviceAreaName;
	private String virtualNavigationHierarchyId;
    private String matchCode;
    private String latitudeTxt;
    private String longitudeTxt;
	private Boolean manageDispatchInd;
	private Boolean mdiInd;
	private String sapName;
	private String timeZoneCode;
	private String connectivityCompleteStatusCode;
	private String lockMileStone;
	private String echangeStatusCode;
	private String echangePlannedStartDataTime;
	private String echangePlannedEndDateTime;
	private String echangeId;
	private Boolean hasComponentInd;
	private String requiredLanguageCode;
	private ZonedDateTime appointmentStartDate;
	private ZonedDateTime appointmentEndDate;
	private ZonedDateTime earlyStartDate;
	private ZonedDateTime dueDate;
	private String calendarName;
	private Boolean internalTechnicianRequiredInd;
	private String projectCode;
	private Boolean multiTechInd;
	private Long customerId;
    private String customerName;
    private String customerLegalName;
    private String customerRating;
    private String customerBillingNumber;
    private String customerMarketSegmentCode;
    private String customerIdentifierTxt;
    private String customerIdentifierTypeCd;
	private String fifaCustomerState;
	private String customerRequestDate;
	private String orderBasedDropIndicator;
	private String workListCategoryTxt;
	private Boolean suspendedInd;
	private Boolean recurringJobInd;
	private Boolean jobReroutedIndicator;
	private String workOrderStatusCode;
	private String customerTypeCode;
	private String serviceIdentificationTypeCode;
	private String serviceIdentificationTxt;
	
	private CivicAddress workOrderAddress;
	
	private String[] preferredTechinicianList;
	private String[] requiredTechnicianList;
	private String[] prohibitedTechicianList;
	
	private TeamWorkerSkill[] requiredSkillList;
    private Contact[] contactList;
	private TypeCode[] workOrderRemarkList;
	private TypeCode[] workOrderAttributeList;
	private TypeCode[] workOrderDetailList;
	private Component[] componentList;

}
