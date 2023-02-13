//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 11:14:18 AM CST 
//


package com.newegg.marketplace.sdk.item.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSRP" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MAP" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CheckoutMAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EnableFreeShipping">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OnPromotion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipByNewegg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Active">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlRootElement(name = "PriceResult")
public class PriceResultV2 {

    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ItemNumber", required = true)
    @JsonProperty("ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "SellerPartNumber", required = true)
    @JsonProperty("SellerPartNumber")
    protected String sellerPartNumber;
    @XmlElement(name = "MSRP", required = true)
    @JsonProperty("MSRP")
    protected BigDecimal msrp;
    @XmlElement(name = "MAP", required = true)
    @JsonProperty("MAP")
    protected BigDecimal map;
    @XmlElement(name = "CheckoutMAP")
    @JsonProperty("CheckoutMAP")
    protected int checkoutMAP;
    @XmlElement(name = "SellingPrice", required = true)
    @JsonProperty("SellingPrice")
    protected BigDecimal sellingPrice;
    @XmlElement(name = "EnableFreeShipping")
    @JsonProperty("EnableFreeShipping")
    protected int enableFreeShipping;
    @XmlElement(name = "OnPromotion", required = true)
    @JsonProperty("OnPromotion")
    protected String onPromotion;
    @XmlElement(name = "ShipByNewegg")
    @JsonProperty("ShipByNewegg")
    protected int shipByNewegg;
    @XmlElement(name = "Active")
    @JsonProperty("Active")
    protected int active;

    /**
     * Gets the value of the sellerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets the value of the sellerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the sellerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerPartNumber() {
        return sellerPartNumber;
    }

    /**
     * Sets the value of the sellerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerPartNumber(String value) {
        this.sellerPartNumber = value;
    }

    /**
     * Gets the value of the msrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSRP() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSRP(BigDecimal value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAP() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAP(BigDecimal value) {
        this.map = value;
    }

    /**
     * Gets the value of the checkoutMAP property.
     * 
     */
    public int getCheckoutMAP() {
        return checkoutMAP;
    }

    /**
     * Sets the value of the checkoutMAP property.
     * 
     */
    public void setCheckoutMAP(int value) {
        this.checkoutMAP = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingPrice(BigDecimal value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the enableFreeShipping property.
     * 
     */
    public int getEnableFreeShipping() {
        return enableFreeShipping;
    }

    /**
     * Sets the value of the enableFreeShipping property.
     * 
     */
    public void setEnableFreeShipping(int value) {
        this.enableFreeShipping = value;
    }

    /**
     * Gets the value of the onPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnPromotion() {
        return onPromotion;
    }

    /**
     * Sets the value of the onPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnPromotion(String value) {
        this.onPromotion = value;
    }

    /**
     * Gets the value of the shipByNewegg property.
     * 
     */
    public int getShipByNewegg() {
        return shipByNewegg;
    }

    /**
     * Sets the value of the shipByNewegg property.
     * 
     */
    public void setShipByNewegg(int value) {
        this.shipByNewegg = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

}
