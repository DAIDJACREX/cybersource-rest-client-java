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
import Model.Ptsv1pushfundstransferProcessingInformationRecurringOptions;
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

  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("networkRoutingOrder")
  private String networkRoutingOrder = null;

  @SerializedName("payoutsOptions")
  private Ptsv1pushfundstransferProcessingInformationPayoutsOptions payoutsOptions = null;

  @SerializedName("purposeOfPayment")
  private String purposeOfPayment = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("recurringOptions")
  private Ptsv1pushfundstransferProcessingInformationRecurringOptions recurringOptions = null;

  @SerializedName("transactionReason")
  private String transactionReason = null;

  public Ptsv1pushfundstransferProcessingInformation businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   *  Payouts transaction type. Required for Mastercard Send.  Valid Values- Visa Platform Connect: - &#x60;AA&#x60;: Account to account. - &#x60;CP&#x60;: Card bill payment - &#x60;FD&#x60;: Funds disbursement (general) - &#x60;GD&#x60;: Government disbursement - &#x60;MD&#x60;: Merchant disbursement (acquirers or aggregators settling to merchants). - &#x60;PP&#x60;: Person to person. - &#x60;TU&#x60;: Top-up for enhanced prepaid loads.   Mastercard Send: - &#x60;BB&#x60;: Business to business. - &#x60;BD&#x60;: Business Disbursement - &#x60;CP&#x60;: Card bill payment - &#x60;GD&#x60;: Government disbursement - &#x60;MD&#x60;: Merchant disbursement (acquirers or aggregators settling to merchants). - &#x60;OG&#x60;: Online gambling payout.   Chase Paymentech Solutions: - &#x60;AA&#x60;: Account to account. - &#x60;FD&#x60;: Funds disbursement (general) - &#x60;MD&#x60;: Merchant disbursement (acquirers or aggregators settling to merchants). - &#x60;PP&#x60;: Person to person.   FDC Compass: - &#x60;BB&#x60;: Business to business. - &#x60;BI&#x60;: Bank-initiated money transfer. - &#x60;FD&#x60;: Funds disbursement (general) - &#x60;GD&#x60;: Government disbursement - &#x60;GP&#x60;: Gambling Payment - &#x60;LO&#x60;: Loyalty Offers - &#x60;MD&#x60;: Merchant disbursement (acquirers or aggregators settling to merchants). - &#x60;MI&#x60;: Merchant initated money transfer - &#x60;OG&#x60;: Online gambling payout. - &#x60;PD&#x60;: Payroll pension disbursement. - &#x60;PP&#x60;: Person to person. - &#x60;WT&#x60;: Wallet transfer. 
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = " Payouts transaction type. Required for Mastercard Send.  Valid Values- Visa Platform Connect: - `AA`: Account to account. - `CP`: Card bill payment - `FD`: Funds disbursement (general) - `GD`: Government disbursement - `MD`: Merchant disbursement (acquirers or aggregators settling to merchants). - `PP`: Person to person. - `TU`: Top-up for enhanced prepaid loads.   Mastercard Send: - `BB`: Business to business. - `BD`: Business Disbursement - `CP`: Card bill payment - `GD`: Government disbursement - `MD`: Merchant disbursement (acquirers or aggregators settling to merchants). - `OG`: Online gambling payout.   Chase Paymentech Solutions: - `AA`: Account to account. - `FD`: Funds disbursement (general) - `MD`: Merchant disbursement (acquirers or aggregators settling to merchants). - `PP`: Person to person.   FDC Compass: - `BB`: Business to business. - `BI`: Bank-initiated money transfer. - `FD`: Funds disbursement (general) - `GD`: Government disbursement - `GP`: Gambling Payment - `LO`: Loyalty Offers - `MD`: Merchant disbursement (acquirers or aggregators settling to merchants). - `MI`: Merchant initated money transfer - `OG`: Online gambling payout. - `PD`: Payroll pension disbursement. - `PP`: Person to person. - `WT`: Wallet transfer. ")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public Ptsv1pushfundstransferProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction.  Value for an OCT transaction: internet  For details, see the e_commerce_indicator field description in Payouts Using the SCMP API. 
   * @return commerceIndicator
  **/
  @ApiModelProperty(required = true, value = "Type of transaction.  Value for an OCT transaction: internet  For details, see the e_commerce_indicator field description in Payouts Using the SCMP API. ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv1pushfundstransferProcessingInformation networkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
    return this;
  }

   /**
   * Visa Platform Connect This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to get the attributes for specified networks only. The networks specified in this field must be a subset of the information provided during program enrollment. Refer to Sharing Group Code/Network Routing Order. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service.  VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the network routing order. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer&#39;s preference. If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer&#39;s routing priorities.  For details, see the network_order field description in BIN Lookup Service Using the SCMP API. 
   * @return networkRoutingOrder
  **/
  @ApiModelProperty(value = "Visa Platform Connect This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to get the attributes for specified networks only. The networks specified in this field must be a subset of the information provided during program enrollment. Refer to Sharing Group Code/Network Routing Order. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service.  VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the network routing order. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer's preference. If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer's routing priorities.  For details, see the network_order field description in BIN Lookup Service Using the SCMP API. ")
  public String getNetworkRoutingOrder() {
    return networkRoutingOrder;
  }

  public void setNetworkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
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

  public Ptsv1pushfundstransferProcessingInformation purposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
    return this;
  }

   /**
   * This will send purpose of funds code for original credit transactions (OCTs).  Visa Platform Connect (VPC) This will send purpose of transaction code for original credit transactions (OCTs). Purpose of Payment codes are defined by the recipient issuer&#39;s country and vary by country.  Mastercard Send: - &#x60;00&#x60;: Family Support - &#x60;01&#x60;: Regular Labor Transfers (expatriates), - &#x60;02&#x60;: Travel &amp; Tourism - &#x60;03&#x60;: Education - &#x60;04&#x60;: Hospitalization &amp; Medical Treatment, - &#x60;05&#x60;: Emergency Need - &#x60;06&#x60;: Savings - &#x60;07&#x60;: Gifts - &#x60;08&#x60;: Other - &#x60;09&#x60;: Salary - &#x60;10&#x60;: Crowd lending - &#x60;11&#x60;: Crypto currency - &#x60;12&#x60;: Refund to original card - &#x60;13&#x60;: Refund to new card 
   * @return purposeOfPayment
  **/
  @ApiModelProperty(value = "This will send purpose of funds code for original credit transactions (OCTs).  Visa Platform Connect (VPC) This will send purpose of transaction code for original credit transactions (OCTs). Purpose of Payment codes are defined by the recipient issuer's country and vary by country.  Mastercard Send: - `00`: Family Support - `01`: Regular Labor Transfers (expatriates), - `02`: Travel & Tourism - `03`: Education - `04`: Hospitalization & Medical Treatment, - `05`: Emergency Need - `06`: Savings - `07`: Gifts - `08`: Other - `09`: Salary - `10`: Crowd lending - `11`: Crypto currency - `12`: Refund to original card - `13`: Refund to new card ")
  public String getPurposeOfPayment() {
    return purposeOfPayment;
  }

  public void setPurposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
  }

  public Ptsv1pushfundstransferProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request.  For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request.  For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv1pushfundstransferProcessingInformation recurringOptions(Ptsv1pushfundstransferProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
    return this;
  }

   /**
   * Get recurringOptions
   * @return recurringOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferProcessingInformationRecurringOptions getRecurringOptions() {
    return recurringOptions;
  }

  public void setRecurringOptions(Ptsv1pushfundstransferProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
  }

  public Ptsv1pushfundstransferProcessingInformation transactionReason(String transactionReason) {
    this.transactionReason = transactionReason;
    return this;
  }

   /**
   * Transaction reason code.  This field applies only to Visa Platform Connect 
   * @return transactionReason
  **/
  @ApiModelProperty(value = "Transaction reason code.  This field applies only to Visa Platform Connect ")
  public String getTransactionReason() {
    return transactionReason;
  }

  public void setTransactionReason(String transactionReason) {
    this.transactionReason = transactionReason;
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
        Objects.equals(this.commerceIndicator, ptsv1pushfundstransferProcessingInformation.commerceIndicator) &&
        Objects.equals(this.networkRoutingOrder, ptsv1pushfundstransferProcessingInformation.networkRoutingOrder) &&
        Objects.equals(this.payoutsOptions, ptsv1pushfundstransferProcessingInformation.payoutsOptions) &&
        Objects.equals(this.purposeOfPayment, ptsv1pushfundstransferProcessingInformation.purposeOfPayment) &&
        Objects.equals(this.reconciliationId, ptsv1pushfundstransferProcessingInformation.reconciliationId) &&
        Objects.equals(this.recurringOptions, ptsv1pushfundstransferProcessingInformation.recurringOptions) &&
        Objects.equals(this.transactionReason, ptsv1pushfundstransferProcessingInformation.transactionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, commerceIndicator, networkRoutingOrder, payoutsOptions, purposeOfPayment, reconciliationId, recurringOptions, transactionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferProcessingInformation {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    networkRoutingOrder: ").append(toIndentedString(networkRoutingOrder)).append("\n");
    sb.append("    payoutsOptions: ").append(toIndentedString(payoutsOptions)).append("\n");
    sb.append("    purposeOfPayment: ").append(toIndentedString(purposeOfPayment)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    recurringOptions: ").append(toIndentedString(recurringOptions)).append("\n");
    sb.append("    transactionReason: ").append(toIndentedString(transactionReason)).append("\n");
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

