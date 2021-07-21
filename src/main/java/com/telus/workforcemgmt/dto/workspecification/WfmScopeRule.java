package com.telus.workforcemgmt.dto.workspecification;


import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the WFM_SCOPE_RULE database table.
 * 
 */
@Data
@Builder(toBuilder=true) 
public class WfmScopeRule {
	
	private long wfmScopeRuleId;

	private LocalDateTime createTs;

	private String createUserId;

	private String custNotifInd;

	private String dfltApptProflCd;

	private String fmsCoid;

	private String jobTypeCd;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String productCd;

	private String provinceCd;

	private String serviceAreaClliCd;

	private String serviceClassCd;

	private String serviceSubclassCd;

	private String workOrderCategoryCd;

	private String workOrderClassificationCd;

	private String workgroupCd;

	
}