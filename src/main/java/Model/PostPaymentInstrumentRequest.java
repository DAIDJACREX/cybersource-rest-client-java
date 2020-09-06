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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentCard;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostPaymentInstrumentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class PostPaymentInstrumentRequest {
  @SerializedName("_links")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("bankAccount")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount bankAccount = null;

  @SerializedName("card")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentCard card = null;

  @SerializedName("buyerInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation buyerInformation = null;

  @SerializedName("billTo")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo billTo = null;

  @SerializedName("processingInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformation processingInformation = null;

  @SerializedName("merchantInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantInformation = null;

  @SerializedName("instrumentIdentifier")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("metadata")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata metadata = null;

  @SerializedName("_embedded")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded embedded = null;

  public PostPaymentInstrumentRequest links(Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks links) {
    this.links = links;
  }

  public PostPaymentInstrumentRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the Payment Instrument Token.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the Payment Instrument Token.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The type of token.  Valid values: - paymentInstrument 
   * @return object
  **/
  @ApiModelProperty(example = "paymentInstrument", value = "The type of token.  Valid values: - paymentInstrument ")
  public String getObject() {
    return object;
  }

   /**
   * Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

  public PostPaymentInstrumentRequest bankAccount(Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PostPaymentInstrumentRequest card(Tmsv2customersEmbeddedDefaultPaymentInstrumentCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard getCard() {
    return card;
  }

  public void setCard(Tmsv2customersEmbeddedDefaultPaymentInstrumentCard card) {
    this.card = card;
  }

  public PostPaymentInstrumentRequest buyerInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public PostPaymentInstrumentRequest billTo(Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo billTo) {
    this.billTo = billTo;
  }

  public PostPaymentInstrumentRequest processingInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PostPaymentInstrumentRequest merchantInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PostPaymentInstrumentRequest instrumentIdentifier(Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }

  public PostPaymentInstrumentRequest metadata(Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata metadata) {
    this.metadata = metadata;
  }

  public PostPaymentInstrumentRequest embedded(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentInstrumentRequest postPaymentInstrumentRequest = (PostPaymentInstrumentRequest) o;
    return Objects.equals(this.links, postPaymentInstrumentRequest.links) &&
        Objects.equals(this.id, postPaymentInstrumentRequest.id) &&
        Objects.equals(this.object, postPaymentInstrumentRequest.object) &&
        Objects.equals(this.state, postPaymentInstrumentRequest.state) &&
        Objects.equals(this.bankAccount, postPaymentInstrumentRequest.bankAccount) &&
        Objects.equals(this.card, postPaymentInstrumentRequest.card) &&
        Objects.equals(this.buyerInformation, postPaymentInstrumentRequest.buyerInformation) &&
        Objects.equals(this.billTo, postPaymentInstrumentRequest.billTo) &&
        Objects.equals(this.processingInformation, postPaymentInstrumentRequest.processingInformation) &&
        Objects.equals(this.merchantInformation, postPaymentInstrumentRequest.merchantInformation) &&
        Objects.equals(this.instrumentIdentifier, postPaymentInstrumentRequest.instrumentIdentifier) &&
        Objects.equals(this.metadata, postPaymentInstrumentRequest.metadata) &&
        Objects.equals(this.embedded, postPaymentInstrumentRequest.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, state, bankAccount, card, buyerInformation, billTo, processingInformation, merchantInformation, instrumentIdentifier, metadata, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentInstrumentRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

