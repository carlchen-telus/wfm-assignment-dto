package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class JobActionRequest {

	private String actionRequestCd;
	private String reasonDomainNm;
	private String reasonDomainValueCd;
	private ZonedDateTime requestExpiryDt;
	private String requestRemarkTxt;
	
}
