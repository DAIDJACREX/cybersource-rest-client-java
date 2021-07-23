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

/**
 * Request Info Section
 */
@ApiModel(description = "Request Info Section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("cybersourceMerchantId")
  private String cybersourceMerchantId = null;

  @SerializedName("processorMerchantId")
  private String processorMerchantId = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("transactionReferenceNumber")
  private String transactionReferenceNumber = null;

  @SerializedName("merchantReferenceNumber")
  private String merchantReferenceNumber = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails cybersourceMerchantId(String cybersourceMerchantId) {
    this.cybersourceMerchantId = cybersourceMerchantId;
    return this;
  }

   /**
   * Cybersource Merchant Id
   * @return cybersourceMerchantId
  **/
  @ApiModelProperty(example = "Cybersource Merchant Id", value = "Cybersource Merchant Id")
  public String getCybersourceMerchantId() {
    return cybersourceMerchantId;
  }

  public void setCybersourceMerchantId(String cybersourceMerchantId) {
    this.cybersourceMerchantId = cybersourceMerchantId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails processorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
    return this;
  }

   /**
   * Cybersource Processor Merchant Id
   * @return processorMerchantId
  **/
  @ApiModelProperty(example = "Processor Merchant Id", value = "Cybersource Processor Merchant Id")
  public String getProcessorMerchantId() {
    return processorMerchantId;
  }

  public void setProcessorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Group Name
   * @return groupName
  **/
  @ApiModelProperty(example = "996411990498708810001", value = "Group Name")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

   /**
   * Transaction Reference Number
   * @return transactionReferenceNumber
  **/
  @ApiModelProperty(example = "RZ3J9WCS9J33", value = "Transaction Reference Number")
  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails merchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
    return this;
  }

   /**
   * Merchant Reference Number
   * @return merchantReferenceNumber
  **/
  @ApiModelProperty(example = "47882339", value = "Merchant Reference Number")
  public String getMerchantReferenceNumber() {
    return merchantReferenceNumber;
  }

  public void setMerchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails = (ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.requestId) &&
        Objects.equals(this.cybersourceMerchantId, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.cybersourceMerchantId) &&
        Objects.equals(this.processorMerchantId, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.processorMerchantId) &&
        Objects.equals(this.groupName, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.groupName) &&
        Objects.equals(this.transactionReferenceNumber, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.transactionReferenceNumber) &&
        Objects.equals(this.merchantReferenceNumber, reportingV3PurchaseRefundDetailsGet200ResponseRequestDetails.merchantReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, cybersourceMerchantId, processorMerchantId, groupName, transactionReferenceNumber, merchantReferenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    cybersourceMerchantId: ").append(toIndentedString(cybersourceMerchantId)).append("\n");
    sb.append("    processorMerchantId: ").append(toIndentedString(processorMerchantId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    merchantReferenceNumber: ").append(toIndentedString(merchantReferenceNumber)).append("\n");
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

