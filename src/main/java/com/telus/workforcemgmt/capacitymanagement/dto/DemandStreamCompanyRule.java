package com.telus.workforcemgmt.capacitymanagement.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;



public class DemandStreamCompanyRule implements Serializable {
	private static final long serialVersionUID = 1L;

	private String companyNm;

	private LocalDateTime createTs;

	private String createUserId;

	private BigDecimal demandStreamCompanyRuleId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private String internalTechnicianInd;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	
	public DemandStreamCompanyRule() {
	}

	public String getCompanyNm() {
		return this.companyNm;
	}

	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}

	public LocalDateTime getCreateTs() {
		return this.createTs;
	}

	public void setCreateTs(LocalDateTime createTs) {
		this.createTs = createTs;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public BigDecimal getDemandStreamCompanyRuleId() {
		return this.demandStreamCompanyRuleId;
	}

	public void setDemandStreamCompanyRuleId(BigDecimal demandStreamCompanyRuleId) {
		this.demandStreamCompanyRuleId = demandStreamCompanyRuleId;
	}

	public LocalDateTime getEffectiveEndTs() {
		return this.effectiveEndTs;
	}

	public void setEffectiveEndTs(LocalDateTime effectiveEndTs) {
		this.effectiveEndTs = effectiveEndTs;
	}

	public LocalDateTime getEffectiveStartTs() {
		return this.effectiveStartTs;
	}

	public void setEffectiveStartTs(LocalDateTime effectiveStartTs) {
		this.effectiveStartTs = effectiveStartTs;
	}

	public String getInternalTechnicianInd() {
		return this.internalTechnicianInd;
	}

	public void setInternalTechnicianInd(String internalTechnicianInd) {
		this.internalTechnicianInd = internalTechnicianInd;
	}

	public LocalDateTime getLastUpdtTs() {
		return this.lastUpdtTs;
	}

	public void setLastUpdtTs(LocalDateTime lastUpdtTs) {
		this.lastUpdtTs = lastUpdtTs;
	}

	public String getLastUpdtUserId() {
		return this.lastUpdtUserId;
	}

	public void setLastUpdtUserId(String lastUpdtUserId) {
		this.lastUpdtUserId = lastUpdtUserId;
	}

}