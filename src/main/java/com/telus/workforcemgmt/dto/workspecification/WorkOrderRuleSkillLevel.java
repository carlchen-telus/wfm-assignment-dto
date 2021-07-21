package com.telus.workforcemgmt.dto.workspecification;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the WORK_ORDER_RULE_SKILL_LEVEL database table.
 * 
 */
@Data
@Builder(toBuilder=true) 
public class WorkOrderRuleSkillLevel {

	private long workOrderRuleSkillLevelId;

	private String causeLevel1Txt;
	private String causeLevel2Txt;
	private String causeLevel3Txt;
	private LocalDateTime createTs;
	private String createUserId;
	private LocalDateTime effectiveEndTs;
	private LocalDateTime effectiveStartTs;
	private LocalDateTime lastUpdtTs;
	private String lastUpdtUserId;
	private String multiUnitInd;
	private BigDecimal requiredLevelNum;
	private BigDecimal skillLevelNum;
	private String skillLevelUsageCd;
	private String technologyCd;
	private String troubleTypeTxt;
	private String workOrderActionCd;
	private String workOrderClassificationCd;


}