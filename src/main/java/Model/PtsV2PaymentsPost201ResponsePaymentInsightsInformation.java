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
import Model.PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePaymentInsightsInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInsightsInformation {
  @SerializedName("responseInsights")
  private PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights responseInsights = null;

  public PtsV2PaymentsPost201ResponsePaymentInsightsInformation responseInsights(PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights responseInsights) {
    this.responseInsights = responseInsights;
    return this;
  }

   /**
   * Get responseInsights
   * @return responseInsights
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights getResponseInsights() {
    return responseInsights;
  }

  public void setResponseInsights(PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights responseInsights) {
    this.responseInsights = responseInsights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInsightsInformation ptsV2PaymentsPost201ResponsePaymentInsightsInformation = (PtsV2PaymentsPost201ResponsePaymentInsightsInformation) o;
    return Objects.equals(this.responseInsights, ptsV2PaymentsPost201ResponsePaymentInsightsInformation.responseInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInsights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInsightsInformation {\n");
    
    sb.append("    responseInsights: ").append(toIndentedString(responseInsights)).append("\n");
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

