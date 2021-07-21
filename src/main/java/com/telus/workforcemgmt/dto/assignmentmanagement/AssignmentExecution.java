package com.telus.workforcemgmt.dto.assignmentmanagement;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

@Data
public class AssignmentExecution  {
    private String executionName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private ZonedDateTime executionDateTime;
    private String createUserId;
    private List<TypeCode> attributeList;
}
