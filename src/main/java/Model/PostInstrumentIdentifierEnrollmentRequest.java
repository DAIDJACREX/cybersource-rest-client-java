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
import Model.TmsEmbeddedInstrumentIdentifierBankAccount;
import Model.TmsEmbeddedInstrumentIdentifierBillTo;
import Model.TmsEmbeddedInstrumentIdentifierCard;
import Model.TmsEmbeddedInstrumentIdentifierIssuer;
import Model.TmsEmbeddedInstrumentIdentifierLinks;
import Model.TmsEmbeddedInstrumentIdentifierMetadata;
import Model.TmsEmbeddedInstrumentIdentifierProcessingInformation;
import Model.TmsEmbeddedInstrumentIdentifierTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostInstrumentIdentifierEnrollmentRequest
 */

public class PostInstrumentIdentifierEnrollmentRequest {
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

  @SerializedName("card")
  private TmsEmbeddedInstrumentIdentifierCard card = null;

  @SerializedName("bankAccount")
  private TmsEmbeddedInstrumentIdentifierBankAccount bankAccount = null;

  @SerializedName("tokenizedCard")
  private TmsEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard = null;

  @SerializedName("issuer")
  private TmsEmbeddedInstrumentIdentifierIssuer issuer = null;

  @SerializedName("processingInformation")
  private TmsEmbeddedInstrumentIdentifierProcessingInformation processingInformation = null;

  @SerializedName("billTo")
  private TmsEmbeddedInstrumentIdentifierBillTo billTo = null;

  @SerializedName("metadata")
  private TmsEmbeddedInstrumentIdentifierMetadata metadata = null;

  public PostInstrumentIdentifierEnrollmentRequest links(TmsEmbeddedInstrumentIdentifierLinks links) {
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

  public PostInstrumentIdentifierEnrollmentRequest id(String id) {
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

  public PostInstrumentIdentifierEnrollmentRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Instrument Identifier. Possible Values: - enrollable card 
   * @return type
  **/
  @ApiModelProperty(value = "The type of Instrument Identifier. Possible Values: - enrollable card ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PostInstrumentIdentifierEnrollmentRequest card(TmsEmbeddedInstrumentIdentifierCard card) {
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

  public PostInstrumentIdentifierEnrollmentRequest bankAccount(TmsEmbeddedInstrumentIdentifierBankAccount bankAccount) {
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

  public PostInstrumentIdentifierEnrollmentRequest tokenizedCard(TmsEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(TmsEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public PostInstrumentIdentifierEnrollmentRequest issuer(TmsEmbeddedInstrumentIdentifierIssuer issuer) {
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

  public PostInstrumentIdentifierEnrollmentRequest processingInformation(TmsEmbeddedInstrumentIdentifierProcessingInformation processingInformation) {
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

  public PostInstrumentIdentifierEnrollmentRequest billTo(TmsEmbeddedInstrumentIdentifierBillTo billTo) {
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

  public PostInstrumentIdentifierEnrollmentRequest metadata(TmsEmbeddedInstrumentIdentifierMetadata metadata) {
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
    PostInstrumentIdentifierEnrollmentRequest postInstrumentIdentifierEnrollmentRequest = (PostInstrumentIdentifierEnrollmentRequest) o;
    return Objects.equals(this.links, postInstrumentIdentifierEnrollmentRequest.links) &&
        Objects.equals(this.id, postInstrumentIdentifierEnrollmentRequest.id) &&
        Objects.equals(this.object, postInstrumentIdentifierEnrollmentRequest.object) &&
        Objects.equals(this.state, postInstrumentIdentifierEnrollmentRequest.state) &&
        Objects.equals(this.type, postInstrumentIdentifierEnrollmentRequest.type) &&
        Objects.equals(this.card, postInstrumentIdentifierEnrollmentRequest.card) &&
        Objects.equals(this.bankAccount, postInstrumentIdentifierEnrollmentRequest.bankAccount) &&
        Objects.equals(this.tokenizedCard, postInstrumentIdentifierEnrollmentRequest.tokenizedCard) &&
        Objects.equals(this.issuer, postInstrumentIdentifierEnrollmentRequest.issuer) &&
        Objects.equals(this.processingInformation, postInstrumentIdentifierEnrollmentRequest.processingInformation) &&
        Objects.equals(this.billTo, postInstrumentIdentifierEnrollmentRequest.billTo) &&
        Objects.equals(this.metadata, postInstrumentIdentifierEnrollmentRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, state, type, card, bankAccount, tokenizedCard, issuer, processingInformation, billTo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInstrumentIdentifierEnrollmentRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

