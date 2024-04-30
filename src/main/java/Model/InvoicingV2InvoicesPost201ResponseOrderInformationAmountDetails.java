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
import Model.Invoicingv2invoicesOrderInformationAmountDetailsFreight;
import Model.Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Contains all of the amount-related fields in the invoice.
 */
@ApiModel(description = "Contains all of the amount-related fields in the invoice.")

public class InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("balanceAmount")
  private String balanceAmount = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("discountPercent")
  private BigDecimal discountPercent = null;

  @SerializedName("subAmount")
  private BigDecimal subAmount = null;

  @SerializedName("minimumPartialAmount")
  private BigDecimal minimumPartialAmount = null;

  @SerializedName("taxDetails")
  private Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails = null;

  @SerializedName("freight")
  private Invoicingv2invoicesOrderInformationAmountDetailsFreight freight = null;

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \&quot;Authorization Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Capture Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Credit Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \&quot;Zero Amount Authorizations,\&quot; \&quot;Credit Information for Specific Processors\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Card Present Required to include either this field or &#x60;orderInformation.lineItems[].unitPrice&#x60; for the order.  #### Invoicing Required for creating a new invoice.  #### PIN Debit Amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount.  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit; however, for all other processors, these fields are required.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see &#x60;grand_total_amount&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \&quot;Authorization Information for Specific Processors\&quot; of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \"Authorization Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Capture Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Credit Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \"Zero Amount Authorizations,\" \"Credit Information for Specific Processors\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Card Present Required to include either this field or `orderInformation.lineItems[].unitPrice` for the order.  #### Invoicing Required for creating a new invoice.  #### PIN Debit Amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount.  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit; however, for all other processors, these fields are required.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see `grand_total_amount` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \"Authorization Information for Specific Processors\" of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Total discount amount applied to the order. 
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Total discount amount applied to the order. ")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails discountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * The total discount percentage applied to the invoice.
   * @return discountPercent
  **/
  @ApiModelProperty(value = "The total discount percentage applied to the invoice.")
  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails subAmount(BigDecimal subAmount) {
    this.subAmount = subAmount;
    return this;
  }

   /**
   * Sub-amount of the invoice.
   * @return subAmount
  **/
  @ApiModelProperty(value = "Sub-amount of the invoice.")
  public BigDecimal getSubAmount() {
    return subAmount;
  }

  public void setSubAmount(BigDecimal subAmount) {
    this.subAmount = subAmount;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails minimumPartialAmount(BigDecimal minimumPartialAmount) {
    this.minimumPartialAmount = minimumPartialAmount;
    return this;
  }

   /**
   * The minimum partial amount required to pay the invoice.
   * @return minimumPartialAmount
  **/
  @ApiModelProperty(value = "The minimum partial amount required to pay the invoice.")
  public BigDecimal getMinimumPartialAmount() {
    return minimumPartialAmount;
  }

  public void setMinimumPartialAmount(BigDecimal minimumPartialAmount) {
    this.minimumPartialAmount = minimumPartialAmount;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails taxDetails(Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails) {
    this.taxDetails = taxDetails;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails freight(Invoicingv2invoicesOrderInformationAmountDetailsFreight freight) {
    this.freight = freight;
    return this;
  }

   /**
   * Get freight
   * @return freight
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesOrderInformationAmountDetailsFreight getFreight() {
    return freight;
  }

  public void setFreight(Invoicingv2invoicesOrderInformationAmountDetailsFreight freight) {
    this.freight = freight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails = (InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.currency) &&
        Objects.equals(this.balanceAmount, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.balanceAmount) &&
        Objects.equals(this.discountAmount, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.discountAmount) &&
        Objects.equals(this.discountPercent, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.discountPercent) &&
        Objects.equals(this.subAmount, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.subAmount) &&
        Objects.equals(this.minimumPartialAmount, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.minimumPartialAmount) &&
        Objects.equals(this.taxDetails, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.taxDetails) &&
        Objects.equals(this.freight, invoicingV2InvoicesPost201ResponseOrderInformationAmountDetails.freight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, balanceAmount, discountAmount, discountPercent, subAmount, minimumPartialAmount, taxDetails, freight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    subAmount: ").append(toIndentedString(subAmount)).append("\n");
    sb.append("    minimumPartialAmount: ").append(toIndentedString(minimumPartialAmount)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
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

