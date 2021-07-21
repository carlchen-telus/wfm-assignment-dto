package com.telus.workforcemgmt.dto;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class InputHeader {

	private ZonedDateTime requestDateTime;
	private String userId;
	private String transactionId;
}
