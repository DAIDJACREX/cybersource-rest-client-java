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
import Model.Kmsv2keyssymClientReferenceInformation;
import Model.Kmsv2keyssymdeletesKeyInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteBulkP12KeysRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class DeleteBulkP12KeysRequest {
  @SerializedName("clientReferenceInformation")
  private Kmsv2keyssymClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("keyInformation")
  private List<Kmsv2keyssymdeletesKeyInformation> keyInformation = null;

  public DeleteBulkP12KeysRequest clientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Kmsv2keyssymClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public DeleteBulkP12KeysRequest keyInformation(List<Kmsv2keyssymdeletesKeyInformation> keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

  public DeleteBulkP12KeysRequest addKeyInformationItem(Kmsv2keyssymdeletesKeyInformation keyInformationItem) {
    if (this.keyInformation == null) {
      this.keyInformation = new ArrayList<Kmsv2keyssymdeletesKeyInformation>();
    }
    this.keyInformation.add(keyInformationItem);
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(value = "")
  public List<Kmsv2keyssymdeletesKeyInformation> getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(List<Kmsv2keyssymdeletesKeyInformation> keyInformation) {
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
    DeleteBulkP12KeysRequest deleteBulkP12KeysRequest = (DeleteBulkP12KeysRequest) o;
    return Objects.equals(this.clientReferenceInformation, deleteBulkP12KeysRequest.clientReferenceInformation) &&
        Objects.equals(this.keyInformation, deleteBulkP12KeysRequest.keyInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, keyInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBulkP12KeysRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
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

