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
import Model.TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions
 */

public class TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions {
  @SerializedName("authType")
  private String authType = null;

  @SerializedName("authIndicator")
  private String authIndicator = null;

  @SerializedName("extendAuthIndicator")
  private String extendAuthIndicator = null;

  @SerializedName("cardVerificationIndicator")
  private Boolean cardVerificationIndicator = null;

  @SerializedName("initiator")
  private TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator initiator = null;

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authorization type. Possible values:   - &#x60;AUTOCAPTURE&#x60;: automatic capture.  - &#x60;STANDARDCAPTURE&#x60;: standard capture.  - &#x60;VERBAL&#x60;: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to &#x60;AUTOCAPTURE&#x60; and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to &#x60;STANDARDCAPTURE&#x60; and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the &#x60;auth_type&#x60; field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Forced Capture Set this field to &#x60;VERBAL&#x60; and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  #### Verbal Authorization Set this field to &#x60;VERBAL&#x60; and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \&quot;Verbal Authorizations\&quot; in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). 
   * @return authType
  **/
  @ApiModelProperty(value = "Authorization type. Possible values:   - `AUTOCAPTURE`: automatic capture.  - `STANDARDCAPTURE`: standard capture.  - `VERBAL`: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to `AUTOCAPTURE` and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to `STANDARDCAPTURE` and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the `auth_type` field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Forced Capture Set this field to `VERBAL` and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  #### Verbal Authorization Set this field to `VERBAL` and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \"Verbal Authorizations\" in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). ")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions authIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
    return this;
  }

   /**
   * Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  To set the default for this field, contact CyberSource Customer Support.  #### Barclays and Elavon The default for Barclays and Elavon is 1 (final authorization). To change the default for this field, contact CyberSource Customer Support.  #### CyberSource through VisaNet When the value for this field is 0, it corresponds to the following data in the TC 33 capture file:  - Record: CP01 TCR0  - Position: 164  - Field: Additional Authorization Indicators When the value for this field is 1, it does not correspond to any data in the TC 33 capture file. 
   * @return authIndicator
  **/
  @ApiModelProperty(value = "Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  To set the default for this field, contact CyberSource Customer Support.  #### Barclays and Elavon The default for Barclays and Elavon is 1 (final authorization). To change the default for this field, contact CyberSource Customer Support.  #### CyberSource through VisaNet When the value for this field is 0, it corresponds to the following data in the TC 33 capture file:  - Record: CP01 TCR0  - Position: 164  - Field: Additional Authorization Indicators When the value for this field is 1, it does not correspond to any data in the TC 33 capture file. ")
  public String getAuthIndicator() {
    return authIndicator;
  }

  public void setAuthIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions extendAuthIndicator(String extendAuthIndicator) {
    this.extendAuthIndicator = extendAuthIndicator;
    return this;
  }

   /**
   * Flag that indicates whether the transaction is an extended authorization. 
   * @return extendAuthIndicator
  **/
  @ApiModelProperty(value = "Flag that indicates whether the transaction is an extended authorization. ")
  public String getExtendAuthIndicator() {
    return extendAuthIndicator;
  }

  public void setExtendAuthIndicator(String extendAuthIndicator) {
    this.extendAuthIndicator = extendAuthIndicator;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions cardVerificationIndicator(Boolean cardVerificationIndicator) {
    this.cardVerificationIndicator = cardVerificationIndicator;
    return this;
  }

   /**
   * This API field will indicate whether a card verification check is being performed during the transaction  Possible values:   - &#x60;true&#x60;   - &#x60;false&#x60; (default value) 
   * @return cardVerificationIndicator
  **/
  @ApiModelProperty(value = "This API field will indicate whether a card verification check is being performed during the transaction  Possible values:   - `true`   - `false` (default value) ")
  public Boolean isCardVerificationIndicator() {
    return cardVerificationIndicator;
  }

  public void setCardVerificationIndicator(Boolean cardVerificationIndicator) {
    this.cardVerificationIndicator = cardVerificationIndicator;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions initiator(TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions = (TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.authType, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions.authType) &&
        Objects.equals(this.authIndicator, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions.authIndicator) &&
        Objects.equals(this.extendAuthIndicator, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions.extendAuthIndicator) &&
        Objects.equals(this.cardVerificationIndicator, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions.cardVerificationIndicator) &&
        Objects.equals(this.initiator, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, authIndicator, extendAuthIndicator, cardVerificationIndicator, initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authIndicator: ").append(toIndentedString(authIndicator)).append("\n");
    sb.append("    extendAuthIndicator: ").append(toIndentedString(extendAuthIndicator)).append("\n");
    sb.append("    cardVerificationIndicator: ").append(toIndentedString(cardVerificationIndicator)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

