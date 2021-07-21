package com.telus.workforcemgmt.capacitymanagement.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * The persistent class for the DEMAND_TYPE_RELATIONSHIP database table.
 * 
 */
public class DemandTypeRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	private long demandTypeRelationshipId;

	private LocalDateTime createTs;

	private String createUserId;

	private LocalDateTime effectiveEndTs;

	private LocalDateTime effectiveStartTs;

	private long fromObjectId;

	private LocalDateTime lastUpdtTs;

	private String lastUpdtUserId;

	private String objectTypeCd;

	private String relationshipTypeCd;

	private long toObjectId;

	public DemandTypeRelationship() {
	}

	public long getDemandTypeRelationshipId() {
		return this.demandTypeRelationshipId;
	}

	public void setDemandTypeRelationshipId(long demandTypeRelationshipId) {
		this.demandTypeRelationshipId = demandTypeRelationshipId;
	}

	public LocalDateTime getCreateTs() {
		return this.createTs;
	}

	public void setCreateTs(LocalDateTime createTs) {
		this.createTs = createTs;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public LocalDateTime getEffectiveEndTs() {
		return this.effectiveEndTs;
	}

	public void setEffectiveEndTs(LocalDateTime effectiveEndTs) {
		this.effectiveEndTs = effectiveEndTs;
	}

	public LocalDateTime getEffectiveStartTs() {
		return this.effectiveStartTs;
	}

	public void setEffectiveStartTs(LocalDateTime effectiveStartTs) {
		this.effectiveStartTs = effectiveStartTs;
	}

	public long getFromObjectId() {
		return this.fromObjectId;
	}

	public void setFromObjectId(long fromObjectId) {
		this.fromObjectId = fromObjectId;
	}

	public LocalDateTime getLastUpdtTs() {
		return this.lastUpdtTs;
	}

	public void setLastUpdtTs(LocalDateTime lastUpdtTs) {
		this.lastUpdtTs = lastUpdtTs;
	}

	public String getLastUpdtUserId() {
		return this.lastUpdtUserId;
	}

	public void setLastUpdtUserId(String lastUpdtUserId) {
		this.lastUpdtUserId = lastUpdtUserId;
	}

	public String getObjectTypeCd() {
		return this.objectTypeCd;
	}

	public void setObjectTypeCd(String objectTypeCd) {
		this.objectTypeCd = objectTypeCd;
	}

	public String getRelationshipTypeCd() {
		return this.relationshipTypeCd;
	}

	public void setRelationshipTypeCd(String relationshipTypeCd) {
		this.relationshipTypeCd = relationshipTypeCd;
	}

	public long getToObjectId() {
		return this.toObjectId;
	}

	public void setToObjectId(long toObjectId) {
		this.toObjectId = toObjectId;
	}

}