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
import Model.Ptsv1pushfundstransferProcessingInformationPayoutsOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv1pushfundstransferProcessingInformation
 */

public class Ptsv1pushfundstransferProcessingInformation {
  @SerializedName("businessApplicationId")
  private String businessApplicationId = null;

  @SerializedName("payoutsOptions")
  private Ptsv1pushfundstransferProcessingInformationPayoutsOptions payoutsOptions = null;

  @SerializedName("feeProgramId")
  private String feeProgramId = null;

  @SerializedName("networkPartnerId")
  private String networkPartnerId = null;

  @SerializedName("processingCode")
  private String processingCode = null;

  @SerializedName("sharingGroupCode")
  private String sharingGroupCode = null;

  @SerializedName("purposeOfPayment")
  private String purposeOfPayment = null;

  public Ptsv1pushfundstransferProcessingInformation businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * Money Transfer (MT) - &#x60;AA&#x60;: Account to Account - &#x60;BI&#x60;: Bank-Initiated Money Transfer - &#x60;CD&#x60;: Cash Deposit - &#x60;FT&#x60;: Funds Transfer - &#x60;TU&#x60;: Prepaid Card Loan - &#x60;WT&#x60;: Wallet Transfer-Staged Digital Wallet (SDW) Transfer - &#x60;PP&#x60;: P2P Money Transfer  Funds Disbursement (FD) - &#x60;BB&#x60;: Business-to-business Supplier Payments - &#x60;BP&#x60;: Non-Card Bill Pay  - &#x60;CP&#x60;: Credit Card Bill Pay - &#x60;FD&#x60;: General Funds Disbursements - &#x60;GD&#x60;: Government Disbursements and Government Initiated Tax Refunds - &#x60;GP&#x60;: Gambling/Gaming Payouts (other than online gaming) - &#x60;LO&#x60;: Loyalty Payments - &#x60;MD&#x60;: Merchant Settlement - &#x60;MI&#x60;: Faster Refunds - &#x60;OG&#x60;: Online Gambling Payouts - &#x60;PD&#x60;: Payroll and Pension Disbursements - &#x60;RP&#x60;: Request-to-Pay Service 
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Money Transfer (MT) - `AA`: Account to Account - `BI`: Bank-Initiated Money Transfer - `CD`: Cash Deposit - `FT`: Funds Transfer - `TU`: Prepaid Card Loan - `WT`: Wallet Transfer-Staged Digital Wallet (SDW) Transfer - `PP`: P2P Money Transfer  Funds Disbursement (FD) - `BB`: Business-to-business Supplier Payments - `BP`: Non-Card Bill Pay  - `CP`: Credit Card Bill Pay - `FD`: General Funds Disbursements - `GD`: Government Disbursements and Government Initiated Tax Refunds - `GP`: Gambling/Gaming Payouts (other than online gaming) - `LO`: Loyalty Payments - `MD`: Merchant Settlement - `MI`: Faster Refunds - `OG`: Online Gambling Payouts - `PD`: Payroll and Pension Disbursements - `RP`: Request-to-Pay Service ")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public Ptsv1pushfundstransferProcessingInformation payoutsOptions(Ptsv1pushfundstransferProcessingInformationPayoutsOptions payoutsOptions) {
    this.payoutsOptions = payoutsOptions;
    return this;
  }

   /**
   * Get payoutsOptions
   * @return payoutsOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions getPayoutsOptions() {
    return payoutsOptions;
  }

  public void setPayoutsOptions(Ptsv1pushfundstransferProcessingInformationPayoutsOptions payoutsOptions) {
    this.payoutsOptions = payoutsOptions;
  }

  public Ptsv1pushfundstransferProcessingInformation feeProgramId(String feeProgramId) {
    this.feeProgramId = feeProgramId;
    return this;
  }

   /**
   * Fee Program Indicator. This field identifies the interchange fee program applicable to each financial transaction. Fee program indicator (FPI) values correspond to the fee descriptor and rate for each existing fee program. 
   * @return feeProgramId
  **/
  @ApiModelProperty(value = "Fee Program Indicator. This field identifies the interchange fee program applicable to each financial transaction. Fee program indicator (FPI) values correspond to the fee descriptor and rate for each existing fee program. ")
  public String getFeeProgramId() {
    return feeProgramId;
  }

  public void setFeeProgramId(String feeProgramId) {
    this.feeProgramId = feeProgramId;
  }

  public Ptsv1pushfundstransferProcessingInformation networkPartnerId(String networkPartnerId) {
    this.networkPartnerId = networkPartnerId;
    return this;
  }

   /**
   * Merchant payment gateway ID that is assigned by Mastercard and is provided by the acquirer when a registered merchant payment gateway service provider is involved in the transaction. 
   * @return networkPartnerId
  **/
  @ApiModelProperty(value = "Merchant payment gateway ID that is assigned by Mastercard and is provided by the acquirer when a registered merchant payment gateway service provider is involved in the transaction. ")
  public String getNetworkPartnerId() {
    return networkPartnerId;
  }

  public void setNetworkPartnerId(String networkPartnerId) {
    this.networkPartnerId = networkPartnerId;
  }

  public Ptsv1pushfundstransferProcessingInformation processingCode(String processingCode) {
    this.processingCode = processingCode;
    return this;
  }

   /**
   * This field contains coding that identifies (1) the customer transaction type and (2) the customer account types affected by the transaction.  Default: 5402 (Original Credit Transaction)  Contains codes that combined with some other fields such as the BAI (Business Application Id) identify some unique use cases. For Sales Tax rebates this field should be populated with the value 5120 (Value-added tax/Sales Tax) along with the businessApplicationId field set to the value &#39;FD&#39; which indicates this push funds transfer is being conducted in order to facilitate a sales tax refund. 
   * @return processingCode
  **/
  @ApiModelProperty(value = "This field contains coding that identifies (1) the customer transaction type and (2) the customer account types affected by the transaction.  Default: 5402 (Original Credit Transaction)  Contains codes that combined with some other fields such as the BAI (Business Application Id) identify some unique use cases. For Sales Tax rebates this field should be populated with the value 5120 (Value-added tax/Sales Tax) along with the businessApplicationId field set to the value 'FD' which indicates this push funds transfer is being conducted in order to facilitate a sales tax refund. ")
  public String getProcessingCode() {
    return processingCode;
  }

  public void setProcessingCode(String processingCode) {
    this.processingCode = processingCode;
  }

  public Ptsv1pushfundstransferProcessingInformation sharingGroupCode(String sharingGroupCode) {
    this.sharingGroupCode = sharingGroupCode;
    return this;
  }

   /**
   * This U.S.-only field is optionally used by PIN Debit Gateway Service participants (merchants and acquirers) to specify the network access priority. VisaNet checks to determine if there are issuer routing preferences for a network specified by the sharing group code. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on issuer preference. If an preference exists for multiple specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on acquirer routing priorities.  Valid Values:  ACCEL_EXCHANGE_E  CU24_C  INTERLINK_G  MAESTRO_8  NYCE_Y  NYCE_F  PULSE_S  PULSE_L  PULSE_H  STAR_N  STAR_W  STAR_Z  STAR_Q  STAR_M  VISA_V 
   * @return sharingGroupCode
  **/
  @ApiModelProperty(value = "This U.S.-only field is optionally used by PIN Debit Gateway Service participants (merchants and acquirers) to specify the network access priority. VisaNet checks to determine if there are issuer routing preferences for a network specified by the sharing group code. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on issuer preference. If an preference exists for multiple specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on acquirer routing priorities.  Valid Values:  ACCEL_EXCHANGE_E  CU24_C  INTERLINK_G  MAESTRO_8  NYCE_Y  NYCE_F  PULSE_S  PULSE_L  PULSE_H  STAR_N  STAR_W  STAR_Z  STAR_Q  STAR_M  VISA_V ")
  public String getSharingGroupCode() {
    return sharingGroupCode;
  }

  public void setSharingGroupCode(String sharingGroupCode) {
    this.sharingGroupCode = sharingGroupCode;
  }

  public Ptsv1pushfundstransferProcessingInformation purposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
    return this;
  }

   /**
   * This will send purpose of funds code for original credit transactions (OCTs). 
   * @return purposeOfPayment
  **/
  @ApiModelProperty(value = "This will send purpose of funds code for original credit transactions (OCTs). ")
  public String getPurposeOfPayment() {
    return purposeOfPayment;
  }

  public void setPurposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferProcessingInformation ptsv1pushfundstransferProcessingInformation = (Ptsv1pushfundstransferProcessingInformation) o;
    return Objects.equals(this.businessApplicationId, ptsv1pushfundstransferProcessingInformation.businessApplicationId) &&
        Objects.equals(this.payoutsOptions, ptsv1pushfundstransferProcessingInformation.payoutsOptions) &&
        Objects.equals(this.feeProgramId, ptsv1pushfundstransferProcessingInformation.feeProgramId) &&
        Objects.equals(this.networkPartnerId, ptsv1pushfundstransferProcessingInformation.networkPartnerId) &&
        Objects.equals(this.processingCode, ptsv1pushfundstransferProcessingInformation.processingCode) &&
        Objects.equals(this.sharingGroupCode, ptsv1pushfundstransferProcessingInformation.sharingGroupCode) &&
        Objects.equals(this.purposeOfPayment, ptsv1pushfundstransferProcessingInformation.purposeOfPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, payoutsOptions, feeProgramId, networkPartnerId, processingCode, sharingGroupCode, purposeOfPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferProcessingInformation {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    payoutsOptions: ").append(toIndentedString(payoutsOptions)).append("\n");
    sb.append("    feeProgramId: ").append(toIndentedString(feeProgramId)).append("\n");
    sb.append("    networkPartnerId: ").append(toIndentedString(networkPartnerId)).append("\n");
    sb.append("    processingCode: ").append(toIndentedString(processingCode)).append("\n");
    sb.append("    sharingGroupCode: ").append(toIndentedString(sharingGroupCode)).append("\n");
    sb.append("    purposeOfPayment: ").append(toIndentedString(purposeOfPayment)).append("\n");
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

