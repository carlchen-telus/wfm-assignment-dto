package com.telus.workforcemgmt.dto.workspecification;




import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the WFM_PARTNER_SCOPE_RULE database table.
 * 
 */

@Data
@Builder(toBuilder=true) 
public class WfmPartnerScopeRule {

	private long wfmPartnerScopeRuleId;

	private LocalDateTime createTs;

	private String createUserId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private String jobTypeCd;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String partnerCompanyCd;

	private String productCd;

	private String serviceAreaClliCd;

	private String serviceClassCd;

	private String technologyCd;

	private String workOrderActionCatgryCd;

	private String workOrderCategoryCd;

	private String workOrderClassificationCd;

	private String workgroupCd;

	
}