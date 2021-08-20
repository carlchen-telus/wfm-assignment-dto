package com.telus.workforcemgmt.dto.assignmentmanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class TeamWorkerSkill {

	@NonNull private String name;
	@NonNull private String level;

}

