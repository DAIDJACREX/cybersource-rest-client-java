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
import Model.ReportingV3ChargebackDetailsGet200ResponseChargebackDetails;
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
 * ReportingV3ChargebackDetailsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class ReportingV3ChargebackDetailsGet200Response {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("chargebackDetails")
  private List<ReportingV3ChargebackDetailsGet200ResponseChargebackDetails> chargebackDetails = null;

  public ReportingV3ChargebackDetailsGet200Response organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "testrest", value = "Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ChargebackDetailsGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Report Start Date (ISO 8601 Extended)
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date (ISO 8601 Extended)")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3ChargebackDetailsGet200Response endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Report Start Date (ISO 8601 Extended)
   * @return endTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date (ISO 8601 Extended)")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3ChargebackDetailsGet200Response chargebackDetails(List<ReportingV3ChargebackDetailsGet200ResponseChargebackDetails> chargebackDetails) {
    this.chargebackDetails = chargebackDetails;
    return this;
  }

  public ReportingV3ChargebackDetailsGet200Response addChargebackDetailsItem(ReportingV3ChargebackDetailsGet200ResponseChargebackDetails chargebackDetailsItem) {
    if (this.chargebackDetails == null) {
      this.chargebackDetails = new ArrayList<ReportingV3ChargebackDetailsGet200ResponseChargebackDetails>();
    }
    this.chargebackDetails.add(chargebackDetailsItem);
    return this;
  }

   /**
   * List of Chargeback Details list.
   * @return chargebackDetails
  **/
  @ApiModelProperty(value = "List of Chargeback Details list.")
  public List<ReportingV3ChargebackDetailsGet200ResponseChargebackDetails> getChargebackDetails() {
    return chargebackDetails;
  }

  public void setChargebackDetails(List<ReportingV3ChargebackDetailsGet200ResponseChargebackDetails> chargebackDetails) {
    this.chargebackDetails = chargebackDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ChargebackDetailsGet200Response reportingV3ChargebackDetailsGet200Response = (ReportingV3ChargebackDetailsGet200Response) o;
    return Objects.equals(this.organizationId, reportingV3ChargebackDetailsGet200Response.organizationId) &&
        Objects.equals(this.startTime, reportingV3ChargebackDetailsGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3ChargebackDetailsGet200Response.endTime) &&
        Objects.equals(this.chargebackDetails, reportingV3ChargebackDetailsGet200Response.chargebackDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, startTime, endTime, chargebackDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ChargebackDetailsGet200Response {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    chargebackDetails: ").append(toIndentedString(chargebackDetails)).append("\n");
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

