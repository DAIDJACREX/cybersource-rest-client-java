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
import Model.Upv1capturecontextsCaptureMandate;
import Model.Upv1capturecontextsCheckoutApiInitialization;
import Model.Upv1capturecontextsOrderInformation;
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
 * GenerateUnifiedCheckoutCaptureContextRequest
 */

public class GenerateUnifiedCheckoutCaptureContextRequest {
  @SerializedName("targetOrigins")
  private List<String> targetOrigins = null;

  @SerializedName("clientVersion")
  private String clientVersion = null;

  @SerializedName("allowedCardNetworks")
  private List<String> allowedCardNetworks = null;

  @SerializedName("allowedPaymentTypes")
  private List<String> allowedPaymentTypes = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("captureMandate")
  private Upv1capturecontextsCaptureMandate captureMandate = null;

  @SerializedName("orderInformation")
  private Upv1capturecontextsOrderInformation orderInformation = null;

  @SerializedName("checkoutApiInitialization")
  private Upv1capturecontextsCheckoutApiInitialization checkoutApiInitialization = null;

  public GenerateUnifiedCheckoutCaptureContextRequest targetOrigins(List<String> targetOrigins) {
    this.targetOrigins = targetOrigins;
    return this;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest addTargetOriginsItem(String targetOriginsItem) {
    if (this.targetOrigins == null) {
      this.targetOrigins = new ArrayList<String>();
    }
    this.targetOrigins.add(targetOriginsItem);
    return this;
  }

   /**
   * The [target origin](https://developer.mozilla.org/en-US/docs/Glossary/Origin) of the website on which you will be launching Unified Checkout is defined by the scheme (protocol), hostname (domain) and port number (if used).    You must use https://hostname (unless you use http://localhost) Wildcards are NOT supported.  Ensure that subdomains are included. Any valid top-level domain is supported (e.g. .com, .co.uk, .gov.br etc)  Examples:   - https://example.com   - https://subdomain.example.com   - https://example.com:8080&lt;br&gt;&lt;br&gt;  If you are embedding within multiple nested iframes you need to specify the origins of all the browser contexts used, for example:    targetOrigins: [     \&quot;https://example.com\&quot;,     \&quot;https://basket.example.com\&quot;,     \&quot;https://ecom.example.com\&quot;   ] 
   * @return targetOrigins
  **/
  @ApiModelProperty(value = "The [target origin](https://developer.mozilla.org/en-US/docs/Glossary/Origin) of the website on which you will be launching Unified Checkout is defined by the scheme (protocol), hostname (domain) and port number (if used).    You must use https://hostname (unless you use http://localhost) Wildcards are NOT supported.  Ensure that subdomains are included. Any valid top-level domain is supported (e.g. .com, .co.uk, .gov.br etc)  Examples:   - https://example.com   - https://subdomain.example.com   - https://example.com:8080<br><br>  If you are embedding within multiple nested iframes you need to specify the origins of all the browser contexts used, for example:    targetOrigins: [     \"https://example.com\",     \"https://basket.example.com\",     \"https://ecom.example.com\"   ] ")
  public List<String> getTargetOrigins() {
    return targetOrigins;
  }

  public void setTargetOrigins(List<String> targetOrigins) {
    this.targetOrigins = targetOrigins;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest clientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

   /**
   * Specify the version of Unified Checkout that you want to use.
   * @return clientVersion
  **/
  @ApiModelProperty(example = "0.22", value = "Specify the version of Unified Checkout that you want to use.")
  public String getClientVersion() {
    return clientVersion;
  }

  public void setClientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest allowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
    return this;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest addAllowedCardNetworksItem(String allowedCardNetworksItem) {
    if (this.allowedCardNetworks == null) {
      this.allowedCardNetworks = new ArrayList<String>();
    }
    this.allowedCardNetworks.add(allowedCardNetworksItem);
    return this;
  }

   /**
   * The list of card networks you want to use for this Unified Checkout transaction.  Unified Checkout currently supports the following card networks:   - VISA   - MASTERCARD   - AMEX   - DISCOVER   - DINERSCLUB   - JCB 
   * @return allowedCardNetworks
  **/
  @ApiModelProperty(value = "The list of card networks you want to use for this Unified Checkout transaction.  Unified Checkout currently supports the following card networks:   - VISA   - MASTERCARD   - AMEX   - DISCOVER   - DINERSCLUB   - JCB ")
  public List<String> getAllowedCardNetworks() {
    return allowedCardNetworks;
  }

  public void setAllowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest allowedPaymentTypes(List<String> allowedPaymentTypes) {
    this.allowedPaymentTypes = allowedPaymentTypes;
    return this;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest addAllowedPaymentTypesItem(String allowedPaymentTypesItem) {
    if (this.allowedPaymentTypes == null) {
      this.allowedPaymentTypes = new ArrayList<String>();
    }
    this.allowedPaymentTypes.add(allowedPaymentTypesItem);
    return this;
  }

   /**
   * The payment types that are allowed for the merchant.    Possible values when launching Unified Checkout:   - PANENTRY                 - GOOGLEPAY   - SRC   - CHECK &lt;br&gt;&lt;br&gt;  Possible values when launching Unified Checkout with Checkout API: - PANENTRY               - SRC &lt;br&gt;&lt;br&gt;  Possible values when launching Click To Pay Drop-In UI: - CLICKTOPAY &lt;br&gt;&lt;br&gt;  **Important:**    - SRC and CLICKTOPAY are only available for Visa, Mastercard and AMEX. 
   * @return allowedPaymentTypes
  **/
  @ApiModelProperty(value = "The payment types that are allowed for the merchant.    Possible values when launching Unified Checkout:   - PANENTRY                 - GOOGLEPAY   - SRC   - CHECK <br><br>  Possible values when launching Unified Checkout with Checkout API: - PANENTRY               - SRC <br><br>  Possible values when launching Click To Pay Drop-In UI: - CLICKTOPAY <br><br>  **Important:**    - SRC and CLICKTOPAY are only available for Visa, Mastercard and AMEX. ")
  public List<String> getAllowedPaymentTypes() {
    return allowedPaymentTypes;
  }

  public void setAllowedPaymentTypes(List<String> allowedPaymentTypes) {
    this.allowedPaymentTypes = allowedPaymentTypes;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country the purchase is originating from (e.g. country of the merchant).  Use the two-character ISO Standard 
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Country the purchase is originating from (e.g. country of the merchant).  Use the two-character ISO Standard ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Localization of the User experience conforming to the ISO 639-1 language standards and two-character ISO Standard Country Code.  Please refer to list of [supported locales through Unified Checkout](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-appendix-languages.html) 
   * @return locale
  **/
  @ApiModelProperty(example = "en_US", value = "Localization of the User experience conforming to the ISO 639-1 language standards and two-character ISO Standard Country Code.  Please refer to list of [supported locales through Unified Checkout](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-appendix-languages.html) ")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest captureMandate(Upv1capturecontextsCaptureMandate captureMandate) {
    this.captureMandate = captureMandate;
    return this;
  }

   /**
   * Get captureMandate
   * @return captureMandate
  **/
  @ApiModelProperty(value = "")
  public Upv1capturecontextsCaptureMandate getCaptureMandate() {
    return captureMandate;
  }

  public void setCaptureMandate(Upv1capturecontextsCaptureMandate captureMandate) {
    this.captureMandate = captureMandate;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest orderInformation(Upv1capturecontextsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Upv1capturecontextsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Upv1capturecontextsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public GenerateUnifiedCheckoutCaptureContextRequest checkoutApiInitialization(Upv1capturecontextsCheckoutApiInitialization checkoutApiInitialization) {
    this.checkoutApiInitialization = checkoutApiInitialization;
    return this;
  }

   /**
   * Get checkoutApiInitialization
   * @return checkoutApiInitialization
  **/
  @ApiModelProperty(value = "")
  public Upv1capturecontextsCheckoutApiInitialization getCheckoutApiInitialization() {
    return checkoutApiInitialization;
  }

  public void setCheckoutApiInitialization(Upv1capturecontextsCheckoutApiInitialization checkoutApiInitialization) {
    this.checkoutApiInitialization = checkoutApiInitialization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUnifiedCheckoutCaptureContextRequest generateUnifiedCheckoutCaptureContextRequest = (GenerateUnifiedCheckoutCaptureContextRequest) o;
    return Objects.equals(this.targetOrigins, generateUnifiedCheckoutCaptureContextRequest.targetOrigins) &&
        Objects.equals(this.clientVersion, generateUnifiedCheckoutCaptureContextRequest.clientVersion) &&
        Objects.equals(this.allowedCardNetworks, generateUnifiedCheckoutCaptureContextRequest.allowedCardNetworks) &&
        Objects.equals(this.allowedPaymentTypes, generateUnifiedCheckoutCaptureContextRequest.allowedPaymentTypes) &&
        Objects.equals(this.country, generateUnifiedCheckoutCaptureContextRequest.country) &&
        Objects.equals(this.locale, generateUnifiedCheckoutCaptureContextRequest.locale) &&
        Objects.equals(this.captureMandate, generateUnifiedCheckoutCaptureContextRequest.captureMandate) &&
        Objects.equals(this.orderInformation, generateUnifiedCheckoutCaptureContextRequest.orderInformation) &&
        Objects.equals(this.checkoutApiInitialization, generateUnifiedCheckoutCaptureContextRequest.checkoutApiInitialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetOrigins, clientVersion, allowedCardNetworks, allowedPaymentTypes, country, locale, captureMandate, orderInformation, checkoutApiInitialization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnifiedCheckoutCaptureContextRequest {\n");
    
    sb.append("    targetOrigins: ").append(toIndentedString(targetOrigins)).append("\n");
    sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
    sb.append("    allowedCardNetworks: ").append(toIndentedString(allowedCardNetworks)).append("\n");
    sb.append("    allowedPaymentTypes: ").append(toIndentedString(allowedPaymentTypes)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    captureMandate: ").append(toIndentedString(captureMandate)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    checkoutApiInitialization: ").append(toIndentedString(checkoutApiInitialization)).append("\n");
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

