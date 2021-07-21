package com.telus.workforcemgmt.dto.workspecification;


import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the WORK_ORDER_RULE_SKILL database table.
 * 
 */
@Data
@Builder(toBuilder=true) 
public class WorkOrderRuleSkill {

	private long workOrderRuleSkillId;

	private LocalDateTime createTs;

	private String createUserId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private String jobTypeCd;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String productCd;

	private String serviceClassCd;

	private String serviceSubclassCd;

	private String skillTypeCode;

	private String technologyCd;

	private String workOrderClassificationCd;

	
}