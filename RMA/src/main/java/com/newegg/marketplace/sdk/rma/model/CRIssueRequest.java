//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.08 at 04:25:53 PM CST 
//

package com.newegg.marketplace.sdk.rma.model;

import java.math.BigDecimal;
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
 *       &lt;sequence>
 *         &lt;element name="IssueUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="IssueCourtesyRefund"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IssueCourtesyRefund">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="SourceSONumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RefundReason">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotalRefundAmount">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0.00"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NoteToCustomer" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
		"issueUser",
		"operationType",
		"requestBody"
})
@XmlRootElement(name = "NeweggAPIRequest")
public class CRIssueRequest {

	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
	protected String issueUser;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType;

	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected CRIssueRequest.RequestBody requestBody;

	public String getIssueUser() {
		return issueUser;
	}

	public void setIssueUser(String issueUser) {
		this.issueUser = issueUser;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public CRIssueRequest.RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(CRIssueRequest.RequestBody requestBody) {
		this.requestBody = requestBody;
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
	 *       &lt;sequence>
	 *         &lt;element name="IssueCourtesyRefund">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;all>
	 *                   &lt;element name="SourceSONumber">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
	 *                         &lt;minInclusive value="1"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="RefundReason">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
	 *                         &lt;minInclusive value="1"/>
	 *                         &lt;maxInclusive value="6"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="TotalRefundAmount">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
	 *                         &lt;minExclusive value="0.00"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="NoteToCustomer" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="500"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
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
			"issueCourtesyRefund"
	})
	public static class RequestBody {

		@XmlElement(name = "IssueCourtesyRefund", required = true)
		@JsonProperty("IssueCourtesyRefund")
		protected CRIssueRequest.RequestBody.IssueCourtesyRefund issueCourtesyRefund;

		public CRIssueRequest.RequestBody.IssueCourtesyRefund getIssueCourtesyRefund() {
			return issueCourtesyRefund;
		}

		public void setIssueCourtesyRefund(CRIssueRequest.RequestBody.IssueCourtesyRefund issueCourtesyRefund) {
			this.issueCourtesyRefund = issueCourtesyRefund;
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
		 *       &lt;all>
		 *         &lt;element name="SourceSONumber">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
		 *               &lt;minInclusive value="1"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="RefundReason">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
		 *               &lt;minInclusive value="1"/>
		 *               &lt;maxInclusive value="6"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="TotalRefundAmount">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
		 *               &lt;minExclusive value="0.00"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="NoteToCustomer" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="500"/>
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
		public static class IssueCourtesyRefund {

			@XmlElement(name = "SourceSONumber")
			@JsonProperty("SourceSONumber")
			protected int sourceSONumber;

			@XmlElement(name = "RefundReason")
			@JsonProperty("RefundReason")
			protected int refundReason;

			@XmlElement(name = "TotalRefundAmount", required = true)
			@JsonProperty("TotalRefundAmount")
			protected BigDecimal totalRefundAmount;

			@XmlElement(name = "NoteToCustomer")
			@JsonProperty("NoteToCustomer")
			protected String noteToCustomer;

			public int getSourceSONumber() {
				return sourceSONumber;
			}

			public void setSourceSONumber(int sourceSONumber) {
				this.sourceSONumber = sourceSONumber;
			}

			public int getRefundReason() {
				return refundReason;
			}

			public void setRefundReason(int refundReason) {
				this.refundReason = refundReason;
			}

			public BigDecimal getTotalRefundAmount() {
				return totalRefundAmount;
			}

			public void setTotalRefundAmount(BigDecimal totalRefundAmount) {
				this.totalRefundAmount = totalRefundAmount;
			}

			public String getNoteToCustomer() {
				return noteToCustomer;
			}

			public void setNoteToCustomer(String noteToCustomer) {
				this.noteToCustomer = noteToCustomer;
			}

		}

	}

}
