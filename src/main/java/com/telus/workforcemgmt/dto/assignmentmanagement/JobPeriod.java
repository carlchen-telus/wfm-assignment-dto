package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.TimeZone;

import lombok.Data;

/**
 * Created by T948414 on Dec 11, 2020
 */

@Data
public class JobPeriod  {
    
	private ZonedDateTime start;
    private ZonedDateTime end;
    private LocalDate localStart;
    private LocalDate localEnd;
    private TimeZone jobLocalTimezone;

}
