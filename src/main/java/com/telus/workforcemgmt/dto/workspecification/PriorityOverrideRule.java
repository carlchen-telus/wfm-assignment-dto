package com.telus.workforcemgmt.dto.workspecification;

import java.time.ZonedDateTime;

import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the PRIORITY_OVERRIDE_RULE database table.
 * 
 */
@Data
@Builder(toBuilder=true) 
public class PriorityOverrideRule {

	private long priorityOverrideRuleId;

	private ZonedDateTime createTs;

	private String createUserId;

	private String domainNm;

	private String domainValueCd;

	private ZonedDateTime effectiveEndTs;

	private ZonedDateTime effectiveStartTs;

	private String jobPriorityCd;

	private ZonedDateTime lastUpdtTs;

	private String lastUpdtUserId;


}