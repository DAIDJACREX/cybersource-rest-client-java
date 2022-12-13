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
import Model.Riskv1decisionsidmarkingRiskInformationMarkingDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsidmarkingRiskInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Riskv1decisionsidmarkingRiskInformation {
  @SerializedName("markingDetails")
  private Riskv1decisionsidmarkingRiskInformationMarkingDetails markingDetails = null;

  public Riskv1decisionsidmarkingRiskInformation markingDetails(Riskv1decisionsidmarkingRiskInformationMarkingDetails markingDetails) {
    this.markingDetails = markingDetails;
    return this;
  }

   /**
   * Get markingDetails
   * @return markingDetails
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsidmarkingRiskInformationMarkingDetails getMarkingDetails() {
    return markingDetails;
  }

  public void setMarkingDetails(Riskv1decisionsidmarkingRiskInformationMarkingDetails markingDetails) {
    this.markingDetails = markingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsidmarkingRiskInformation riskv1decisionsidmarkingRiskInformation = (Riskv1decisionsidmarkingRiskInformation) o;
    return Objects.equals(this.markingDetails, riskv1decisionsidmarkingRiskInformation.markingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsidmarkingRiskInformation {\n");
    
    sb.append("    markingDetails: ").append(toIndentedString(markingDetails)).append("\n");
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

