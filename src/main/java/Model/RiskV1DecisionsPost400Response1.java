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
import Model.PtsV2PaymentsPost201ResponseErrorInformationDetails;
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
 * RiskV1DecisionsPost400Response1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class RiskV1DecisionsPost400Response1 {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details = null;

  public RiskV1DecisionsPost400Response1 submitTimeUtc(String submitTimeUtc) {
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

  public RiskV1DecisionsPost400Response1 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - INVALID_REQUEST ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1DecisionsPost400Response1 reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status.  Possible Values: - &#x60;MISSING_FIELD&#x60; - &#x60;INVALID_DATA&#x60; 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status.  Possible Values: - `MISSING_FIELD` - `INVALID_DATA` ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RiskV1DecisionsPost400Response1 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1DecisionsPost400Response1 details(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public RiskV1DecisionsPost400Response1 addDetailsItem(PtsV2PaymentsPost201ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV2PaymentsPost201ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost400Response1 riskV1DecisionsPost400Response1 = (RiskV1DecisionsPost400Response1) o;
    return Objects.equals(this.submitTimeUtc, riskV1DecisionsPost400Response1.submitTimeUtc) &&
        Objects.equals(this.status, riskV1DecisionsPost400Response1.status) &&
        Objects.equals(this.reason, riskV1DecisionsPost400Response1.reason) &&
        Objects.equals(this.message, riskV1DecisionsPost400Response1.message) &&
        Objects.equals(this.details, riskV1DecisionsPost400Response1.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost400Response1 {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

