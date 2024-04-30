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
 * GetAllPlansResponsePlanInformationBillingCycles
 */

public class GetAllPlansResponsePlanInformationBillingCycles {
  @SerializedName("total")
  private String total = null;

  public GetAllPlansResponsePlanInformationBillingCycles total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Describe total number of billing cycles 
   * @return total
  **/
  @ApiModelProperty(value = "Describe total number of billing cycles ")
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllPlansResponsePlanInformationBillingCycles getAllPlansResponsePlanInformationBillingCycles = (GetAllPlansResponsePlanInformationBillingCycles) o;
    return Objects.equals(this.total, getAllPlansResponsePlanInformationBillingCycles.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllPlansResponsePlanInformationBillingCycles {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

