//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.30 at 01:05:45 PM PDT 
//


package com.telus.workforcemgmt.dto.locationmanagement;


public class GeographicCoordinateAddress {

    private String matchCode;
    private String latitudeTxt;
    private String longitudeTxt;

    
    public GeographicCoordinateAddress(String matchCode, String latitudeTxt, String longitudeTxt) {
		super();
		this.matchCode = matchCode;
		this.latitudeTxt = latitudeTxt;
		this.longitudeTxt = longitudeTxt;
	}

	/**
     * Gets the value of the matchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchCode() {
        return matchCode;
    }

    /**
     * Sets the value of the matchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchCode(String value) {
        this.matchCode = value;
    }

    /**
     * Gets the value of the latitudeTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeTxt() {
        return latitudeTxt;
    }

    /**
     * Sets the value of the latitudeTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeTxt(String value) {
        this.latitudeTxt = value;
    }

    /**
     * Gets the value of the longitudeTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeTxt() {
        return longitudeTxt;
    }

    /**
     * Sets the value of the longitudeTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeTxt(String value) {
        this.longitudeTxt = value;
    }

}
