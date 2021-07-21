package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.io.Serializable;
import java.util.Date;

public class JobReroute {
	
	private Long id;
	
	private long reRouteJobId;
	
	private String assignmentId;
	
	private String workforceSegment;
	
	private float remainingHours;
	
	private Boolean returnedIndicator; 
	
	private String reRouteReasonCode;
	
	private String originatingSystemWoGroupId;
	
	private String status;
}