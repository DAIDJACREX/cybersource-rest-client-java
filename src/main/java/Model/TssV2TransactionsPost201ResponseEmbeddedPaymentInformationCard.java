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
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("type")
  private String type = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the cardholder’s account number. This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details.  You must contact customer support to have your account enabled to receive these fields in the credit reply message.  #### PIN debit This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  Returned by PIN debit credit and PIN debit purchase.  This field is supported only by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the cardholder’s account number. This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details.  You must contact customer support to have your account enabled to receive these fields in the credit reply message.  #### PIN debit This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  Returned by PIN debit credit and PIN debit purchase.  This field is supported only by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. 
   * @return prefix
  **/
  @ApiModelProperty(value = "Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. ")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value &#x60;001&#x60; for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche[^1] - &#x60;007&#x60;: JCB[^1] - &#x60;014&#x60;: Enroute[^1] - &#x60;021&#x60;: JAL[^1] - &#x60;024&#x60;: Maestro (UK Domestic)[^1] - &#x60;031&#x60;: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;033&#x60;: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;034&#x60;: Dankort[^1] - &#x60;036&#x60;: Cartes Bancaires[^1] - &#x60;037&#x60;: Carta Si[^1] - &#x60;039&#x60;: Encoded account number[^1] - &#x60;040&#x60;: UATP[^1] - &#x60;042&#x60;: Maestro (International)[^1] - &#x60;050&#x60;: Hipercard[^2,3] - &#x60;051&#x60;: Aura - &#x60;054&#x60;: Elo[^3] - &#x60;062&#x60;: China UnionPay  [^1]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value `001` for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche[^1] - `007`: JCB[^1] - `014`: Enroute[^1] - `021`: JAL[^1] - `024`: Maestro (UK Domestic)[^1] - `031`: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use `001` for all Visa card types. - `033`: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use `001` for all Visa card types. - `034`: Dankort[^1] - `036`: Cartes Bancaires[^1] - `037`: Carta Si[^1] - `039`: Encoded account number[^1] - `040`: UATP[^1] - `042`: Maestro (International)[^1] - `050`: Hipercard[^2,3] - `051`: Aura - `054`: Elo[^3] - `062`: China UnionPay  [^1]: For this card type, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard) o;
    return Objects.equals(this.suffix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.prefix) &&
        Objects.equals(this.type, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

