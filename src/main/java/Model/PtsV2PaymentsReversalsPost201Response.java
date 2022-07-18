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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation;
import Model.PtsV2PaymentsReversalsPost201ResponseIssuerInformation;
import Model.PtsV2PaymentsReversalsPost201ResponseProcessorInformation;
import Model.PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails;
import Model.Ptsv2paymentsidreversalsPointOfSaleInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsReversalsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class PtsV2PaymentsReversalsPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("reversalAmountDetails")
  private PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails reversalAmountDetails = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsReversalsPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("issuerInformation")
  private PtsV2PaymentsReversalsPost201ResponseIssuerInformation issuerInformation = null;

  @SerializedName("authorizationInformation")
  private PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation authorizationInformation = null;

  @SerializedName("pointOfSaleInformation")
  private Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation = null;

  public PtsV2PaymentsReversalsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsReversalsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsReversalsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public PtsV2PaymentsReversalsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - REVERSED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - REVERSED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PaymentsReversalsPost201Response reconciliationId(String reconciliationId) {
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

  public PtsV2PaymentsReversalsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PaymentsReversalsPost201Response reversalAmountDetails(PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails reversalAmountDetails) {
    this.reversalAmountDetails = reversalAmountDetails;
    return this;
  }

   /**
   * Get reversalAmountDetails
   * @return reversalAmountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails getReversalAmountDetails() {
    return reversalAmountDetails;
  }

  public void setReversalAmountDetails(PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails reversalAmountDetails) {
    this.reversalAmountDetails = reversalAmountDetails;
  }

  public PtsV2PaymentsReversalsPost201Response processorInformation(PtsV2PaymentsReversalsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsReversalsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsReversalsPost201Response issuerInformation(PtsV2PaymentsReversalsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseIssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(PtsV2PaymentsReversalsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }

  public PtsV2PaymentsReversalsPost201Response authorizationInformation(PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation authorizationInformation) {
    this.authorizationInformation = authorizationInformation;
    return this;
  }

   /**
   * Get authorizationInformation
   * @return authorizationInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation getAuthorizationInformation() {
    return authorizationInformation;
  }

  public void setAuthorizationInformation(PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation authorizationInformation) {
    this.authorizationInformation = authorizationInformation;
  }

  public PtsV2PaymentsReversalsPost201Response pointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsReversalsPost201Response ptsV2PaymentsReversalsPost201Response = (PtsV2PaymentsReversalsPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsReversalsPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsReversalsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsReversalsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsReversalsPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsReversalsPost201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsReversalsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.reversalAmountDetails, ptsV2PaymentsReversalsPost201Response.reversalAmountDetails) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsReversalsPost201Response.processorInformation) &&
        Objects.equals(this.issuerInformation, ptsV2PaymentsReversalsPost201Response.issuerInformation) &&
        Objects.equals(this.authorizationInformation, ptsV2PaymentsReversalsPost201Response.authorizationInformation) &&
        Objects.equals(this.pointOfSaleInformation, ptsV2PaymentsReversalsPost201Response.pointOfSaleInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, clientReferenceInformation, reversalAmountDetails, processorInformation, issuerInformation, authorizationInformation, pointOfSaleInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsReversalsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    reversalAmountDetails: ").append(toIndentedString(reversalAmountDetails)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
    sb.append("    authorizationInformation: ").append(toIndentedString(authorizationInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
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

