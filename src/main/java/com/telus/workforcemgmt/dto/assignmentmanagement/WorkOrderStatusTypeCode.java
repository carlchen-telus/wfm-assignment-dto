
package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.util.ArrayList;


/**
 * Work order status code
 * 
 */
public enum WorkOrderStatusTypeCode {

    OPEN,
    COMPLETE,
    CANCELLED;

    public String value() {
        return name();
    }

    public static WorkOrderStatusTypeCode fromValue(String v) {
        return valueOf(v);
    }
    
    public static ArrayList<String> getActiveStatus(){
	ArrayList<String> l = new ArrayList<String>(1);
	l.add(OPEN.toString());
	return l;
    }

}
