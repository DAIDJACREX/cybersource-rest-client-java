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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseRiskInformationRules
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationRules {
  @SerializedName("name")
  private String name = null;

  @SerializedName("decision")
  private String decision = null;

  public PtsV2PaymentsPost201ResponseRiskInformationRules name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Description of the rule as it appears in the Profile Editor.
   * @return name
  **/
  @ApiModelProperty(value = "Description of the rule as it appears in the Profile Editor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationRules decision(String decision) {
    this.decision = decision;
    return this;
  }

   /**
   * Summarizes the result for the rule according to the setting that you chose in the Profile Editor. This field can contain one of the following values: - &#x60;IGNORE&#x60; - &#x60;REVIEW&#x60; - &#x60;REJECT&#x60; - &#x60;ACCEPT&#x60; 
   * @return decision
  **/
  @ApiModelProperty(value = "Summarizes the result for the rule according to the setting that you chose in the Profile Editor. This field can contain one of the following values: - `IGNORE` - `REVIEW` - `REJECT` - `ACCEPT` ")
  public String getDecision() {
    return decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationRules ptsV2PaymentsPost201ResponseRiskInformationRules = (PtsV2PaymentsPost201ResponseRiskInformationRules) o;
    return Objects.equals(this.name, ptsV2PaymentsPost201ResponseRiskInformationRules.name) &&
        Objects.equals(this.decision, ptsV2PaymentsPost201ResponseRiskInformationRules.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, decision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationRules {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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

