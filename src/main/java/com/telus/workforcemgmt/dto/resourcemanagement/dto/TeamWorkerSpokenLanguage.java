package com.telus.workforcemgmt.dto.resourcemanagement.dto;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class TeamWorkerSpokenLanguage extends RepresentationModel<TeamWorkerSpokenLanguage>{

	private List<String> languages;
	private Error error;

	
}
