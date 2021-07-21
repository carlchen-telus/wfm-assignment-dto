package com.telus.workforcemgmt.dto.locationmanagement;

import java.time.LocalDate;

public class FsaZoneInfo {
	
	private String fsaName;
	private LocalDate bauDate;
	private LocalDate readyDate;
	
	public String getFsaName() {
		return fsaName;
	}
	public void setFsaName(String fsaName) {
		this.fsaName = fsaName;
	}
	public LocalDate getBauDate() {
		return bauDate;
	}
	public void setBauDate(LocalDate bauDate) {
		this.bauDate = bauDate;
	}
	public LocalDate getReadyDate() {
		return readyDate;
	}
	public void setReadyDate(LocalDate readyDate) {
		this.readyDate = readyDate;
	}
	
	

}
