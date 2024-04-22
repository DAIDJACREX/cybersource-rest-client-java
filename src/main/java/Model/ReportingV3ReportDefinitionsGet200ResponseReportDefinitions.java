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
import Model.ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings;
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
 * ReportingV3ReportDefinitionsGet200ResponseReportDefinitions
 */

public class ReportingV3ReportDefinitionsGet200ResponseReportDefinitions {
  @SerializedName("type")
  private String type = null;

  @SerializedName("reportDefinitionId")
  private Integer reportDefinitionId = null;

  @SerializedName("reportDefintionName")
  private String reportDefintionName = null;

  @SerializedName("supportedFormats")
  private List<String> supportedFormats = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("defaultSettings")
  private ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings defaultSettings = null;

  @SerializedName("subscriptionType")
  private String subscriptionType = null;

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * | Id  |         Definition Class          | | --- | --------------------------------- | | 210 | TransactionRequestClass           | | 211 | PaymentBatchDetailClass           | | 212 | ExceptionDetailClass              | | 213 | ProcessorSettlementDetailClass    | | 214 | ProcessorEventsDetailClass        | | 215 | FundingDetailClass                | | 216 | AgingDetailClass                  | | 217 | ChargebackAndRetrievalDetailClass | | 218 | DepositDetailClass                | | 219 | FeeDetailClass                    | | 220 | InvoiceSummaryClass               | | 221 | PayerAuthDetailClass              | | 222 | ConversionDetailClass             | | 270 | JPTransactionDetailClass          | | 271 | ServiceFeeDetailClass             | | 310 | GatewayTransactionRequestClass    | | 400 | DecisionManagerEventDetailClass   | | 401 | DecisionManagerDetailClass        | | 410 | FeeSummaryClass                   | | 420 | TaxCalculationClass               | | 520 | POSTerminalExceptionClass         | | 620 | SubscriptionDetailClass           | 
   * @return reportDefinitionId
  **/
  @ApiModelProperty(value = "| Id  |         Definition Class          | | --- | --------------------------------- | | 210 | TransactionRequestClass           | | 211 | PaymentBatchDetailClass           | | 212 | ExceptionDetailClass              | | 213 | ProcessorSettlementDetailClass    | | 214 | ProcessorEventsDetailClass        | | 215 | FundingDetailClass                | | 216 | AgingDetailClass                  | | 217 | ChargebackAndRetrievalDetailClass | | 218 | DepositDetailClass                | | 219 | FeeDetailClass                    | | 220 | InvoiceSummaryClass               | | 221 | PayerAuthDetailClass              | | 222 | ConversionDetailClass             | | 270 | JPTransactionDetailClass          | | 271 | ServiceFeeDetailClass             | | 310 | GatewayTransactionRequestClass    | | 400 | DecisionManagerEventDetailClass   | | 401 | DecisionManagerDetailClass        | | 410 | FeeSummaryClass                   | | 420 | TaxCalculationClass               | | 520 | POSTerminalExceptionClass         | | 620 | SubscriptionDetailClass           | ")
  public Integer getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
    return this;
  }

   /**
   * Get reportDefintionName
   * @return reportDefintionName
  **/
  @ApiModelProperty(value = "")
  public String getReportDefintionName() {
    return reportDefintionName;
  }

  public void setReportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions supportedFormats(List<String> supportedFormats) {
    this.supportedFormats = supportedFormats;
    return this;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions addSupportedFormatsItem(String supportedFormatsItem) {
    if (this.supportedFormats == null) {
      this.supportedFormats = new ArrayList<String>();
    }
    this.supportedFormats.add(supportedFormatsItem);
    return this;
  }

   /**
   * Get supportedFormats
   * @return supportedFormats
  **/
  @ApiModelProperty(value = "")
  public List<String> getSupportedFormats() {
    return supportedFormats;
  }

  public void setSupportedFormats(List<String> supportedFormats) {
    this.supportedFormats = supportedFormats;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions defaultSettings(ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings defaultSettings) {
    this.defaultSettings = defaultSettings;
    return this;
  }

   /**
   * Get defaultSettings
   * @return defaultSettings
  **/
  @ApiModelProperty(value = "")
  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings getDefaultSettings() {
    return defaultSettings;
  }

  public void setDefaultSettings(ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings defaultSettings) {
    this.defaultSettings = defaultSettings;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * &#39;The subscription type for which report definition is required. By default the type will be CUSTOM.&#39; Valid Values: - CLASSIC - CUSTOM - STANDARD 
   * @return subscriptionType
  **/
  @ApiModelProperty(example = "CLASSIC", value = "'The subscription type for which report definition is required. By default the type will be CUSTOM.' Valid Values: - CLASSIC - CUSTOM - STANDARD ")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportingV3ReportDefinitionsGet200ResponseReportDefinitions = (ReportingV3ReportDefinitionsGet200ResponseReportDefinitions) o;
    return Objects.equals(this.type, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.type) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.reportDefinitionId) &&
        Objects.equals(this.reportDefintionName, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.reportDefintionName) &&
        Objects.equals(this.supportedFormats, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.supportedFormats) &&
        Objects.equals(this.description, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.description) &&
        Objects.equals(this.defaultSettings, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.defaultSettings) &&
        Objects.equals(this.subscriptionType, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reportDefinitionId, reportDefintionName, supportedFormats, description, defaultSettings, subscriptionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportDefinitionsGet200ResponseReportDefinitions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportDefintionName: ").append(toIndentedString(reportDefintionName)).append("\n");
    sb.append("    supportedFormats: ").append(toIndentedString(supportedFormats)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultSettings: ").append(toIndentedString(defaultSettings)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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

