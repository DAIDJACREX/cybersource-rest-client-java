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
import Model.ReportingV3ReportsGet200ResponseLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Report Search Result Bean
 */
@ApiModel(description = "Report Search Result Bean")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class ReportingV3ReportsGet200ResponseReportSearchResults {
  @SerializedName("_link")
  private ReportingV3ReportsGet200ResponseLink link = null;

  @SerializedName("reportDefinitionId")
  private String reportDefinitionId = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reportStartTime")
  private DateTime reportStartTime = null;

  @SerializedName("reportEndTime")
  private DateTime reportEndTime = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("queuedTime")
  private DateTime queuedTime = null;

  @SerializedName("reportGeneratingTime")
  private DateTime reportGeneratingTime = null;

  @SerializedName("reportCompletedTime")
  private DateTime reportCompletedTime = null;

  @SerializedName("subscriptionType")
  private String subscriptionType = null;

  @SerializedName("groupId")
  private String groupId = null;

  public ReportingV3ReportsGet200ResponseReportSearchResults link(ReportingV3ReportsGet200ResponseLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public ReportingV3ReportsGet200ResponseLink getLink() {
    return link;
  }

  public void setLink(ReportingV3ReportsGet200ResponseLink link) {
    this.link = link;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Unique Report Identifier of each report type
   * @return reportDefinitionId
  **/
  @ApiModelProperty(example = "210", value = "Unique Report Identifier of each report type")
  public String getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the report specified by merchant while creating the report
   * @return reportName
  **/
  @ApiModelProperty(example = "MyTransactionRequestDetailReport", value = "Name of the report specified by merchant while creating the report")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Format of the report to get generated Valid Values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Format of the report to get generated Valid Values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * Frequency of the report to get generated Valid Values: - DAILY - WEEKLY - MONTHLY - ADHOC 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "Frequency of the report to get generated Valid Values: - DAILY - WEEKLY - MONTHLY - ADHOC ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the report Valid Values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA 
   * @return status
  **/
  @ApiModelProperty(value = "Status of the report Valid Values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
    return this;
  }

   /**
   * Specifies the report start time in ISO 8601 format
   * @return reportStartTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:00:00+05:00", value = "Specifies the report start time in ISO 8601 format")
  public DateTime getReportStartTime() {
    return reportStartTime;
  }

  public void setReportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
    return this;
  }

   /**
   * Specifies the report end time in ISO 8601 format
   * @return reportEndTime
  **/
  @ApiModelProperty(example = "2017-10-02T10:00:00+05:00", value = "Specifies the report end time in ISO 8601 format")
  public DateTime getReportEndTime() {
    return reportEndTime;
  }

  public void setReportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Unique identifier generated for every reports
   * @return reportId
  **/
  @ApiModelProperty(example = "6d9cb5b6-0e97-2d03-e053-7cb8d30af52e", value = "Unique identifier generated for every reports")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * CyberSource Merchant Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "Test_MerchantId", value = "CyberSource Merchant Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults queuedTime(DateTime queuedTime) {
    this.queuedTime = queuedTime;
    return this;
  }

   /**
   * Specifies the time of the report in queued  in ISO 8601 format
   * @return queuedTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:00:00+05:00", value = "Specifies the time of the report in queued  in ISO 8601 format")
  public DateTime getQueuedTime() {
    return queuedTime;
  }

  public void setQueuedTime(DateTime queuedTime) {
    this.queuedTime = queuedTime;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportGeneratingTime(DateTime reportGeneratingTime) {
    this.reportGeneratingTime = reportGeneratingTime;
    return this;
  }

   /**
   * Specifies the time of the report started to generate  in ISO 8601 format
   * @return reportGeneratingTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:00:00+05:00", value = "Specifies the time of the report started to generate  in ISO 8601 format")
  public DateTime getReportGeneratingTime() {
    return reportGeneratingTime;
  }

  public void setReportGeneratingTime(DateTime reportGeneratingTime) {
    this.reportGeneratingTime = reportGeneratingTime;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults reportCompletedTime(DateTime reportCompletedTime) {
    this.reportCompletedTime = reportCompletedTime;
    return this;
  }

   /**
   * Specifies the time of the report completed the generation  in ISO 8601 format
   * @return reportCompletedTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:10:00+05:00", value = "Specifies the time of the report completed the generation  in ISO 8601 format")
  public DateTime getReportCompletedTime() {
    return reportCompletedTime;
  }

  public void setReportCompletedTime(DateTime reportCompletedTime) {
    this.reportCompletedTime = reportCompletedTime;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Specifies whether the subscription created is either Custom, Standard or Classic 
   * @return subscriptionType
  **/
  @ApiModelProperty(example = "CUSTOM", value = "Specifies whether the subscription created is either Custom, Standard or Classic ")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public ReportingV3ReportsGet200ResponseReportSearchResults groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id for selected group.
   * @return groupId
  **/
  @ApiModelProperty(example = "12345", value = "Id for selected group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsGet200ResponseReportSearchResults reportingV3ReportsGet200ResponseReportSearchResults = (ReportingV3ReportsGet200ResponseReportSearchResults) o;
    return Objects.equals(this.link, reportingV3ReportsGet200ResponseReportSearchResults.link) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportsGet200ResponseReportSearchResults.reportDefinitionId) &&
        Objects.equals(this.reportName, reportingV3ReportsGet200ResponseReportSearchResults.reportName) &&
        Objects.equals(this.reportMimeType, reportingV3ReportsGet200ResponseReportSearchResults.reportMimeType) &&
        Objects.equals(this.reportFrequency, reportingV3ReportsGet200ResponseReportSearchResults.reportFrequency) &&
        Objects.equals(this.status, reportingV3ReportsGet200ResponseReportSearchResults.status) &&
        Objects.equals(this.reportStartTime, reportingV3ReportsGet200ResponseReportSearchResults.reportStartTime) &&
        Objects.equals(this.reportEndTime, reportingV3ReportsGet200ResponseReportSearchResults.reportEndTime) &&
        Objects.equals(this.timezone, reportingV3ReportsGet200ResponseReportSearchResults.timezone) &&
        Objects.equals(this.reportId, reportingV3ReportsGet200ResponseReportSearchResults.reportId) &&
        Objects.equals(this.organizationId, reportingV3ReportsGet200ResponseReportSearchResults.organizationId) &&
        Objects.equals(this.queuedTime, reportingV3ReportsGet200ResponseReportSearchResults.queuedTime) &&
        Objects.equals(this.reportGeneratingTime, reportingV3ReportsGet200ResponseReportSearchResults.reportGeneratingTime) &&
        Objects.equals(this.reportCompletedTime, reportingV3ReportsGet200ResponseReportSearchResults.reportCompletedTime) &&
        Objects.equals(this.subscriptionType, reportingV3ReportsGet200ResponseReportSearchResults.subscriptionType) &&
        Objects.equals(this.groupId, reportingV3ReportsGet200ResponseReportSearchResults.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, reportDefinitionId, reportName, reportMimeType, reportFrequency, status, reportStartTime, reportEndTime, timezone, reportId, organizationId, queuedTime, reportGeneratingTime, reportCompletedTime, subscriptionType, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsGet200ResponseReportSearchResults {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportStartTime: ").append(toIndentedString(reportStartTime)).append("\n");
    sb.append("    reportEndTime: ").append(toIndentedString(reportEndTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
    sb.append("    reportGeneratingTime: ").append(toIndentedString(reportGeneratingTime)).append("\n");
    sb.append("    reportCompletedTime: ").append(toIndentedString(reportCompletedTime)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

