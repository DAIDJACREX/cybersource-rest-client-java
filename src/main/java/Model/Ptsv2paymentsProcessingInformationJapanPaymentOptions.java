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
 * Ptsv2paymentsProcessingInformationJapanPaymentOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Ptsv2paymentsProcessingInformationJapanPaymentOptions {
  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("installments")
  private String installments = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("firstBillingMonth")
  private String firstBillingMonth = null;

  @SerializedName("businessName")
  private String businessName = null;

  @SerializedName("businessNameKatakana")
  private String businessNameKatakana = null;

  @SerializedName("jis2TrackData")
  private String jis2TrackData = null;

  @SerializedName("businessNameAlphaNumeric")
  private String businessNameAlphaNumeric = null;

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) ")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions installments(String installments) {
    this.installments = installments;
    return this;
  }

   /**
   * Number of Installments. 
   * @return installments
  **/
  @ApiModelProperty(value = "Number of Installments. ")
  public String getInstallments() {
    return installments;
  }

  public void setInstallments(String installments) {
    this.installments = installments;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Unique Japan Credit Card Association (JCCA) terminal identifier.  The difference between this field and the &#x60;pointOfSaleInformation.terminalID&#x60; field is that you can define &#x60;pointOfSaleInformation.terminalID&#x60;, but &#x60;processingInformation.japanPaymentOptions.terminalId&#x60; is defined by the JCCA and is used only in Japan.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Unique Japan Credit Card Association (JCCA) terminal identifier.  The difference between this field and the `pointOfSaleInformation.terminalID` field is that you can define `pointOfSaleInformation.terminalID`, but `processingInformation.japanPaymentOptions.terminalId` is defined by the JCCA and is used only in Japan.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions firstBillingMonth(String firstBillingMonth) {
    this.firstBillingMonth = firstBillingMonth;
    return this;
  }

   /**
   * Billing month in MM format. 
   * @return firstBillingMonth
  **/
  @ApiModelProperty(value = "Billing month in MM format. ")
  public String getFirstBillingMonth() {
    return firstBillingMonth;
  }

  public void setFirstBillingMonth(String firstBillingMonth) {
    this.firstBillingMonth = firstBillingMonth;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Business name in Japanese characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. 
   * @return businessName
  **/
  @ApiModelProperty(value = "Business name in Japanese characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. ")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions businessNameKatakana(String businessNameKatakana) {
    this.businessNameKatakana = businessNameKatakana;
    return this;
  }

   /**
   * Business name in Katakana characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. 
   * @return businessNameKatakana
  **/
  @ApiModelProperty(value = "Business name in Katakana characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. ")
  public String getBusinessNameKatakana() {
    return businessNameKatakana;
  }

  public void setBusinessNameKatakana(String businessNameKatakana) {
    this.businessNameKatakana = businessNameKatakana;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions jis2TrackData(String jis2TrackData) {
    this.jis2TrackData = jis2TrackData;
    return this;
  }

   /**
   * Japanese Industrial Standard Type 2 (JIS2) track data from the front of the card.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. 
   * @return jis2TrackData
  **/
  @ApiModelProperty(value = "Japanese Industrial Standard Type 2 (JIS2) track data from the front of the card.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. ")
  public String getJis2TrackData() {
    return jis2TrackData;
  }

  public void setJis2TrackData(String jis2TrackData) {
    this.jis2TrackData = jis2TrackData;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptions businessNameAlphaNumeric(String businessNameAlphaNumeric) {
    this.businessNameAlphaNumeric = businessNameAlphaNumeric;
    return this;
  }

   /**
   * Business name in alphanumeric characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. 
   * @return businessNameAlphaNumeric
  **/
  @ApiModelProperty(value = "Business name in alphanumeric characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. ")
  public String getBusinessNameAlphaNumeric() {
    return businessNameAlphaNumeric;
  }

  public void setBusinessNameAlphaNumeric(String businessNameAlphaNumeric) {
    this.businessNameAlphaNumeric = businessNameAlphaNumeric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationJapanPaymentOptions ptsv2paymentsProcessingInformationJapanPaymentOptions = (Ptsv2paymentsProcessingInformationJapanPaymentOptions) o;
    return Objects.equals(this.paymentMethod, ptsv2paymentsProcessingInformationJapanPaymentOptions.paymentMethod) &&
        Objects.equals(this.installments, ptsv2paymentsProcessingInformationJapanPaymentOptions.installments) &&
        Objects.equals(this.terminalId, ptsv2paymentsProcessingInformationJapanPaymentOptions.terminalId) &&
        Objects.equals(this.firstBillingMonth, ptsv2paymentsProcessingInformationJapanPaymentOptions.firstBillingMonth) &&
        Objects.equals(this.businessName, ptsv2paymentsProcessingInformationJapanPaymentOptions.businessName) &&
        Objects.equals(this.businessNameKatakana, ptsv2paymentsProcessingInformationJapanPaymentOptions.businessNameKatakana) &&
        Objects.equals(this.jis2TrackData, ptsv2paymentsProcessingInformationJapanPaymentOptions.jis2TrackData) &&
        Objects.equals(this.businessNameAlphaNumeric, ptsv2paymentsProcessingInformationJapanPaymentOptions.businessNameAlphaNumeric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, installments, terminalId, firstBillingMonth, businessName, businessNameKatakana, jis2TrackData, businessNameAlphaNumeric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationJapanPaymentOptions {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    firstBillingMonth: ").append(toIndentedString(firstBillingMonth)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessNameKatakana: ").append(toIndentedString(businessNameKatakana)).append("\n");
    sb.append("    jis2TrackData: ").append(toIndentedString(jis2TrackData)).append("\n");
    sb.append("    businessNameAlphaNumeric: ").append(toIndentedString(businessNameAlphaNumeric)).append("\n");
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

