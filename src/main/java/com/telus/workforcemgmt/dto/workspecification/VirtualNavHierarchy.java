package com.telus.workforcemgmt.dto.workspecification;



import java.math.BigDecimal;
import java.time.LocalDateTime;


import lombok.Builder;
import lombok.Data;

/**
 * The persistent class for the VIRTUAL_NAV_HIERARCHY database table.
 * 
 */
@Data
@Builder
public class VirtualNavHierarchy {

	private long virtualNavHierarchyId;

	private String commonAreaTxt;

	private LocalDateTime createTs;

	private String createUserId;

	private BigDecimal districtLocationId;

	private String districtNm;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private String fmsCoid;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String latitudeQty;

	private String longitudeQty;

	private String manageCapacityInd;

	private String manageDispatchInd;

	private String provinceCd;

	private BigDecimal provinceLocationId;

	private String provinceNm;

	private BigDecimal regionLocationId;

	private String regionNm;

	private String sapLocationCd;

	private String serviceAreaClliCd;

	private BigDecimal serviceAreaLocationId;

	private String serviceAreaNm;

	private String workOrderCategoryCd;

}