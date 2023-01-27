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
 * PushFunds401Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class PushFunds401Response {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  public PushFunds401Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource. 
   * @return id
  **/
  @ApiModelProperty(value = "A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PushFunds401Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;  **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ`  **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PushFunds401Response reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status.  Possible values: - UNAUTHORIZED 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status.  Possible values: - UNAUTHORIZED ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PushFunds401Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.  Possible values: - Authentication Failed 
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.  Possible values: - Authentication Failed ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds401Response pushFunds401Response = (PushFunds401Response) o;
    return Objects.equals(this.id, pushFunds401Response.id) &&
        Objects.equals(this.submitTimeUtc, pushFunds401Response.submitTimeUtc) &&
        Objects.equals(this.reason, pushFunds401Response.reason) &&
        Objects.equals(this.message, pushFunds401Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, reason, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds401Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

