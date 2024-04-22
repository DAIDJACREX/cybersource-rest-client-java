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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Name of the payment processor. Example - \&quot;wellsfargoach\&quot;
 */
@ApiModel(description = "Name of the payment processor. Example - \"wellsfargoach\"")

public class ECheckConfigCommonInternalOnlyProcessors {
  @SerializedName("enableCCS")
  private Boolean enableCCS = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("enable15anTransactionReferenceNumber")
  private Boolean enable15anTransactionReferenceNumber = true;

  @SerializedName("portalSupportedPaytypes")
  private String portalSupportedPaytypes = "CHECK";

  @SerializedName("settlementMethod")
  private Object settlementMethod = null;

  @SerializedName("verificationLevel")
  private Object verificationLevel = null;

  @SerializedName("setCompletedState")
  private Boolean setCompletedState = false;

  public ECheckConfigCommonInternalOnlyProcessors enableCCS(Boolean enableCCS) {
    this.enableCCS = enableCCS;
    return this;
  }

   /**
   * *NEW* Flag to indicate whether the processor is migrated to the Common Connectivity Services Platform. Applicable for VPC and amexdirect processors. 
   * @return enableCCS
  **/
  @ApiModelProperty(value = "*NEW* Flag to indicate whether the processor is migrated to the Common Connectivity Services Platform. Applicable for VPC and amexdirect processors. ")
  public Boolean isEnableCCS() {
    return enableCCS;
  }

  public void setEnableCCS(Boolean enableCCS) {
    this.enableCCS = enableCCS;
  }

  public ECheckConfigCommonInternalOnlyProcessors terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * *NEW* The &#39;Terminal Id&#39; aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions. Applicable for VPC processors. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "*NEW* The 'Terminal Id' aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions. Applicable for VPC processors. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public ECheckConfigCommonInternalOnlyProcessors enable15anTransactionReferenceNumber(Boolean enable15anTransactionReferenceNumber) {
    this.enable15anTransactionReferenceNumber = enable15anTransactionReferenceNumber;
    return this;
  }

   /**
   * *NEW* This ensures the transaction reference # contains an identifier that can be viewed in CYBS
   * @return enable15anTransactionReferenceNumber
  **/
  @ApiModelProperty(value = "*NEW* This ensures the transaction reference # contains an identifier that can be viewed in CYBS")
  public Boolean isEnable15anTransactionReferenceNumber() {
    return enable15anTransactionReferenceNumber;
  }

  public void setEnable15anTransactionReferenceNumber(Boolean enable15anTransactionReferenceNumber) {
    this.enable15anTransactionReferenceNumber = enable15anTransactionReferenceNumber;
  }

  public ECheckConfigCommonInternalOnlyProcessors portalSupportedPaytypes(String portalSupportedPaytypes) {
    this.portalSupportedPaytypes = portalSupportedPaytypes;
    return this;
  }

   /**
   * *NEW* This is used by the EBC2 application
   * @return portalSupportedPaytypes
  **/
  @ApiModelProperty(value = "*NEW* This is used by the EBC2 application")
  public String getPortalSupportedPaytypes() {
    return portalSupportedPaytypes;
  }

  public void setPortalSupportedPaytypes(String portalSupportedPaytypes) {
    this.portalSupportedPaytypes = portalSupportedPaytypes;
  }

  public ECheckConfigCommonInternalOnlyProcessors settlementMethod(Object settlementMethod) {
    this.settlementMethod = settlementMethod;
    return this;
  }

   /**
   * *NEW*
   * @return settlementMethod
  **/
  @ApiModelProperty(value = "*NEW*")
  public Object getSettlementMethod() {
    return settlementMethod;
  }

  public void setSettlementMethod(Object settlementMethod) {
    this.settlementMethod = settlementMethod;
  }

  public ECheckConfigCommonInternalOnlyProcessors verificationLevel(Object verificationLevel) {
    this.verificationLevel = verificationLevel;
    return this;
  }

   /**
   * *NEW*
   * @return verificationLevel
  **/
  @ApiModelProperty(value = "*NEW*")
  public Object getVerificationLevel() {
    return verificationLevel;
  }

  public void setVerificationLevel(Object verificationLevel) {
    this.verificationLevel = verificationLevel;
  }

  public ECheckConfigCommonInternalOnlyProcessors setCompletedState(Boolean setCompletedState) {
    this.setCompletedState = setCompletedState;
    return this;
  }

   /**
   * *Moved* When set to Yes we will automatically update transactions to a completed status X-number of days after the transaction comes through; if no failure notification is received. When set to No means we will not update transaction status in this manner. For BAMS/Bank of America merchants, they should be set to No unless we are explicitly asked to set a merchant to YES.
   * @return setCompletedState
  **/
  @ApiModelProperty(value = "*Moved* When set to Yes we will automatically update transactions to a completed status X-number of days after the transaction comes through; if no failure notification is received. When set to No means we will not update transaction status in this manner. For BAMS/Bank of America merchants, they should be set to No unless we are explicitly asked to set a merchant to YES.")
  public Boolean isSetCompletedState() {
    return setCompletedState;
  }

  public void setSetCompletedState(Boolean setCompletedState) {
    this.setCompletedState = setCompletedState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECheckConfigCommonInternalOnlyProcessors echeckConfigCommonInternalOnlyProcessors = (ECheckConfigCommonInternalOnlyProcessors) o;
    return Objects.equals(this.enableCCS, echeckConfigCommonInternalOnlyProcessors.enableCCS) &&
        Objects.equals(this.terminalId, echeckConfigCommonInternalOnlyProcessors.terminalId) &&
        Objects.equals(this.enable15anTransactionReferenceNumber, echeckConfigCommonInternalOnlyProcessors.enable15anTransactionReferenceNumber) &&
        Objects.equals(this.portalSupportedPaytypes, echeckConfigCommonInternalOnlyProcessors.portalSupportedPaytypes) &&
        Objects.equals(this.settlementMethod, echeckConfigCommonInternalOnlyProcessors.settlementMethod) &&
        Objects.equals(this.verificationLevel, echeckConfigCommonInternalOnlyProcessors.verificationLevel) &&
        Objects.equals(this.setCompletedState, echeckConfigCommonInternalOnlyProcessors.setCompletedState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableCCS, terminalId, enable15anTransactionReferenceNumber, portalSupportedPaytypes, settlementMethod, verificationLevel, setCompletedState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECheckConfigCommonInternalOnlyProcessors {\n");
    
    sb.append("    enableCCS: ").append(toIndentedString(enableCCS)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    enable15anTransactionReferenceNumber: ").append(toIndentedString(enable15anTransactionReferenceNumber)).append("\n");
    sb.append("    portalSupportedPaytypes: ").append(toIndentedString(portalSupportedPaytypes)).append("\n");
    sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
    sb.append("    verificationLevel: ").append(toIndentedString(verificationLevel)).append("\n");
    sb.append("    setCompletedState: ").append(toIndentedString(setCompletedState)).append("\n");
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

