
package com.telus.workforcemgmt.dto.assignmentmanagement;

import lombok.Data;

@Data
public class Component {

    private String componentId;
    private String componentTypeCd;
    private String originatingSystemId;
    private String originatingSystemWorkOrderId;
    private String originatingSystemWorkOrderInternalId;
    private String originatingSystemWorkOrderExtensionId;
    private String secondarySystemId;
    private String secondarySystemWorkOrderId;
    private String secondarySystemWorkOrderInternalId;
    private Boolean hostReadyForDispatchInd;
    private String productCategoryCd;
    private String jobTypeCd;
    private String workOrderActionCd;
    private String productTechnologyCd;
    private String installationTypeCd;
    private Float estimatedDurationNum;
    private String estimatedDurationUnitCd;
    private ComponentLocation componentLocation;
    private TypeCode[] componentAttributeList;
    private TypeCode[] componentDetailList;
    private TypeCode[] remarkList;
    private String customerName;
    private String customerContactName;
    private String customerContactPhoneNumber;
    private String statusCd;
    private Boolean isDoableInd;
    private Integer componentNumber;
    private TeamWorkerSkill[] requiredSkills;
    

}
