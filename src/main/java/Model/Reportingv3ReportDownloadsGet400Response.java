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
import Model.Reportingv3ReportDownloadsGet400ResponseDetails;
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
import org.joda.time.DateTime;

/**
 * HTTP status code for client application
 */
@ApiModel(description = "HTTP status code for client application")

public class Reportingv3ReportDownloadsGet400Response {
  @SerializedName("submitTimeUtc")
  private DateTime submitTimeUtc = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<Reportingv3ReportDownloadsGet400ResponseDetails> details = new ArrayList<Reportingv3ReportDownloadsGet400ResponseDetails>();

  public Reportingv3ReportDownloadsGet400Response submitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC.  
   * @return submitTimeUtc
  **/
  @ApiModelProperty(example = "2016-08-11T22:47:57Z", required = true, value = "Time of request in UTC.  ")
  public DateTime getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public Reportingv3ReportDownloadsGet400Response reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Documented reason code 
   * @return reason
  **/
  @ApiModelProperty(example = "INVALID_DATA", required = true, value = "Documented reason code ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Reportingv3ReportDownloadsGet400Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Short descriptive message to the user. 
   * @return message
  **/
  @ApiModelProperty(example = "One or more fields contains invalid data", required = true, value = "Short descriptive message to the user. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Reportingv3ReportDownloadsGet400Response details(List<Reportingv3ReportDownloadsGet400ResponseDetails> details) {
    this.details = details;
    return this;
  }

  public Reportingv3ReportDownloadsGet400Response addDetailsItem(Reportingv3ReportDownloadsGet400ResponseDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Error field list 
   * @return details
  **/
  @ApiModelProperty(required = true, value = "Error field list ")
  public List<Reportingv3ReportDownloadsGet400ResponseDetails> getDetails() {
    return details;
  }

  public void setDetails(List<Reportingv3ReportDownloadsGet400ResponseDetails> details) {
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
    Reportingv3ReportDownloadsGet400Response reportingv3ReportDownloadsGet400Response = (Reportingv3ReportDownloadsGet400Response) o;
    return Objects.equals(this.submitTimeUtc, reportingv3ReportDownloadsGet400Response.submitTimeUtc) &&
        Objects.equals(this.reason, reportingv3ReportDownloadsGet400Response.reason) &&
        Objects.equals(this.message, reportingv3ReportDownloadsGet400Response.message) &&
        Objects.equals(this.details, reportingv3ReportDownloadsGet400Response.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportingv3ReportDownloadsGet400Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
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

