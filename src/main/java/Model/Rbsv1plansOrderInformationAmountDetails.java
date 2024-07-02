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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rbsv1plansOrderInformationAmountDetails
 */

public class Rbsv1plansOrderInformationAmountDetails {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("billingAmount")
  private String billingAmount = null;

  @SerializedName("setupFee")
  private String setupFee = null;

  public Rbsv1plansOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency.  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. 
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency.  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Rbsv1plansOrderInformationAmountDetails billingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
    return this;
  }

   /**
   * Billing amount for the billing period. 
   * @return billingAmount
  **/
  @ApiModelProperty(required = true, value = "Billing amount for the billing period. ")
  public String getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
  }

  public Rbsv1plansOrderInformationAmountDetails setupFee(String setupFee) {
    this.setupFee = setupFee;
    return this;
  }

   /**
   * Subscription setup fee 
   * @return setupFee
  **/
  @ApiModelProperty(value = "Subscription setup fee ")
  public String getSetupFee() {
    return setupFee;
  }

  public void setSetupFee(String setupFee) {
    this.setupFee = setupFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rbsv1plansOrderInformationAmountDetails rbsv1plansOrderInformationAmountDetails = (Rbsv1plansOrderInformationAmountDetails) o;
    return Objects.equals(this.currency, rbsv1plansOrderInformationAmountDetails.currency) &&
        Objects.equals(this.billingAmount, rbsv1plansOrderInformationAmountDetails.billingAmount) &&
        Objects.equals(this.setupFee, rbsv1plansOrderInformationAmountDetails.setupFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, billingAmount, setupFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rbsv1plansOrderInformationAmountDetails {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    billingAmount: ").append(toIndentedString(billingAmount)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
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

