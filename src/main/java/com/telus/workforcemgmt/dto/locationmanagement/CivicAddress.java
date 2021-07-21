
package com.telus.workforcemgmt.dto.locationmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CivicAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="civicNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civicNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePremodifierText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePreDirectionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePrefixTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePostTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePostDirectionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNamePostModifierText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landmarkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CivicAddress", propOrder = {
    "civicNumberPrefix",
    "civicNumber",
    "civicNumberSuffix",
    "streetNamePremodifierText",
    "streetNamePreDirectionalCode",
    "streetNamePrefixTypeCode",
    "streetName",
    "streetNamePostTypeCode",
    "streetNamePostDirectionalCode",
    "streetNamePostModifierText",
    "buildingTypeCode",
    "buildingName",
    "floorTypeCode",
    "floorName",
    "unitTypeCode",
    "unitName",
    "landmarkName",
    "placeName",
    "municipalityCode",
    "provinceStateCode",
    "countryCode",
    "postalCode"
})
public class CivicAddress {

    private String civicNumberPrefix;
    private String civicNumber;
    private String civicNumberSuffix;
    private String streetNamePremodifierText;
    private String streetNamePreDirectionalCode;
    private String streetNamePrefixTypeCode;
    private String streetName;
    private String streetNamePostTypeCode;
    private String streetNamePostDirectionalCode;
    private String streetNamePostModifierText;
    private String buildingTypeCode;
    private String buildingName;
    private String floorTypeCode;
    private String floorName;
    private String unitTypeCode;
    private String unitName;
    private String landmarkName;
    private String placeName;
    private String municipalityCode;
    private String provinceStateCode;
    private String countryCode;
    private String postalCode;

    /**
     * Gets the value of the civicNumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicNumberPrefix() {
        return civicNumberPrefix;
    }

    /**
     * Sets the value of the civicNumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicNumberPrefix(String value) {
        this.civicNumberPrefix = value;
    }

    /**
     * Gets the value of the civicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicNumber() {
        return civicNumber;
    }

    /**
     * Sets the value of the civicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicNumber(String value) {
        this.civicNumber = value;
    }

    /**
     * Gets the value of the civicNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicNumberSuffix() {
        return civicNumberSuffix;
    }

    /**
     * Sets the value of the civicNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicNumberSuffix(String value) {
        this.civicNumberSuffix = value;
    }

    /**
     * Gets the value of the streetNamePremodifierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePremodifierText() {
        return streetNamePremodifierText;
    }

    /**
     * Sets the value of the streetNamePremodifierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePremodifierText(String value) {
        this.streetNamePremodifierText = value;
    }

    /**
     * Gets the value of the streetNamePreDirectionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePreDirectionalCode() {
        return streetNamePreDirectionalCode;
    }

    /**
     * Sets the value of the streetNamePreDirectionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePreDirectionalCode(String value) {
        this.streetNamePreDirectionalCode = value;
    }

    /**
     * Gets the value of the streetNamePrefixTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePrefixTypeCode() {
        return streetNamePrefixTypeCode;
    }

    /**
     * Sets the value of the streetNamePrefixTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePrefixTypeCode(String value) {
        this.streetNamePrefixTypeCode = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNamePostTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePostTypeCode() {
        return streetNamePostTypeCode;
    }

    /**
     * Sets the value of the streetNamePostTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePostTypeCode(String value) {
        this.streetNamePostTypeCode = value;
    }

    /**
     * Gets the value of the streetNamePostDirectionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePostDirectionalCode() {
        return streetNamePostDirectionalCode;
    }

    /**
     * Sets the value of the streetNamePostDirectionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePostDirectionalCode(String value) {
        this.streetNamePostDirectionalCode = value;
    }

    /**
     * Gets the value of the streetNamePostModifierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNamePostModifierText() {
        return streetNamePostModifierText;
    }

    /**
     * Sets the value of the streetNamePostModifierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNamePostModifierText(String value) {
        this.streetNamePostModifierText = value;
    }

    /**
     * Gets the value of the buildingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingTypeCode() {
        return buildingTypeCode;
    }

    /**
     * Sets the value of the buildingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingTypeCode(String value) {
        this.buildingTypeCode = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the floorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorTypeCode() {
        return floorTypeCode;
    }

    /**
     * Sets the value of the floorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorTypeCode(String value) {
        this.floorTypeCode = value;
    }

    /**
     * Gets the value of the floorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorName() {
        return floorName;
    }

    /**
     * Sets the value of the floorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorName(String value) {
        this.floorName = value;
    }

    /**
     * Gets the value of the unitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeCode() {
        return unitTypeCode;
    }

    /**
     * Sets the value of the unitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeCode(String value) {
        this.unitTypeCode = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the landmarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmarkName() {
        return landmarkName;
    }

    /**
     * Sets the value of the landmarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmarkName(String value) {
        this.landmarkName = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the municipalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityCode() {
        return municipalityCode;
    }

    /**
     * Sets the value of the municipalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityCode(String value) {
        this.municipalityCode = value;
    }

    /**
     * Gets the value of the provinceStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceStateCode() {
        return provinceStateCode;
    }

    /**
     * Sets the value of the provinceStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceStateCode(String value) {
        this.provinceStateCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
