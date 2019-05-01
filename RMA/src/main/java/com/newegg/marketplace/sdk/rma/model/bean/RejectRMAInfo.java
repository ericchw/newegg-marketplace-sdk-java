//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 03:44:55 PM CST 
//

package com.newegg.marketplace.sdk.rma.model.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RMANumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RejectReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipCarrier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtherShipCarrier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipService">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrackingNumberList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="TrackingNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RejectRMAInfo")
public class RejectRMAInfo {

	@XmlElement(name = "RMANumber")
	@JsonProperty("RMANumber")
	protected int rmaNumber;

	@XmlElement(name = "RejectReason")
	@JsonProperty("RejectReason")
	protected int rejectReason;

	@XmlElement(name = "ShipCarrier")
	@JsonProperty("ShipCarrier")
	protected int shipCarrier;

	@XmlElement(name = "OtherShipCarrier")
	@JsonProperty("OtherShipCarrier")
	protected String otherShipCarrier;

	@XmlElement(name = "ShipService", required = true)
	@JsonProperty("ShipService")
	protected String shipService;

	@XmlElement(name = "TrackingNumberList", required = true)
	@JsonProperty("TrackingNumberList")
	protected RejectRMAInfo.TrackingNumberList trackingNumberList;

	public int getRmaNumber() {
		return rmaNumber;
	}

	public void setRmaNumber(int rmaNumber) {
		this.rmaNumber = rmaNumber;
	}

	public int getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(int rejectReason) {
		this.rejectReason = rejectReason;
	}

	public int getShipCarrier() {
		return shipCarrier;
	}

	public void setShipCarrier(int shipCarrier) {
		this.shipCarrier = shipCarrier;
	}

	public String getOtherShipCarrier() {
		return otherShipCarrier;
	}

	public void setOtherShipCarrier(String otherShipCarrier) {
		this.otherShipCarrier = otherShipCarrier;
	}

	public String getShipService() {
		return shipService;
	}

	public void setShipService(String shipService) {
		this.shipService = shipService;
	}

	public RejectRMAInfo.TrackingNumberList getTrackingNumberList() {
		return trackingNumberList;
	}

	public void setTrackingNumberList(RejectRMAInfo.TrackingNumberList trackingNumberList) {
		this.trackingNumberList = trackingNumberList;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence maxOccurs="unbounded">
	 *         &lt;element name="TrackingNumber">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;minLength value="1"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"trackingNumber"
	})
	public static class TrackingNumberList {

		@XmlElement(name = "TrackingNumber", required = true)
		@JsonProperty("TrackingNumber")
		protected List<String> trackingNumber;

		/**
		 * Gets the value of the trackingNumber property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the trackingNumber property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getTrackingNumber().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link String }
		 * 
		 * 
		 */
		public List<String> getTrackingNumber() {
			if (trackingNumber == null) {
				trackingNumber = new ArrayList<String>();
			}
			return this.trackingNumber;
		}

	}

}
