//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.21 at 01:46:38 PM CST 
//


package com.newegg.marketplace.sdk.seller.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


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
 *         &lt;element name="IsSuccess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyInfoList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PropertyInfo" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IsAdvancedSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="IsGroupBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PropertyValueList">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
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
@XmlRootElement(name = "NeweggAPIResponse")
public class GetSubcategoryPropertyValueResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSubcategoryPropertyValueResponse.ResponseBody responseBody;

    /**
     * Gets the value of the isSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

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
     * Gets the value of the responseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubcategoryPropertyValueResponse.ResponseBody }
     *     
     */
    public GetSubcategoryPropertyValueResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubcategoryPropertyValueResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSubcategoryPropertyValueResponse.ResponseBody value) {
        this.responseBody = value;
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
     *         &lt;element name="PropertyInfoList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PropertyInfo" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IsAdvancedSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="IsGroupBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PropertyValueList">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
        "propertyInfoList"
    })
    public static class ResponseBody {

        @XmlElement(name = "PropertyInfoList", required = true)
        //@JsonProperty("PropertyInfoList")
        @JsonUnwrapped
        protected GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList propertyInfoList;

        /**
         * Gets the value of the propertyInfoList property.
         * 
         * @return
         *     possible object is
         *     {@link GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList }
         *     
         */
        public GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList getPropertyInfoList() {
            return propertyInfoList;
        }

        /**
         * Sets the value of the propertyInfoList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList }
         *     
         */
        public void setPropertyInfoList(GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList value) {
            this.propertyInfoList = value;
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
         *         &lt;element name="PropertyInfo" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IsAdvancedSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="IsGroupBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PropertyValueList">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "propertyInfo"
        })
        public static class PropertyInfoList {

            @XmlElement(name = "PropertyInfo", required = true)
            @JsonProperty("PropertyInfoList")
            protected List<GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo> propertyInfo;

            /**
             * Gets the value of the propertyInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the propertyInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPropertyInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo }
             * 
             * 
             */
            public List<GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo> getPropertyInfo() {
                if (propertyInfo == null) {
                    propertyInfo = new ArrayList<GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo>();
                }
                return this.propertyInfo;
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
             *         &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IsAdvancedSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="IsGroupBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PropertyValueList">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            public static class PropertyInfo {

                @XmlElement(name = "SubcategoryID")
                @JsonProperty("SubcategoryID")
                protected int subcategoryID;
                @XmlElement(name = "SubcategoryName", required = true)
                @JsonProperty("SubcategoryName")
                protected String subcategoryName;
                @XmlElement(name = "PropertyName", required = true)
                @JsonProperty("PropertyName")
                protected String propertyName;
                @XmlElement(name = "IsAdvancedSearch")
                @JsonProperty("IsAdvancedSearch")
                protected int isAdvancedSearch;
                @XmlElement(name = "IsGroupBy")
                @JsonProperty("IsGroupBy")
                protected int isGroupBy;
                @XmlElement(name = "IsRequired")
                @JsonProperty("IsRequired")
                protected int isRequired;
                @XmlElement(name = "PropertyValueList", required = true)
                //@JsonProperty("PropertyValueList")
                @JsonUnwrapped
                protected GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo.PropertyValueList propertyValueList;

                /**
                 * Gets the value of the subcategoryID property.
                 * 
                 */
                public int getSubcategoryID() {
                    return subcategoryID;
                }

                /**
                 * Sets the value of the subcategoryID property.
                 * 
                 */
                public void setSubcategoryID(int value) {
                    this.subcategoryID = value;
                }

                /**
                 * Gets the value of the subcategoryName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubcategoryName() {
                    return subcategoryName;
                }

                /**
                 * Sets the value of the subcategoryName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubcategoryName(String value) {
                    this.subcategoryName = value;
                }

                /**
                 * Gets the value of the propertyName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPropertyName() {
                    return propertyName;
                }

                /**
                 * Sets the value of the propertyName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPropertyName(String value) {
                    this.propertyName = value;
                }

                /**
                 * Gets the value of the isAdvancedSearch property.
                 * 
                 */
                public int getIsAdvancedSearch() {
                    return isAdvancedSearch;
                }

                /**
                 * Sets the value of the isAdvancedSearch property.
                 * 
                 */
                public void setIsAdvancedSearch(int value) {
                    this.isAdvancedSearch = value;
                }

                /**
                 * Gets the value of the isGroupBy property.
                 * 
                 */
                public int getIsGroupBy() {
                    return isGroupBy;
                }

                /**
                 * Sets the value of the isGroupBy property.
                 * 
                 */
                public void setIsGroupBy(int value) {
                    this.isGroupBy = value;
                }

                /**
                 * Gets the value of the isRequired property.
                 * 
                 */
                public int getIsRequired() {
                    return isRequired;
                }

                /**
                 * Sets the value of the isRequired property.
                 * 
                 */
                public void setIsRequired(int value) {
                    this.isRequired = value;
                }

                /**
                 * Gets the value of the propertyValueList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo.PropertyValueList }
                 *     
                 */
                public GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo.PropertyValueList getPropertyValueList() {
                    return propertyValueList;
                }

                /**
                 * Sets the value of the propertyValueList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo.PropertyValueList }
                 *     
                 */
                public void setPropertyValueList(GetSubcategoryPropertyValueResponse.ResponseBody.PropertyInfoList.PropertyInfo.PropertyValueList value) {
                    this.propertyValueList = value;
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
                 *         &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                    "propertyValue"
                })
                public static class PropertyValueList {

                    @XmlElement(name = "PropertyValue", required = true)
                    @JsonProperty("PropertyValueList")
                    protected List<String> propertyValue;

                    /**
                     * Gets the value of the propertyValue property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the propertyValue property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPropertyValue().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getPropertyValue() {
                        if (propertyValue == null) {
                            propertyValue = new ArrayList<String>();
                        }
                        return this.propertyValue;
                    }

                }

            }

        }

    }

}
