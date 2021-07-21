package com.telus.workforcemgmt.dto.resourcemanagement.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class ProjectRequirements extends RepresentationModel<ProjectRequirements>{
	
	private String technology;
	private String productCategory;
	private String demandType;
	private String priority;
	private Error error;
	

}
