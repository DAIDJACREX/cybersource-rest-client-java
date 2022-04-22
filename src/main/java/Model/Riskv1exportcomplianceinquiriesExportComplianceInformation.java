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
import Model.Riskv1exportcomplianceinquiriesExportComplianceInformationWeights;
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
 * Riskv1exportcomplianceinquiriesExportComplianceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class Riskv1exportcomplianceinquiriesExportComplianceInformation {
  @SerializedName("addressOperator")
  private String addressOperator = null;

  @SerializedName("weights")
  private Riskv1exportcomplianceinquiriesExportComplianceInformationWeights weights = null;

  @SerializedName("sanctionLists")
  private List<String> sanctionLists = null;

  public Riskv1exportcomplianceinquiriesExportComplianceInformation addressOperator(String addressOperator) {
    this.addressOperator = addressOperator;
    return this;
  }

   /**
   * Parts of the customer’s information that must match with an entry in the DPL (denied parties list) before a match occurs. This field can contain one of the following values: - AND: (default) The customer’s name or company and the customer’s address must appear in the database. - OR: The customer’s name must appear in the database. - IGNORE: You want the service to detect a match only of the customer’s name or company but not of the address. 
   * @return addressOperator
  **/
  @ApiModelProperty(value = "Parts of the customer’s information that must match with an entry in the DPL (denied parties list) before a match occurs. This field can contain one of the following values: - AND: (default) The customer’s name or company and the customer’s address must appear in the database. - OR: The customer’s name must appear in the database. - IGNORE: You want the service to detect a match only of the customer’s name or company but not of the address. ")
  public String getAddressOperator() {
    return addressOperator;
  }

  public void setAddressOperator(String addressOperator) {
    this.addressOperator = addressOperator;
  }

  public Riskv1exportcomplianceinquiriesExportComplianceInformation weights(Riskv1exportcomplianceinquiriesExportComplianceInformationWeights weights) {
    this.weights = weights;
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @ApiModelProperty(value = "")
  public Riskv1exportcomplianceinquiriesExportComplianceInformationWeights getWeights() {
    return weights;
  }

  public void setWeights(Riskv1exportcomplianceinquiriesExportComplianceInformationWeights weights) {
    this.weights = weights;
  }

  public Riskv1exportcomplianceinquiriesExportComplianceInformation sanctionLists(List<String> sanctionLists) {
    this.sanctionLists = sanctionLists;
    return this;
  }

  public Riskv1exportcomplianceinquiriesExportComplianceInformation addSanctionListsItem(String sanctionListsItem) {
    if (this.sanctionLists == null) {
      this.sanctionLists = new ArrayList<String>();
    }
    this.sanctionLists.add(sanctionListsItem);
    return this;
  }

   /**
   * Use this field to specify which list(s) you want checked with the request. The reply will include the list name as well as the response data. To check against multiple lists, enter multiple list codes separated by a caret (^). For more information, see \&quot;Restricted and Denied Parties List,\&quot; page 68. 
   * @return sanctionLists
  **/
  @ApiModelProperty(value = "Use this field to specify which list(s) you want checked with the request. The reply will include the list name as well as the response data. To check against multiple lists, enter multiple list codes separated by a caret (^). For more information, see \"Restricted and Denied Parties List,\" page 68. ")
  public List<String> getSanctionLists() {
    return sanctionLists;
  }

  public void setSanctionLists(List<String> sanctionLists) {
    this.sanctionLists = sanctionLists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesExportComplianceInformation riskv1exportcomplianceinquiriesExportComplianceInformation = (Riskv1exportcomplianceinquiriesExportComplianceInformation) o;
    return Objects.equals(this.addressOperator, riskv1exportcomplianceinquiriesExportComplianceInformation.addressOperator) &&
        Objects.equals(this.weights, riskv1exportcomplianceinquiriesExportComplianceInformation.weights) &&
        Objects.equals(this.sanctionLists, riskv1exportcomplianceinquiriesExportComplianceInformation.sanctionLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressOperator, weights, sanctionLists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesExportComplianceInformation {\n");
    
    sb.append("    addressOperator: ").append(toIndentedString(addressOperator)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
    sb.append("    sanctionLists: ").append(toIndentedString(sanctionLists)).append("\n");
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

