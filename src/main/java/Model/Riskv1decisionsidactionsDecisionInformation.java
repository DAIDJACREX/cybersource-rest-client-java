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
 * Riskv1decisionsidactionsDecisionInformation
 */

public class Riskv1decisionsidactionsDecisionInformation {
  @SerializedName("decision")
  private String decision = null;

  @SerializedName("comments")
  private String comments = null;

  public Riskv1decisionsidactionsDecisionInformation decision(String decision) {
    this.decision = decision;
    return this;
  }

   /**
   * Decision that will be applied to the given case. Possible values are: - &#x60;ACCEPT&#x60; - &#x60;REJECT&#x60; 
   * @return decision
  **/
  @ApiModelProperty(value = "Decision that will be applied to the given case. Possible values are: - `ACCEPT` - `REJECT` ")
  public String getDecision() {
    return decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }

  public Riskv1decisionsidactionsDecisionInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Notes from the reviewer about the decision made to this case.
   * @return comments
  **/
  @ApiModelProperty(value = "Notes from the reviewer about the decision made to this case.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsidactionsDecisionInformation riskv1decisionsidactionsDecisionInformation = (Riskv1decisionsidactionsDecisionInformation) o;
    return Objects.equals(this.decision, riskv1decisionsidactionsDecisionInformation.decision) &&
        Objects.equals(this.comments, riskv1decisionsidactionsDecisionInformation.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decision, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsidactionsDecisionInformation {\n");
    
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
