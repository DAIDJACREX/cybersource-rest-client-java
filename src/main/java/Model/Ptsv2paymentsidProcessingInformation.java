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
import Model.Ptsv2paymentsidProcessingInformationAuthorizationOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class Ptsv2paymentsidProcessingInformation {
  @SerializedName("authorizationOptions")
  private Ptsv2paymentsidProcessingInformationAuthorizationOptions authorizationOptions = null;

  public Ptsv2paymentsidProcessingInformation authorizationOptions(Ptsv2paymentsidProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidProcessingInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(Ptsv2paymentsidProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidProcessingInformation ptsv2paymentsidProcessingInformation = (Ptsv2paymentsidProcessingInformation) o;
    return Objects.equals(this.authorizationOptions, ptsv2paymentsidProcessingInformation.authorizationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidProcessingInformation {\n");
    
    sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
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

