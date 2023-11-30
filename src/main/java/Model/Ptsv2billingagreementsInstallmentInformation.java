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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2billingagreementsInstallmentInformation
 */

public class Ptsv2billingagreementsInstallmentInformation {
  @SerializedName("alertPreference")
  private String alertPreference = null;

  @SerializedName("firstInstallmentDate")
  private String firstInstallmentDate = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("lastInstallmentDate")
  private String lastInstallmentDate = null;

  @SerializedName("maxAmount")
  private String maxAmount = null;

  @SerializedName("minAmount")
  private String minAmount = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("preferredDay")
  private String preferredDay = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  public Ptsv2billingagreementsInstallmentInformation alertPreference(String alertPreference) {
    this.alertPreference = alertPreference;
    return this;
  }

   /**
   * Applicable only for SI. Required in case the authentication is initiated for SI registration. Valid Values: - &#x60;SMS&#x60; - &#x60;EMAIL&#x60; - &#x60;BOTH&#x60; 
   * @return alertPreference
  **/
  @ApiModelProperty(value = "Applicable only for SI. Required in case the authentication is initiated for SI registration. Valid Values: - `SMS` - `EMAIL` - `BOTH` ")
  public String getAlertPreference() {
    return alertPreference;
  }

  public void setAlertPreference(String alertPreference) {
    this.alertPreference = alertPreference;
  }

  public Ptsv2billingagreementsInstallmentInformation firstInstallmentDate(String firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
    return this;
  }

   /**
   * Date of the first installment payment. Format: YYMMDD. When you do not include this field, CyberSource sends a string of six zeros (000000) to the processor. For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR9 - Position: 42-47 - Field: Date of First Installment 
   * @return firstInstallmentDate
  **/
  @ApiModelProperty(value = "Date of the first installment payment. Format: YYMMDD. When you do not include this field, CyberSource sends a string of six zeros (000000) to the processor. For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR9 - Position: 42-47 - Field: Date of First Installment ")
  public String getFirstInstallmentDate() {
    return firstInstallmentDate;
  }

  public void setFirstInstallmentDate(String firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
  }

  public Ptsv2billingagreementsInstallmentInformation identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Standing Instruction/Installment identifier. 
   * @return identifier
  **/
  @ApiModelProperty(value = "Standing Instruction/Installment identifier. ")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Ptsv2billingagreementsInstallmentInformation lastInstallmentDate(String lastInstallmentDate) {
    this.lastInstallmentDate = lastInstallmentDate;
    return this;
  }

   /**
   * End date of the SI transactions. Cannot be later than card expiry date. Ideally this can be set to expiry date. Required in case the authentication is initiated for SI registration. 
   * @return lastInstallmentDate
  **/
  @ApiModelProperty(value = "End date of the SI transactions. Cannot be later than card expiry date. Ideally this can be set to expiry date. Required in case the authentication is initiated for SI registration. ")
  public String getLastInstallmentDate() {
    return lastInstallmentDate;
  }

  public void setLastInstallmentDate(String lastInstallmentDate) {
    this.lastInstallmentDate = lastInstallmentDate;
  }

  public Ptsv2billingagreementsInstallmentInformation maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Maximum Amount for which SI can be initiated. Required in case the authentication is initiated for SI registration. 
   * @return maxAmount
  **/
  @ApiModelProperty(value = "Maximum Amount for which SI can be initiated. Required in case the authentication is initiated for SI registration. ")
  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Ptsv2billingagreementsInstallmentInformation minAmount(String minAmount) {
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Minimum Amount for which SI can be initiated. Required in case the authentication is initiated for SI registration. 
   * @return minAmount
  **/
  @ApiModelProperty(value = "Minimum Amount for which SI can be initiated. Required in case the authentication is initiated for SI registration. ")
  public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }

  public Ptsv2billingagreementsInstallmentInformation paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment plan for the installments.  Possible values: - 0 (default): Regular installment. This value is not allowed for airline transactions. - 1: Installment payment with down payment. - 2: Installment payment without down payment. This value is supported only for airline transactions. - 3: Installment payment; down payment and boarding fee will follow. This value is supported only for airline transactions. - 4: Down payment only; regular installment payment will follow. - 5: Boarding fee only. This value is supported only for airline transactions.  This field is supported only for installment payments with Visa on CyberSource through VisaNet in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 9 - Field: Merchant Installment Supporting Information 
   * @return paymentType
  **/
  @ApiModelProperty(value = "Payment plan for the installments.  Possible values: - 0 (default): Regular installment. This value is not allowed for airline transactions. - 1: Installment payment with down payment. - 2: Installment payment without down payment. This value is supported only for airline transactions. - 3: Installment payment; down payment and boarding fee will follow. This value is supported only for airline transactions. - 4: Down payment only; regular installment payment will follow. - 5: Boarding fee only. This value is supported only for airline transactions.  This field is supported only for installment payments with Visa on CyberSource through VisaNet in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 9 - Field: Merchant Installment Supporting Information ")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Ptsv2billingagreementsInstallmentInformation preferredDay(String preferredDay) {
    this.preferredDay = preferredDay;
    return this;
  }

   /**
   * Preferred date for initiating the SI transaction every month. This field need not be sent in case the SI has to be initiated as and when required, e.g., topping up the wallet, etc. 
   * @return preferredDay
  **/
  @ApiModelProperty(value = "Preferred date for initiating the SI transaction every month. This field need not be sent in case the SI has to be initiated as and when required, e.g., topping up the wallet, etc. ")
  public String getPreferredDay() {
    return preferredDay;
  }

  public void setPreferredDay(String preferredDay) {
    this.preferredDay = preferredDay;
  }

  public Ptsv2billingagreementsInstallmentInformation sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Installment number when making payments in installments. Used along with &#x60;totalCount&#x60; to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as &#x60;sequence&#x60; &#x3D; 2 and &#x60;totalCount&#x60; &#x3D; 5.  For details, see \&quot;Installment Payments\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors. For details, see \&quot;Chase Paymentech Solutions Merchant Descriptors\&quot; and \&quot;FDC Compass Merchant Descriptors\&quot; in the [Merchant Descriptors Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### CyberSource through VisaNet When you do not include this field in a request for a Crediario installment payment, CyberSource sends a value of 0 to the processor.  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 38-40 - Field: Installment Payment Number  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. 
   * maximum: 99
   * @return sequence
  **/
  @ApiModelProperty(value = "Installment number when making payments in installments. Used along with `totalCount` to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as `sequence` = 2 and `totalCount` = 5.  For details, see \"Installment Payments\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors. For details, see \"Chase Paymentech Solutions Merchant Descriptors\" and \"FDC Compass Merchant Descriptors\" in the [Merchant Descriptors Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### CyberSource through VisaNet When you do not include this field in a request for a Crediario installment payment, CyberSource sends a value of 0 to the processor.  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 38-40 - Field: Installment Payment Number  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. ")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsInstallmentInformation ptsv2billingagreementsInstallmentInformation = (Ptsv2billingagreementsInstallmentInformation) o;
    return Objects.equals(this.alertPreference, ptsv2billingagreementsInstallmentInformation.alertPreference) &&
        Objects.equals(this.firstInstallmentDate, ptsv2billingagreementsInstallmentInformation.firstInstallmentDate) &&
        Objects.equals(this.identifier, ptsv2billingagreementsInstallmentInformation.identifier) &&
        Objects.equals(this.lastInstallmentDate, ptsv2billingagreementsInstallmentInformation.lastInstallmentDate) &&
        Objects.equals(this.maxAmount, ptsv2billingagreementsInstallmentInformation.maxAmount) &&
        Objects.equals(this.minAmount, ptsv2billingagreementsInstallmentInformation.minAmount) &&
        Objects.equals(this.paymentType, ptsv2billingagreementsInstallmentInformation.paymentType) &&
        Objects.equals(this.preferredDay, ptsv2billingagreementsInstallmentInformation.preferredDay) &&
        Objects.equals(this.sequence, ptsv2billingagreementsInstallmentInformation.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertPreference, firstInstallmentDate, identifier, lastInstallmentDate, maxAmount, minAmount, paymentType, preferredDay, sequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsInstallmentInformation {\n");
    
    sb.append("    alertPreference: ").append(toIndentedString(alertPreference)).append("\n");
    sb.append("    firstInstallmentDate: ").append(toIndentedString(firstInstallmentDate)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    lastInstallmentDate: ").append(toIndentedString(lastInstallmentDate)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    preferredDay: ").append(toIndentedString(preferredDay)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

