package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.util.List;

import lombok.Data;

@Data
public class Customer  {

    /**
     * Customer name
     */
    private String name;

    /**
     * Business legal name
     */
    private String legalName;

    /**
     * Rating of the customer
     */
    private String rating;

    /**
     * Type of customer, e.g. customer, partner, dealer.
     */
    private CustomerTypeCode typeCode;

    /**
     * Customer contact information, ,maximun 3 contacts are allowed
     */
    private List<Contact> contacts;

    private String billingNumber;

    private String marketSegmentCode;

    private String customerIdentifier;

    private String customerIdentifierTypeCd;

   
}
