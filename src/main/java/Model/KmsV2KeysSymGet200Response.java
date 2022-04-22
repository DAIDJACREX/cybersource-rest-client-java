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
import Model.KmsV2KeysSymGet200ResponseKeyInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KmsV2KeysSymGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class KmsV2KeysSymGet200Response {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("keyInformation")
  private KmsV2KeysSymGet200ResponseKeyInformation keyInformation = null;

  public KmsV2KeysSymGet200Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public KmsV2KeysSymGet200Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - ACCEPTED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - ACCEPTED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KmsV2KeysSymGet200Response keyInformation(KmsV2KeysSymGet200ResponseKeyInformation keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(value = "")
  public KmsV2KeysSymGet200ResponseKeyInformation getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(KmsV2KeysSymGet200ResponseKeyInformation keyInformation) {
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
    KmsV2KeysSymGet200Response kmsV2KeysSymGet200Response = (KmsV2KeysSymGet200Response) o;
    return Objects.equals(this.submitTimeUtc, kmsV2KeysSymGet200Response.submitTimeUtc) &&
        Objects.equals(this.status, kmsV2KeysSymGet200Response.status) &&
        Objects.equals(this.keyInformation, kmsV2KeysSymGet200Response.keyInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, keyInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsV2KeysSymGet200Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

