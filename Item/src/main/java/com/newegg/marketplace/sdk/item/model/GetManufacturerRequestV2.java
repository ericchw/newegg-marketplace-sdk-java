//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 08:42:46 AM CST 
//


package com.newegg.marketplace.sdk.item.model;

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
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GetManufacturerRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PageIndex" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PageSize" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RestrictedCountryCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RequestCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreatedDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreatedDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
@XmlRootElement(name = "NeweggAPIRequest")
public class GetManufacturerRequestV2 {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType="GetManufacturerRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected GetManufacturerRequestV2.RequestBody requestBody;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetManufacturerRequestV2.RequestBody }
     *     
     */
    public GetManufacturerRequestV2.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetManufacturerRequestV2.RequestBody }
     *     
     */
    public void setRequestBody(GetManufacturerRequestV2.RequestBody value) {
        this.requestBody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PageIndex" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PageSize" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RestrictedCountryCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RequestCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreatedDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreatedDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "pageIndex",
        "pageSize",
        "restrictedCountryCode",
        "requestCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "PageIndex")
        @JsonProperty("PageIndex")
        protected Integer pageIndex;
        @XmlElement(name = "PageSize")
        @JsonProperty("PageSize")
        protected Integer pageSize;
        @XmlElement(name = "RestrictedCountryCode", required = true)
        @JsonProperty("RestrictedCountryCode")
        protected String restrictedCountryCode;
        @XmlElement(name = "RequestCriteria", required = true)
        @JsonProperty("RequestCriteria")
        protected GetManufacturerRequestV2.RequestBody.RequestCriteria requestCriteria;

        /**
         * Gets the value of the pageIndex property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPageIndex() {
            return pageIndex;
        }

        /**
         * Sets the value of the pageIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPageIndex(Integer value) {
            this.pageIndex = value;
        }

        /**
         * Gets the value of the pageSize property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPageSize() {
            return pageSize;
        }

        /**
         * Sets the value of the pageSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPageSize(Integer value) {
            this.pageSize = value;
        }

        /**
         * Gets the value of the restrictedCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestrictedCountryCode() {
            return restrictedCountryCode;
        }

        /**
         * Sets the value of the restrictedCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestrictedCountryCode(String value) {
            this.restrictedCountryCode = value;
        }

        /**
         * Gets the value of the requestCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link GetManufacturerRequestV2.RequestBody.RequestCriteria }
         *     
         */
        public GetManufacturerRequestV2.RequestBody.RequestCriteria getRequestCriteria() {
            return requestCriteria;
        }

        /**
         * Sets the value of the requestCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetManufacturerRequestV2.RequestBody.RequestCriteria }
         *     
         */
        public void setRequestCriteria(GetManufacturerRequestV2.RequestBody.RequestCriteria value) {
            this.requestCriteria = value;
        }


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
         *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreatedDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreatedDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class RequestCriteria {

            @XmlElement(name = "ManufacturerName")
            @JsonProperty("ManufacturerName")
            protected String manufacturerName;
            @XmlElement(name = "CreatedDateFrom")
            @JsonProperty("CreatedDateFrom")
            protected String createdDateFrom;
            @XmlElement(name = "CreatedDateTo")
            @JsonProperty("CreatedDateTo")
            protected String createdDateTo;

            /**
             * Gets the value of the manufacturerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManufacturerName() {
                return manufacturerName;
            }

            /**
             * Sets the value of the manufacturerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManufacturerName(String value) {
                this.manufacturerName = value;
            }

            /**
             * Gets the value of the createdDateFrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedDateFrom() {
                return createdDateFrom;
            }

            /**
             * Sets the value of the createdDateFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedDateFrom(String value) {
                this.createdDateFrom = value;
            }

            /**
             * Gets the value of the createdDateTo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedDateTo() {
                return createdDateTo;
            }

            /**
             * Sets the value of the createdDateTo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedDateTo(String value) {
                this.createdDateTo = value;
            }

        }

    }

}
