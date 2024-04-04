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
 * PtsV2PaymentsPost201ResponseOrderInformationAmountDetails
 */

public class PtsV2PaymentsPost201ResponseOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("authorizedAmount")
  private String authorizedAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("processorTransactionFee")
  private String processorTransactionFee = null;

  @SerializedName("exchangeRate")
  private String exchangeRate = null;

  @SerializedName("foreignCurrency")
  private String foreignCurrency = null;

  @SerializedName("foreignAmount")
  private String foreignAmount = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Amount you requested for the payment or capture.  This value is returned for partial authorizations. This field is also returned on incremental authorizations will contain the aggregated amount from the original authorizations and all the incremental authorizations. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Amount you requested for the payment or capture.  This value is returned for partial authorizations. This field is also returned on incremental authorizations will contain the aggregated amount from the original authorizations and all the incremental authorizations. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails authorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
    return this;
  }

   /**
   * Amount that was authorized.  Returned by authorization service.  #### PIN debit Amount of the purchase.  Returned by PIN debit purchase.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in Merchant Descriptors Using the SCMP API. 
   * @return authorizedAmount
  **/
  @ApiModelProperty(value = "Amount that was authorized.  Returned by authorization service.  #### PIN debit Amount of the purchase.  Returned by PIN debit purchase.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in Merchant Descriptors Using the SCMP API. ")
  public String getAuthorizedAmount() {
    return authorizedAmount;
  }

  public void setAuthorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails currency(String currency) {
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

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails processorTransactionFee(String processorTransactionFee) {
    this.processorTransactionFee = processorTransactionFee;
    return this;
  }

   /**
   * Amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code. 
   * @return processorTransactionFee
  **/
  @ApiModelProperty(value = "Amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code. ")
  public String getProcessorTransactionFee() {
    return processorTransactionFee;
  }

  public void setProcessorTransactionFee(String processorTransactionFee) {
    this.processorTransactionFee = processorTransactionFee;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The rate of conversion of the currency given in the request to CNY. The conversion happens at the time when Alipay&#39;s trade order is created 
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "The rate of conversion of the currency given in the request to CNY. The conversion happens at the time when Alipay's trade order is created ")
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails foreignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * Currency code for the transaction performed in cross border currency. 
   * @return foreignCurrency
  **/
  @ApiModelProperty(value = "Currency code for the transaction performed in cross border currency. ")
  public String getForeignCurrency() {
    return foreignCurrency;
  }

  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails foreignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
    return this;
  }

   /**
   * The transaction amount in CNY. 
   * @return foreignAmount
  **/
  @ApiModelProperty(value = "The transaction amount in CNY. ")
  public String getForeignAmount() {
    return foreignAmount;
  }

  public void setForeignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * If coupons/vouchers are used in the transaction, the discount amount redeemed in the settlement currency will be returned. Otherwise, no return. 
   * @return discountAmount
  **/
  @ApiModelProperty(value = "If coupons/vouchers are used in the transaction, the discount amount redeemed in the settlement currency will be returned. Otherwise, no return. ")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseOrderInformationAmountDetails ptsV2PaymentsPost201ResponseOrderInformationAmountDetails = (PtsV2PaymentsPost201ResponseOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.authorizedAmount, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.authorizedAmount) &&
        Objects.equals(this.currency, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.currency) &&
        Objects.equals(this.processorTransactionFee, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.processorTransactionFee) &&
        Objects.equals(this.exchangeRate, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.exchangeRate) &&
        Objects.equals(this.foreignCurrency, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.foreignCurrency) &&
        Objects.equals(this.foreignAmount, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.foreignAmount) &&
        Objects.equals(this.discountAmount, ptsV2PaymentsPost201ResponseOrderInformationAmountDetails.discountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, authorizedAmount, currency, processorTransactionFee, exchangeRate, foreignCurrency, foreignAmount, discountAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    authorizedAmount: ").append(toIndentedString(authorizedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    processorTransactionFee: ").append(toIndentedString(processorTransactionFee)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
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

