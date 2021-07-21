
package com.telus.workforcemgmt.dto.resourcemanagement.dto;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;


@Data
public class TeamWorkerRequirements extends RepresentationModel<TeamWorkerRequirements>{

	private Boolean internalTeamWorkerRequiredIndicator;

    private List<String> requiredTeamWorkers;

    private List<String> prohibitedTeamWorkers;
    
    private List<String> preferredTeamWorkers;

    private Integer lockDownDuration;
    
	private String contractorCompany;
    
    private Boolean noTechniciansAssignedToProjectOrSiteAccess = false;
    
    private Error error;


}
