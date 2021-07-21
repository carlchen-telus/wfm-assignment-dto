package com.telus.workforcemgmt.dto.assignmentmanagement;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class JobAssignment {

    private Long jobAssignmentId;
    private String teamWorkerId;
    private JobStatusCode statusCd;
    private AssignmentExecution execution;
    private ZonedDateTime scheduledStartDateTime;
    private ZonedDateTime scheduledEndDateTime;
   

}

