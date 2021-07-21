package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class SoftBooking {
	
	private SoftBookingStatusCode status;
	private ZonedDateTime expirationDateTime;
	
	
}
