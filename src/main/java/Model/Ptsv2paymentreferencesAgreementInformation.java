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
 * Ptsv2paymentreferencesAgreementInformation
 */

public class Ptsv2paymentreferencesAgreementInformation {
  @SerializedName("indicator")
  private String indicator = null;

  @SerializedName("description")
  private String description = null;

  public Ptsv2paymentreferencesAgreementInformation indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * Indicates whether the transaction is a billing agreement. Possible values - true - false (default) 
   * @return indicator
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is a billing agreement. Possible values - true - false (default) ")
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public Ptsv2paymentreferencesAgreementInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the billing agreement
   * @return description
  **/
  @ApiModelProperty(value = "Description of the billing agreement")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesAgreementInformation ptsv2paymentreferencesAgreementInformation = (Ptsv2paymentreferencesAgreementInformation) o;
    return Objects.equals(this.indicator, ptsv2paymentreferencesAgreementInformation.indicator) &&
        Objects.equals(this.description, ptsv2paymentreferencesAgreementInformation.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesAgreementInformation {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
