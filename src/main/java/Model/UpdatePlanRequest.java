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
import Model.GetAllPlansResponseOrderInformation;
import Model.Rbsv1plansidPlanInformation;
import Model.Rbsv1plansidProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdatePlanRequest
 */

public class UpdatePlanRequest {
  @SerializedName("planInformation")
  private Rbsv1plansidPlanInformation planInformation = null;

  @SerializedName("processingInformation")
  private Rbsv1plansidProcessingInformation processingInformation = null;

  @SerializedName("orderInformation")
  private GetAllPlansResponseOrderInformation orderInformation = null;

  public UpdatePlanRequest planInformation(Rbsv1plansidPlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1plansidPlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(Rbsv1plansidPlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public UpdatePlanRequest processingInformation(Rbsv1plansidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1plansidProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Rbsv1plansidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public UpdatePlanRequest orderInformation(GetAllPlansResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllPlansResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(GetAllPlansResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlanRequest updatePlanRequest = (UpdatePlanRequest) o;
    return Objects.equals(this.planInformation, updatePlanRequest.planInformation) &&
        Objects.equals(this.processingInformation, updatePlanRequest.processingInformation) &&
        Objects.equals(this.orderInformation, updatePlanRequest.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planInformation, processingInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlanRequest {\n");
    
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

