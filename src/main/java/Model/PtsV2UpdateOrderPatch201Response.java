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
import Model.PtsV2CreateOrderPost201ResponseProcessorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2UpdateOrderPatch201Response
 */

public class PtsV2UpdateOrderPatch201Response {
  @SerializedName("status")
  private String status = null;

  @SerializedName("processorInformation")
  private PtsV2CreateOrderPost201ResponseProcessorInformation processorInformation = null;

  public PtsV2UpdateOrderPatch201Response status(String status) {
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

  public PtsV2UpdateOrderPatch201Response processorInformation(PtsV2CreateOrderPost201ResponseProcessorInformation processorInformation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2UpdateOrderPatch201Response ptsV2UpdateOrderPatch201Response = (PtsV2UpdateOrderPatch201Response) o;
    return Objects.equals(this.status, ptsV2UpdateOrderPatch201Response.status) &&
        Objects.equals(this.processorInformation, ptsV2UpdateOrderPatch201Response.processorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, processorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2UpdateOrderPatch201Response {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
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

