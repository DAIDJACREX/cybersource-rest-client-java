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
 * PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION
 */

public class PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION {
  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  public PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for payerAuthentication 201 enroll and validate calls. Possible values are: - &#x60;AUTHENTICATION_SUCCESSFUL&#x60; - &#x60;PENDING_AUTHENTICATION&#x60; - &#x60;INVALID_REQUEST&#x60; - &#x60;AUTHENTICATION_FAILED&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "The status for payerAuthentication 201 enroll and validate calls. Possible values are: - `AUTHENTICATION_SUCCESSFUL` - `PENDING_AUTHENTICATION` - `INVALID_REQUEST` - `AUTHENTICATION_FAILED` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status. Possible values are: - &#x60;INVALID_MERCHANT_CONFIGURATION&#x60; - &#x60;CONSUMER_AUTHENTICATION_REQUIRED&#x60; - &#x60;CONSUMER_AUTHENTICATION_FAILED&#x60; - &#x60;AUTHENTICATION_FAILED&#x60; 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status. Possible values are: - `INVALID_MERCHANT_CONFIGURATION` - `CONSUMER_AUTHENTICATION_REQUIRED` - `CONSUMER_AUTHENTICATION_FAILED` - `AUTHENTICATION_FAILED` ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the reason of the status. Value is: - Encountered a Payer Authentication problem. Payer could not be authenticated. 
   * @return message
  **/
  @ApiModelProperty(value = "The message describing the reason of the status. Value is: - Encountered a Payer Authentication problem. Payer could not be authenticated. ")
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
    PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION ptsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION = (PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION) o;
    return Objects.equals(this.status, ptsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION.status) &&
        Objects.equals(this.reason, ptsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION.reason) &&
        Objects.equals(this.message, ptsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseEmbeddedActionsCONSUMERAUTHENTICATION {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

