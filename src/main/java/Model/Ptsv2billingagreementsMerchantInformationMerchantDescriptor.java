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
 * Ptsv2billingagreementsMerchantInformationMerchantDescriptor
 */

public class Ptsv2billingagreementsMerchantInformationMerchantDescriptor {
  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("name")
  private String name = null;

  public Ptsv2billingagreementsMerchantInformationMerchantDescriptor postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Merchant&#39;s postal code.  #### PIN debit Postal code for your business location. This value might be displayed on the cardholder&#39;s statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: &#x60;12345-6789&#x60;  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: &#x60;A1B 2C3&#x60;  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada. **Important** Mastercard requires a postal code for any country that uses postal codes. You can provide the postal code in your account or you can include this field in your request.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Merchant's postal code.  #### PIN debit Postal code for your business location. This value might be displayed on the cardholder's statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: `12345-6789`  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: `A1B 2C3`  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada. **Important** Mastercard requires a postal code for any country that uses postal codes. You can provide the postal code in your account or you can include this field in your request.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2billingagreementsMerchantInformationMerchantDescriptor contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see &#x60;merchant_descriptor_contact&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--&gt; Contact information for the merchant.  **Note** These are the maximum data lengths for the following payment processors: - FDCCompass (13) - Paymentech (13) 
   * @return contact
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see `merchant_descriptor_contact` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--> Contact information for the merchant.  **Note** These are the maximum data lengths for the following payment processors: - FDCCompass (13) - Paymentech (13) ")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Ptsv2billingagreementsMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  #### PIN debit City for your business location. This value might be displayed on the cardholder&#39;s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  #### PIN debit City for your business location. This value might be displayed on the cardholder's statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2billingagreementsMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder&#39;s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder&#39;s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. 
   * @return name
  **/
  @ApiModelProperty(value = "Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder's statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder's statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsMerchantInformationMerchantDescriptor ptsv2billingagreementsMerchantInformationMerchantDescriptor = (Ptsv2billingagreementsMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.postalCode, ptsv2billingagreementsMerchantInformationMerchantDescriptor.postalCode) &&
        Objects.equals(this.contact, ptsv2billingagreementsMerchantInformationMerchantDescriptor.contact) &&
        Objects.equals(this.locality, ptsv2billingagreementsMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.name, ptsv2billingagreementsMerchantInformationMerchantDescriptor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, contact, locality, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

