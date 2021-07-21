package com.telus.workforcemgmt.dto.assignmentmanagement;

public enum JobStatusCode {

	ACKNOWLEDGED,
	DECLINED,
    OPEN,
    TENTATIVE,
    DISPATCHED,
    REJECTED,
    ACCEPTED,
    EN_ROUTE,
    ON_SITE,
    COMPLETION_PROCESS_STARTED,
    COMPLETE,
    PARTIAL_COMPLETE,
    INCOMPLETE,
    CANCELLED,
    CONNECT_COMPLETE,
    COMPLETE_CR,
    PURGED,
    RESUMED,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static JobStatusCode fromValue(String v) {
        return valueOf(v);
    }
}