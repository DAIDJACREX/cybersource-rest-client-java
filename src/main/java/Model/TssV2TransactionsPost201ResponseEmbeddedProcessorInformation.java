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
import Model.TssV2TransactionsGet200ResponseProcessorInformationProcessor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedProcessorInformation
 */

public class TssV2TransactionsPost201ResponseEmbeddedProcessorInformation {
  @SerializedName("processor")
  private TssV2TransactionsGet200ResponseProcessorInformationProcessor processor = null;

  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  public TssV2TransactionsPost201ResponseEmbeddedProcessorInformation processor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationProcessor getProcessor() {
    return processor;
  }

  public void setProcessor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
  }

  public TssV2TransactionsPost201ResponseEmbeddedProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public TssV2TransactionsPost201ResponseEmbeddedProcessorInformation retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * #### Ingenico ePayments Unique number that CyberSource generates to identify the transaction. You can use this value to identify transactions in the Ingenico ePayments Collections Report, which provides settlement information. Contact customer support for information about the report.  ### CyberSource through VisaNet Retrieval request number. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "#### Ingenico ePayments Unique number that CyberSource generates to identify the transaction. You can use this value to identify transactions in the Ingenico ePayments Collections Report, which provides settlement information. Contact customer support for information about the report.  ### CyberSource through VisaNet Retrieval request number. ")
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
    TssV2TransactionsPost201ResponseEmbeddedProcessorInformation tssV2TransactionsPost201ResponseEmbeddedProcessorInformation = (TssV2TransactionsPost201ResponseEmbeddedProcessorInformation) o;
    return Objects.equals(this.processor, tssV2TransactionsPost201ResponseEmbeddedProcessorInformation.processor) &&
        Objects.equals(this.approvalCode, tssV2TransactionsPost201ResponseEmbeddedProcessorInformation.approvalCode) &&
        Objects.equals(this.retrievalReferenceNumber, tssV2TransactionsPost201ResponseEmbeddedProcessorInformation.retrievalReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processor, approvalCode, retrievalReferenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedProcessorInformation {\n");
    
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
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

