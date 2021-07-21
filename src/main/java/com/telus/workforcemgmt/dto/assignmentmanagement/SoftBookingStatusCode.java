
package com.telus.workforcemgmt.dto.assignmentmanagement;

public enum SoftBookingStatusCode {

    NEW,
    BOOKED,
    ERRORED,
    CANCELLED,
    LOCKEDOWN;

    public String value() {
        return name();
    }

    public static SoftBookingStatusCode fromValue(String v) {
        return valueOf(v);
    }
    
}
