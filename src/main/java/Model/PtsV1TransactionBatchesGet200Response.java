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
import Model.PtsV1TransactionBatchesGet200ResponseLinks;
import Model.PtsV1TransactionBatchesGet200ResponseTransactionBatches;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PtsV1TransactionBatchesGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class PtsV1TransactionBatchesGet200Response {
  @SerializedName("transactionBatches")
  private List<PtsV1TransactionBatchesGet200ResponseTransactionBatches> transactionBatches = null;

  @SerializedName("_links")
  private PtsV1TransactionBatchesGet200ResponseLinks links = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  public PtsV1TransactionBatchesGet200Response transactionBatches(List<PtsV1TransactionBatchesGet200ResponseTransactionBatches> transactionBatches) {
    this.transactionBatches = transactionBatches;
    return this;
  }

  public PtsV1TransactionBatchesGet200Response addTransactionBatchesItem(PtsV1TransactionBatchesGet200ResponseTransactionBatches transactionBatchesItem) {
    if (this.transactionBatches == null) {
      this.transactionBatches = new ArrayList<PtsV1TransactionBatchesGet200ResponseTransactionBatches>();
    }
    this.transactionBatches.add(transactionBatchesItem);
    return this;
  }

   /**
   * Get transactionBatches
   * @return transactionBatches
  **/
  @ApiModelProperty(value = "")
  public List<PtsV1TransactionBatchesGet200ResponseTransactionBatches> getTransactionBatches() {
    return transactionBatches;
  }

  public void setTransactionBatches(List<PtsV1TransactionBatchesGet200ResponseTransactionBatches> transactionBatches) {
    this.transactionBatches = transactionBatches;
  }

  public PtsV1TransactionBatchesGet200Response links(PtsV1TransactionBatchesGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV1TransactionBatchesGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV1TransactionBatchesGet200ResponseLinks links) {
    this.links = links;
  }

  public PtsV1TransactionBatchesGet200Response submitTimeUtc(String submitTimeUtc) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV1TransactionBatchesGet200Response ptsV1TransactionBatchesGet200Response = (PtsV1TransactionBatchesGet200Response) o;
    return Objects.equals(this.transactionBatches, ptsV1TransactionBatchesGet200Response.transactionBatches) &&
        Objects.equals(this.links, ptsV1TransactionBatchesGet200Response.links) &&
        Objects.equals(this.submitTimeUtc, ptsV1TransactionBatchesGet200Response.submitTimeUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionBatches, links, submitTimeUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesGet200Response {\n");
    
    sb.append("    transactionBatches: ").append(toIndentedString(transactionBatches)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
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

