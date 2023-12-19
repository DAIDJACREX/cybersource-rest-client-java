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
import Model.Ptsv2billingagreementsMerchantInformationMerchantDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2billingagreementsMerchantInformation
 */

public class Ptsv2billingagreementsMerchantInformation {
  @SerializedName("merchantDescriptor")
  private Ptsv2billingagreementsMerchantInformationMerchantDescriptor merchantDescriptor = null;

  @SerializedName("categoryCode")
  private Integer categoryCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("transactionLocalDateTime")
  private String transactionLocalDateTime = null;

  public Ptsv2billingagreementsMerchantInformation merchantDescriptor(Ptsv2billingagreementsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Ptsv2billingagreementsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public Ptsv2billingagreementsMerchantInformation categoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company&#39;s cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the &#x60;merchant_category_code&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code 
   * maximum: 9999
   * @return categoryCode
  **/
  @ApiModelProperty(value = "The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company's cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the `merchant_category_code` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code ")
  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Ptsv2billingagreementsMerchantInformation administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state where the merchant is located.  #### PIN debit State code or region code for your business. Use the Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) This value might be displayed on the cardholder&#39;s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The state where the merchant is located.  #### PIN debit State code or region code for your business. Use the Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) This value might be displayed on the cardholder's statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2billingagreementsMerchantInformation transactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
    return this;
  }

   /**
   * Date and time at your physical location.  Format: &#x60;YYYYMMDDhhmmss&#x60;, where:  - &#x60;YYYY&#x60; &#x3D; year  - &#x60;MM&#x60; &#x3D; month  - &#x60;DD&#x60; &#x3D; day  - &#x60;hh&#x60; &#x3D; hour  - &#x60;mm&#x60; &#x3D; minutes  - &#x60;ss&#x60; &#x3D; seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. 
   * @return transactionLocalDateTime
  **/
  @ApiModelProperty(value = "Date and time at your physical location.  Format: `YYYYMMDDhhmmss`, where:  - `YYYY` = year  - `MM` = month  - `DD` = day  - `hh` = hour  - `mm` = minutes  - `ss` = seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. ")
  public String getTransactionLocalDateTime() {
    return transactionLocalDateTime;
  }

  public void setTransactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsMerchantInformation ptsv2billingagreementsMerchantInformation = (Ptsv2billingagreementsMerchantInformation) o;
    return Objects.equals(this.merchantDescriptor, ptsv2billingagreementsMerchantInformation.merchantDescriptor) &&
        Objects.equals(this.categoryCode, ptsv2billingagreementsMerchantInformation.categoryCode) &&
        Objects.equals(this.administrativeArea, ptsv2billingagreementsMerchantInformation.administrativeArea) &&
        Objects.equals(this.transactionLocalDateTime, ptsv2billingagreementsMerchantInformation.transactionLocalDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDescriptor, categoryCode, administrativeArea, transactionLocalDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsMerchantInformation {\n");
    
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    transactionLocalDateTime: ").append(toIndentedString(transactionLocalDateTime)).append("\n");
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

