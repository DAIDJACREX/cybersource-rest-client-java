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
 * Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount
 */

public class Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount {
  @SerializedName("required")
  private Boolean required = null;

  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount = (Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount) o;
    return Objects.equals(this.required, flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

