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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushFunds201ResponseProcessorInformation
 */

public class PushFunds201ResponseProcessorInformation {
  @SerializedName("transactionId")
  private Integer transactionId = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("responseCodeSource")
  private String responseCodeSource = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  public PushFunds201ResponseProcessorInformation transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. ")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public PushFunds201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Transaction status from the processor. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "Transaction status from the processor. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PushFunds201ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Issuer-generated approval code for the transaction. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Issuer-generated approval code for the transaction. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PushFunds201ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * System audit number. Returned by authorization and incremental authorization services.  Visa Platform Connect  System trace number that must be printed on the customer&#39;s receipt. 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "System audit number. Returned by authorization and incremental authorization services.  Visa Platform Connect  System trace number that must be printed on the customer's receipt. ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public PushFunds201ResponseProcessorInformation responseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
    return this;
  }

   /**
   * Used by Visa only and contains the response source/reason code that identifies the source of the response decision. 
   * @return responseCodeSource
  **/
  @ApiModelProperty(value = "Used by Visa only and contains the response source/reason code that identifies the source of the response decision. ")
  public String getResponseCodeSource() {
    return responseCodeSource;
  }

  public void setResponseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
  }

  public PushFunds201ResponseProcessorInformation retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * Unique reference number returned by the processor that identifies the transaction at the network.  Supported by Mastercard Send 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "Unique reference number returned by the processor that identifies the transaction at the network.  Supported by Mastercard Send ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponseProcessorInformation pushFunds201ResponseProcessorInformation = (PushFunds201ResponseProcessorInformation) o;
    return Objects.equals(this.transactionId, pushFunds201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.responseCode, pushFunds201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.approvalCode, pushFunds201ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.systemTraceAuditNumber, pushFunds201ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.responseCodeSource, pushFunds201ResponseProcessorInformation.responseCodeSource) &&
        Objects.equals(this.retrievalReferenceNumber, pushFunds201ResponseProcessorInformation.retrievalReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, responseCode, approvalCode, systemTraceAuditNumber, responseCodeSource, retrievalReferenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponseProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    sb.append("    responseCodeSource: ").append(toIndentedString(responseCodeSource)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
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

