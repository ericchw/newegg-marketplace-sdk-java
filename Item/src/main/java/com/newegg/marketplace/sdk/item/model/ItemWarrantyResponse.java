//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 04:28:57 PM CST 
//


package com.newegg.marketplace.sdk.item.model;

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
 *       &lt;sequence>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="ItemWarrantyList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ItemWarranty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ErrorList" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Error">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
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
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "isSuccess",
    "operationType",
    "sellerID",
    "responseBody",
    "responseDate"
})
@XmlRootElement(name = "NeweggAPIResponse")
public class ItemWarrantyResponse {

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
    protected ItemWarrantyResponse.ResponseBody responseBody;
    @XmlElement(name = "ResponseDate", required = true)
    @JsonProperty("ResponseDate")
    protected String responseDate;

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
     *     {@link ItemWarrantyResponse.ResponseBody }
     *     
     */
    public ItemWarrantyResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWarrantyResponse.ResponseBody }
     *     
     */
    public void setResponseBody(ItemWarrantyResponse.ResponseBody value) {
        this.responseBody = value;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDate(String value) {
        this.responseDate = value;
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
     *         &lt;element name="ItemWarrantyList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ItemWarranty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ErrorList" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Error">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
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
        "itemWarrantyList"
    })
    public static class ResponseBody {

        @XmlElement(name = "ItemWarrantyList", required = true)
        //@JsonProperty("ItemWarrantyList")
        @JsonUnwrapped
        protected ItemWarrantyResponse.ResponseBody.ItemWarrantyList itemWarrantyList;

        /**
         * Gets the value of the itemWarrantyList property.
         * 
         * @return
         *     possible object is
         *     {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList }
         *     
         */
        public ItemWarrantyResponse.ResponseBody.ItemWarrantyList getItemWarrantyList() {
            return itemWarrantyList;
        }

        /**
         * Sets the value of the itemWarrantyList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList }
         *     
         */
        public void setItemWarrantyList(ItemWarrantyResponse.ResponseBody.ItemWarrantyList value) {
            this.itemWarrantyList = value;
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
         *         &lt;element name="ItemWarranty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ErrorList" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Error">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
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
            "itemWarranty"
        })
        public static class ItemWarrantyList {

            @XmlElement(name = "ItemWarranty")
            @JsonProperty("ItemWarrantyList")
            protected List<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty> itemWarranty;

            /**
             * Gets the value of the itemWarranty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itemWarranty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItemWarranty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty }
             * 
             * 
             */
            public List<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty> getItemWarranty() {
                if (itemWarranty == null) {
                    itemWarranty = new ArrayList<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty>();
                }
                return this.itemWarranty;
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
             *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ErrorList" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Error">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "isSuccess",
                "errorList"
            })
            public static class ItemWarranty {

                @XmlElement(name = "IsSuccess", required = true)
                @JsonProperty("IsSuccess")
                protected boolean isSuccess;
                @XmlElement(name = "ErrorList")
                //@JsonProperty("ErrorList")
                @JsonUnwrapped
                protected ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList errorList;

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
                 * Gets the value of the errorList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList }
                 *     
                 */
                public ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList getErrorList() {
                    return errorList;
                }

                /**
                 * Sets the value of the errorList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList }
                 *     
                 */
                public void setErrorList(ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList value) {
                    this.errorList = value;
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
                 *         &lt;element name="Error">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "error"
                })
                public static class ErrorList {

                    @XmlElement(name = "Error", required = true)
                    @JsonProperty("ErrorList")
                    protected List<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList.Error> error;

                    /**
                     * Gets the value of the error property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList.Error }
                     *     
                     */
                    public List<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList.Error> getError() {
                    	if(error==null) {
                    		error=new ArrayList<ItemWarrantyResponse.ResponseBody.ItemWarrantyList.ItemWarranty.ErrorList.Error>();
                    	}
                    	return this.error;
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
                     *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "errorCode",
                        "errorMessage"
                    })
                    public static class Error {

                        @XmlElement(name = "ErrorCode", required = true)
                        @JsonProperty("ErrorCode")
                        protected String errorCode;
                        @XmlElement(name = "ErrorMessage", required = true)
                        @JsonProperty("ErrorMessage")
                        protected String errorMessage;

                        /**
                         * Gets the value of the errorCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getErrorCode() {
                            return errorCode;
                        }

                        /**
                         * Sets the value of the errorCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setErrorCode(String value) {
                            this.errorCode = value;
                        }

                        /**
                         * Gets the value of the errorMessage property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getErrorMessage() {
                            return errorMessage;
                        }

                        /**
                         * Sets the value of the errorMessage property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setErrorMessage(String value) {
                            this.errorMessage = value;
                        }

                    }

                }

            }

        }

    }

}
