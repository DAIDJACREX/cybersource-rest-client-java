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
import Model.Riskv1decisionsidmarkingRiskInformation;
import Model.Riskv1liststypeentriesClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FraudMarkingActionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class FraudMarkingActionRequest {
  @SerializedName("riskInformation")
  private Riskv1decisionsidmarkingRiskInformation riskInformation = null;

  @SerializedName("clientReferenceInformation")
  private Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation = null;

  public FraudMarkingActionRequest riskInformation(Riskv1decisionsidmarkingRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsidmarkingRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1decisionsidmarkingRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public FraudMarkingActionRequest clientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudMarkingActionRequest fraudMarkingActionRequest = (FraudMarkingActionRequest) o;
    return Objects.equals(this.riskInformation, fraudMarkingActionRequest.riskInformation) &&
        Objects.equals(this.clientReferenceInformation, fraudMarkingActionRequest.clientReferenceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskInformation, clientReferenceInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudMarkingActionRequest {\n");
    
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
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

