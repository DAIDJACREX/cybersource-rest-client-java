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
import Model.PaymentsProductsCardPresentConnect;
import Model.PaymentsProductsCardProcessing;
import Model.PaymentsProductsCurrencyConversion;
import Model.PaymentsProductsCybsReadyTerminal;
import Model.PaymentsProductsDifferentialFee;
import Model.PaymentsProductsDigitalPayments;
import Model.PaymentsProductsECheck;
import Model.PaymentsProductsPayerAuthentication;
import Model.PaymentsProductsPayouts;
import Model.PaymentsProductsSecureAcceptance;
import Model.PaymentsProductsServiceFee;
import Model.PaymentsProductsTax;
import Model.PaymentsProductsVirtualTerminal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProducts
 */

public class PaymentsProducts {
  @SerializedName("cardProcessing")
  private PaymentsProductsCardProcessing cardProcessing = null;

  @SerializedName("cardPresentConnect")
  private PaymentsProductsCardPresentConnect cardPresentConnect = null;

  @SerializedName("cybsReadyTerminal")
  private PaymentsProductsCybsReadyTerminal cybsReadyTerminal = null;

  @SerializedName("eCheck")
  private PaymentsProductsECheck eCheck = null;

  @SerializedName("payerAuthentication")
  private PaymentsProductsPayerAuthentication payerAuthentication = null;

  @SerializedName("digitalPayments")
  private PaymentsProductsDigitalPayments digitalPayments = null;

  @SerializedName("secureAcceptance")
  private PaymentsProductsSecureAcceptance secureAcceptance = null;

  @SerializedName("virtualTerminal")
  private PaymentsProductsVirtualTerminal virtualTerminal = null;

  @SerializedName("currencyConversion")
  private PaymentsProductsCurrencyConversion currencyConversion = null;

  @SerializedName("tax")
  private PaymentsProductsTax tax = null;

  @SerializedName("customerInvoicing")
  private PaymentsProductsTax customerInvoicing = null;

  @SerializedName("recurringBilling")
  private PaymentsProductsTax recurringBilling = null;

  @SerializedName("paymentOrchestration")
  private PaymentsProductsTax paymentOrchestration = null;

  @SerializedName("payouts")
  private PaymentsProductsPayouts payouts = null;

  @SerializedName("differentialFee")
  private PaymentsProductsDifferentialFee differentialFee = null;

  @SerializedName("payByLink")
  private PaymentsProductsTax payByLink = null;

  @SerializedName("unifiedCheckout")
  private PaymentsProductsTax unifiedCheckout = null;

  @SerializedName("receivablesManager")
  private PaymentsProductsTax receivablesManager = null;

  @SerializedName("serviceFee")
  private PaymentsProductsServiceFee serviceFee = null;

  public PaymentsProducts cardProcessing(PaymentsProductsCardProcessing cardProcessing) {
    this.cardProcessing = cardProcessing;
    return this;
  }

   /**
   * Get cardProcessing
   * @return cardProcessing
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCardProcessing getCardProcessing() {
    return cardProcessing;
  }

  public void setCardProcessing(PaymentsProductsCardProcessing cardProcessing) {
    this.cardProcessing = cardProcessing;
  }

  public PaymentsProducts cardPresentConnect(PaymentsProductsCardPresentConnect cardPresentConnect) {
    this.cardPresentConnect = cardPresentConnect;
    return this;
  }

   /**
   * Get cardPresentConnect
   * @return cardPresentConnect
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCardPresentConnect getCardPresentConnect() {
    return cardPresentConnect;
  }

  public void setCardPresentConnect(PaymentsProductsCardPresentConnect cardPresentConnect) {
    this.cardPresentConnect = cardPresentConnect;
  }

  public PaymentsProducts cybsReadyTerminal(PaymentsProductsCybsReadyTerminal cybsReadyTerminal) {
    this.cybsReadyTerminal = cybsReadyTerminal;
    return this;
  }

   /**
   * Get cybsReadyTerminal
   * @return cybsReadyTerminal
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCybsReadyTerminal getCybsReadyTerminal() {
    return cybsReadyTerminal;
  }

  public void setCybsReadyTerminal(PaymentsProductsCybsReadyTerminal cybsReadyTerminal) {
    this.cybsReadyTerminal = cybsReadyTerminal;
  }

  public PaymentsProducts eCheck(PaymentsProductsECheck eCheck) {
    this.eCheck = eCheck;
    return this;
  }

   /**
   * Get eCheck
   * @return eCheck
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsECheck getECheck() {
    return eCheck;
  }

  public void setECheck(PaymentsProductsECheck eCheck) {
    this.eCheck = eCheck;
  }

  public PaymentsProducts payerAuthentication(PaymentsProductsPayerAuthentication payerAuthentication) {
    this.payerAuthentication = payerAuthentication;
    return this;
  }

   /**
   * Get payerAuthentication
   * @return payerAuthentication
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayerAuthentication getPayerAuthentication() {
    return payerAuthentication;
  }

  public void setPayerAuthentication(PaymentsProductsPayerAuthentication payerAuthentication) {
    this.payerAuthentication = payerAuthentication;
  }

  public PaymentsProducts digitalPayments(PaymentsProductsDigitalPayments digitalPayments) {
    this.digitalPayments = digitalPayments;
    return this;
  }

   /**
   * Get digitalPayments
   * @return digitalPayments
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsDigitalPayments getDigitalPayments() {
    return digitalPayments;
  }

  public void setDigitalPayments(PaymentsProductsDigitalPayments digitalPayments) {
    this.digitalPayments = digitalPayments;
  }

  public PaymentsProducts secureAcceptance(PaymentsProductsSecureAcceptance secureAcceptance) {
    this.secureAcceptance = secureAcceptance;
    return this;
  }

   /**
   * Get secureAcceptance
   * @return secureAcceptance
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptance getSecureAcceptance() {
    return secureAcceptance;
  }

  public void setSecureAcceptance(PaymentsProductsSecureAcceptance secureAcceptance) {
    this.secureAcceptance = secureAcceptance;
  }

  public PaymentsProducts virtualTerminal(PaymentsProductsVirtualTerminal virtualTerminal) {
    this.virtualTerminal = virtualTerminal;
    return this;
  }

   /**
   * Get virtualTerminal
   * @return virtualTerminal
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsVirtualTerminal getVirtualTerminal() {
    return virtualTerminal;
  }

  public void setVirtualTerminal(PaymentsProductsVirtualTerminal virtualTerminal) {
    this.virtualTerminal = virtualTerminal;
  }

  public PaymentsProducts currencyConversion(PaymentsProductsCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsCurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(PaymentsProductsCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public PaymentsProducts tax(PaymentsProductsTax tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getTax() {
    return tax;
  }

  public void setTax(PaymentsProductsTax tax) {
    this.tax = tax;
  }

  public PaymentsProducts customerInvoicing(PaymentsProductsTax customerInvoicing) {
    this.customerInvoicing = customerInvoicing;
    return this;
  }

   /**
   * Get customerInvoicing
   * @return customerInvoicing
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getCustomerInvoicing() {
    return customerInvoicing;
  }

  public void setCustomerInvoicing(PaymentsProductsTax customerInvoicing) {
    this.customerInvoicing = customerInvoicing;
  }

  public PaymentsProducts recurringBilling(PaymentsProductsTax recurringBilling) {
    this.recurringBilling = recurringBilling;
    return this;
  }

   /**
   * Get recurringBilling
   * @return recurringBilling
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getRecurringBilling() {
    return recurringBilling;
  }

  public void setRecurringBilling(PaymentsProductsTax recurringBilling) {
    this.recurringBilling = recurringBilling;
  }

  public PaymentsProducts paymentOrchestration(PaymentsProductsTax paymentOrchestration) {
    this.paymentOrchestration = paymentOrchestration;
    return this;
  }

   /**
   * Get paymentOrchestration
   * @return paymentOrchestration
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getPaymentOrchestration() {
    return paymentOrchestration;
  }

  public void setPaymentOrchestration(PaymentsProductsTax paymentOrchestration) {
    this.paymentOrchestration = paymentOrchestration;
  }

  public PaymentsProducts payouts(PaymentsProductsPayouts payouts) {
    this.payouts = payouts;
    return this;
  }

   /**
   * Get payouts
   * @return payouts
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsPayouts getPayouts() {
    return payouts;
  }

  public void setPayouts(PaymentsProductsPayouts payouts) {
    this.payouts = payouts;
  }

  public PaymentsProducts differentialFee(PaymentsProductsDifferentialFee differentialFee) {
    this.differentialFee = differentialFee;
    return this;
  }

   /**
   * Get differentialFee
   * @return differentialFee
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsDifferentialFee getDifferentialFee() {
    return differentialFee;
  }

  public void setDifferentialFee(PaymentsProductsDifferentialFee differentialFee) {
    this.differentialFee = differentialFee;
  }

  public PaymentsProducts payByLink(PaymentsProductsTax payByLink) {
    this.payByLink = payByLink;
    return this;
  }

   /**
   * Get payByLink
   * @return payByLink
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getPayByLink() {
    return payByLink;
  }

  public void setPayByLink(PaymentsProductsTax payByLink) {
    this.payByLink = payByLink;
  }

  public PaymentsProducts unifiedCheckout(PaymentsProductsTax unifiedCheckout) {
    this.unifiedCheckout = unifiedCheckout;
    return this;
  }

   /**
   * Get unifiedCheckout
   * @return unifiedCheckout
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getUnifiedCheckout() {
    return unifiedCheckout;
  }

  public void setUnifiedCheckout(PaymentsProductsTax unifiedCheckout) {
    this.unifiedCheckout = unifiedCheckout;
  }

  public PaymentsProducts receivablesManager(PaymentsProductsTax receivablesManager) {
    this.receivablesManager = receivablesManager;
    return this;
  }

   /**
   * Get receivablesManager
   * @return receivablesManager
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsTax getReceivablesManager() {
    return receivablesManager;
  }

  public void setReceivablesManager(PaymentsProductsTax receivablesManager) {
    this.receivablesManager = receivablesManager;
  }

  public PaymentsProducts serviceFee(PaymentsProductsServiceFee serviceFee) {
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * Get serviceFee
   * @return serviceFee
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsServiceFee getServiceFee() {
    return serviceFee;
  }

  public void setServiceFee(PaymentsProductsServiceFee serviceFee) {
    this.serviceFee = serviceFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProducts paymentsProducts = (PaymentsProducts) o;
    return Objects.equals(this.cardProcessing, paymentsProducts.cardProcessing) &&
        Objects.equals(this.cardPresentConnect, paymentsProducts.cardPresentConnect) &&
        Objects.equals(this.cybsReadyTerminal, paymentsProducts.cybsReadyTerminal) &&
        Objects.equals(this.eCheck, paymentsProducts.eCheck) &&
        Objects.equals(this.payerAuthentication, paymentsProducts.payerAuthentication) &&
        Objects.equals(this.digitalPayments, paymentsProducts.digitalPayments) &&
        Objects.equals(this.secureAcceptance, paymentsProducts.secureAcceptance) &&
        Objects.equals(this.virtualTerminal, paymentsProducts.virtualTerminal) &&
        Objects.equals(this.currencyConversion, paymentsProducts.currencyConversion) &&
        Objects.equals(this.tax, paymentsProducts.tax) &&
        Objects.equals(this.customerInvoicing, paymentsProducts.customerInvoicing) &&
        Objects.equals(this.recurringBilling, paymentsProducts.recurringBilling) &&
        Objects.equals(this.paymentOrchestration, paymentsProducts.paymentOrchestration) &&
        Objects.equals(this.payouts, paymentsProducts.payouts) &&
        Objects.equals(this.differentialFee, paymentsProducts.differentialFee) &&
        Objects.equals(this.payByLink, paymentsProducts.payByLink) &&
        Objects.equals(this.unifiedCheckout, paymentsProducts.unifiedCheckout) &&
        Objects.equals(this.receivablesManager, paymentsProducts.receivablesManager) &&
        Objects.equals(this.serviceFee, paymentsProducts.serviceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardProcessing, cardPresentConnect, cybsReadyTerminal, eCheck, payerAuthentication, digitalPayments, secureAcceptance, virtualTerminal, currencyConversion, tax, customerInvoicing, recurringBilling, paymentOrchestration, payouts, differentialFee, payByLink, unifiedCheckout, receivablesManager, serviceFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProducts {\n");
    
    sb.append("    cardProcessing: ").append(toIndentedString(cardProcessing)).append("\n");
    sb.append("    cardPresentConnect: ").append(toIndentedString(cardPresentConnect)).append("\n");
    sb.append("    cybsReadyTerminal: ").append(toIndentedString(cybsReadyTerminal)).append("\n");
    sb.append("    eCheck: ").append(toIndentedString(eCheck)).append("\n");
    sb.append("    payerAuthentication: ").append(toIndentedString(payerAuthentication)).append("\n");
    sb.append("    digitalPayments: ").append(toIndentedString(digitalPayments)).append("\n");
    sb.append("    secureAcceptance: ").append(toIndentedString(secureAcceptance)).append("\n");
    sb.append("    virtualTerminal: ").append(toIndentedString(virtualTerminal)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    customerInvoicing: ").append(toIndentedString(customerInvoicing)).append("\n");
    sb.append("    recurringBilling: ").append(toIndentedString(recurringBilling)).append("\n");
    sb.append("    paymentOrchestration: ").append(toIndentedString(paymentOrchestration)).append("\n");
    sb.append("    payouts: ").append(toIndentedString(payouts)).append("\n");
    sb.append("    differentialFee: ").append(toIndentedString(differentialFee)).append("\n");
    sb.append("    payByLink: ").append(toIndentedString(payByLink)).append("\n");
    sb.append("    unifiedCheckout: ").append(toIndentedString(unifiedCheckout)).append("\n");
    sb.append("    receivablesManager: ").append(toIndentedString(receivablesManager)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
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

