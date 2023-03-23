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
import Model.Riskv1authenticationsetupsPaymentInformationCard;
import Model.Riskv1authenticationsetupsPaymentInformationCustomer;
import Model.Riskv1authenticationsetupsPaymentInformationFluidData;
import Model.Riskv1authenticationsetupsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationsetupsPaymentInformation
 */

public class Riskv1authenticationsetupsPaymentInformation {
  @SerializedName("card")
  private Riskv1authenticationsetupsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1authenticationsetupsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Riskv1authenticationsetupsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private Riskv1authenticationsetupsPaymentInformationCustomer customer = null;

  public Riskv1authenticationsetupsPaymentInformation card(Riskv1authenticationsetupsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1authenticationsetupsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1authenticationsetupsPaymentInformation tokenizedCard(Riskv1authenticationsetupsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1authenticationsetupsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Riskv1authenticationsetupsPaymentInformation fluidData(Riskv1authenticationsetupsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(Riskv1authenticationsetupsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }

  public Riskv1authenticationsetupsPaymentInformation customer(Riskv1authenticationsetupsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Riskv1authenticationsetupsPaymentInformationCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsetupsPaymentInformation riskv1authenticationsetupsPaymentInformation = (Riskv1authenticationsetupsPaymentInformation) o;
    return Objects.equals(this.card, riskv1authenticationsetupsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1authenticationsetupsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, riskv1authenticationsetupsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, riskv1authenticationsetupsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, fluidData, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsetupsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

