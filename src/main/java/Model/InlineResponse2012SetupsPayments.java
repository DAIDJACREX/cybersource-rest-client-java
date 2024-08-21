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
import Model.InlineResponse2012SetupsPaymentsCardProcessing;
import Model.InlineResponse2012SetupsPaymentsDigitalPayments;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2012SetupsPayments
 */

public class InlineResponse2012SetupsPayments {
  @SerializedName("cardProcessing")
  private InlineResponse2012SetupsPaymentsCardProcessing cardProcessing = null;

  @SerializedName("cardPresentConnect")
  private InlineResponse2012SetupsPaymentsCardProcessing cardPresentConnect = null;

  @SerializedName("eCheck")
  private InlineResponse2012SetupsPaymentsCardProcessing eCheck = null;

  @SerializedName("payerAuthentication")
  private InlineResponse2012SetupsPaymentsCardProcessing payerAuthentication = null;

  @SerializedName("digitalPayments")
  private InlineResponse2012SetupsPaymentsDigitalPayments digitalPayments = null;

  @SerializedName("secureAcceptance")
  private InlineResponse2012SetupsPaymentsCardProcessing secureAcceptance = null;

  @SerializedName("virtualTerminal")
  private InlineResponse2012SetupsPaymentsCardProcessing virtualTerminal = null;

  @SerializedName("currencyConversion")
  private InlineResponse2012SetupsPaymentsCardProcessing currencyConversion = null;

  @SerializedName("tax")
  private InlineResponse2012SetupsPaymentsDigitalPayments tax = null;

  @SerializedName("customerInvoicing")
  private InlineResponse2012SetupsPaymentsDigitalPayments customerInvoicing = null;

  @SerializedName("recurringBilling")
  private InlineResponse2012SetupsPaymentsCardProcessing recurringBilling = null;

  @SerializedName("cybsReadyTerminal")
  private InlineResponse2012SetupsPaymentsCardProcessing cybsReadyTerminal = null;

  @SerializedName("paymentOrchestration")
  private InlineResponse2012SetupsPaymentsDigitalPayments paymentOrchestration = null;

  @SerializedName("payouts")
  private InlineResponse2012SetupsPaymentsCardProcessing payouts = null;

  @SerializedName("payByLink")
  private InlineResponse2012SetupsPaymentsDigitalPayments payByLink = null;

  @SerializedName("unifiedCheckout")
  private InlineResponse2012SetupsPaymentsDigitalPayments unifiedCheckout = null;

  @SerializedName("receivablesManager")
  private InlineResponse2012SetupsPaymentsDigitalPayments receivablesManager = null;

  @SerializedName("serviceFee")
  private InlineResponse2012SetupsPaymentsCardProcessing serviceFee = null;

  public InlineResponse2012SetupsPayments cardProcessing(InlineResponse2012SetupsPaymentsCardProcessing cardProcessing) {
    this.cardProcessing = cardProcessing;
    return this;
  }

   /**
   * Get cardProcessing
   * @return cardProcessing
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getCardProcessing() {
    return cardProcessing;
  }

  public void setCardProcessing(InlineResponse2012SetupsPaymentsCardProcessing cardProcessing) {
    this.cardProcessing = cardProcessing;
  }

  public InlineResponse2012SetupsPayments cardPresentConnect(InlineResponse2012SetupsPaymentsCardProcessing cardPresentConnect) {
    this.cardPresentConnect = cardPresentConnect;
    return this;
  }

   /**
   * Get cardPresentConnect
   * @return cardPresentConnect
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getCardPresentConnect() {
    return cardPresentConnect;
  }

  public void setCardPresentConnect(InlineResponse2012SetupsPaymentsCardProcessing cardPresentConnect) {
    this.cardPresentConnect = cardPresentConnect;
  }

  public InlineResponse2012SetupsPayments eCheck(InlineResponse2012SetupsPaymentsCardProcessing eCheck) {
    this.eCheck = eCheck;
    return this;
  }

   /**
   * Get eCheck
   * @return eCheck
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getECheck() {
    return eCheck;
  }

  public void setECheck(InlineResponse2012SetupsPaymentsCardProcessing eCheck) {
    this.eCheck = eCheck;
  }

  public InlineResponse2012SetupsPayments payerAuthentication(InlineResponse2012SetupsPaymentsCardProcessing payerAuthentication) {
    this.payerAuthentication = payerAuthentication;
    return this;
  }

   /**
   * Get payerAuthentication
   * @return payerAuthentication
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getPayerAuthentication() {
    return payerAuthentication;
  }

  public void setPayerAuthentication(InlineResponse2012SetupsPaymentsCardProcessing payerAuthentication) {
    this.payerAuthentication = payerAuthentication;
  }

  public InlineResponse2012SetupsPayments digitalPayments(InlineResponse2012SetupsPaymentsDigitalPayments digitalPayments) {
    this.digitalPayments = digitalPayments;
    return this;
  }

   /**
   * Get digitalPayments
   * @return digitalPayments
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getDigitalPayments() {
    return digitalPayments;
  }

  public void setDigitalPayments(InlineResponse2012SetupsPaymentsDigitalPayments digitalPayments) {
    this.digitalPayments = digitalPayments;
  }

  public InlineResponse2012SetupsPayments secureAcceptance(InlineResponse2012SetupsPaymentsCardProcessing secureAcceptance) {
    this.secureAcceptance = secureAcceptance;
    return this;
  }

   /**
   * Get secureAcceptance
   * @return secureAcceptance
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getSecureAcceptance() {
    return secureAcceptance;
  }

  public void setSecureAcceptance(InlineResponse2012SetupsPaymentsCardProcessing secureAcceptance) {
    this.secureAcceptance = secureAcceptance;
  }

  public InlineResponse2012SetupsPayments virtualTerminal(InlineResponse2012SetupsPaymentsCardProcessing virtualTerminal) {
    this.virtualTerminal = virtualTerminal;
    return this;
  }

   /**
   * Get virtualTerminal
   * @return virtualTerminal
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getVirtualTerminal() {
    return virtualTerminal;
  }

  public void setVirtualTerminal(InlineResponse2012SetupsPaymentsCardProcessing virtualTerminal) {
    this.virtualTerminal = virtualTerminal;
  }

  public InlineResponse2012SetupsPayments currencyConversion(InlineResponse2012SetupsPaymentsCardProcessing currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(InlineResponse2012SetupsPaymentsCardProcessing currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public InlineResponse2012SetupsPayments tax(InlineResponse2012SetupsPaymentsDigitalPayments tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getTax() {
    return tax;
  }

  public void setTax(InlineResponse2012SetupsPaymentsDigitalPayments tax) {
    this.tax = tax;
  }

  public InlineResponse2012SetupsPayments customerInvoicing(InlineResponse2012SetupsPaymentsDigitalPayments customerInvoicing) {
    this.customerInvoicing = customerInvoicing;
    return this;
  }

   /**
   * Get customerInvoicing
   * @return customerInvoicing
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getCustomerInvoicing() {
    return customerInvoicing;
  }

  public void setCustomerInvoicing(InlineResponse2012SetupsPaymentsDigitalPayments customerInvoicing) {
    this.customerInvoicing = customerInvoicing;
  }

  public InlineResponse2012SetupsPayments recurringBilling(InlineResponse2012SetupsPaymentsCardProcessing recurringBilling) {
    this.recurringBilling = recurringBilling;
    return this;
  }

   /**
   * Get recurringBilling
   * @return recurringBilling
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getRecurringBilling() {
    return recurringBilling;
  }

  public void setRecurringBilling(InlineResponse2012SetupsPaymentsCardProcessing recurringBilling) {
    this.recurringBilling = recurringBilling;
  }

  public InlineResponse2012SetupsPayments cybsReadyTerminal(InlineResponse2012SetupsPaymentsCardProcessing cybsReadyTerminal) {
    this.cybsReadyTerminal = cybsReadyTerminal;
    return this;
  }

   /**
   * Get cybsReadyTerminal
   * @return cybsReadyTerminal
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getCybsReadyTerminal() {
    return cybsReadyTerminal;
  }

  public void setCybsReadyTerminal(InlineResponse2012SetupsPaymentsCardProcessing cybsReadyTerminal) {
    this.cybsReadyTerminal = cybsReadyTerminal;
  }

  public InlineResponse2012SetupsPayments paymentOrchestration(InlineResponse2012SetupsPaymentsDigitalPayments paymentOrchestration) {
    this.paymentOrchestration = paymentOrchestration;
    return this;
  }

   /**
   * Get paymentOrchestration
   * @return paymentOrchestration
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getPaymentOrchestration() {
    return paymentOrchestration;
  }

  public void setPaymentOrchestration(InlineResponse2012SetupsPaymentsDigitalPayments paymentOrchestration) {
    this.paymentOrchestration = paymentOrchestration;
  }

  public InlineResponse2012SetupsPayments payouts(InlineResponse2012SetupsPaymentsCardProcessing payouts) {
    this.payouts = payouts;
    return this;
  }

   /**
   * Get payouts
   * @return payouts
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getPayouts() {
    return payouts;
  }

  public void setPayouts(InlineResponse2012SetupsPaymentsCardProcessing payouts) {
    this.payouts = payouts;
  }

  public InlineResponse2012SetupsPayments payByLink(InlineResponse2012SetupsPaymentsDigitalPayments payByLink) {
    this.payByLink = payByLink;
    return this;
  }

   /**
   * Get payByLink
   * @return payByLink
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getPayByLink() {
    return payByLink;
  }

  public void setPayByLink(InlineResponse2012SetupsPaymentsDigitalPayments payByLink) {
    this.payByLink = payByLink;
  }

  public InlineResponse2012SetupsPayments unifiedCheckout(InlineResponse2012SetupsPaymentsDigitalPayments unifiedCheckout) {
    this.unifiedCheckout = unifiedCheckout;
    return this;
  }

   /**
   * Get unifiedCheckout
   * @return unifiedCheckout
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getUnifiedCheckout() {
    return unifiedCheckout;
  }

  public void setUnifiedCheckout(InlineResponse2012SetupsPaymentsDigitalPayments unifiedCheckout) {
    this.unifiedCheckout = unifiedCheckout;
  }

  public InlineResponse2012SetupsPayments receivablesManager(InlineResponse2012SetupsPaymentsDigitalPayments receivablesManager) {
    this.receivablesManager = receivablesManager;
    return this;
  }

   /**
   * Get receivablesManager
   * @return receivablesManager
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsDigitalPayments getReceivablesManager() {
    return receivablesManager;
  }

  public void setReceivablesManager(InlineResponse2012SetupsPaymentsDigitalPayments receivablesManager) {
    this.receivablesManager = receivablesManager;
  }

  public InlineResponse2012SetupsPayments serviceFee(InlineResponse2012SetupsPaymentsCardProcessing serviceFee) {
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * Get serviceFee
   * @return serviceFee
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessing getServiceFee() {
    return serviceFee;
  }

  public void setServiceFee(InlineResponse2012SetupsPaymentsCardProcessing serviceFee) {
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
    InlineResponse2012SetupsPayments inlineResponse2012SetupsPayments = (InlineResponse2012SetupsPayments) o;
    return Objects.equals(this.cardProcessing, inlineResponse2012SetupsPayments.cardProcessing) &&
        Objects.equals(this.cardPresentConnect, inlineResponse2012SetupsPayments.cardPresentConnect) &&
        Objects.equals(this.eCheck, inlineResponse2012SetupsPayments.eCheck) &&
        Objects.equals(this.payerAuthentication, inlineResponse2012SetupsPayments.payerAuthentication) &&
        Objects.equals(this.digitalPayments, inlineResponse2012SetupsPayments.digitalPayments) &&
        Objects.equals(this.secureAcceptance, inlineResponse2012SetupsPayments.secureAcceptance) &&
        Objects.equals(this.virtualTerminal, inlineResponse2012SetupsPayments.virtualTerminal) &&
        Objects.equals(this.currencyConversion, inlineResponse2012SetupsPayments.currencyConversion) &&
        Objects.equals(this.tax, inlineResponse2012SetupsPayments.tax) &&
        Objects.equals(this.customerInvoicing, inlineResponse2012SetupsPayments.customerInvoicing) &&
        Objects.equals(this.recurringBilling, inlineResponse2012SetupsPayments.recurringBilling) &&
        Objects.equals(this.cybsReadyTerminal, inlineResponse2012SetupsPayments.cybsReadyTerminal) &&
        Objects.equals(this.paymentOrchestration, inlineResponse2012SetupsPayments.paymentOrchestration) &&
        Objects.equals(this.payouts, inlineResponse2012SetupsPayments.payouts) &&
        Objects.equals(this.payByLink, inlineResponse2012SetupsPayments.payByLink) &&
        Objects.equals(this.unifiedCheckout, inlineResponse2012SetupsPayments.unifiedCheckout) &&
        Objects.equals(this.receivablesManager, inlineResponse2012SetupsPayments.receivablesManager) &&
        Objects.equals(this.serviceFee, inlineResponse2012SetupsPayments.serviceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardProcessing, cardPresentConnect, eCheck, payerAuthentication, digitalPayments, secureAcceptance, virtualTerminal, currencyConversion, tax, customerInvoicing, recurringBilling, cybsReadyTerminal, paymentOrchestration, payouts, payByLink, unifiedCheckout, receivablesManager, serviceFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012SetupsPayments {\n");
    
    sb.append("    cardProcessing: ").append(toIndentedString(cardProcessing)).append("\n");
    sb.append("    cardPresentConnect: ").append(toIndentedString(cardPresentConnect)).append("\n");
    sb.append("    eCheck: ").append(toIndentedString(eCheck)).append("\n");
    sb.append("    payerAuthentication: ").append(toIndentedString(payerAuthentication)).append("\n");
    sb.append("    digitalPayments: ").append(toIndentedString(digitalPayments)).append("\n");
    sb.append("    secureAcceptance: ").append(toIndentedString(secureAcceptance)).append("\n");
    sb.append("    virtualTerminal: ").append(toIndentedString(virtualTerminal)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    customerInvoicing: ").append(toIndentedString(customerInvoicing)).append("\n");
    sb.append("    recurringBilling: ").append(toIndentedString(recurringBilling)).append("\n");
    sb.append("    cybsReadyTerminal: ").append(toIndentedString(cybsReadyTerminal)).append("\n");
    sb.append("    paymentOrchestration: ").append(toIndentedString(paymentOrchestration)).append("\n");
    sb.append("    payouts: ").append(toIndentedString(payouts)).append("\n");
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

