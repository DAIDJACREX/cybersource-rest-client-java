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
import Model.Ptsv2paymentsMerchantInformationMerchantDescriptor;
import Model.Ptsv2paymentsMerchantInformationServiceFeeDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsMerchantInformation
 */

public class Ptsv2paymentsMerchantInformation {
  @SerializedName("merchantDescriptor")
  private Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("salesOrganizationId")
  private String salesOrganizationId = null;

  @SerializedName("categoryCode")
  private Integer categoryCode = null;

  @SerializedName("categoryCodeDomestic")
  private Integer categoryCodeDomestic = null;

  @SerializedName("taxId")
  private String taxId = null;

  @SerializedName("vatRegistrationNumber")
  private String vatRegistrationNumber = null;

  @SerializedName("cardAcceptorReferenceNumber")
  private String cardAcceptorReferenceNumber = null;

  @SerializedName("transactionLocalDateTime")
  private String transactionLocalDateTime = null;

  @SerializedName("serviceFeeDescriptor")
  private Ptsv2paymentsMerchantInformationServiceFeeDescriptor serviceFeeDescriptor = null;

  @SerializedName("cancelUrl")
  private String cancelUrl = null;

  @SerializedName("successUrl")
  private String successUrl = null;

  @SerializedName("failureUrl")
  private String failureUrl = null;

  @SerializedName("returnUrl")
  private String returnUrl = null;

  @SerializedName("merchantName")
  private String merchantName = null;

  public Ptsv2paymentsMerchantInformation merchantDescriptor(Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public Ptsv2paymentsMerchantInformation domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * This field will contain either the merchant url or the reverse domain as per the requirement for DSRP Format 3. This might vary transaction to transaction and might not be static. Merchant needs to have access to send this value for all DSRP program. 
   * @return domainName
  **/
  @ApiModelProperty(value = "This field will contain either the merchant url or the reverse domain as per the requirement for DSRP Format 3. This might vary transaction to transaction and might not be static. Merchant needs to have access to send this value for all DSRP program. ")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public Ptsv2paymentsMerchantInformation salesOrganizationId(String salesOrganizationId) {
    this.salesOrganizationId = salesOrganizationId;
    return this;
  }

   /**
   * Company ID assigned to an independent sales organization. Get this value from Mastercard.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR6 - Position: 106-116 - Field: Mastercard Independent Sales Organization ID  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies.  For processor-specific information, see the &#x60;sales_organization_ID&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return salesOrganizationId
  **/
  @ApiModelProperty(value = "Company ID assigned to an independent sales organization. Get this value from Mastercard.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR6 - Position: 106-116 - Field: Mastercard Independent Sales Organization ID  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies.  For processor-specific information, see the `sales_organization_ID` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getSalesOrganizationId() {
    return salesOrganizationId;
  }

  public void setSalesOrganizationId(String salesOrganizationId) {
    this.salesOrganizationId = salesOrganizationId;
  }

  public Ptsv2paymentsMerchantInformation categoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the &#x60;merchant_category_code&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code 
   * maximum: 9999
   * @return categoryCode
  **/
  @ApiModelProperty(value = "The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the `merchant_category_code` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code ")
  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Ptsv2paymentsMerchantInformation categoryCodeDomestic(Integer categoryCodeDomestic) {
    this.categoryCodeDomestic = categoryCodeDomestic;
    return this;
  }

   /**
   * Merchant category code for domestic transactions. The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. Including this field in a request for a domestic transaction might reduce interchange fees.  When you include this field in a request: - Do not include the &#x60;merchant_category_code&#x60; field. - The value for this field overrides the value in your CyberSource account.  This field is supported only for: - Domestic transactions with Mastercard in Spain. Domestic means that you and the cardholder are in the same country. - Merchants enrolled in the OmniPay Direct interchange program. - First Data Merchant Solutions (Europe) on OmniPay Direct. 
   * maximum: 9999
   * @return categoryCodeDomestic
  **/
  @ApiModelProperty(value = "Merchant category code for domestic transactions. The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. Including this field in a request for a domestic transaction might reduce interchange fees.  When you include this field in a request: - Do not include the `merchant_category_code` field. - The value for this field overrides the value in your CyberSource account.  This field is supported only for: - Domestic transactions with Mastercard in Spain. Domestic means that you and the cardholder are in the same country. - Merchants enrolled in the OmniPay Direct interchange program. - First Data Merchant Solutions (Europe) on OmniPay Direct. ")
  public Integer getCategoryCodeDomestic() {
    return categoryCodeDomestic;
  }

  public void setCategoryCodeDomestic(Integer categoryCodeDomestic) {
    this.categoryCodeDomestic = categoryCodeDomestic;
  }

  public Ptsv2paymentsMerchantInformation taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Your Cadastro Nacional da Pessoa Jurídica (CNPJ) number.  This field is supported only for BNDES transactions on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR6 - Position: 40-59 - Field: BNDES Reference Field 1  For details, see &#x60;bill_merchant_tax_id&#x60; field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return taxId
  **/
  @ApiModelProperty(value = "Your Cadastro Nacional da Pessoa Jurídica (CNPJ) number.  This field is supported only for BNDES transactions on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR6 - Position: 40-59 - Field: BNDES Reference Field 1  For details, see `bill_merchant_tax_id` field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public Ptsv2paymentsMerchantInformation vatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
    return this;
  }

   /**
   * Your government-assigned tax identification number.  #### Tax Calculation Required field for value added tax only. Not applicable to U.S. and Canadian taxes.  #### CyberSource through VisaNet For CtV processors, the maximum length is 20.  For other processor-specific information, see the &#x60;merchant_vat_registration_number&#x60; field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatRegistrationNumber
  **/
  @ApiModelProperty(value = "Your government-assigned tax identification number.  #### Tax Calculation Required field for value added tax only. Not applicable to U.S. and Canadian taxes.  #### CyberSource through VisaNet For CtV processors, the maximum length is 20.  For other processor-specific information, see the `merchant_vat_registration_number` field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
  }

  public Ptsv2paymentsMerchantInformation cardAcceptorReferenceNumber(String cardAcceptorReferenceNumber) {
    this.cardAcceptorReferenceNumber = cardAcceptorReferenceNumber;
    return this;
  }

   /**
   * Reference number that facilitates card acceptor/corporation communication and record keeping.  For processor-specific information, see the &#x60;card_acceptor_ref_number&#x60; field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return cardAcceptorReferenceNumber
  **/
  @ApiModelProperty(value = "Reference number that facilitates card acceptor/corporation communication and record keeping.  For processor-specific information, see the `card_acceptor_ref_number` field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getCardAcceptorReferenceNumber() {
    return cardAcceptorReferenceNumber;
  }

  public void setCardAcceptorReferenceNumber(String cardAcceptorReferenceNumber) {
    this.cardAcceptorReferenceNumber = cardAcceptorReferenceNumber;
  }

  public Ptsv2paymentsMerchantInformation transactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
    return this;
  }

   /**
   * Date and time at your physical location.  Format: &#x60;YYYYMMDDhhmmss&#x60;, where:  - &#x60;YYYY&#x60; &#x3D; year  - &#x60;MM&#x60; &#x3D; month  - &#x60;DD&#x60; &#x3D; day  - &#x60;hh&#x60; &#x3D; hour  - &#x60;mm&#x60; &#x3D; minutes  - &#x60;ss&#x60; &#x3D; seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. 
   * @return transactionLocalDateTime
  **/
  @ApiModelProperty(value = "Date and time at your physical location.  Format: `YYYYMMDDhhmmss`, where:  - `YYYY` = year  - `MM` = month  - `DD` = day  - `hh` = hour  - `mm` = minutes  - `ss` = seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. ")
  public String getTransactionLocalDateTime() {
    return transactionLocalDateTime;
  }

  public void setTransactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
  }

  public Ptsv2paymentsMerchantInformation serviceFeeDescriptor(Ptsv2paymentsMerchantInformationServiceFeeDescriptor serviceFeeDescriptor) {
    this.serviceFeeDescriptor = serviceFeeDescriptor;
    return this;
  }

   /**
   * Get serviceFeeDescriptor
   * @return serviceFeeDescriptor
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsMerchantInformationServiceFeeDescriptor getServiceFeeDescriptor() {
    return serviceFeeDescriptor;
  }

  public void setServiceFeeDescriptor(Ptsv2paymentsMerchantInformationServiceFeeDescriptor serviceFeeDescriptor) {
    this.serviceFeeDescriptor = serviceFeeDescriptor;
  }

  public Ptsv2paymentsMerchantInformation cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * customer would be redirected to this url based on the decision of the transaction
   * @return cancelUrl
  **/
  @ApiModelProperty(value = "customer would be redirected to this url based on the decision of the transaction")
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public Ptsv2paymentsMerchantInformation successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * customer would be redirected to this url based on the decision of the transaction
   * @return successUrl
  **/
  @ApiModelProperty(value = "customer would be redirected to this url based on the decision of the transaction")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public Ptsv2paymentsMerchantInformation failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

   /**
   * customer would be redirected to this url based on the decision of the transaction
   * @return failureUrl
  **/
  @ApiModelProperty(value = "customer would be redirected to this url based on the decision of the transaction")
  public String getFailureUrl() {
    return failureUrl;
  }

  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }

  public Ptsv2paymentsMerchantInformation returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * URL for displaying payment results to the consumer (notifications) after the transaction is processed. Usually this URL belongs to merchant and its behavior is defined by merchant 
   * @return returnUrl
  **/
  @ApiModelProperty(value = "URL for displaying payment results to the consumer (notifications) after the transaction is processed. Usually this URL belongs to merchant and its behavior is defined by merchant ")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public Ptsv2paymentsMerchantInformation merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Use this field only if you are requesting payment with Payer Authentication service together.  Your company’s name as you want it to appear to the customer in the issuing bank’s authentication form. This value overrides the value specified by your merchant bank. 
   * @return merchantName
  **/
  @ApiModelProperty(value = "Use this field only if you are requesting payment with Payer Authentication service together.  Your company’s name as you want it to appear to the customer in the issuing bank’s authentication form. This value overrides the value specified by your merchant bank. ")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantInformation ptsv2paymentsMerchantInformation = (Ptsv2paymentsMerchantInformation) o;
    return Objects.equals(this.merchantDescriptor, ptsv2paymentsMerchantInformation.merchantDescriptor) &&
        Objects.equals(this.domainName, ptsv2paymentsMerchantInformation.domainName) &&
        Objects.equals(this.salesOrganizationId, ptsv2paymentsMerchantInformation.salesOrganizationId) &&
        Objects.equals(this.categoryCode, ptsv2paymentsMerchantInformation.categoryCode) &&
        Objects.equals(this.categoryCodeDomestic, ptsv2paymentsMerchantInformation.categoryCodeDomestic) &&
        Objects.equals(this.taxId, ptsv2paymentsMerchantInformation.taxId) &&
        Objects.equals(this.vatRegistrationNumber, ptsv2paymentsMerchantInformation.vatRegistrationNumber) &&
        Objects.equals(this.cardAcceptorReferenceNumber, ptsv2paymentsMerchantInformation.cardAcceptorReferenceNumber) &&
        Objects.equals(this.transactionLocalDateTime, ptsv2paymentsMerchantInformation.transactionLocalDateTime) &&
        Objects.equals(this.serviceFeeDescriptor, ptsv2paymentsMerchantInformation.serviceFeeDescriptor) &&
        Objects.equals(this.cancelUrl, ptsv2paymentsMerchantInformation.cancelUrl) &&
        Objects.equals(this.successUrl, ptsv2paymentsMerchantInformation.successUrl) &&
        Objects.equals(this.failureUrl, ptsv2paymentsMerchantInformation.failureUrl) &&
        Objects.equals(this.returnUrl, ptsv2paymentsMerchantInformation.returnUrl) &&
        Objects.equals(this.merchantName, ptsv2paymentsMerchantInformation.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDescriptor, domainName, salesOrganizationId, categoryCode, categoryCodeDomestic, taxId, vatRegistrationNumber, cardAcceptorReferenceNumber, transactionLocalDateTime, serviceFeeDescriptor, cancelUrl, successUrl, failureUrl, returnUrl, merchantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformation {\n");
    
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    salesOrganizationId: ").append(toIndentedString(salesOrganizationId)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    categoryCodeDomestic: ").append(toIndentedString(categoryCodeDomestic)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    vatRegistrationNumber: ").append(toIndentedString(vatRegistrationNumber)).append("\n");
    sb.append("    cardAcceptorReferenceNumber: ").append(toIndentedString(cardAcceptorReferenceNumber)).append("\n");
    sb.append("    transactionLocalDateTime: ").append(toIndentedString(transactionLocalDateTime)).append("\n");
    sb.append("    serviceFeeDescriptor: ").append(toIndentedString(serviceFeeDescriptor)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

