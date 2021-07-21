package com.telus.workforcemgmt.dto.workspecification;

public enum WorkSpecificationType {
	RG("REGULAR"), MLTEC("MULTI_TECH"), MLTSEC("MULTI_TECH_SEC"),  //for WorkOrder
	OW("OWNER"), RL("RELATED"), TR("OTHER"), ND("NONDOABLE"),//for component, component-job relationship
	
	//following are used by JOB
	MLTECM("MULTI_TECH_MAIN"),MLTECA("MULTI_TECH_AUX"),
	MLTSECSM("MULTI_TECH_SEC_MAIN"), MLTSECSA("MULTI_TECH_SEC_AUX"),MLTSECNS("MULTI_TECH_SEC_NOSEC"); 
	
	String description;
	
	WorkSpecificationType(String value) {
		this.description = value;
	}
	
	String getDescription() {
		return this.description;
	}
	
}
