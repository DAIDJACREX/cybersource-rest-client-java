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
import Model.RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList;
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
 * RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation {
  @SerializedName("ipCountryConfidence")
  private Integer ipCountryConfidence = null;

  @SerializedName("infoCodes")
  private List<String> infoCodes = null;

  @SerializedName("watchList")
  private RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList watchList = null;

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation ipCountryConfidence(Integer ipCountryConfidence) {
    this.ipCountryConfidence = ipCountryConfidence;
    return this;
  }

   /**
   * Likelihood that the country associated with the customer’s IP address was identified correctly. Returns a value from 1–100, where 100 indicates the highest likelihood. If the country cannot be determined, the value is –1. 
   * minimum: -1
   * maximum: 100
   * @return ipCountryConfidence
  **/
  @ApiModelProperty(value = "Likelihood that the country associated with the customer’s IP address was identified correctly. Returns a value from 1–100, where 100 indicates the highest likelihood. If the country cannot be determined, the value is –1. ")
  public Integer getIpCountryConfidence() {
    return ipCountryConfidence;
  }

  public void setIpCountryConfidence(Integer ipCountryConfidence) {
    this.ipCountryConfidence = ipCountryConfidence;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation infoCodes(List<String> infoCodes) {
    this.infoCodes = infoCodes;
    return this;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation addInfoCodesItem(String infoCodesItem) {
    if (this.infoCodes == null) {
      this.infoCodes = new ArrayList<String>();
    }
    this.infoCodes.add(infoCodesItem);
    return this;
  }

   /**
   * Returned when the Denied Parties List check (first two codes) or the export service (all others) would have declined the transaction. This field can contain one or more of these values: - &#x60;MATCH-DPC&#x60;: Denied Parties List match. - &#x60;UNV-DPC&#x60;: Denied Parties List unavailable. - &#x60;MATCH-BCO&#x60;: Billing country restricted. - &#x60;MATCH-EMCO&#x60;: Email country restricted. - &#x60;MATCH-HCO&#x60;: Host name country restricted. - &#x60;MATCH-IPCO&#x60;: IP country restricted. - &#x60;MATCH-SCO&#x60;: Shipping country restricted. 
   * @return infoCodes
  **/
  @ApiModelProperty(value = "Returned when the Denied Parties List check (first two codes) or the export service (all others) would have declined the transaction. This field can contain one or more of these values: - `MATCH-DPC`: Denied Parties List match. - `UNV-DPC`: Denied Parties List unavailable. - `MATCH-BCO`: Billing country restricted. - `MATCH-EMCO`: Email country restricted. - `MATCH-HCO`: Host name country restricted. - `MATCH-IPCO`: IP country restricted. - `MATCH-SCO`: Shipping country restricted. ")
  public List<String> getInfoCodes() {
    return infoCodes;
  }

  public void setInfoCodes(List<String> infoCodes) {
    this.infoCodes = infoCodes;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation watchList(RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList watchList) {
    this.watchList = watchList;
    return this;
  }

   /**
   * Get watchList
   * @return watchList
  **/
  @ApiModelProperty(value = "")
  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList getWatchList() {
    return watchList;
  }

  public void setWatchList(RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList watchList) {
    this.watchList = watchList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation = (RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation) o;
    return Objects.equals(this.ipCountryConfidence, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation.ipCountryConfidence) &&
        Objects.equals(this.infoCodes, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation.infoCodes) &&
        Objects.equals(this.watchList, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation.watchList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipCountryConfidence, infoCodes, watchList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation {\n");
    
    sb.append("    ipCountryConfidence: ").append(toIndentedString(ipCountryConfidence)).append("\n");
    sb.append("    infoCodes: ").append(toIndentedString(infoCodes)).append("\n");
    sb.append("    watchList: ").append(toIndentedString(watchList)).append("\n");
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

