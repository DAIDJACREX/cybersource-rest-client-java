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
 * Billing Frequency 
 */
@ApiModel(description = "Billing Frequency ")

public class GetAllPlansResponsePlanInformationBillingPeriod {
  @SerializedName("length")
  private String length = null;

  @SerializedName("unit")
  private String unit = null;

  public GetAllPlansResponsePlanInformationBillingPeriod length(String length) {
    this.length = length;
    return this;
  }

   /**
   * Example: - If length&#x3D;1 &amp; unit&#x3D;month then charge every month - If length&#x3D;7 &amp; unit&#x3D;day then charge every 7th day 
   * @return length
  **/
  @ApiModelProperty(value = "Example: - If length=1 & unit=month then charge every month - If length=7 & unit=day then charge every 7th day ")
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public GetAllPlansResponsePlanInformationBillingPeriod unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Calendar unit values.   possible values:   - &#x60;D&#x60; - day   - &#x60;M&#x60; - month   - &#x60;W&#x60; - week   - &#x60;Y&#x60; - year 
   * @return unit
  **/
  @ApiModelProperty(value = "Calendar unit values.   possible values:   - `D` - day   - `M` - month   - `W` - week   - `Y` - year ")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllPlansResponsePlanInformationBillingPeriod getAllPlansResponsePlanInformationBillingPeriod = (GetAllPlansResponsePlanInformationBillingPeriod) o;
    return Objects.equals(this.length, getAllPlansResponsePlanInformationBillingPeriod.length) &&
        Objects.equals(this.unit, getAllPlansResponsePlanInformationBillingPeriod.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllPlansResponsePlanInformationBillingPeriod {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

