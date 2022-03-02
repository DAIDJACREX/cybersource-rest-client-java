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
import Model.Riskv1decisionsPaymentInformationCard;
import Model.Riskv1decisionsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the payment data for this transaction.
 */
@ApiModel(description = "Contains the payment data for this transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Riskv1decisionsPaymentInformation {
  @SerializedName("card")
  private Riskv1decisionsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("bank")
  private Ptsv2paymentsPaymentInformationBank bank = null;

  @SerializedName("method")
  private String method = null;

  public Riskv1decisionsPaymentInformation card(Riskv1decisionsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1decisionsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1decisionsPaymentInformation tokenizedCard(Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Riskv1decisionsPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
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

  public Riskv1decisionsPaymentInformation bank(Ptsv2paymentsPaymentInformationBank bank) {
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

  public Riskv1decisionsPaymentInformation method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Method of payment used for the order. This field can contain one of the following values:   - &#x60;consumer&#x60; (default): Customer credit card   - &#x60;corporate&#x60;: Corporate credit card   - &#x60;debit&#x60;: Debit card, such as a Maestro (UK Domestic) card   - &#x60;cod&#x60;: Collect on delivery   - &#x60;check&#x60;: Electronic check   - &#x60;p2p&#x60;: Person-to-person payment   - &#x60;private1&#x60;: Private label credit card   - &#x60;other&#x60;: Other payment method 
   * @return method
  **/
  @ApiModelProperty(value = "Method of payment used for the order. This field can contain one of the following values:   - `consumer` (default): Customer credit card   - `corporate`: Corporate credit card   - `debit`: Debit card, such as a Maestro (UK Domestic) card   - `cod`: Collect on delivery   - `check`: Electronic check   - `p2p`: Person-to-person payment   - `private1`: Private label credit card   - `other`: Other payment method ")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsPaymentInformation riskv1decisionsPaymentInformation = (Riskv1decisionsPaymentInformation) o;
    return Objects.equals(this.card, riskv1decisionsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1decisionsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.customer, riskv1decisionsPaymentInformation.customer) &&
        Objects.equals(this.bank, riskv1decisionsPaymentInformation.bank) &&
        Objects.equals(this.method, riskv1decisionsPaymentInformation.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, customer, bank, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

