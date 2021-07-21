package com.telus.workforcemgmt.dto.locationmanagement;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder=true) 
public class Location extends RepresentationModel<Location>{

	private long locationId;
	private GeographicCoordinateAddress geoPoint;
	private String serviceAreaCLLI;
	private String fmsCoId;
	private FsaZoneInfo fsa;
	private List<LocationCode> locationCodes;
	private CivicAddress address;
	private String timezone;
	private boolean multiUnitAddressInd;
	
}
