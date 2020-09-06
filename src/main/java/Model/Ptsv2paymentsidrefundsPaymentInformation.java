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
import Model.Ptsv2paymentsPaymentInformationBank;
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Ptsv2paymentsPaymentInformationFluidData;
import Model.Ptsv2paymentsPaymentInformationInstrumentIdentifier;
import Model.Ptsv2paymentsPaymentInformationLegacyToken;
import Model.Ptsv2paymentsPaymentInformationPaymentInstrument;
import Model.Ptsv2paymentsPaymentInformationPaymentType;
import Model.Ptsv2paymentsPaymentInformationShippingAddress;
import Model.Ptsv2paymentsPaymentInformationTokenizedCard;
import Model.Ptsv2paymentsidrefundsPaymentInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidrefundsPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Ptsv2paymentsidrefundsPaymentInformation {
  @SerializedName("card")
  private Ptsv2paymentsidrefundsPaymentInformationCard card = null;

  @SerializedName("bank")
  private Ptsv2paymentsPaymentInformationBank bank = null;

  @SerializedName("tokenizedCard")
  private Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Ptsv2paymentsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("instrumentIdentifier")
  private Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("shippingAddress")
  private Ptsv2paymentsPaymentInformationShippingAddress shippingAddress = null;

  @SerializedName("legacyToken")
  private Ptsv2paymentsPaymentInformationLegacyToken legacyToken = null;

  @SerializedName("paymentType")
  private Ptsv2paymentsPaymentInformationPaymentType paymentType = null;

  public Ptsv2paymentsidrefundsPaymentInformation card(Ptsv2paymentsidrefundsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Ptsv2paymentsidrefundsPaymentInformationCard card) {
    this.card = card;
  }

  public Ptsv2paymentsidrefundsPaymentInformation bank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
  }

  public Ptsv2paymentsidrefundsPaymentInformation tokenizedCard(Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Ptsv2paymentsidrefundsPaymentInformation fluidData(Ptsv2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(Ptsv2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }

  public Ptsv2paymentsidrefundsPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
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

  public Ptsv2paymentsidrefundsPaymentInformation paymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
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

  public Ptsv2paymentsidrefundsPaymentInformation instrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }

  public Ptsv2paymentsidrefundsPaymentInformation shippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
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

  public Ptsv2paymentsidrefundsPaymentInformation legacyToken(Ptsv2paymentsPaymentInformationLegacyToken legacyToken) {
    this.legacyToken = legacyToken;
    return this;
  }

   /**
   * Get legacyToken
   * @return legacyToken
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationLegacyToken getLegacyToken() {
    return legacyToken;
  }

  public void setLegacyToken(Ptsv2paymentsPaymentInformationLegacyToken legacyToken) {
    this.legacyToken = legacyToken;
  }

  public Ptsv2paymentsidrefundsPaymentInformation paymentType(Ptsv2paymentsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Ptsv2paymentsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsPaymentInformation ptsv2paymentsidrefundsPaymentInformation = (Ptsv2paymentsidrefundsPaymentInformation) o;
    return Objects.equals(this.card, ptsv2paymentsidrefundsPaymentInformation.card) &&
        Objects.equals(this.bank, ptsv2paymentsidrefundsPaymentInformation.bank) &&
        Objects.equals(this.tokenizedCard, ptsv2paymentsidrefundsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, ptsv2paymentsidrefundsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, ptsv2paymentsidrefundsPaymentInformation.customer) &&
        Objects.equals(this.paymentInstrument, ptsv2paymentsidrefundsPaymentInformation.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifier, ptsv2paymentsidrefundsPaymentInformation.instrumentIdentifier) &&
        Objects.equals(this.shippingAddress, ptsv2paymentsidrefundsPaymentInformation.shippingAddress) &&
        Objects.equals(this.legacyToken, ptsv2paymentsidrefundsPaymentInformation.legacyToken) &&
        Objects.equals(this.paymentType, ptsv2paymentsidrefundsPaymentInformation.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bank, tokenizedCard, fluidData, customer, paymentInstrument, instrumentIdentifier, shippingAddress, legacyToken, paymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    legacyToken: ").append(toIndentedString(legacyToken)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

