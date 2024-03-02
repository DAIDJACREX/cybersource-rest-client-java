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
import Model.TmsPaymentInstrumentProcessingInfo;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentCard;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PatchCustomerPaymentInstrumentRequest
 */

public class PatchCustomerPaymentInstrumentRequest {
  @SerializedName("_links")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bankAccount")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount bankAccount = null;

  @SerializedName("card")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentCard card = null;

  @SerializedName("buyerInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation buyerInformation = null;

  @SerializedName("billTo")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo billTo = null;

  @SerializedName("processingInformation")
  private TmsPaymentInstrumentProcessingInfo processingInformation = null;

  @SerializedName("merchantInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantInformation = null;

  @SerializedName("instrumentIdentifier")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("metadata")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata metadata = null;

  @SerializedName("_embedded")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded embedded = null;

  public PatchCustomerPaymentInstrumentRequest links(Tmsv2customersEmbeddedDefaultPaymentInstrumentLinks links) {
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

  public PatchCustomerPaymentInstrumentRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Payment Instrument Token.
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Payment Instrument Token.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The type.  Possible Values: - paymentInstrument 
   * @return object
  **/
  @ApiModelProperty(example = "paymentInstrument", value = "The type.  Possible Values: - paymentInstrument ")
  public String getObject() {
    return object;
  }

  public PatchCustomerPaymentInstrumentRequest _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Flag that indicates whether customer payment instrument is the dafault. Possible Values:  - &#x60;true&#x60;: Payment instrument is customer&#39;s default.  - &#x60;false&#x60;: Payment instrument is not customer&#39;s default. 
   * @return _default
  **/
  @ApiModelProperty(value = "Flag that indicates whether customer payment instrument is the dafault. Possible Values:  - `true`: Payment instrument is customer's default.  - `false`: Payment instrument is not customer's default. ")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

   /**
   * Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

   /**
   * The type of Payment Instrument. Possible Values: - cardHash 
   * @return type
  **/
  @ApiModelProperty(value = "The type of Payment Instrument. Possible Values: - cardHash ")
  public String getType() {
    return type;
  }

  public PatchCustomerPaymentInstrumentRequest bankAccount(Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount bankAccount) {
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

  public PatchCustomerPaymentInstrumentRequest card(Tmsv2customersEmbeddedDefaultPaymentInstrumentCard card) {
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

  public PatchCustomerPaymentInstrumentRequest buyerInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation buyerInformation) {
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

  public PatchCustomerPaymentInstrumentRequest billTo(Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo billTo) {
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

  public PatchCustomerPaymentInstrumentRequest processingInformation(TmsPaymentInstrumentProcessingInfo processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsPaymentInstrumentProcessingInfo getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsPaymentInstrumentProcessingInfo processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PatchCustomerPaymentInstrumentRequest merchantInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantInformation) {
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

  public PatchCustomerPaymentInstrumentRequest instrumentIdentifier(Tmsv2customersEmbeddedDefaultPaymentInstrumentInstrumentIdentifier instrumentIdentifier) {
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

  public PatchCustomerPaymentInstrumentRequest metadata(Tmsv2customersEmbeddedDefaultPaymentInstrumentMetadata metadata) {
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

  public PatchCustomerPaymentInstrumentRequest embedded(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded embedded) {
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
    PatchCustomerPaymentInstrumentRequest patchCustomerPaymentInstrumentRequest = (PatchCustomerPaymentInstrumentRequest) o;
    return Objects.equals(this.links, patchCustomerPaymentInstrumentRequest.links) &&
        Objects.equals(this.id, patchCustomerPaymentInstrumentRequest.id) &&
        Objects.equals(this.object, patchCustomerPaymentInstrumentRequest.object) &&
        Objects.equals(this._default, patchCustomerPaymentInstrumentRequest._default) &&
        Objects.equals(this.state, patchCustomerPaymentInstrumentRequest.state) &&
        Objects.equals(this.type, patchCustomerPaymentInstrumentRequest.type) &&
        Objects.equals(this.bankAccount, patchCustomerPaymentInstrumentRequest.bankAccount) &&
        Objects.equals(this.card, patchCustomerPaymentInstrumentRequest.card) &&
        Objects.equals(this.buyerInformation, patchCustomerPaymentInstrumentRequest.buyerInformation) &&
        Objects.equals(this.billTo, patchCustomerPaymentInstrumentRequest.billTo) &&
        Objects.equals(this.processingInformation, patchCustomerPaymentInstrumentRequest.processingInformation) &&
        Objects.equals(this.merchantInformation, patchCustomerPaymentInstrumentRequest.merchantInformation) &&
        Objects.equals(this.instrumentIdentifier, patchCustomerPaymentInstrumentRequest.instrumentIdentifier) &&
        Objects.equals(this.metadata, patchCustomerPaymentInstrumentRequest.metadata) &&
        Objects.equals(this.embedded, patchCustomerPaymentInstrumentRequest.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, _default, state, type, bankAccount, card, buyerInformation, billTo, processingInformation, merchantInformation, instrumentIdentifier, metadata, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCustomerPaymentInstrumentRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

