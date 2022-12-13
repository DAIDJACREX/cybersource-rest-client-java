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
 * Ptsv2paymentsMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Ptsv2paymentsMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("alternateName")
  private String alternateName = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("countryOfOrigin")
  private String countryOfOrigin = null;

  public Ptsv2paymentsMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. 
   * @return name
  **/
  @ApiModelProperty(value = "Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * An alternate name for the merchant.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_alternate&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--&gt; 
   * @return alternateName
  **/
  @ApiModelProperty(value = "An alternate name for the merchant.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_alternate` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--> ")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor contact(String contact) {
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

  public Ptsv2paymentsMerchantInformationMerchantDescriptor address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of merchant&#39;s address. For the descriptions, used-by information, data types, and lengths for these fields, see &#x60;merchant_descriptor_street&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of merchant's address. For the descriptions, used-by information, data types, and lengths for these fields, see `merchant_descriptor_street` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  #### PIN debit City for your business location. This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  #### PIN debit City for your business location. This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Merchant&#39;s country.  #### PIN debit Country code for your business location. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters. **Note** If your business is located in the U.S. or Canada and you include this field in a request, you must also include &#x60;merchantInformation.merchantDescriptor.administrativeArea&#x60;.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return country
  **/
  @ApiModelProperty(value = "Merchant's country.  #### PIN debit Country code for your business location. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters. **Note** If your business is located in the U.S. or Canada and you include this field in a request, you must also include `merchantInformation.merchantDescriptor.administrativeArea`.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Merchant&#39;s postal code.  #### PIN debit Postal code for your business location. This value might be displayed on the cardholder’s statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: &#x60;12345-6789&#x60;  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: &#x60;A1B 2C3&#x60;  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada. **Important** Mastercard requires a postal code for any country that uses postal codes. You can provide the postal code in your account or you can include this field in your request.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Merchant's postal code.  #### PIN debit Postal code for your business location. This value might be displayed on the cardholder’s statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: `12345-6789`  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: `A1B 2C3`  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada. **Important** Mastercard requires a postal code for any country that uses postal codes. You can provide the postal code in your account or you can include this field in your request.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state where the merchant is located.  #### PIN debit State code or region code for your business. Use the Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The state where the merchant is located.  #### PIN debit State code or region code for your business. Use the Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  **Note** This field is supported only for businesses located in the U.S. or Canada.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Merchant phone as contact information for CNP transactions 
   * @return phone
  **/
  @ApiModelProperty(value = "Merchant phone as contact information for CNP transactions ")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Address of company&#39;s website provided by merchant 
   * @return url
  **/
  @ApiModelProperty(value = "Address of company's website provided by merchant ")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor countryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

   /**
   * #### Visa Platform Connect This field will indicate merchant country of origin 
   * @return countryOfOrigin
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect This field will indicate merchant country of origin ")
  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantInformationMerchantDescriptor ptsv2paymentsMerchantInformationMerchantDescriptor = (Ptsv2paymentsMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, ptsv2paymentsMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.alternateName, ptsv2paymentsMerchantInformationMerchantDescriptor.alternateName) &&
        Objects.equals(this.contact, ptsv2paymentsMerchantInformationMerchantDescriptor.contact) &&
        Objects.equals(this.address1, ptsv2paymentsMerchantInformationMerchantDescriptor.address1) &&
        Objects.equals(this.locality, ptsv2paymentsMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.country, ptsv2paymentsMerchantInformationMerchantDescriptor.country) &&
        Objects.equals(this.postalCode, ptsv2paymentsMerchantInformationMerchantDescriptor.postalCode) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsMerchantInformationMerchantDescriptor.administrativeArea) &&
        Objects.equals(this.phone, ptsv2paymentsMerchantInformationMerchantDescriptor.phone) &&
        Objects.equals(this.url, ptsv2paymentsMerchantInformationMerchantDescriptor.url) &&
        Objects.equals(this.countryOfOrigin, ptsv2paymentsMerchantInformationMerchantDescriptor.countryOfOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, alternateName, contact, address1, locality, country, postalCode, administrativeArea, phone, url, countryOfOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
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

