package com.telus.workforcemgmt.capacitymanagement.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class DemandStreamSummary extends RepresentationModel<DemandStreamSummary>{

	private long demandStreamId;
	private String demandStreamNm;
	private int rankNum;
	private long demandTypeId;
	private long demandTypeRuleId;
	private String demandTypeNm; 
	private int demandTypeRankNum;
	private boolean parentDemandInd;
	private String workOrderCategoryCd;
	private String workOrderClassificationCd;
	private String serviceClassCd;
	private String jobTypeCd;
	private String productCd;
	private String technologyCd;
	private String workOrderActionCatgryCd;
	private String skillLevelUsageCd;
	private Boolean outOfServiceInd;
	private Boolean slaInd;
	private String specialProjectNm;
	private String customerId;
	private String severityCd;
	private String origSystemId;
	private String installTypeCd;
	private String districtNm;
	private String serviceAreaNm;
	private String demandPolygonId;
	private String serviceAddressId;
	private Long aggregateId;
	private Long demandStreamGeographyId;
	//private int geoMatchRanking;
	private List<DemandStreamCompanyRule> demandStreamCompanyRuleList;
	private List<DemandTypeRelationship> demandTypeRelationships;
	private LocalDate effectiveDate;
	
	
	
	
}
