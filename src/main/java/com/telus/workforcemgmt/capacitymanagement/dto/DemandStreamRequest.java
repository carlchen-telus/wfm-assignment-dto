package com.telus.workforcemgmt.capacitymanagement.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
public class DemandStreamRequest {

	private String workOrderClassificationCd; 
	private String serviceClassCd; 
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate effectiveDate; 
	private String jobTypeCd; 
	private String productCd; 
	private String technologyCd;
	private String workOrderCategoryCd;
	
	private Boolean outOfServiceInd;
	private Boolean slaInd;
	private String specialProjectName;
	private String severityCd;
	private String installTypeCd;
	private String skillLevelUsageCd;
	private String customerId;
	private String originalSystemId;
	private String workOrderActionCatgryCd;
	
	private String districtName;
	private String serviceAreaName;
	private String locationId;
	private GeoPoint geoPoint;



}
