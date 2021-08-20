package com.telus.workforcemgmt.dto;

public enum Operation {
	  ADDED, UPDATED, 
	  //DELETE We never delete a workorder field. we can update to an empty value, like a blank string, a empty list 
}