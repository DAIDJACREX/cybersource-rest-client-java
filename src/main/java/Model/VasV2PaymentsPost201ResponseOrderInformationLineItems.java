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
import Model.VasV2PaymentsPost201ResponseOrderInformationJurisdiction;
import Model.VasV2PaymentsPost201ResponseOrderInformationTaxDetails;
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
 * VasV2PaymentsPost201ResponseOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class VasV2PaymentsPost201ResponseOrderInformationLineItems {
  @SerializedName("taxDetails")
  private List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails = null;

  @SerializedName("jurisdiction")
  private List<VasV2PaymentsPost201ResponseOrderInformationJurisdiction> jurisdiction = null;

  @SerializedName("exemptAmount")
  private String exemptAmount = null;

  @SerializedName("taxableAmount")
  private String taxableAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  public VasV2PaymentsPost201ResponseOrderInformationLineItems taxDetails(List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems addTaxDetailsItem(VasV2PaymentsPost201ResponseOrderInformationTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<VasV2PaymentsPost201ResponseOrderInformationTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems jurisdiction(List<VasV2PaymentsPost201ResponseOrderInformationJurisdiction> jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems addJurisdictionItem(VasV2PaymentsPost201ResponseOrderInformationJurisdiction jurisdictionItem) {
    if (this.jurisdiction == null) {
      this.jurisdiction = new ArrayList<VasV2PaymentsPost201ResponseOrderInformationJurisdiction>();
    }
    this.jurisdiction.add(jurisdictionItem);
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(value = "")
  public List<VasV2PaymentsPost201ResponseOrderInformationJurisdiction> getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(List<VasV2PaymentsPost201ResponseOrderInformationJurisdiction> jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems exemptAmount(String exemptAmount) {
    this.exemptAmount = exemptAmount;
    return this;
  }

   /**
   * Exempt amount for the lineItem. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return exemptAmount
  **/
  @ApiModelProperty(value = "Exempt amount for the lineItem. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getExemptAmount() {
    return exemptAmount;
  }

  public void setExemptAmount(String exemptAmount) {
    this.exemptAmount = exemptAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems taxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Portion of the item amount that is taxable. 
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "Portion of the item amount that is taxable. ")
  public String getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax for the item. This value is the sum of all taxes applied to the item. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax for the item. This value is the sum of all taxes applied to the item. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseOrderInformationLineItems vasV2PaymentsPost201ResponseOrderInformationLineItems = (VasV2PaymentsPost201ResponseOrderInformationLineItems) o;
    return Objects.equals(this.taxDetails, vasV2PaymentsPost201ResponseOrderInformationLineItems.taxDetails) &&
        Objects.equals(this.jurisdiction, vasV2PaymentsPost201ResponseOrderInformationLineItems.jurisdiction) &&
        Objects.equals(this.exemptAmount, vasV2PaymentsPost201ResponseOrderInformationLineItems.exemptAmount) &&
        Objects.equals(this.taxableAmount, vasV2PaymentsPost201ResponseOrderInformationLineItems.taxableAmount) &&
        Objects.equals(this.taxAmount, vasV2PaymentsPost201ResponseOrderInformationLineItems.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxDetails, jurisdiction, exemptAmount, taxableAmount, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseOrderInformationLineItems {\n");
    
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

