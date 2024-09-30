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
import Model.Ptsv2paymentsTokenInformationTokenProvisioningInformation;
import Model.TmsEmbeddedInstrumentIdentifierBankAccount;
import Model.TmsEmbeddedInstrumentIdentifierBillTo;
import Model.TmsEmbeddedInstrumentIdentifierCard;
import Model.TmsEmbeddedInstrumentIdentifierIssuer;
import Model.TmsEmbeddedInstrumentIdentifierLinks;
import Model.TmsEmbeddedInstrumentIdentifierMetadata;
import Model.TmsEmbeddedInstrumentIdentifierProcessingInformation;
import Model.Tmsv2TokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PatchInstrumentIdentifierRequest
 */

public class PatchInstrumentIdentifierRequest {
  @SerializedName("_links")
  private TmsEmbeddedInstrumentIdentifierLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("tokenProvisioningInformation")
  private Ptsv2paymentsTokenInformationTokenProvisioningInformation tokenProvisioningInformation = null;

  @SerializedName("card")
  private TmsEmbeddedInstrumentIdentifierCard card = null;

  @SerializedName("bankAccount")
  private TmsEmbeddedInstrumentIdentifierBankAccount bankAccount = null;

  @SerializedName("tokenizedCard")
  private Tmsv2TokenizedCard tokenizedCard = null;

  @SerializedName("issuer")
  private TmsEmbeddedInstrumentIdentifierIssuer issuer = null;

  @SerializedName("processingInformation")
  private TmsEmbeddedInstrumentIdentifierProcessingInformation processingInformation = null;

  @SerializedName("billTo")
  private TmsEmbeddedInstrumentIdentifierBillTo billTo = null;

  @SerializedName("metadata")
  private TmsEmbeddedInstrumentIdentifierMetadata metadata = null;

  public PatchInstrumentIdentifierRequest links(TmsEmbeddedInstrumentIdentifierLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierLinks getLinks() {
    return links;
  }

  public void setLinks(TmsEmbeddedInstrumentIdentifierLinks links) {
    this.links = links;
  }

  public PatchInstrumentIdentifierRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Instrument Identifier Token. 
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Instrument Identifier Token. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The type.  Possible Values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "The type.  Possible Values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

  public PatchInstrumentIdentifierRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Instrument Identifier. Possible Values: - enrollable card - enrollable token 
   * @return type
  **/
  @ApiModelProperty(value = "The type of Instrument Identifier. Possible Values: - enrollable card - enrollable token ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PatchInstrumentIdentifierRequest tokenProvisioningInformation(Ptsv2paymentsTokenInformationTokenProvisioningInformation tokenProvisioningInformation) {
    this.tokenProvisioningInformation = tokenProvisioningInformation;
    return this;
  }

   /**
   * Get tokenProvisioningInformation
   * @return tokenProvisioningInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTokenInformationTokenProvisioningInformation getTokenProvisioningInformation() {
    return tokenProvisioningInformation;
  }

  public void setTokenProvisioningInformation(Ptsv2paymentsTokenInformationTokenProvisioningInformation tokenProvisioningInformation) {
    this.tokenProvisioningInformation = tokenProvisioningInformation;
  }

  public PatchInstrumentIdentifierRequest card(TmsEmbeddedInstrumentIdentifierCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierCard getCard() {
    return card;
  }

  public void setCard(TmsEmbeddedInstrumentIdentifierCard card) {
    this.card = card;
  }

  public PatchInstrumentIdentifierRequest bankAccount(TmsEmbeddedInstrumentIdentifierBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(TmsEmbeddedInstrumentIdentifierBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PatchInstrumentIdentifierRequest tokenizedCard(Tmsv2TokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Tmsv2TokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public PatchInstrumentIdentifierRequest issuer(TmsEmbeddedInstrumentIdentifierIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(TmsEmbeddedInstrumentIdentifierIssuer issuer) {
    this.issuer = issuer;
  }

  public PatchInstrumentIdentifierRequest processingInformation(TmsEmbeddedInstrumentIdentifierProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsEmbeddedInstrumentIdentifierProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PatchInstrumentIdentifierRequest billTo(TmsEmbeddedInstrumentIdentifierBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(TmsEmbeddedInstrumentIdentifierBillTo billTo) {
    this.billTo = billTo;
  }

  public PatchInstrumentIdentifierRequest metadata(TmsEmbeddedInstrumentIdentifierMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TmsEmbeddedInstrumentIdentifierMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchInstrumentIdentifierRequest patchInstrumentIdentifierRequest = (PatchInstrumentIdentifierRequest) o;
    return Objects.equals(this.links, patchInstrumentIdentifierRequest.links) &&
        Objects.equals(this.id, patchInstrumentIdentifierRequest.id) &&
        Objects.equals(this.object, patchInstrumentIdentifierRequest.object) &&
        Objects.equals(this.state, patchInstrumentIdentifierRequest.state) &&
        Objects.equals(this.type, patchInstrumentIdentifierRequest.type) &&
        Objects.equals(this.tokenProvisioningInformation, patchInstrumentIdentifierRequest.tokenProvisioningInformation) &&
        Objects.equals(this.card, patchInstrumentIdentifierRequest.card) &&
        Objects.equals(this.bankAccount, patchInstrumentIdentifierRequest.bankAccount) &&
        Objects.equals(this.tokenizedCard, patchInstrumentIdentifierRequest.tokenizedCard) &&
        Objects.equals(this.issuer, patchInstrumentIdentifierRequest.issuer) &&
        Objects.equals(this.processingInformation, patchInstrumentIdentifierRequest.processingInformation) &&
        Objects.equals(this.billTo, patchInstrumentIdentifierRequest.billTo) &&
        Objects.equals(this.metadata, patchInstrumentIdentifierRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, state, type, tokenProvisioningInformation, card, bankAccount, tokenizedCard, issuer, processingInformation, billTo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchInstrumentIdentifierRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tokenProvisioningInformation: ").append(toIndentedString(tokenProvisioningInformation)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

