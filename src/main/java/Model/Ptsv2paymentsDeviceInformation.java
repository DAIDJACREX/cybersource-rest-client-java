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
import Model.Ptsv2paymentsDeviceInformationRawData;
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
 * Ptsv2paymentsDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class Ptsv2paymentsDeviceInformation {
  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  @SerializedName("fingerprintSessionId")
  private String fingerprintSessionId = null;

  @SerializedName("useRawFingerprintSessionId")
  private Boolean useRawFingerprintSessionId = null;

  @SerializedName("deviceType")
  private String deviceType = null;

  @SerializedName("rawData")
  private List<Ptsv2paymentsDeviceInformationRawData> rawData = null;

  @SerializedName("httpAcceptBrowserValue")
  private String httpAcceptBrowserValue = null;

  @SerializedName("httpAcceptContent")
  private String httpAcceptContent = null;

  @SerializedName("httpBrowserEmail")
  private String httpBrowserEmail = null;

  @SerializedName("httpBrowserLanguage")
  private String httpBrowserLanguage = null;

  @SerializedName("httpBrowserJavaEnabled")
  private Boolean httpBrowserJavaEnabled = null;

  @SerializedName("httpBrowserJavaScriptEnabled")
  private Boolean httpBrowserJavaScriptEnabled = null;

  @SerializedName("httpBrowserColorDepth")
  private String httpBrowserColorDepth = null;

  @SerializedName("httpBrowserScreenHeight")
  private String httpBrowserScreenHeight = null;

  @SerializedName("httpBrowserScreenWidth")
  private String httpBrowserScreenWidth = null;

  @SerializedName("httpBrowserTimeDifference")
  private String httpBrowserTimeDifference = null;

  @SerializedName("userAgentBrowserValue")
  private String userAgentBrowserValue = null;

  public Ptsv2paymentsDeviceInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * DNS resolved hostname from &#x60;ipAddress&#x60;.
   * @return hostName
  **/
  @ApiModelProperty(value = "DNS resolved hostname from `ipAddress`.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Ptsv2paymentsDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Ptsv2paymentsDeviceInformation userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Customer’s browser as identified from the HTTP header data. For example, &#x60;Mozilla&#x60; is the value that identifies the Netscape browser. 
   * @return userAgent
  **/
  @ApiModelProperty(value = "Customer’s browser as identified from the HTTP header data. For example, `Mozilla` is the value that identifies the Netscape browser. ")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public Ptsv2paymentsDeviceInformation fingerprintSessionId(String fingerprintSessionId) {
    this.fingerprintSessionId = fingerprintSessionId;
    return this;
  }

   /**
   * Field that contains the session ID that you send to Decision Manager to obtain the device fingerprint information. The string can contain uppercase and lowercase letters, digits, hyphen (-), and underscore (_). However, do not use the same uppercase and lowercase letters to indicate different session IDs.  The session ID must be unique for each merchant ID. You can use any string that you are already generating, such as an order number or web session ID.  The session ID must be unique for each page load, regardless of an individual’s web session ID. If a user navigates to a profiled page and is assigned a web session, navigates away from the profiled page, then navigates back to the profiled page, the generated session ID should be different and unique. You may use a web session ID, but it is preferable to use an application GUID (Globally Unique Identifier). This measure ensures that a unique ID is generated every time the page is loaded, even if it is the same user reloading the page. 
   * @return fingerprintSessionId
  **/
  @ApiModelProperty(value = "Field that contains the session ID that you send to Decision Manager to obtain the device fingerprint information. The string can contain uppercase and lowercase letters, digits, hyphen (-), and underscore (_). However, do not use the same uppercase and lowercase letters to indicate different session IDs.  The session ID must be unique for each merchant ID. You can use any string that you are already generating, such as an order number or web session ID.  The session ID must be unique for each page load, regardless of an individual’s web session ID. If a user navigates to a profiled page and is assigned a web session, navigates away from the profiled page, then navigates back to the profiled page, the generated session ID should be different and unique. You may use a web session ID, but it is preferable to use an application GUID (Globally Unique Identifier). This measure ensures that a unique ID is generated every time the page is loaded, even if it is the same user reloading the page. ")
  public String getFingerprintSessionId() {
    return fingerprintSessionId;
  }

  public void setFingerprintSessionId(String fingerprintSessionId) {
    this.fingerprintSessionId = fingerprintSessionId;
  }

  public Ptsv2paymentsDeviceInformation useRawFingerprintSessionId(Boolean useRawFingerprintSessionId) {
    this.useRawFingerprintSessionId = useRawFingerprintSessionId;
    return this;
  }

   /**
   * Boolean that indicates whether request contains the device fingerprint information. Values: - &#x60;true&#x60;: Use raw fingerprintSessionId when looking up device details. - &#x60;false&#x60; (default): Use merchant id + fingerprintSessionId as the session id for Device detail collection. 
   * @return useRawFingerprintSessionId
  **/
  @ApiModelProperty(value = "Boolean that indicates whether request contains the device fingerprint information. Values: - `true`: Use raw fingerprintSessionId when looking up device details. - `false` (default): Use merchant id + fingerprintSessionId as the session id for Device detail collection. ")
  public Boolean getUseRawFingerprintSessionId() {
    return useRawFingerprintSessionId;
  }

  public void setUseRawFingerprintSessionId(Boolean useRawFingerprintSessionId) {
    this.useRawFingerprintSessionId = useRawFingerprintSessionId;
  }

  public Ptsv2paymentsDeviceInformation deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * The device type at the client side.
   * @return deviceType
  **/
  @ApiModelProperty(value = "The device type at the client side.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Ptsv2paymentsDeviceInformation rawData(List<Ptsv2paymentsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
    return this;
  }

  public Ptsv2paymentsDeviceInformation addRawDataItem(Ptsv2paymentsDeviceInformationRawData rawDataItem) {
    if (this.rawData == null) {
      this.rawData = new ArrayList<Ptsv2paymentsDeviceInformationRawData>();
    }
    this.rawData.add(rawDataItem);
    return this;
  }

   /**
   * Get rawData
   * @return rawData
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsDeviceInformationRawData> getRawData() {
    return rawData;
  }

  public void setRawData(List<Ptsv2paymentsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
  }

  public Ptsv2paymentsDeviceInformation httpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
    return this;
  }

   /**
   * Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. 
   * @return httpAcceptBrowserValue
  **/
  @ApiModelProperty(value = "Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. ")
  public String getHttpAcceptBrowserValue() {
    return httpAcceptBrowserValue;
  }

  public void setHttpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
  }

  public Ptsv2paymentsDeviceInformation httpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
    return this;
  }

   /**
   * The exact content of the HTTP accept header. 
   * @return httpAcceptContent
  **/
  @ApiModelProperty(value = "The exact content of the HTTP accept header. ")
  public String getHttpAcceptContent() {
    return httpAcceptContent;
  }

  public void setHttpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserEmail(String httpBrowserEmail) {
    this.httpBrowserEmail = httpBrowserEmail;
    return this;
  }

   /**
   * Email address set in the customer’s browser, which may differ from customer email. 
   * @return httpBrowserEmail
  **/
  @ApiModelProperty(value = "Email address set in the customer’s browser, which may differ from customer email. ")
  public String getHttpBrowserEmail() {
    return httpBrowserEmail;
  }

  public void setHttpBrowserEmail(String httpBrowserEmail) {
    this.httpBrowserEmail = httpBrowserEmail;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserLanguage(String httpBrowserLanguage) {
    this.httpBrowserLanguage = httpBrowserLanguage;
    return this;
  }

   /**
   * Value represents the browser language as defined in IETF BCP47. Example:en-US, refer  https://en.wikipedia.org/wiki/IETF_language_tag for more details. 
   * @return httpBrowserLanguage
  **/
  @ApiModelProperty(value = "Value represents the browser language as defined in IETF BCP47. Example:en-US, refer  https://en.wikipedia.org/wiki/IETF_language_tag for more details. ")
  public String getHttpBrowserLanguage() {
    return httpBrowserLanguage;
  }

  public void setHttpBrowserLanguage(String httpBrowserLanguage) {
    this.httpBrowserLanguage = httpBrowserLanguage;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserJavaEnabled(Boolean httpBrowserJavaEnabled) {
    this.httpBrowserJavaEnabled = httpBrowserJavaEnabled;
    return this;
  }

   /**
   * A Boolean value that represents the ability of the cardholder browser to execute Java. Value is returned from the navigator.javaEnabled property. Possible Values:True/False 
   * @return httpBrowserJavaEnabled
  **/
  @ApiModelProperty(value = "A Boolean value that represents the ability of the cardholder browser to execute Java. Value is returned from the navigator.javaEnabled property. Possible Values:True/False ")
  public Boolean getHttpBrowserJavaEnabled() {
    return httpBrowserJavaEnabled;
  }

  public void setHttpBrowserJavaEnabled(Boolean httpBrowserJavaEnabled) {
    this.httpBrowserJavaEnabled = httpBrowserJavaEnabled;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserJavaScriptEnabled(Boolean httpBrowserJavaScriptEnabled) {
    this.httpBrowserJavaScriptEnabled = httpBrowserJavaScriptEnabled;
    return this;
  }

   /**
   * A Boolean value that represents the ability of the cardholder browser to execute JavaScript. Possible Values:True/False. **Note**: Merchants should be able to know the values from fingerprint details of cardholder&#39;s browser. 
   * @return httpBrowserJavaScriptEnabled
  **/
  @ApiModelProperty(value = "A Boolean value that represents the ability of the cardholder browser to execute JavaScript. Possible Values:True/False. **Note**: Merchants should be able to know the values from fingerprint details of cardholder's browser. ")
  public Boolean getHttpBrowserJavaScriptEnabled() {
    return httpBrowserJavaScriptEnabled;
  }

  public void setHttpBrowserJavaScriptEnabled(Boolean httpBrowserJavaScriptEnabled) {
    this.httpBrowserJavaScriptEnabled = httpBrowserJavaScriptEnabled;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserColorDepth(String httpBrowserColorDepth) {
    this.httpBrowserColorDepth = httpBrowserColorDepth;
    return this;
  }

   /**
   * Value represents the bit depth of the color palette for displaying images, in bits per pixel. Example : 24, refer https://en.wikipedia.org/wiki/Color_depth for more details 
   * @return httpBrowserColorDepth
  **/
  @ApiModelProperty(value = "Value represents the bit depth of the color palette for displaying images, in bits per pixel. Example : 24, refer https://en.wikipedia.org/wiki/Color_depth for more details ")
  public String getHttpBrowserColorDepth() {
    return httpBrowserColorDepth;
  }

  public void setHttpBrowserColorDepth(String httpBrowserColorDepth) {
    this.httpBrowserColorDepth = httpBrowserColorDepth;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserScreenHeight(String httpBrowserScreenHeight) {
    this.httpBrowserScreenHeight = httpBrowserScreenHeight;
    return this;
  }

   /**
   * Total height of the Cardholder&#39;s scree in pixels, example: 864. 
   * @return httpBrowserScreenHeight
  **/
  @ApiModelProperty(value = "Total height of the Cardholder's scree in pixels, example: 864. ")
  public String getHttpBrowserScreenHeight() {
    return httpBrowserScreenHeight;
  }

  public void setHttpBrowserScreenHeight(String httpBrowserScreenHeight) {
    this.httpBrowserScreenHeight = httpBrowserScreenHeight;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserScreenWidth(String httpBrowserScreenWidth) {
    this.httpBrowserScreenWidth = httpBrowserScreenWidth;
    return this;
  }

   /**
   * Total width of the cardholder&#39;s screen in pixels. Example: 1536. 
   * @return httpBrowserScreenWidth
  **/
  @ApiModelProperty(value = "Total width of the cardholder's screen in pixels. Example: 1536. ")
  public String getHttpBrowserScreenWidth() {
    return httpBrowserScreenWidth;
  }

  public void setHttpBrowserScreenWidth(String httpBrowserScreenWidth) {
    this.httpBrowserScreenWidth = httpBrowserScreenWidth;
  }

  public Ptsv2paymentsDeviceInformation httpBrowserTimeDifference(String httpBrowserTimeDifference) {
    this.httpBrowserTimeDifference = httpBrowserTimeDifference;
    return this;
  }

   /**
   * Time difference between UTC time and the cardholder browser local time, in minutes, Example:300 
   * @return httpBrowserTimeDifference
  **/
  @ApiModelProperty(value = "Time difference between UTC time and the cardholder browser local time, in minutes, Example:300 ")
  public String getHttpBrowserTimeDifference() {
    return httpBrowserTimeDifference;
  }

  public void setHttpBrowserTimeDifference(String httpBrowserTimeDifference) {
    this.httpBrowserTimeDifference = httpBrowserTimeDifference;
  }

  public Ptsv2paymentsDeviceInformation userAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
    return this;
  }

   /**
   * Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. 
   * @return userAgentBrowserValue
  **/
  @ApiModelProperty(value = "Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. ")
  public String getUserAgentBrowserValue() {
    return userAgentBrowserValue;
  }

  public void setUserAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsDeviceInformation ptsv2paymentsDeviceInformation = (Ptsv2paymentsDeviceInformation) o;
    return Objects.equals(this.hostName, ptsv2paymentsDeviceInformation.hostName) &&
        Objects.equals(this.ipAddress, ptsv2paymentsDeviceInformation.ipAddress) &&
        Objects.equals(this.userAgent, ptsv2paymentsDeviceInformation.userAgent) &&
        Objects.equals(this.fingerprintSessionId, ptsv2paymentsDeviceInformation.fingerprintSessionId) &&
        Objects.equals(this.useRawFingerprintSessionId, ptsv2paymentsDeviceInformation.useRawFingerprintSessionId) &&
        Objects.equals(this.deviceType, ptsv2paymentsDeviceInformation.deviceType) &&
        Objects.equals(this.rawData, ptsv2paymentsDeviceInformation.rawData) &&
        Objects.equals(this.httpAcceptBrowserValue, ptsv2paymentsDeviceInformation.httpAcceptBrowserValue) &&
        Objects.equals(this.httpAcceptContent, ptsv2paymentsDeviceInformation.httpAcceptContent) &&
        Objects.equals(this.httpBrowserEmail, ptsv2paymentsDeviceInformation.httpBrowserEmail) &&
        Objects.equals(this.httpBrowserLanguage, ptsv2paymentsDeviceInformation.httpBrowserLanguage) &&
        Objects.equals(this.httpBrowserJavaEnabled, ptsv2paymentsDeviceInformation.httpBrowserJavaEnabled) &&
        Objects.equals(this.httpBrowserJavaScriptEnabled, ptsv2paymentsDeviceInformation.httpBrowserJavaScriptEnabled) &&
        Objects.equals(this.httpBrowserColorDepth, ptsv2paymentsDeviceInformation.httpBrowserColorDepth) &&
        Objects.equals(this.httpBrowserScreenHeight, ptsv2paymentsDeviceInformation.httpBrowserScreenHeight) &&
        Objects.equals(this.httpBrowserScreenWidth, ptsv2paymentsDeviceInformation.httpBrowserScreenWidth) &&
        Objects.equals(this.httpBrowserTimeDifference, ptsv2paymentsDeviceInformation.httpBrowserTimeDifference) &&
        Objects.equals(this.userAgentBrowserValue, ptsv2paymentsDeviceInformation.userAgentBrowserValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, ipAddress, userAgent, fingerprintSessionId, useRawFingerprintSessionId, deviceType, rawData, httpAcceptBrowserValue, httpAcceptContent, httpBrowserEmail, httpBrowserLanguage, httpBrowserJavaEnabled, httpBrowserJavaScriptEnabled, httpBrowserColorDepth, httpBrowserScreenHeight, httpBrowserScreenWidth, httpBrowserTimeDifference, userAgentBrowserValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsDeviceInformation {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    fingerprintSessionId: ").append(toIndentedString(fingerprintSessionId)).append("\n");
    sb.append("    useRawFingerprintSessionId: ").append(toIndentedString(useRawFingerprintSessionId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    httpAcceptBrowserValue: ").append(toIndentedString(httpAcceptBrowserValue)).append("\n");
    sb.append("    httpAcceptContent: ").append(toIndentedString(httpAcceptContent)).append("\n");
    sb.append("    httpBrowserEmail: ").append(toIndentedString(httpBrowserEmail)).append("\n");
    sb.append("    httpBrowserLanguage: ").append(toIndentedString(httpBrowserLanguage)).append("\n");
    sb.append("    httpBrowserJavaEnabled: ").append(toIndentedString(httpBrowserJavaEnabled)).append("\n");
    sb.append("    httpBrowserJavaScriptEnabled: ").append(toIndentedString(httpBrowserJavaScriptEnabled)).append("\n");
    sb.append("    httpBrowserColorDepth: ").append(toIndentedString(httpBrowserColorDepth)).append("\n");
    sb.append("    httpBrowserScreenHeight: ").append(toIndentedString(httpBrowserScreenHeight)).append("\n");
    sb.append("    httpBrowserScreenWidth: ").append(toIndentedString(httpBrowserScreenWidth)).append("\n");
    sb.append("    httpBrowserTimeDifference: ").append(toIndentedString(httpBrowserTimeDifference)).append("\n");
    sb.append("    userAgentBrowserValue: ").append(toIndentedString(userAgentBrowserValue)).append("\n");
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

