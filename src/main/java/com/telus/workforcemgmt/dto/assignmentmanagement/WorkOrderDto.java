package com.telus.workforcemgmt.dto.assignmentmanagement;



import java.time.LocalDate;
import java.time.ZonedDateTime;

import com.telus.workforcemgmt.dto.locationmanagement.CivicAddress;
import com.telus.workforcemgmt.dto.locationmanagement.GeographicCoordinateAddress;

import lombok.Data;

@Data
public class WorkOrderDto  {

	private String callId;
	
	private String caseLevel1;
	
	private String caseLevel2;
	
	private String caseLevel3;
	
	private String engagment;
	
	private Component[] componentList;
	
	private Long customerId;
	
	private Boolean customerNotificationIndicator;
	
	private LocalDate fsaBauDate;
	private String fsaId;
	private Boolean fsaCandidateIndicator;
	
	private String invalidPreferredTechncian;
	
	private TypeCode[] workOrderRemarks;
	
	private String locationSource;
	private Boolean multiUnitAddressIndicator;
	
	private Integer numberOfTechnicianRequired;
	
	private String originatingSystemExtensionId;
	private String originatingSystemWOGroupId;
	private String originatingSystemWoId;
	private String originatingSystemInternalId;
	private String originatingSystemId;
	
	private Boolean outOfServiceIndicator;
	
	private String[] preferredTechinician;
	
	private String secondarySystemId;
	
	private String secondarySystemWoId;
	
	private String secondarySystemWoInternalId;

	private String serviceAreaCLLI;
	private String serviceAreaCLLIDerived;
	private String serviceLevelAgreementIndicator;
	private String severityCode;
	
	private String siteAccess;
	
	private String troubleType;
	
	private String workGroup;

	private String workOrderAction;
	private CivicAddress workOrderAddress;
	private String workOrderCategoryCd;
	private String workOrderCategoryDerived;
	

	private String classificationCode; 
	
	private Float estimatedDurationByHost;
	private Long workOrderId;
	
	private String jobTypeCode;
	private String locationId;
	
	private String productCategoryCode;
	
	private String productCategoryCodeDerived;
	private String serviceClassCode;
	
	private String subServiceClassCode;
	private String technologyCode;

	private Boolean softBookingInd;

	private SoftBooking softBooking;
	private ZonedDateTime originatingSystemCreateDate;
	
	private String provinceCode;
	private String regionName;
	private String districtName;
	private String serviceAreaName;
	private String virtualNavigationHierarchyId;
	private GeographicCoordinateAddress geoCoding;
	
	private Boolean manageDispatchInd;
	private Boolean mdiInd;
	private String sapName;
	private String timeZone;
	private String connectivityComplete;
	private String lockMileStone;
	private String echangeStatus;
	private String echangePlannedStart;
	private String echangePlannedEnd;
	private String echangeId;
	private Boolean hasComponentInd;
	private String requiredLanguage;
	private TeamWorkerSkill[] requiredSkills;
	
	private ZonedDateTime appointmentStartDate;
	private ZonedDateTime appointmentEndDate;
	private ZonedDateTime earlyStartDate;
	private ZonedDateTime dueDate;
	
	private String calendarName;
	private Boolean internalTechnicianRequiredInd;
	private String[] requiredTechnicians;
	private String[] prohibitedTechicians;
	private String projectCode;
	
	private Boolean multiTechInd;
	private TypeCode[] workOrderDetails;
	private Customer customer;
	private Contact[] contactList;
	private String customerRequestDate;
	private TypeCode[] workOrderAttributes;
	private String fifaCustomerState;
	private String orderBasedDropIndicator;
	private String workListCategory;
	private WorkOrderStatusTypeCode status;
	private Boolean suspended;
	private Boolean recurringJobInd;
	private TypeCode serviceIdentification;
	private Boolean jobReroutedIndicator;

}
