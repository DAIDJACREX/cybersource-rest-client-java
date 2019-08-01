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
import Model.Ptsv2creditsPointOfSaleInformationEmv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2creditsPointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T12:55:52.826+05:30")
public class Ptsv2creditsPointOfSaleInformation {
  @SerializedName("emv")
  private Ptsv2creditsPointOfSaleInformationEmv emv = null;

  @SerializedName("partnerSdkVersion")
  private String partnerSdkVersion = null;

  @SerializedName("storeAndForwardIndicator")
  private String storeAndForwardIndicator = null;

  @SerializedName("cardholderVerificationMethod")
  private List<String> cardholderVerificationMethod = null;

  @SerializedName("terminalInputCapability")
  private List<String> terminalInputCapability = null;

  @SerializedName("terminalSerialNumber")
  private String terminalSerialNumber = null;

  @SerializedName("terminalCardCaptureCapability")
  private String terminalCardCaptureCapability = null;

  @SerializedName("terminalOutputCapability")
  private String terminalOutputCapability = null;

  @SerializedName("terminalPinCapability")
  private Integer terminalPinCapability = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  public Ptsv2creditsPointOfSaleInformation emv(Ptsv2creditsPointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsPointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(Ptsv2creditsPointOfSaleInformationEmv emv) {
    this.emv = emv;
  }

  public Ptsv2creditsPointOfSaleInformation partnerSdkVersion(String partnerSdkVersion) {
    this.partnerSdkVersion = partnerSdkVersion;
    return this;
  }

   /**
   * Version of the software installed on the POS terminal. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. 
   * @return partnerSdkVersion
  **/
  @ApiModelProperty(value = "Version of the software installed on the POS terminal. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. ")
  public String getPartnerSdkVersion() {
    return partnerSdkVersion;
  }

  public void setPartnerSdkVersion(String partnerSdkVersion) {
    this.partnerSdkVersion = partnerSdkVersion;
  }

  public Ptsv2creditsPointOfSaleInformation storeAndForwardIndicator(String storeAndForwardIndicator) {
    this.storeAndForwardIndicator = storeAndForwardIndicator;
    return this;
  }

   /**
   * When connectivity is unavailable, the client software that is installed on the POS terminal can store a transaction in its memory and send it for authorization when connectivity is restored. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  Possible values: - Y: Transaction was stored and then forwarded. - N (default): Transaction was not stored and then forwarded.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. 
   * @return storeAndForwardIndicator
  **/
  @ApiModelProperty(value = "When connectivity is unavailable, the client software that is installed on the POS terminal can store a transaction in its memory and send it for authorization when connectivity is restored. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  Possible values: - Y: Transaction was stored and then forwarded. - N (default): Transaction was not stored and then forwarded.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. ")
  public String getStoreAndForwardIndicator() {
    return storeAndForwardIndicator;
  }

  public void setStoreAndForwardIndicator(String storeAndForwardIndicator) {
    this.storeAndForwardIndicator = storeAndForwardIndicator;
  }

  public Ptsv2creditsPointOfSaleInformation cardholderVerificationMethod(List<String> cardholderVerificationMethod) {
    this.cardholderVerificationMethod = cardholderVerificationMethod;
    return this;
  }

  public Ptsv2creditsPointOfSaleInformation addCardholderVerificationMethodItem(String cardholderVerificationMethodItem) {
    if (this.cardholderVerificationMethod == null) {
      this.cardholderVerificationMethod = new ArrayList<String>();
    }
    this.cardholderVerificationMethod.add(cardholderVerificationMethodItem);
    return this;
  }

   /**
   * Get cardholderVerificationMethod
   * @return cardholderVerificationMethod
  **/
  @ApiModelProperty(example = "[\"PIN\",\"Signature\"]", value = "")
  public List<String> getCardholderVerificationMethod() {
    return cardholderVerificationMethod;
  }

  public void setCardholderVerificationMethod(List<String> cardholderVerificationMethod) {
    this.cardholderVerificationMethod = cardholderVerificationMethod;
  }

  public Ptsv2creditsPointOfSaleInformation terminalInputCapability(List<String> terminalInputCapability) {
    this.terminalInputCapability = terminalInputCapability;
    return this;
  }

  public Ptsv2creditsPointOfSaleInformation addTerminalInputCapabilityItem(String terminalInputCapabilityItem) {
    if (this.terminalInputCapability == null) {
      this.terminalInputCapability = new ArrayList<String>();
    }
    this.terminalInputCapability.add(terminalInputCapabilityItem);
    return this;
  }

   /**
   * Get terminalInputCapability
   * @return terminalInputCapability
  **/
  @ApiModelProperty(example = "[\"Keyed\",\"Swiped\",\"Contact\",\"QRcode\"]", value = "")
  public List<String> getTerminalInputCapability() {
    return terminalInputCapability;
  }

  public void setTerminalInputCapability(List<String> terminalInputCapability) {
    this.terminalInputCapability = terminalInputCapability;
  }

  public Ptsv2creditsPointOfSaleInformation terminalSerialNumber(String terminalSerialNumber) {
    this.terminalSerialNumber = terminalSerialNumber;
    return this;
  }

   /**
   * Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  For details, see the &#x60;terminal_serial_number&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return terminalSerialNumber
  **/
  @ApiModelProperty(value = "Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  For details, see the `terminal_serial_number` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getTerminalSerialNumber() {
    return terminalSerialNumber;
  }

  public void setTerminalSerialNumber(String terminalSerialNumber) {
    this.terminalSerialNumber = terminalSerialNumber;
  }

  public Ptsv2creditsPointOfSaleInformation terminalCardCaptureCapability(String terminalCardCaptureCapability) {
    this.terminalCardCaptureCapability = terminalCardCaptureCapability;
    return this;
  }

   /**
   * Indicates whether the terminal can capture the card.  Possible values: - 1: Terminal can capture card. - 0: Terminal cannot capture card.  This field is supported only on American Express Direct. 
   * @return terminalCardCaptureCapability
  **/
  @ApiModelProperty(value = "Indicates whether the terminal can capture the card.  Possible values: - 1: Terminal can capture card. - 0: Terminal cannot capture card.  This field is supported only on American Express Direct. ")
  public String getTerminalCardCaptureCapability() {
    return terminalCardCaptureCapability;
  }

  public void setTerminalCardCaptureCapability(String terminalCardCaptureCapability) {
    this.terminalCardCaptureCapability = terminalCardCaptureCapability;
  }

  public Ptsv2creditsPointOfSaleInformation terminalOutputCapability(String terminalOutputCapability) {
    this.terminalOutputCapability = terminalOutputCapability;
    return this;
  }

   /**
   * Indicates whether the terminal can print or display messages.  Possible values: - 1: Neither - 2: Print only - 3: Display only - 4: Print and display  This field is supported only on American Express Direct. 
   * @return terminalOutputCapability
  **/
  @ApiModelProperty(value = "Indicates whether the terminal can print or display messages.  Possible values: - 1: Neither - 2: Print only - 3: Display only - 4: Print and display  This field is supported only on American Express Direct. ")
  public String getTerminalOutputCapability() {
    return terminalOutputCapability;
  }

  public void setTerminalOutputCapability(String terminalOutputCapability) {
    this.terminalOutputCapability = terminalOutputCapability;
  }

  public Ptsv2creditsPointOfSaleInformation terminalPinCapability(Integer terminalPinCapability) {
    this.terminalPinCapability = terminalPinCapability;
    return this;
  }

   /**
   * Maximum PIN length that the terminal can capture.  Possible values: -  0: No PIN capture capability -  1: PIN capture capability unknown -  4: Four characters -  5: Five characters -  6: Six characters -  7: Seven characters -  8: Eight characters -  9: Nine characters - 10: Ten characters - 11: Eleven characters - 12: Twelve characters  This field is supported only on American Express Direct and SIX. 
   * @return terminalPinCapability
  **/
  @ApiModelProperty(value = "Maximum PIN length that the terminal can capture.  Possible values: -  0: No PIN capture capability -  1: PIN capture capability unknown -  4: Four characters -  5: Five characters -  6: Six characters -  7: Seven characters -  8: Eight characters -  9: Nine characters - 10: Ten characters - 11: Eleven characters - 12: Twelve characters  This field is supported only on American Express Direct and SIX. ")
  public Integer getTerminalPinCapability() {
    return terminalPinCapability;
  }

  public void setTerminalPinCapability(Integer terminalPinCapability) {
    this.terminalPinCapability = terminalPinCapability;
  }

  public Ptsv2creditsPointOfSaleInformation deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Value created by the client software that uniquely identifies the POS device. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. 
   * @return deviceId
  **/
  @ApiModelProperty(value = "Value created by the client software that uniquely identifies the POS device. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. ")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsPointOfSaleInformation ptsv2creditsPointOfSaleInformation = (Ptsv2creditsPointOfSaleInformation) o;
    return Objects.equals(this.emv, ptsv2creditsPointOfSaleInformation.emv) &&
        Objects.equals(this.partnerSdkVersion, ptsv2creditsPointOfSaleInformation.partnerSdkVersion) &&
        Objects.equals(this.storeAndForwardIndicator, ptsv2creditsPointOfSaleInformation.storeAndForwardIndicator) &&
        Objects.equals(this.cardholderVerificationMethod, ptsv2creditsPointOfSaleInformation.cardholderVerificationMethod) &&
        Objects.equals(this.terminalInputCapability, ptsv2creditsPointOfSaleInformation.terminalInputCapability) &&
        Objects.equals(this.terminalSerialNumber, ptsv2creditsPointOfSaleInformation.terminalSerialNumber) &&
        Objects.equals(this.terminalCardCaptureCapability, ptsv2creditsPointOfSaleInformation.terminalCardCaptureCapability) &&
        Objects.equals(this.terminalOutputCapability, ptsv2creditsPointOfSaleInformation.terminalOutputCapability) &&
        Objects.equals(this.terminalPinCapability, ptsv2creditsPointOfSaleInformation.terminalPinCapability) &&
        Objects.equals(this.deviceId, ptsv2creditsPointOfSaleInformation.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emv, partnerSdkVersion, storeAndForwardIndicator, cardholderVerificationMethod, terminalInputCapability, terminalSerialNumber, terminalCardCaptureCapability, terminalOutputCapability, terminalPinCapability, deviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsPointOfSaleInformation {\n");
    
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
    sb.append("    partnerSdkVersion: ").append(toIndentedString(partnerSdkVersion)).append("\n");
    sb.append("    storeAndForwardIndicator: ").append(toIndentedString(storeAndForwardIndicator)).append("\n");
    sb.append("    cardholderVerificationMethod: ").append(toIndentedString(cardholderVerificationMethod)).append("\n");
    sb.append("    terminalInputCapability: ").append(toIndentedString(terminalInputCapability)).append("\n");
    sb.append("    terminalSerialNumber: ").append(toIndentedString(terminalSerialNumber)).append("\n");
    sb.append("    terminalCardCaptureCapability: ").append(toIndentedString(terminalCardCaptureCapability)).append("\n");
    sb.append("    terminalOutputCapability: ").append(toIndentedString(terminalOutputCapability)).append("\n");
    sb.append("    terminalPinCapability: ").append(toIndentedString(terminalPinCapability)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

