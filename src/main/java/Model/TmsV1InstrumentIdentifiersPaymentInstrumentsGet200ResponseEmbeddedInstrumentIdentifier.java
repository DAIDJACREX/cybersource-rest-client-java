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
import Model.TmsV1InstrumentIdentifiersPost200ResponseBankAccount;
import Model.TmsV1InstrumentIdentifiersPost200ResponseCard;
import Model.TmsV1InstrumentIdentifiersPost200ResponseLinks;
import Model.TmsV1InstrumentIdentifiersPost200ResponseMetadata;
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T12:55:52.826+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier {
  @SerializedName("_links")
  private TmsV1InstrumentIdentifiersPost200ResponseLinks links = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseCard card = null;

  @SerializedName("bankAccount")
  private TmsV1InstrumentIdentifiersPost200ResponseBankAccount bankAccount = null;

  @SerializedName("processingInformation")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation = null;

  @SerializedName("metadata")
  private TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier links(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
  }

   /**
   * &#39;Describes type of token.&#39;  Valid values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "'Describes type of token.'  Valid values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * &#39;Current state of the token.&#39;              Valid values: - ACTIVE - CLOSED 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "'Current state of the token.'              Valid values: - ACTIVE - CLOSED ")
  public String getState() {
    return state;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the existing instrument identifier to be linked to the newly created payment instrument.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456789", value = "The ID of the existing instrument identifier to be linked to the newly created payment instrument.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier card(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier bankAccount(TmsV1InstrumentIdentifiersPost200ResponseBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(TmsV1InstrumentIdentifiersPost200ResponseBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier processingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier metadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
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
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier) o;
    return Objects.equals(this.links, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.links) &&
        Objects.equals(this.object, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.object) &&
        Objects.equals(this.state, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.state) &&
        Objects.equals(this.id, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.id) &&
        Objects.equals(this.card, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.card) &&
        Objects.equals(this.bankAccount, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.bankAccount) &&
        Objects.equals(this.processingInformation, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.processingInformation) &&
        Objects.equals(this.metadata, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, state, id, card, bankAccount, processingInformation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedInstrumentIdentifier {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
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

