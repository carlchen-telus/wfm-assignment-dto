package com.telus.workforcemgmt.dto;

public class Difference {

	private String path;
	private Operation operation;
	private Object newValue;
	private Object oldValue;


	public Difference(Object newValue, Object oldValue, String path, Operation operation) {
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.path = path;
		this.operation = operation;
	}

	public Object getNewValue() {
		return newValue;
	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
}