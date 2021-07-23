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
import Model.InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation {
  @SerializedName("merchantLogo")
  private String merchantLogo = null;

  @SerializedName("merchantDisplayName")
  private String merchantDisplayName = null;

  @SerializedName("customEmailMessage")
  private String customEmailMessage = null;

  @SerializedName("enableReminders")
  private Boolean enableReminders = null;

  @SerializedName("headerStyle")
  private InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle = null;

  @SerializedName("deliveryLanguage")
  private String deliveryLanguage = null;

  @SerializedName("defaultCurrencyCode")
  private String defaultCurrencyCode = null;

  @SerializedName("payerAuthentication3DSVersion")
  private String payerAuthentication3DSVersion = null;

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation merchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
    return this;
  }

   /**
   * The image file, which must be encoded in Base64 format. Supported file formats are &#x60;png&#x60;, &#x60;jpg&#x60;, and &#x60;gif&#x60;. The image file size restriction is 1 MB.
   * @return merchantLogo
  **/
  @ApiModelProperty(value = "The image file, which must be encoded in Base64 format. Supported file formats are `png`, `jpg`, and `gif`. The image file size restriction is 1 MB.")
  public String getMerchantLogo() {
    return merchantLogo;
  }

  public void setMerchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation merchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
    return this;
  }

   /**
   * The merchant&#39;s display name shown on the invoice.
   * @return merchantDisplayName
  **/
  @ApiModelProperty(value = "The merchant's display name shown on the invoice.")
  public String getMerchantDisplayName() {
    return merchantDisplayName;
  }

  public void setMerchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation customEmailMessage(String customEmailMessage) {
    this.customEmailMessage = customEmailMessage;
    return this;
  }

   /**
   * The content of the email message that we send to your customers.
   * @return customEmailMessage
  **/
  @ApiModelProperty(value = "The content of the email message that we send to your customers.")
  public String getCustomEmailMessage() {
    return customEmailMessage;
  }

  public void setCustomEmailMessage(String customEmailMessage) {
    this.customEmailMessage = customEmailMessage;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation enableReminders(Boolean enableReminders) {
    this.enableReminders = enableReminders;
    return this;
  }

   /**
   * Whether you would like us to send an auto-generated reminder email to your invoice recipients. Currently, this reminder email is sent five days before the invoice is due and one day after it is past due.
   * @return enableReminders
  **/
  @ApiModelProperty(value = "Whether you would like us to send an auto-generated reminder email to your invoice recipients. Currently, this reminder email is sent five days before the invoice is due and one day after it is past due.")
  public Boolean getEnableReminders() {
    return enableReminders;
  }

  public void setEnableReminders(Boolean enableReminders) {
    this.enableReminders = enableReminders;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation headerStyle(InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle) {
    this.headerStyle = headerStyle;
    return this;
  }

   /**
   * Get headerStyle
   * @return headerStyle
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle getHeaderStyle() {
    return headerStyle;
  }

  public void setHeaderStyle(InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle) {
    this.headerStyle = headerStyle;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation deliveryLanguage(String deliveryLanguage) {
    this.deliveryLanguage = deliveryLanguage;
    return this;
  }

   /**
   * The language of the email that we send to your customers. Possible values are &#x60;zh-CN&#x60;, &#x60;zh-TW&#x60;, &#x60;en-US&#x60;, &#x60;fr-FR&#x60;, &#x60;de-DE&#x60;, &#x60;ja-JP&#x60;, &#x60;pt-BR&#x60;, &#x60;ru-RU&#x60; and &#x60;es-419&#x60;.
   * @return deliveryLanguage
  **/
  @ApiModelProperty(value = "The language of the email that we send to your customers. Possible values are `zh-CN`, `zh-TW`, `en-US`, `fr-FR`, `de-DE`, `ja-JP`, `pt-BR`, `ru-RU` and `es-419`.")
  public String getDeliveryLanguage() {
    return deliveryLanguage;
  }

  public void setDeliveryLanguage(String deliveryLanguage) {
    this.deliveryLanguage = deliveryLanguage;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. 
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. ")
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation payerAuthentication3DSVersion(String payerAuthentication3DSVersion) {
    this.payerAuthentication3DSVersion = payerAuthentication3DSVersion;
    return this;
  }

   /**
   * The 3D Secure payer authentication version or status for a merchant&#39;s invoice payments. Possible values are: - &#x60;1&#x60; - &#x60;2&#x60; - &#x60;None&#x60; - &#x60;Disabled&#x60; 
   * @return payerAuthentication3DSVersion
  **/
  @ApiModelProperty(value = "The 3D Secure payer authentication version or status for a merchant's invoice payments. Possible values are: - `1` - `2` - `None` - `Disabled` ")
  public String getPayerAuthentication3DSVersion() {
    return payerAuthentication3DSVersion;
  }

  public void setPayerAuthentication3DSVersion(String payerAuthentication3DSVersion) {
    this.payerAuthentication3DSVersion = payerAuthentication3DSVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation = (InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation) o;
    return Objects.equals(this.merchantLogo, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.merchantLogo) &&
        Objects.equals(this.merchantDisplayName, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.merchantDisplayName) &&
        Objects.equals(this.customEmailMessage, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.customEmailMessage) &&
        Objects.equals(this.enableReminders, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.enableReminders) &&
        Objects.equals(this.headerStyle, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.headerStyle) &&
        Objects.equals(this.deliveryLanguage, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.deliveryLanguage) &&
        Objects.equals(this.defaultCurrencyCode, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.defaultCurrencyCode) &&
        Objects.equals(this.payerAuthentication3DSVersion, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.payerAuthentication3DSVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantLogo, merchantDisplayName, customEmailMessage, enableReminders, headerStyle, deliveryLanguage, defaultCurrencyCode, payerAuthentication3DSVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation {\n");
    
    sb.append("    merchantLogo: ").append(toIndentedString(merchantLogo)).append("\n");
    sb.append("    merchantDisplayName: ").append(toIndentedString(merchantDisplayName)).append("\n");
    sb.append("    customEmailMessage: ").append(toIndentedString(customEmailMessage)).append("\n");
    sb.append("    enableReminders: ").append(toIndentedString(enableReminders)).append("\n");
    sb.append("    headerStyle: ").append(toIndentedString(headerStyle)).append("\n");
    sb.append("    deliveryLanguage: ").append(toIndentedString(deliveryLanguage)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    payerAuthentication3DSVersion: ").append(toIndentedString(payerAuthentication3DSVersion)).append("\n");
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

