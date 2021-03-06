package com.telus.workforcemgmt.dto.workspecification;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class WorkSpecificationRequest {

	@NotBlank
	private String jobTypeCd;
	@NotBlank
	private String productCd;
	@NotBlank
	private String serviceClassCd;
	
	private String technologyCd;
	@NotBlank
	private String workOrderClassificationCd;
	@NotBlank
	private String serviceAreaClliCd;
	
	private boolean outOfServiceInd = false;
	private String serviceSubclassCd = null;
	private boolean slaInd = false;
	private String workOrderActionCd;
	private String workgroupCd;
	private String troubleTypeTxt;
	private String causeLevel1Txt;
	private String causeLevel2Txt;
	private String causeLevel3Txt;
    @JsonIgnore
	private boolean multiTechInd = false;
    @JsonIgnore
	private boolean multiDayInd = false;
	private String severityCd;
	private String engagementLevel;
	private String installTypeCd;
	private boolean multiUnitInd = false;
	@NotBlank
	private Double duration = 0.0D;
	
	private String[] components; //JOB_TYPE_CD-PRODUCT_CATEGORY_CD-TECHNOLOGY_CD-ESTIMATED_DURATION_AMT-WORK_ORDER_ACTION_CD-INSTALL_TYPE_CD

	private LocalDateTime effectDT = LocalDateTime.now();
	
	private Integer numberOfTechRequired = 1;
	private WorkSpecificationType workSpecificationType; //For WorkSpec with WORK_ORDE_ROLE, workSpecificationType in WorkSpecificationRequest is ignored. It is derived by WorkSpecificationTypeDefinition
														//For For WorkSpec of Job and Component, workSpecificationType in WorkSpecificationRequest is MANDATORY. 
	
	public WorkSpecificationRequest() {
		
	}
	
	

	public WorkSpecificationType getWorkSpecificationType() {
		return workSpecificationType;
	}



	public void setWorkSpecificationType(WorkSpecificationType workSpecificationType) {
		this.workSpecificationType = workSpecificationType;
	}



	public String getJobTypeCd() {
		return jobTypeCd;
	}

	public void setJobTypeCd(String jobTypeCd) {
		this.jobTypeCd = jobTypeCd;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getServiceClassCd() {
		return serviceClassCd;
	}

	public void setServiceClassCd(String serviceClassCd) {
		this.serviceClassCd = serviceClassCd;
	}

	public String getServiceSubclassCd() {
		return serviceSubclassCd;
	}

	public void setServiceSubclassCd(String serviceSubclassCd) {
		this.serviceSubclassCd = serviceSubclassCd;
	}

	public String getTechnologyCd() {
		return technologyCd;
	}

	public void setTechnologyCd(String technologyCd) {
		this.technologyCd = technologyCd;
	}

	public String getWorkOrderActionCd() {
		return workOrderActionCd;
	}

	public void setWorkOrderActionCd(String workOrderActionCd) {
		this.workOrderActionCd = workOrderActionCd;
	}

	public String getWorkOrderClassificationCd() {
		return workOrderClassificationCd;
	}

	public void setWorkOrderClassificationCd(String workOrderClassificationCd) {
		this.workOrderClassificationCd = workOrderClassificationCd;
	}

	public String getServiceAreaClliCd() {
		return serviceAreaClliCd;
	}

	public void setServiceAreaClliCd(String serviceAreaClliCd) {
		this.serviceAreaClliCd = serviceAreaClliCd;
	}

	public String getWorkgroupCd() {
		return workgroupCd;
	}

	public void setWorkgroupCd(String workgroupCd) {
		this.workgroupCd = workgroupCd;
	}

	public String getSeverityCd() {
		return severityCd;
	}

	public void setSeverityCd(String severityCd) {
		this.severityCd = severityCd;
	}

	public String getInstallTypeCd() {
		return installTypeCd;
	}

	public void setInstallTypeCd(String installTypeCd) {
		this.installTypeCd = installTypeCd;
	}
	public String getTroubleTypeTxt() {
		return troubleTypeTxt;
	}

	public void setTroubleTypeTxt(String troubleTypeTxt) {
		this.troubleTypeTxt = troubleTypeTxt;
	}

	public String getCauseLevel1Txt() {
		return causeLevel1Txt;
	}

	public void setCauseLevel1Txt(String causeLevel1Txt) {
		this.causeLevel1Txt = causeLevel1Txt;
	}

	public String getCauseLevel2Txt() {
		return causeLevel2Txt;
	}

	public void setCauseLevel2Txt(String causeLevel2Txt) {
		this.causeLevel2Txt = causeLevel2Txt;
	}

	public String getCauseLevel3Txt() {
		return causeLevel3Txt;
	}

	public void setCauseLevel3Txt(String causeLevel3Txt) {
		this.causeLevel3Txt = causeLevel3Txt;
	}

	public LocalDateTime getEffectDT() {
		return effectDT;
	}

	public void setEffectDT(LocalDateTime effectDT) {
		this.effectDT = effectDT;
	}

	public boolean isOutOfServiceInd() {
		return outOfServiceInd;
	}

	public void setOutOfServiceInd(boolean outOfServiceInd) {
		this.outOfServiceInd = outOfServiceInd;
	}

	public boolean isSlaInd() {
		return slaInd;
	}

	public void setSlaInd(boolean slaInd) {
		this.slaInd = slaInd;
	}

	public boolean isMultiUnitInd() {
		return multiUnitInd;
	}

	public void setMultiUnitInd(boolean multiUnitInd) {
		this.multiUnitInd = multiUnitInd;
	}

	public String[] getComponents() {
		return components;
	}

	public void setComponents(String[] components) {
		this.components = components;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public boolean isMultiTechInd() {
		return multiTechInd;
	}

	public void setMultiTechInd(boolean multiTechInd) {
		this.multiTechInd = multiTechInd;
	}

	

	public boolean isMultiDayInd() {
		return multiDayInd;
	}

	public void setMultiDayInd(boolean multiDayInd) {
		this.multiDayInd = multiDayInd;
	}

	public String getEngagementLevel() {
		return engagementLevel;
	}

	public void setEngagementLevel(String engagementLevel) {
		this.engagementLevel = engagementLevel;
	}

	public Integer getNumberOfTechRequired() {
		return numberOfTechRequired;
	}

	public void setNumberOfTechRequired(Integer numberOfTechRequired) {
		this.numberOfTechRequired = numberOfTechRequired;
	}



	@Override
	public String toString() {
		return "WorkSpecificationRequest [jobTypeCd=" + jobTypeCd + ", productCd=" + productCd + ", serviceClassCd="
				+ serviceClassCd + ", technologyCd=" + technologyCd + ", workOrderClassificationCd="
				+ workOrderClassificationCd + ", serviceAreaClliCd=" + serviceAreaClliCd + ", outOfServiceInd="
				+ outOfServiceInd + ", serviceSubclassCd=" + serviceSubclassCd + ", slaInd=" + slaInd
				+ ", workOrderActionCd=" + workOrderActionCd + ", workgroupCd=" + workgroupCd + ", troubleTypeTxt="
				+ troubleTypeTxt + ", causeLevel1Txt=" + causeLevel1Txt + ", causeLevel2Txt=" + causeLevel2Txt
				+ ", causeLevel3Txt=" + causeLevel3Txt + ", multiTechInd=" + multiTechInd + ", multiDayInd="
				+ multiDayInd + ", severityCd=" + severityCd + ", engagementLevel=" + engagementLevel
				+ ", installTypeCd=" + installTypeCd + ", multiUnitInd=" + multiUnitInd + ", duration=" + duration
				+ ", components=" + Arrays.toString(components) + ", effectDT=" + effectDT + ", numberOfTechRequired="
				+ numberOfTechRequired + ", workSpecificationType=" + workSpecificationType + "]";
	}




}
