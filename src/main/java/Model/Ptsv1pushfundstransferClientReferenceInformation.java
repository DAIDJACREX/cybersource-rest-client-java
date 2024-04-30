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
 * Ptsv1pushfundstransferClientReferenceInformation
 */

public class Ptsv1pushfundstransferClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("applicationVersion")
  private String applicationVersion = null;

  @SerializedName("applicationUser")
  private String applicationUser = null;

  public Ptsv1pushfundstransferClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. 
   * @return code
  **/
  @ApiModelProperty(value = "Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv1pushfundstransferClientReferenceInformation applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. 
   * @return applicationName
  **/
  @ApiModelProperty(value = "The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. ")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public Ptsv1pushfundstransferClientReferenceInformation applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Version of the CyberSource application or integration used for a transaction. 
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "Version of the CyberSource application or integration used for a transaction. ")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public Ptsv1pushfundstransferClientReferenceInformation applicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
    return this;
  }

   /**
   * The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. 
   * @return applicationUser
  **/
  @ApiModelProperty(value = "The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. ")
  public String getApplicationUser() {
    return applicationUser;
  }

  public void setApplicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferClientReferenceInformation ptsv1pushfundstransferClientReferenceInformation = (Ptsv1pushfundstransferClientReferenceInformation) o;
    return Objects.equals(this.code, ptsv1pushfundstransferClientReferenceInformation.code) &&
        Objects.equals(this.applicationName, ptsv1pushfundstransferClientReferenceInformation.applicationName) &&
        Objects.equals(this.applicationVersion, ptsv1pushfundstransferClientReferenceInformation.applicationVersion) &&
        Objects.equals(this.applicationUser, ptsv1pushfundstransferClientReferenceInformation.applicationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, applicationName, applicationVersion, applicationUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationUser: ").append(toIndentedString(applicationUser)).append("\n");
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

