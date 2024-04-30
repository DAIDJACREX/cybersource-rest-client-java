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
import Model.Kmsegressv2keysasymClientReferenceInformation;
import Model.Kmsegressv2keysasymKeyInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SaveAsymEgressKey
 */

public class SaveAsymEgressKey {
  @SerializedName("clientReferenceInformation")
  private Kmsegressv2keysasymClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("clientRequestAction")
  private String clientRequestAction = null;

  @SerializedName("keyInformation")
  private Kmsegressv2keysasymKeyInformation keyInformation = null;

  public SaveAsymEgressKey clientReferenceInformation(Kmsegressv2keysasymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Kmsegressv2keysasymClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Kmsegressv2keysasymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public SaveAsymEgressKey clientRequestAction(String clientRequestAction) {
    this.clientRequestAction = clientRequestAction;
    return this;
  }

   /**
   * Client request action. 
   * @return clientRequestAction
  **/
  @ApiModelProperty(required = true, value = "Client request action. ")
  public String getClientRequestAction() {
    return clientRequestAction;
  }

  public void setClientRequestAction(String clientRequestAction) {
    this.clientRequestAction = clientRequestAction;
  }

  public SaveAsymEgressKey keyInformation(Kmsegressv2keysasymKeyInformation keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(required = true, value = "")
  public Kmsegressv2keysasymKeyInformation getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(Kmsegressv2keysasymKeyInformation keyInformation) {
    this.keyInformation = keyInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveAsymEgressKey saveAsymEgressKey = (SaveAsymEgressKey) o;
    return Objects.equals(this.clientReferenceInformation, saveAsymEgressKey.clientReferenceInformation) &&
        Objects.equals(this.clientRequestAction, saveAsymEgressKey.clientRequestAction) &&
        Objects.equals(this.keyInformation, saveAsymEgressKey.keyInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, clientRequestAction, keyInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveAsymEgressKey {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    clientRequestAction: ").append(toIndentedString(clientRequestAction)).append("\n");
    sb.append("    keyInformation: ").append(toIndentedString(keyInformation)).append("\n");
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

