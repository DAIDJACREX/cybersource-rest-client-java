/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * ReportingV3ChargebackDetailsGet200ResponseChargebackDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class ReportingV3ChargebackDetailsGet200ResponseChargebackDetails {
  @SerializedName("processorMerchantId")
  private String processorMerchantId = null;

  @SerializedName("merchantName")
  private String merchantName = null;

  @SerializedName("transactionReferenceNumber")
  private String transactionReferenceNumber = null;

  @SerializedName("merchantReferenceNumber")
  private String merchantReferenceNumber = null;

  @SerializedName("natureOfDispute")
  private String natureOfDispute = null;

  @SerializedName("alertType")
  private String alertType = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("sign")
  private String sign = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("cardType")
  private String cardType = null;

  @SerializedName("originalSettlementTime")
  private DateTime originalSettlementTime = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("responseDueTime")
  private DateTime responseDueTime = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("actionDescription")
  private String actionDescription = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("representmentCPTime")
  private DateTime representmentCPTime = null;

  @SerializedName("applications")
  private String applications = null;

  @SerializedName("eventRequestedTime")
  private DateTime eventRequestedTime = null;

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails processorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
    return this;
  }

   /**
   * Processor Merchant Id
   * @return processorMerchantId
  **/
  @ApiModelProperty(example = "174263416896", value = "Processor Merchant Id")
  public String getProcessorMerchantId() {
    return processorMerchantId;
  }

  public void setProcessorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant Name
   * @return merchantName
  **/
  @ApiModelProperty(example = "Revolutionary Entertainment Inc", value = "Merchant Name")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

   /**
   * Transaction Reference Number
   * @return transactionReferenceNumber
  **/
  @ApiModelProperty(example = "93983883073", value = "Transaction Reference Number")
  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails merchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
    return this;
  }

   /**
   * Merchant Reference Number
   * @return merchantReferenceNumber
  **/
  @ApiModelProperty(example = "X03434388DEADBEEF", value = "Merchant Reference Number")
  public String getMerchantReferenceNumber() {
    return merchantReferenceNumber;
  }

  public void setMerchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails natureOfDispute(String natureOfDispute) {
    this.natureOfDispute = natureOfDispute;
    return this;
  }

   /**
   * Nature of Dispute
   * @return natureOfDispute
  **/
  @ApiModelProperty(example = "Chargeback", value = "Nature of Dispute")
  public String getNatureOfDispute() {
    return natureOfDispute;
  }

  public void setNatureOfDispute(String natureOfDispute) {
    this.natureOfDispute = natureOfDispute;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails alertType(String alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Chargeback Alert Type
   * @return alertType
  **/
  @ApiModelProperty(example = "2", value = "Chargeback Alert Type")
  public String getAlertType() {
    return alertType;
  }

  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Chargeback Amount
   * @return amount
  **/
  @ApiModelProperty(example = "5", value = "Chargeback Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails sign(String sign) {
    this.sign = sign;
    return this;
  }

   /**
   * Chargeback Sign
   * @return sign
  **/
  @ApiModelProperty(example = "C", value = "Chargeback Sign")
  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Chargeback Action
   * @return action
  **/
  @ApiModelProperty(example = "3", value = "Chargeback Action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  @ApiModelProperty(example = "American Express", value = "Card Type")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails originalSettlementTime(DateTime originalSettlementTime) {
    this.originalSettlementTime = originalSettlementTime;
    return this;
  }

   /**
   * Original Settlement Date
   * @return originalSettlementTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Original Settlement Date")
  public DateTime getOriginalSettlementTime() {
    return originalSettlementTime;
  }

  public void setOriginalSettlementTime(DateTime originalSettlementTime) {
    this.originalSettlementTime = originalSettlementTime;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Tracking Number
   * @return trackingNumber
  **/
  @ApiModelProperty(example = "990175", value = "Tracking Number")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request Id
   * @return requestId
  **/
  @ApiModelProperty(example = "5060113732046412501541", value = "Request Id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails responseDueTime(DateTime responseDueTime) {
    this.responseDueTime = responseDueTime;
    return this;
  }

   /**
   * Response Due Date
   * @return responseDueTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Response Due Date")
  public DateTime getResponseDueTime() {
    return responseDueTime;
  }

  public void setResponseDueTime(DateTime responseDueTime) {
    this.responseDueTime = responseDueTime;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Chargeback Date
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Chargeback Date")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails actionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
    return this;
  }

   /**
   * Chargeback Action Description
   * @return actionDescription
  **/
  @ApiModelProperty(example = "Financial transaction", value = "Chargeback Action Description")
  public String getActionDescription() {
    return actionDescription;
  }

  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer Id
   * @return customerId
  **/
  @ApiModelProperty(example = "937999JFK", value = "Customer Id")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Chargeback Reason Code
   * @return reasonCode
  **/
  @ApiModelProperty(example = "1050", value = "Chargeback Reason Code")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails representmentCPTime(DateTime representmentCPTime) {
    this.representmentCPTime = representmentCPTime;
    return this;
  }

   /**
   * Representment CP Date
   * @return representmentCPTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Representment CP Date")
  public DateTime getRepresentmentCPTime() {
    return representmentCPTime;
  }

  public void setRepresentmentCPTime(DateTime representmentCPTime) {
    this.representmentCPTime = representmentCPTime;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails applications(String applications) {
    this.applications = applications;
    return this;
  }

   /**
   * ICS Request Applications
   * @return applications
  **/
  @ApiModelProperty(example = "ics_bill", value = "ICS Request Applications")
  public String getApplications() {
    return applications;
  }

  public void setApplications(String applications) {
    this.applications = applications;
  }

  public ReportingV3ChargebackDetailsGet200ResponseChargebackDetails eventRequestedTime(DateTime eventRequestedTime) {
    this.eventRequestedTime = eventRequestedTime;
    return this;
  }

   /**
   * Event Request Date
   * @return eventRequestedTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Event Request Date")
  public DateTime getEventRequestedTime() {
    return eventRequestedTime;
  }

  public void setEventRequestedTime(DateTime eventRequestedTime) {
    this.eventRequestedTime = eventRequestedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ChargebackDetailsGet200ResponseChargebackDetails reportingV3ChargebackDetailsGet200ResponseChargebackDetails = (ReportingV3ChargebackDetailsGet200ResponseChargebackDetails) o;
    return Objects.equals(this.processorMerchantId, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.processorMerchantId) &&
        Objects.equals(this.merchantName, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.merchantName) &&
        Objects.equals(this.transactionReferenceNumber, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.transactionReferenceNumber) &&
        Objects.equals(this.merchantReferenceNumber, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.merchantReferenceNumber) &&
        Objects.equals(this.natureOfDispute, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.natureOfDispute) &&
        Objects.equals(this.alertType, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.alertType) &&
        Objects.equals(this.amount, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.amount) &&
        Objects.equals(this.sign, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.sign) &&
        Objects.equals(this.action, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.action) &&
        Objects.equals(this.cardType, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.cardType) &&
        Objects.equals(this.originalSettlementTime, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.originalSettlementTime) &&
        Objects.equals(this.trackingNumber, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.trackingNumber) &&
        Objects.equals(this.currencyCode, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.currencyCode) &&
        Objects.equals(this.requestId, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.requestId) &&
        Objects.equals(this.responseDueTime, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.responseDueTime) &&
        Objects.equals(this.time, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.time) &&
        Objects.equals(this.actionDescription, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.actionDescription) &&
        Objects.equals(this.customerId, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.customerId) &&
        Objects.equals(this.reasonCode, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.reasonCode) &&
        Objects.equals(this.representmentCPTime, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.representmentCPTime) &&
        Objects.equals(this.applications, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.applications) &&
        Objects.equals(this.eventRequestedTime, reportingV3ChargebackDetailsGet200ResponseChargebackDetails.eventRequestedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorMerchantId, merchantName, transactionReferenceNumber, merchantReferenceNumber, natureOfDispute, alertType, amount, sign, action, cardType, originalSettlementTime, trackingNumber, currencyCode, requestId, responseDueTime, time, actionDescription, customerId, reasonCode, representmentCPTime, applications, eventRequestedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ChargebackDetailsGet200ResponseChargebackDetails {\n");
    
    sb.append("    processorMerchantId: ").append(toIndentedString(processorMerchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    merchantReferenceNumber: ").append(toIndentedString(merchantReferenceNumber)).append("\n");
    sb.append("    natureOfDispute: ").append(toIndentedString(natureOfDispute)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    originalSettlementTime: ").append(toIndentedString(originalSettlementTime)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseDueTime: ").append(toIndentedString(responseDueTime)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    representmentCPTime: ").append(toIndentedString(representmentCPTime)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    eventRequestedTime: ").append(toIndentedString(eventRequestedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

