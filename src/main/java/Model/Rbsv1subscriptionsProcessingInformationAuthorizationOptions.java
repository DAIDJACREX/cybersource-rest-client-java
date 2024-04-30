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
import Model.Rbsv1subscriptionsProcessingInformationAuthorizationOptionsInitiator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rbsv1subscriptionsProcessingInformationAuthorizationOptions
 */

public class Rbsv1subscriptionsProcessingInformationAuthorizationOptions {
  @SerializedName("initiator")
  private Rbsv1subscriptionsProcessingInformationAuthorizationOptionsInitiator initiator = null;

  public Rbsv1subscriptionsProcessingInformationAuthorizationOptions initiator(Rbsv1subscriptionsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsProcessingInformationAuthorizationOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Rbsv1subscriptionsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rbsv1subscriptionsProcessingInformationAuthorizationOptions rbsv1subscriptionsProcessingInformationAuthorizationOptions = (Rbsv1subscriptionsProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.initiator, rbsv1subscriptionsProcessingInformationAuthorizationOptions.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rbsv1subscriptionsProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

