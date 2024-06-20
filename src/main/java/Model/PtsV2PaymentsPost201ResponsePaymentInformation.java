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
import Model.PtsV2PaymentsPost201ResponsePaymentAccountInformationCard;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationBank;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationEWallet;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard;
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Ptsv2paymentsPaymentInformationPaymentInstrument;
import Model.Ptsv2paymentsPaymentInformationShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePaymentInformation
 */

public class PtsV2PaymentsPost201ResponsePaymentInformation {
  @SerializedName("card")
  private PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card = null;

  @SerializedName("tokenizedCard")
  private PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("accountFeatures")
  private PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures = null;

  @SerializedName("bank")
  private PtsV2PaymentsPost201ResponsePaymentInformationBank bank = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("instrumentIdentifier")
  private PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("shippingAddress")
  private Ptsv2paymentsPaymentInformationShippingAddress shippingAddress = null;

  @SerializedName("scheme")
  private String scheme = null;

  @SerializedName("bin")
  private String bin = null;

  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("binCountry")
  private String binCountry = null;

  @SerializedName("eWallet")
  private PtsV2PaymentsPost201ResponsePaymentInformationEWallet eWallet = null;

  public PtsV2PaymentsPost201ResponsePaymentInformation card(PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard getCard() {
    return card;
  }

  public void setCard(PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card) {
    this.card = card;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation tokenizedCard(PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation accountFeatures(PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
    return this;
  }

   /**
   * Get accountFeatures
   * @return accountFeatures
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures getAccountFeatures() {
    return accountFeatures;
  }

  public void setAccountFeatures(PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation bank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation paymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation instrumentIdentifier(PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation shippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Subtype of card account. This field can contain one of the following values: - Maestro International - Maestro UK Domestic - MasterCard Credit - MasterCard Debit - Visa Credit - Visa Debit - Visa Electron  **Note** Additional values may be present. 
   * @return scheme
  **/
  @ApiModelProperty(value = "Subtype of card account. This field can contain one of the following values: - Maestro International - Maestro UK Domestic - MasterCard Credit - MasterCard Debit - Visa Credit - Visa Debit - Visa Electron  **Note** Additional values may be present. ")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Credit card BIN (the first six digits of the credit card).Derived either from the &#x60;cc_bin&#x60; request field or from the first six characters of the &#x60;customer_cc_num&#x60; field. 
   * @return bin
  **/
  @ApiModelProperty(value = "Credit card BIN (the first six digits of the credit card).Derived either from the `cc_bin` request field or from the first six characters of the `customer_cc_num` field. ")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of payment card account. This field can refer to a credit card, debit card, or prepaid card account type. 
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of payment card account. This field can refer to a credit card, debit card, or prepaid card account type. ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Name of the bank or entity that issued the card account. 
   * @return issuer
  **/
  @ApiModelProperty(value = "Name of the bank or entity that issued the card account. ")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation binCountry(String binCountry) {
    this.binCountry = binCountry;
    return this;
  }

   /**
   * Country (two-digit country code) associated with the BIN of the customer&#39;s card used for the payment. Returned if the information is available. Use this field for additional information when reviewing orders. This information is also displayed in the details page of the CyberSource Business Center. 
   * @return binCountry
  **/
  @ApiModelProperty(value = "Country (two-digit country code) associated with the BIN of the customer's card used for the payment. Returned if the information is available. Use this field for additional information when reviewing orders. This information is also displayed in the details page of the CyberSource Business Center. ")
  public String getBinCountry() {
    return binCountry;
  }

  public void setBinCountry(String binCountry) {
    this.binCountry = binCountry;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation eWallet(PtsV2PaymentsPost201ResponsePaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
    return this;
  }

   /**
   * Get eWallet
   * @return eWallet
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationEWallet getEWallet() {
    return eWallet;
  }

  public void setEWallet(PtsV2PaymentsPost201ResponsePaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformation ptsV2PaymentsPost201ResponsePaymentInformation = (PtsV2PaymentsPost201ResponsePaymentInformation) o;
    return Objects.equals(this.card, ptsV2PaymentsPost201ResponsePaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, ptsV2PaymentsPost201ResponsePaymentInformation.tokenizedCard) &&
        Objects.equals(this.accountFeatures, ptsV2PaymentsPost201ResponsePaymentInformation.accountFeatures) &&
        Objects.equals(this.bank, ptsV2PaymentsPost201ResponsePaymentInformation.bank) &&
        Objects.equals(this.customer, ptsV2PaymentsPost201ResponsePaymentInformation.customer) &&
        Objects.equals(this.paymentInstrument, ptsV2PaymentsPost201ResponsePaymentInformation.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifier, ptsV2PaymentsPost201ResponsePaymentInformation.instrumentIdentifier) &&
        Objects.equals(this.shippingAddress, ptsV2PaymentsPost201ResponsePaymentInformation.shippingAddress) &&
        Objects.equals(this.scheme, ptsV2PaymentsPost201ResponsePaymentInformation.scheme) &&
        Objects.equals(this.bin, ptsV2PaymentsPost201ResponsePaymentInformation.bin) &&
        Objects.equals(this.accountType, ptsV2PaymentsPost201ResponsePaymentInformation.accountType) &&
        Objects.equals(this.issuer, ptsV2PaymentsPost201ResponsePaymentInformation.issuer) &&
        Objects.equals(this.binCountry, ptsV2PaymentsPost201ResponsePaymentInformation.binCountry) &&
        Objects.equals(this.eWallet, ptsV2PaymentsPost201ResponsePaymentInformation.eWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, accountFeatures, bank, customer, paymentInstrument, instrumentIdentifier, shippingAddress, scheme, bin, accountType, issuer, binCountry, eWallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    accountFeatures: ").append(toIndentedString(accountFeatures)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    binCountry: ").append(toIndentedString(binCountry)).append("\n");
    sb.append("    eWallet: ").append(toIndentedString(eWallet)).append("\n");
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

