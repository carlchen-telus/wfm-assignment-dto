package com.telus.workforcemgmt.dto.workspecification;


import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the WORK_ORDER_ACTION_RULE database table.
 * 
 */

@Data
@Builder(toBuilder=true) 
public class WorkOrderActionRule {

	public enum WORK_ORDER_ACTION_USAGE_CODE {SUB_DEMAND, TIME_WIZARD, DEMAND_STREAM, PARTNER};
	
	private long workOrderActionRuleId;

	private LocalDateTime createTs;

	private String createUserId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String workOrderActionCd;

	private String workOrderActionCtgryCd;

	private String workOrderActionUsageCd;

	private String workOrderCategoryCd;

	
}