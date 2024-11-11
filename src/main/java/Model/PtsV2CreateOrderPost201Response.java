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
import Model.PtsV2CreateOrderPost201ResponseBuyerInformation;
import Model.PtsV2CreateOrderPost201ResponseProcessorInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsOrderPost201ResponsePaymentInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreateOrderPost201Response
 */

public class PtsV2CreateOrderPost201Response {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("updateTimeUtc")
  private String updateTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processorInformation")
  private PtsV2CreateOrderPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("paymentInformation")
  private PtsV2PaymentsOrderPost201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("buyerInformation")
  private PtsV2CreateOrderPost201ResponseBuyerInformation buyerInformation = null;

  public PtsV2CreateOrderPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2CreateOrderPost201Response updateTimeUtc(String updateTimeUtc) {
    this.updateTimeUtc = updateTimeUtc;
    return this;
  }

   /**
   * The date and time when the request was last updated. **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). 
   * @return updateTimeUtc
  **/
  @ApiModelProperty(value = "The date and time when the request was last updated. **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). ")
  public String getUpdateTimeUtc() {
    return updateTimeUtc;
  }

  public void setUpdateTimeUtc(String updateTimeUtc) {
    this.updateTimeUtc = updateTimeUtc;
  }

  public PtsV2CreateOrderPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction. Possible values:   - CREATED   - SAVED   - APPROVED   - VOIDED   - COMPLETED   - PAYER_ACTION_REQUIRED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction. Possible values:   - CREATED   - SAVED   - APPROVED   - VOIDED   - COMPLETED   - PAYER_ACTION_REQUIRED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2CreateOrderPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2CreateOrderPost201Response clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2CreateOrderPost201Response processorInformation(PtsV2CreateOrderPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreateOrderPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2CreateOrderPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2CreateOrderPost201Response paymentInformation(PtsV2PaymentsOrderPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2PaymentsOrderPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2CreateOrderPost201Response buyerInformation(PtsV2CreateOrderPost201ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreateOrderPost201ResponseBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(PtsV2CreateOrderPost201ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreateOrderPost201Response ptsV2CreateOrderPost201Response = (PtsV2CreateOrderPost201Response) o;
    return Objects.equals(this.submitTimeUtc, ptsV2CreateOrderPost201Response.submitTimeUtc) &&
        Objects.equals(this.updateTimeUtc, ptsV2CreateOrderPost201Response.updateTimeUtc) &&
        Objects.equals(this.status, ptsV2CreateOrderPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2CreateOrderPost201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, ptsV2CreateOrderPost201Response.clientReferenceInformation) &&
        Objects.equals(this.processorInformation, ptsV2CreateOrderPost201Response.processorInformation) &&
        Objects.equals(this.paymentInformation, ptsV2CreateOrderPost201Response.paymentInformation) &&
        Objects.equals(this.buyerInformation, ptsV2CreateOrderPost201Response.buyerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, updateTimeUtc, status, reconciliationId, clientReferenceInformation, processorInformation, paymentInformation, buyerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreateOrderPost201Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    updateTimeUtc: ").append(toIndentedString(updateTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
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

