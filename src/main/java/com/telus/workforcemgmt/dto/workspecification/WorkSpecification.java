package com.telus.workforcemgmt.dto.workspecification;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class WorkSpecification extends RepresentationModel<WorkSpecification>{

	String id;
	boolean hasComponent;
	WorkOrderRule workOrderRule;
	WfmScopeRule wfmScopeRule;
	VirtualNavHierarchy virtualNavHierarchy;
	WfmPartnerScopeRule wfmPartnerScopeRule;
	List<WorkOrderActionRule> workOrderActionRuleList;
	List<WorkOrderRuleSkill> workOrderRuleSkillList;
	WorkOrderRuleSkillLevel workOrderRuleSkillLevel;
	List<WorkSpecification> componentSpecificationList;
	PriorityOverrideRule priorityOverrideRule;
	SeverityPriorityRule severityPriorityRule;

	Double estimatedDuration;
	Integer numberOfTechnicianRequired;
	String[] labels;
	WorkSpecificationRole role;
	WorkSpecificationType type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isHasComponent() {
		return hasComponent;
	}
	public void setHasComponent(boolean hasComponent) {
		this.hasComponent = hasComponent;
	}
	public WorkOrderRule getWorkOrderRule() {
		return workOrderRule;
	}
	public void setWorkOrderRule(WorkOrderRule workOrderRule) {
		this.workOrderRule = workOrderRule;
	}
	public WfmScopeRule getWfmScopeRule() {
		return wfmScopeRule;
	}
	public void setWfmScopeRule(WfmScopeRule wfmScopeRule) {
		this.wfmScopeRule = wfmScopeRule;
	}
	public VirtualNavHierarchy getVirtualNavHierarchy() {
		return virtualNavHierarchy;
	}
	public void setVirtualNavHierarchy(VirtualNavHierarchy virtualNavHierarchy) {
		this.virtualNavHierarchy = virtualNavHierarchy;
	}
	public WfmPartnerScopeRule getWfmPartnerScopeRule() {
		return wfmPartnerScopeRule;
	}
	public void setWfmPartnerScopeRule(WfmPartnerScopeRule wfmPartnerScopeRule) {
		this.wfmPartnerScopeRule = wfmPartnerScopeRule;
	}
	public List<WorkOrderActionRule> getWorkOrderActionRuleList() {
		return workOrderActionRuleList;
	}
	public void setWorkOrderActionRuleList(List<WorkOrderActionRule> workOrderActionRuleList) {
		this.workOrderActionRuleList = workOrderActionRuleList;
	}
	public List<WorkOrderRuleSkill> getWorkOrderRuleSkillList() {
		return workOrderRuleSkillList;
	}
	public void setWorkOrderRuleSkillList(List<WorkOrderRuleSkill> workOrderRuleSkillList) {
		this.workOrderRuleSkillList = workOrderRuleSkillList;
	}
	public WorkOrderRuleSkillLevel getWorkOrderRuleSkillLevel() {
		return workOrderRuleSkillLevel;
	}
	public void setWorkOrderRuleSkillLevel(WorkOrderRuleSkillLevel workOrderRuleSkillLevel) {
		this.workOrderRuleSkillLevel = workOrderRuleSkillLevel;
	}
	public List<WorkSpecification> getComponentSpecificationList() {
		return componentSpecificationList;
	}
	public void setComponentSpecificationList(List<WorkSpecification> componentSpecificationList) {
		this.componentSpecificationList = componentSpecificationList;
	}
	public PriorityOverrideRule getPriorityOverrideRule() {
		return priorityOverrideRule;
	}
	public void setPriorityOverrideRule(PriorityOverrideRule priorityOverrideRule) {
		this.priorityOverrideRule = priorityOverrideRule;
	}
	public SeverityPriorityRule getSeverityPriorityRule() {
		return severityPriorityRule;
	}
	public void setSeverityPriorityRule(SeverityPriorityRule severityPriorityRule) {
		this.severityPriorityRule = severityPriorityRule;
	}
	public Integer getNumberOfTechnicianRequired() {
		return numberOfTechnicianRequired;
	}
	public void setNumberOfTechnicianRequired(Integer numberOfTechnicianRequired) {
		this.numberOfTechnicianRequired = numberOfTechnicianRequired;
	}
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public WorkSpecificationRole getRole() {
		return role;
	}
	public void setRole(WorkSpecificationRole role) {
		this.role = role;
	}
	public WorkSpecificationType getType() {
		return type;
	}
	public void setType(WorkSpecificationType type) {
		this.type = type;
	}
	public Double getEstimatedDuration() {
		return estimatedDuration;
	}
	public void setEstimatedDuration(Double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	
	
}
