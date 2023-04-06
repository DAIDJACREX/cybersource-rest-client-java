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
 * Ptsv1pushfundstransferPointOfServiceInformation
 */

public class Ptsv1pushfundstransferPointOfServiceInformation {
  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("catLevel")
  private Integer catLevel = null;

  @SerializedName("entryMode")
  private String entryMode = null;

  @SerializedName("pinEntryCapability")
  private Integer pinEntryCapability = null;

  @SerializedName("terminalCapability")
  private Integer terminalCapability = null;

  public Ptsv1pushfundstransferPointOfServiceInformation terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  Visa Platform Connect A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.   Used by Authorization Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.  Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include pointOfSaleInformation.catLevel. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  Visa Platform Connect A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.   Used by Authorization Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.  Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include pointOfSaleInformation.catLevel. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public Ptsv1pushfundstransferPointOfServiceInformation catLevel(Integer catLevel) {
    this.catLevel = catLevel;
    return this;
  }

   /**
   * Type of cardholder-activated terminal. Possible values:  - &#x60;1&#x60;: Automated dispensing machine - &#x60;2&#x60;: Self-service terminal - &#x60;3&#x60;: Limited amount terminal - &#x60;4&#x60;: In-flight commerce (IFC) terminal - &#x60;5&#x60;: Radio frequency device - &#x60;6&#x60;: Mobile acceptance terminal - &#x60;7&#x60;: Electronic cash register - &#x60;8&#x60;: E-commerce device at your location - &#x60;9&#x60;: Terminal or cash register that uses a dialup connection to connect to the transaction processing network  Chase Paymentech Solutions Only values 1, 2, and 3 are supported. Required if pointOfSaleInformation.terminalID is included in the request; otherwise, optional.  Visa Platform COnnect Values 1 through 6 are supported on CyberSource through VisaNet, but some acquirers do not support all six values. Optional field.  Nonnegative integer. 
   * @return catLevel
  **/
  @ApiModelProperty(value = "Type of cardholder-activated terminal. Possible values:  - `1`: Automated dispensing machine - `2`: Self-service terminal - `3`: Limited amount terminal - `4`: In-flight commerce (IFC) terminal - `5`: Radio frequency device - `6`: Mobile acceptance terminal - `7`: Electronic cash register - `8`: E-commerce device at your location - `9`: Terminal or cash register that uses a dialup connection to connect to the transaction processing network  Chase Paymentech Solutions Only values 1, 2, and 3 are supported. Required if pointOfSaleInformation.terminalID is included in the request; otherwise, optional.  Visa Platform COnnect Values 1 through 6 are supported on CyberSource through VisaNet, but some acquirers do not support all six values. Optional field.  Nonnegative integer. ")
  public Integer getCatLevel() {
    return catLevel;
  }

  public void setCatLevel(Integer catLevel) {
    this.catLevel = catLevel;
  }

  public Ptsv1pushfundstransferPointOfServiceInformation entryMode(String entryMode) {
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Method of entering payment card information into the POS terminal. Possible values:  - &#x60;contact&#x60;: Read from direct contact with chip card. - &#x60;contactless&#x60;: Read from a contactless interface using chip data. - &#x60;keyed&#x60;: Manually keyed into POS terminal. This value is not supported on OmniPay Direct. - &#x60;msd&#x60;: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct. - &#x60;swiped&#x60;: Read from credit card magnetic stripe. The contact, contactless, and msd values are supported only for EMV transactions. 
   * @return entryMode
  **/
  @ApiModelProperty(value = "Method of entering payment card information into the POS terminal. Possible values:  - `contact`: Read from direct contact with chip card. - `contactless`: Read from a contactless interface using chip data. - `keyed`: Manually keyed into POS terminal. This value is not supported on OmniPay Direct. - `msd`: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct. - `swiped`: Read from credit card magnetic stripe. The contact, contactless, and msd values are supported only for EMV transactions. ")
  public String getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(String entryMode) {
    this.entryMode = entryMode;
  }

  public Ptsv1pushfundstransferPointOfServiceInformation pinEntryCapability(Integer pinEntryCapability) {
    this.pinEntryCapability = pinEntryCapability;
    return this;
  }

   /**
   * PIN Entry Capability - 0 Unknown. - 1 Indicates terminal can accept and forward online PINs. - 2 Indicates terminal cannot accept and forward online PINs. - 8 Terminal PIN pad down. - 9 Reserved for future use. 
   * @return pinEntryCapability
  **/
  @ApiModelProperty(value = "PIN Entry Capability - 0 Unknown. - 1 Indicates terminal can accept and forward online PINs. - 2 Indicates terminal cannot accept and forward online PINs. - 8 Terminal PIN pad down. - 9 Reserved for future use. ")
  public Integer getPinEntryCapability() {
    return pinEntryCapability;
  }

  public void setPinEntryCapability(Integer pinEntryCapability) {
    this.pinEntryCapability = pinEntryCapability;
  }

  public Ptsv1pushfundstransferPointOfServiceInformation terminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
    return this;
  }

   /**
   * integer [ 1 .. 5 ] POS terminal’s capability. Possible values:  - &#x60;1&#x60;: Terminal has a magnetic stripe reader only. - &#x60;2&#x60;: Terminal has a magnetic stripe reader and manual entry capability. - &#x60;3&#x60;: Terminal has manual entry capability only. - &#x60;4&#x60;: Terminal can read chip cards. - &#x60;5&#x60;: Terminal can read contactless chip cards; cannot use contact to read chip cards. For an EMV transaction, the value of this field must be 4 or 5.  Used by Authorization Required for the following processors: Chase Paymentech Solutions  Optional for the following processors: Visa Platform Connect 
   * @return terminalCapability
  **/
  @ApiModelProperty(value = "integer [ 1 .. 5 ] POS terminal’s capability. Possible values:  - `1`: Terminal has a magnetic stripe reader only. - `2`: Terminal has a magnetic stripe reader and manual entry capability. - `3`: Terminal has manual entry capability only. - `4`: Terminal can read chip cards. - `5`: Terminal can read contactless chip cards; cannot use contact to read chip cards. For an EMV transaction, the value of this field must be 4 or 5.  Used by Authorization Required for the following processors: Chase Paymentech Solutions  Optional for the following processors: Visa Platform Connect ")
  public Integer getTerminalCapability() {
    return terminalCapability;
  }

  public void setTerminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferPointOfServiceInformation ptsv1pushfundstransferPointOfServiceInformation = (Ptsv1pushfundstransferPointOfServiceInformation) o;
    return Objects.equals(this.terminalId, ptsv1pushfundstransferPointOfServiceInformation.terminalId) &&
        Objects.equals(this.catLevel, ptsv1pushfundstransferPointOfServiceInformation.catLevel) &&
        Objects.equals(this.entryMode, ptsv1pushfundstransferPointOfServiceInformation.entryMode) &&
        Objects.equals(this.pinEntryCapability, ptsv1pushfundstransferPointOfServiceInformation.pinEntryCapability) &&
        Objects.equals(this.terminalCapability, ptsv1pushfundstransferPointOfServiceInformation.terminalCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalId, catLevel, entryMode, pinEntryCapability, terminalCapability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferPointOfServiceInformation {\n");
    
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    catLevel: ").append(toIndentedString(catLevel)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    pinEntryCapability: ").append(toIndentedString(pinEntryCapability)).append("\n");
    sb.append("    terminalCapability: ").append(toIndentedString(terminalCapability)).append("\n");
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
