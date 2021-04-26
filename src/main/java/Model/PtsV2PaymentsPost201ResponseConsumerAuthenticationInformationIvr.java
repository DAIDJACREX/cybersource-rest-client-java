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
 * PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr {
  @SerializedName("enabledMessage")
  private Boolean enabledMessage = null;

  @SerializedName("encryptionKey")
  private String encryptionKey = null;

  @SerializedName("encryptionMandatory")
  private Boolean encryptionMandatory = null;

  @SerializedName("encryptionType")
  private String encryptionType = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("prompt")
  private String prompt = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr enabledMessage(Boolean enabledMessage) {
    this.enabledMessage = enabledMessage;
    return this;
  }

   /**
   * Flag to indicate if a valid IVR transaction was detected. 
   * @return enabledMessage
  **/
  @ApiModelProperty(value = "Flag to indicate if a valid IVR transaction was detected. ")
  public Boolean getEnabledMessage() {
    return enabledMessage;
  }

  public void setEnabledMessage(Boolean enabledMessage) {
    this.enabledMessage = enabledMessage;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr encryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * Encryption key to be used in the event the ACS requires encryption of the credential field. 
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "Encryption key to be used in the event the ACS requires encryption of the credential field. ")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr encryptionMandatory(Boolean encryptionMandatory) {
    this.encryptionMandatory = encryptionMandatory;
    return this;
  }

   /**
   * Flag to indicate if the ACS requires the credential to be encrypted. 
   * @return encryptionMandatory
  **/
  @ApiModelProperty(value = "Flag to indicate if the ACS requires the credential to be encrypted. ")
  public Boolean getEncryptionMandatory() {
    return encryptionMandatory;
  }

  public void setEncryptionMandatory(Boolean encryptionMandatory) {
    this.encryptionMandatory = encryptionMandatory;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * An indicator from the ACS to inform the type of encryption that should be used in the event the ACS requires encryption of the credential field. 
   * @return encryptionType
  **/
  @ApiModelProperty(value = "An indicator from the ACS to inform the type of encryption that should be used in the event the ACS requires encryption of the credential field. ")
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr label(String label) {
    this.label = label;
    return this;
  }

   /**
   * An ACS Provided label that can be presented to the Consumer. Recommended use with an application. 
   * @return label
  **/
  @ApiModelProperty(value = "An ACS Provided label that can be presented to the Consumer. Recommended use with an application. ")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * An ACS provided string that can be presented to the Consumer. Recommended use with an application. 
   * @return prompt
  **/
  @ApiModelProperty(value = "An ACS provided string that can be presented to the Consumer. Recommended use with an application. ")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * An ACS provided message that can provide additional information or details. 
   * @return statusMessage
  **/
  @ApiModelProperty(value = "An ACS provided message that can provide additional information or details. ")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr = (PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr) o;
    return Objects.equals(this.enabledMessage, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.enabledMessage) &&
        Objects.equals(this.encryptionKey, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.encryptionKey) &&
        Objects.equals(this.encryptionMandatory, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.encryptionMandatory) &&
        Objects.equals(this.encryptionType, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.encryptionType) &&
        Objects.equals(this.label, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.label) &&
        Objects.equals(this.prompt, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.prompt) &&
        Objects.equals(this.statusMessage, ptsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledMessage, encryptionKey, encryptionMandatory, encryptionType, label, prompt, statusMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseConsumerAuthenticationInformationIvr {\n");
    
    sb.append("    enabledMessage: ").append(toIndentedString(enabledMessage)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    encryptionMandatory: ").append(toIndentedString(encryptionMandatory)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

