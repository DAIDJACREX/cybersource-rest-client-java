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
import Model.Riskv1liststypeentriesPaymentInformationBank;
import Model.Riskv1liststypeentriesPaymentInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the payment data for updating in List Management.
 */
@ApiModel(description = "Contains the payment data for updating in List Management.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Riskv1liststypeentriesPaymentInformation {
  @SerializedName("card")
  private Riskv1liststypeentriesPaymentInformationCard card = null;

  @SerializedName("bank")
  private Riskv1liststypeentriesPaymentInformationBank bank = null;

  public Riskv1liststypeentriesPaymentInformation card(Riskv1liststypeentriesPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1liststypeentriesPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1liststypeentriesPaymentInformation bank(Riskv1liststypeentriesPaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesPaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(Riskv1liststypeentriesPaymentInformationBank bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesPaymentInformation riskv1liststypeentriesPaymentInformation = (Riskv1liststypeentriesPaymentInformation) o;
    return Objects.equals(this.card, riskv1liststypeentriesPaymentInformation.card) &&
        Objects.equals(this.bank, riskv1liststypeentriesPaymentInformation.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

