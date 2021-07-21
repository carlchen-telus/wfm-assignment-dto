package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class SearchAvailabilityPeriod {

	private ZonedDateTime startDateTime;
	private ZonedDateTime endDateTime;
}
