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
import Model.ReportingV3ReportsGet200ResponseReportSearchResults;
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
 * ReportingV3ReportsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class ReportingV3ReportsGet200Response {
  @SerializedName("reportSearchResults")
  private List<ReportingV3ReportsGet200ResponseReportSearchResults> reportSearchResults = null;

  public ReportingV3ReportsGet200Response reportSearchResults(List<ReportingV3ReportsGet200ResponseReportSearchResults> reportSearchResults) {
    this.reportSearchResults = reportSearchResults;
    return this;
  }

  public ReportingV3ReportsGet200Response addReportSearchResultsItem(ReportingV3ReportsGet200ResponseReportSearchResults reportSearchResultsItem) {
    if (this.reportSearchResults == null) {
      this.reportSearchResults = new ArrayList<ReportingV3ReportsGet200ResponseReportSearchResults>();
    }
    this.reportSearchResults.add(reportSearchResultsItem);
    return this;
  }

   /**
   * Get reportSearchResults
   * @return reportSearchResults
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ReportsGet200ResponseReportSearchResults> getReportSearchResults() {
    return reportSearchResults;
  }

  public void setReportSearchResults(List<ReportingV3ReportsGet200ResponseReportSearchResults> reportSearchResults) {
    this.reportSearchResults = reportSearchResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsGet200Response reportingV3ReportsGet200Response = (ReportingV3ReportsGet200Response) o;
    return Objects.equals(this.reportSearchResults, reportingV3ReportsGet200Response.reportSearchResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportSearchResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsGet200Response {\n");
    
    sb.append("    reportSearchResults: ").append(toIndentedString(reportSearchResults)).append("\n");
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

