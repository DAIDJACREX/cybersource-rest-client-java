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
 * Riskv1authenticationresultsConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class Riskv1authenticationresultsConsumerAuthenticationInformation {
  @SerializedName("authenticationTransactionId")
  private String authenticationTransactionId = null;

  @SerializedName("authenticationType")
  private String authenticationType = null;

  @SerializedName("effectiveAuthenticationType")
  private String effectiveAuthenticationType = null;

  @SerializedName("signedParesStatusReason")
  private String signedParesStatusReason = null;

  @SerializedName("signedPares")
  private String signedPares = null;

  @SerializedName("whiteListStatus")
  private String whiteListStatus = null;

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
    return this;
  }

   /**
   * Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. 
   * @return authenticationTransactionId
  **/
  @ApiModelProperty(value = "Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. ")
  public String getAuthenticationTransactionId() {
    return authenticationTransactionId;
  }

  public void setAuthenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Indicates the type of authentication that will be used to challenge the card holder.  Possible Values:  01 - Static  02 - Dynamic  03 - OOB (Out of Band)  04 - Decoupled **NOTE**:  EMV 3-D Secure version 2.1.0 supports values 01-03.  Version 2.2.0 supports values 01-04.  Decoupled authentication is not supported at this time. 
   * @return authenticationType
  **/
  @ApiModelProperty(value = "Indicates the type of authentication that will be used to challenge the card holder.  Possible Values:  01 - Static  02 - Dynamic  03 - OOB (Out of Band)  04 - Decoupled **NOTE**:  EMV 3-D Secure version 2.1.0 supports values 01-03.  Version 2.2.0 supports values 01-04.  Decoupled authentication is not supported at this time. ")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation effectiveAuthenticationType(String effectiveAuthenticationType) {
    this.effectiveAuthenticationType = effectiveAuthenticationType;
    return this;
  }

   /**
   * This field describes the type of 3DS transaction flow that took place.  It can be one of three possible flows; CH - Challenge FR - Frictionless FD - Frictionless with delegation, (challenge not generated by the issuer but by the scheme on behalf of the issuer). 
   * @return effectiveAuthenticationType
  **/
  @ApiModelProperty(value = "This field describes the type of 3DS transaction flow that took place.  It can be one of three possible flows; CH - Challenge FR - Frictionless FD - Frictionless with delegation, (challenge not generated by the issuer but by the scheme on behalf of the issuer). ")
  public String getEffectiveAuthenticationType() {
    return effectiveAuthenticationType;
  }

  public void setEffectiveAuthenticationType(String effectiveAuthenticationType) {
    this.effectiveAuthenticationType = effectiveAuthenticationType;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
    return this;
  }

   /**
   * Provides additional information as to why the PAResStatus has a specific value. 
   * @return signedParesStatusReason
  **/
  @ApiModelProperty(value = "Provides additional information as to why the PAResStatus has a specific value. ")
  public String getSignedParesStatusReason() {
    return signedParesStatusReason;
  }

  public void setSignedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedPares(String signedPares) {
    this.signedPares = signedPares;
    return this;
  }

   /**
   * Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \&quot;Storing Payer Authentication Data,\&quot; page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. 
   * @return signedPares
  **/
  @ApiModelProperty(required = true, value = "Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \"Storing Payer Authentication Data,\" page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. ")
  public String getSignedPares() {
    return signedPares;
  }

  public void setSignedPares(String signedPares) {
    this.signedPares = signedPares;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation whiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
    return this;
  }

   /**
   * Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder 
   * @return whiteListStatus
  **/
  @ApiModelProperty(value = "Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder ")
  public String getWhiteListStatus() {
    return whiteListStatus;
  }

  public void setWhiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationresultsConsumerAuthenticationInformation riskv1authenticationresultsConsumerAuthenticationInformation = (Riskv1authenticationresultsConsumerAuthenticationInformation) o;
    return Objects.equals(this.authenticationTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationTransactionId) &&
        Objects.equals(this.authenticationType, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationType) &&
        Objects.equals(this.effectiveAuthenticationType, riskv1authenticationresultsConsumerAuthenticationInformation.effectiveAuthenticationType) &&
        Objects.equals(this.signedParesStatusReason, riskv1authenticationresultsConsumerAuthenticationInformation.signedParesStatusReason) &&
        Objects.equals(this.signedPares, riskv1authenticationresultsConsumerAuthenticationInformation.signedPares) &&
        Objects.equals(this.whiteListStatus, riskv1authenticationresultsConsumerAuthenticationInformation.whiteListStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationTransactionId, authenticationType, effectiveAuthenticationType, signedParesStatusReason, signedPares, whiteListStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationresultsConsumerAuthenticationInformation {\n");
    
    sb.append("    authenticationTransactionId: ").append(toIndentedString(authenticationTransactionId)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    effectiveAuthenticationType: ").append(toIndentedString(effectiveAuthenticationType)).append("\n");
    sb.append("    signedParesStatusReason: ").append(toIndentedString(signedParesStatusReason)).append("\n");
    sb.append("    signedPares: ").append(toIndentedString(signedPares)).append("\n");
    sb.append("    whiteListStatus: ").append(toIndentedString(whiteListStatus)).append("\n");
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
