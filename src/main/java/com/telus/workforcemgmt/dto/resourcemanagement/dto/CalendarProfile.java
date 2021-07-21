package com.telus.workforcemgmt.dto.resourcemanagement.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class CalendarProfile  extends RepresentationModel<CalendarProfile>{

	private String calendarName;
    private String appointmentProfile;
    private Error error;

	
}
