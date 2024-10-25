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
 * PtsV2PaymentsCapturesPost201ResponseProcessorInformation
 */

public class PtsV2PaymentsCapturesPost201ResponseProcessorInformation {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("networkTransactionId")
  private String networkTransactionId = null;

  @SerializedName("responseDetails")
  private String responseDetails = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("providerResponse")
  private String providerResponse = null;

  @SerializedName("updateTimeUtc")
  private String updateTimeUtc = null;

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID &#x3D; 66012345  - Shift number &#x3D; 001  - Batch number &#x3D; 069  - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID = 66012345  - Shift number = 001  - Batch number = 069  - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation networkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
    return this;
  }

   /**
   * Network Transaction Identifier Applicable for online capture transactions only. 
   * @return networkTransactionId
  **/
  @ApiModelProperty(value = "Network Transaction Identifier Applicable for online capture transactions only. ")
  public String getNetworkTransactionId() {
    return networkTransactionId;
  }

  public void setNetworkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
  }

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation responseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
    return this;
  }

   /**
   * The processor code that describes why the transaction state is pending or reversed. 
   * @return responseDetails
  **/
  @ApiModelProperty(value = "The processor code that describes why the transaction state is pending or reversed. ")
  public String getResponseDetails() {
    return responseDetails;
  }

  public void setResponseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
  }

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;processorInformation.responseCategoryCode&#x60; field. String (3)  #### paypalgateway Processor generated ID for the itemized detail. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `processorInformation.responseCategoryCode` field. String (3)  #### paypalgateway Processor generated ID for the itemized detail. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation providerResponse(String providerResponse) {
    this.providerResponse = providerResponse;
    return this;
  }

   /**
   * Processor response to the API request. 
   * @return providerResponse
  **/
  @ApiModelProperty(value = "Processor response to the API request. ")
  public String getProviderResponse() {
    return providerResponse;
  }

  public void setProviderResponse(String providerResponse) {
    this.providerResponse = providerResponse;
  }

  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation updateTimeUtc(String updateTimeUtc) {
    this.updateTimeUtc = updateTimeUtc;
    return this;
  }

   /**
   * The date and time when the transaction was last updated, in Internet date and time format. 
   * @return updateTimeUtc
  **/
  @ApiModelProperty(value = "The date and time when the transaction was last updated, in Internet date and time format. ")
  public String getUpdateTimeUtc() {
    return updateTimeUtc;
  }

  public void setUpdateTimeUtc(String updateTimeUtc) {
    this.updateTimeUtc = updateTimeUtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsCapturesPost201ResponseProcessorInformation ptsV2PaymentsCapturesPost201ResponseProcessorInformation = (PtsV2PaymentsCapturesPost201ResponseProcessorInformation) o;
    return Objects.equals(this.transactionId, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.networkTransactionId, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.networkTransactionId) &&
        Objects.equals(this.responseDetails, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.responseDetails) &&
        Objects.equals(this.responseCode, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.providerResponse, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.providerResponse) &&
        Objects.equals(this.updateTimeUtc, ptsV2PaymentsCapturesPost201ResponseProcessorInformation.updateTimeUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, networkTransactionId, responseDetails, responseCode, providerResponse, updateTimeUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsCapturesPost201ResponseProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    responseDetails: ").append(toIndentedString(responseDetails)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    providerResponse: ").append(toIndentedString(providerResponse)).append("\n");
    sb.append("    updateTimeUtc: ").append(toIndentedString(updateTimeUtc)).append("\n");
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

