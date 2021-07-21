package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Map;

import lombok.Data;

@Data
public class JobDto {
	
	private Long jobId;
	private String externalJobGroupingId;
	private Integer externalJobId;

	private String productCategoryCd;
	private String technologyCd;
	private String jobTypeCd; 
	private String virtualNavigationHierarchyId;
	private String workOrderCategoryCd; 
	private String projectCd;
	private String calendarDerived;
	
	private String priorityByComponentWorkOrderRule;
	private String priorityByProject;
	private String priorityByWorkOrderRule;
	private String priorityDerived;
	
	private Map<String, Boolean> processingStates;

	private String[] prohibitedTechniciansBySRM;
	private String[] prohibitedTechniciansDerived;
		
	private Boolean internalTechnicianRequiredIndByDemandStream;
	private Boolean internalTechnicianRequiredBySRM;
	private Boolean internalTechnicianRequiredDerivedInd;

	private String requiredContractCompany;
	private String requiredContractCompanyByDemandStream;
	private String requiredContractCompanyBySRM;
	private String requiredContractCompanyByPartnerRule;

	private String[] preferredTechnicians;
	
	private String[] requiredTechniciansBySRM;
	private String[] requiredTechniciansDerived;
	private String requiredTechnicianSource;

	private String selfAssignId;
	
	private String skillLevelUsageByWorkOrderComponentRule;
	private String skillLevelUsageByWorkOrderRule;
	private String skillLevelUsageDerived;
	
	private TeamWorkerSkill[] requiredSkills;
	private TeamWorkerSkill[] skillsByWorkOrderComponentRule;
	private TeamWorkerSkill[] skillsByWorkOrderRule;
	private TeamWorkerSkill[] skillsByDemandStream;

	private Long demandStreamId;
	private String subDemandTypeByWorkOrderComponentRule;
	private String subDemandTypeByWorkOrderRule;
    private String subDemandTypeCode;
	
	private String demandTypeByProject;
	private String demandTypeByWorkOrderRule;
    private String demandTypeCode;

	private ZonedDateTime appointmentStartDate;
	private ZonedDateTime appointmentEndDate;
	private ZonedDateTime earlyStartDate;
	private ZonedDateTime dueDate;
	private LocalDate effectiveDate;

	private Float estimatedDurationByComponentList;
	private Float estimatedDurationDerived;
	private Float estimatedDurationPerJob;

	private String continuationJobScheduleStart;
	private JobStatusCode jobStatusCode;

	private String dispatcherRemark;
	private String cableRepairRemark;
	private String connectivityRemark;
	private String customerContactRemark;
	private String technicianRemark;

	private String appointmentProfileBySRM;
	private JobPeriod adjustedJobPeriodByDelayPeriod;
	private String delayPeriodCutOffByComponentWorkOrderRule;
	private String delayPeriodCutOffByWorkOrderRule;
	private String delayPeriodDayByComponentWorkOrderRule;
	private String delayPeriodDayByWorkOrderRule;
	
	private Integer lockDownPeriod;	
	private Boolean noTechAssignedToProjectOrSiteAccessBySRMInd;
	private ZonedDateTime createDate;
	
	private WorkOrderDto workorder;
	private JobAssignment jobAssignment;
	private JobReroute[]  jobReroutes;
	private JobActionRequest jobActionRequest;
	private String[] jobComponentRelationships;
}
