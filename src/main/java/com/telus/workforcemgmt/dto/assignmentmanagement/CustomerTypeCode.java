package com.telus.workforcemgmt.dto.assignmentmanagement;

/**
 * Customer type code
 *
 */
public enum CustomerTypeCode {

    CUSTOMER,
    PARTNER,
    DEALER,
    INTERNAL;

    public String value() {
        return name();
    }

    public static CustomerTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
