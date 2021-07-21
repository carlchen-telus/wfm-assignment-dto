package com.telus.workforcemgmt.dto.resourcemanagement.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;


import org.springframework.format.annotation.DateTimeFormat;

public class TeamWorkerRequirementRequest {

	
	private String locationId;
	private String specialProjectCd;
	@NotBlank
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate effectiveDate;
	private String siteAccessCd;
	@NotBlank
	private String workOrderCategoryCd;
	private String fsaId;
	
	
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getSpecialProjectCd() {
		return specialProjectCd;
	}
	public void setSpecialProjectCd(String specialProject) {
		this.specialProjectCd = specialProject;
	}
	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getSiteAccessCd() {
		return siteAccessCd;
	}
	public void setSiteAccessCd(String siteAccessCd) {
		this.siteAccessCd = siteAccessCd;
	}
	public String getWorkOrderCategoryCd() {
		return workOrderCategoryCd;
	}
	public void setWorkOrderCategoryCd(String workOrderCategory) {
		this.workOrderCategoryCd = workOrderCategory;
	}
	public String getFsaId() {
		return fsaId;
	}
	public void setFsaId(String fsaId) {
		this.fsaId = fsaId;
	}
	
	
}
