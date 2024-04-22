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
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Riskv1authenticationsPaymentInformationCard;
import Model.Riskv1authenticationsPaymentInformationTokenizedCard;
import Model.Riskv1authenticationsetupsPaymentInformationFluidData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationsPaymentInformation
 */

public class Riskv1authenticationsPaymentInformation {
  @SerializedName("card")
  private Riskv1authenticationsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1authenticationsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Riskv1authenticationsetupsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  public Riskv1authenticationsPaymentInformation card(Riskv1authenticationsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1authenticationsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1authenticationsPaymentInformation tokenizedCard(Riskv1authenticationsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1authenticationsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Riskv1authenticationsPaymentInformation fluidData(Riskv1authenticationsetupsPaymentInformationFluidData fluidData) {
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

  public Riskv1authenticationsPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsPaymentInformation riskv1authenticationsPaymentInformation = (Riskv1authenticationsPaymentInformation) o;
    return Objects.equals(this.card, riskv1authenticationsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1authenticationsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, riskv1authenticationsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, riskv1authenticationsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, fluidData, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsPaymentInformation {\n");
    
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

