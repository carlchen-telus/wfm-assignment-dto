package com.telus.workforcemgmt.dto.assignmentmanagement;

import lombok.Data;


/**
 * Customer contact information
 *
 */
@Data
public class Contact {

    /**
     * Contact person name
     */
    private String name;
    /**
     * Contact type. For west, this is a fixed value "CBR"
     */
    private String typeCode;
    /**
     * Phone number
     */
    private String phone;
    /**
     * Phone location, e.g AUT(Other), BUR(Office), CEL(Mobile), CHA(SummerHouse), FAX(Fax), MES(Message), RES(Residentail), TRV(Work)
     * not used by west
     */
    private String phoneLocation;
    /**
     * Second phone number, not used by west
     */
    private String phone2;
    /**
     * Second phone location, not used by west
     */
    private String phone2Location;


}

