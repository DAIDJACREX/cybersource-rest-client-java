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
 * PtsV1TransactionBatchesGet500ResponseErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class PtsV1TransactionBatchesGet500ResponseErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  public PtsV1TransactionBatchesGet500ResponseErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of status
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of status")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PtsV1TransactionBatchesGet500ResponseErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detailed message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detailed message related to the status and reason listed above.")
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
    PtsV1TransactionBatchesGet500ResponseErrorInformation ptsV1TransactionBatchesGet500ResponseErrorInformation = (PtsV1TransactionBatchesGet500ResponseErrorInformation) o;
    return Objects.equals(this.reason, ptsV1TransactionBatchesGet500ResponseErrorInformation.reason) &&
        Objects.equals(this.message, ptsV1TransactionBatchesGet500ResponseErrorInformation.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesGet500ResponseErrorInformation {\n");
    
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

