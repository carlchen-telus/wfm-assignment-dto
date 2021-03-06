package com.telus.workforcemgmt.dto.workspecification;



import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * The persistent class for the SEVERITY_PRIORITY_RULE database table.
 * 
 */
@Data
@Builder(toBuilder=true) 
public class SeverityPriorityRule {

	private long severityPriorityRuleId;

	private LocalDateTime createTs;

	private String createUserId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private BigDecimal jobPriorityNum;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String severityCd;

	private String workOrderCategoryCd;

	public SeverityPriorityRule(long severityPriorityRuleId, LocalDateTime createTs, String createUserId,
			LocalDateTime effectiveEndTs, LocalDateTime effectiveStartTs, BigDecimal jobPriorityNum,
			LocalDateTime lastUpdtTs, String lastUpdtUserId, String severityCd, String workOrderCategoryCd) {
		super();
		this.severityPriorityRuleId = severityPriorityRuleId;
		this.createTs = createTs;
		this.createUserId = createUserId;
		this.effectiveEndTs = effectiveEndTs;
		this.effectiveStartTs = effectiveStartTs;
		this.jobPriorityNum = jobPriorityNum;
		this.lastUpdtTs = lastUpdtTs;
		this.lastUpdtUserId = lastUpdtUserId;
		this.severityCd = severityCd;
		this.workOrderCategoryCd = workOrderCategoryCd;
	}

	

}