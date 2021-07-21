package com.telus.workforcemgmt.capacitymanagement.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class DemandStreamCapacityCalculation extends RepresentationModel<DemandStreamCapacityCalculation>{

	private LocalDate effectiveDt; // input param
	private Long demandStreamId; // input param

	private BigDecimal calculatedAvailHrsQty = new BigDecimal(0);
	private BigDecimal calculatedUsedHrsQty = new BigDecimal(0);

	private String capacityHrsUsageCd = null;
	private BigDecimal availCapacityHrsQty = new BigDecimal(0);
	private BigDecimal availCapacityHrsPct = new BigDecimal(0);
	private BigDecimal defaultLimitPct = new BigDecimal(0);

	private Long aggregateId = null;
	private BigDecimal aggregateCalculatedAvailHrsQty = new BigDecimal(0);
	private BigDecimal aggregateCalculatedUsedHrsQty = new BigDecimal(0);

	private String aggregateCapacityHrsUsageCd = null;
	private BigDecimal aggregateAvailCapacityHrsQty = new BigDecimal(0);
	private BigDecimal aggregateAvailCapacityHrsPct = new BigDecimal(0);
	private BigDecimal aggregateDefaultLimitPct = new BigDecimal(0);

	private BigDecimal capacityAvailableHours = new BigDecimal(0);
	
	private String capacityAvailableHoursFormula = "";

	
}
