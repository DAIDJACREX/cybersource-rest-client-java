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
import Model.ReportingV3ReportsGet200ResponseLinkReportDownload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReportingV3ReportsGet200ResponseLink
 */

public class ReportingV3ReportsGet200ResponseLink {
  @SerializedName("reportDownload")
  private ReportingV3ReportsGet200ResponseLinkReportDownload reportDownload = null;

  public ReportingV3ReportsGet200ResponseLink reportDownload(ReportingV3ReportsGet200ResponseLinkReportDownload reportDownload) {
    this.reportDownload = reportDownload;
    return this;
  }

   /**
   * Get reportDownload
   * @return reportDownload
  **/
  @ApiModelProperty(value = "")
  public ReportingV3ReportsGet200ResponseLinkReportDownload getReportDownload() {
    return reportDownload;
  }

  public void setReportDownload(ReportingV3ReportsGet200ResponseLinkReportDownload reportDownload) {
    this.reportDownload = reportDownload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsGet200ResponseLink reportingV3ReportsGet200ResponseLink = (ReportingV3ReportsGet200ResponseLink) o;
    return Objects.equals(this.reportDownload, reportingV3ReportsGet200ResponseLink.reportDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDownload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsGet200ResponseLink {\n");
    
    sb.append("    reportDownload: ").append(toIndentedString(reportDownload)).append("\n");
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

