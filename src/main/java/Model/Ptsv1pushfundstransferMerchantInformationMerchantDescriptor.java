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
 * Ptsv1pushfundstransferMerchantInformationMerchantDescriptor
 */

public class Ptsv1pushfundstransferMerchantInformationMerchantDescriptor {
  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("storeId")
  private String storeId = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state where the merchant is located.  See https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf  Note This field is supported only for businesses located in the U.S. or Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The state where the merchant is located.  See https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf  Note This field is supported only for businesses located in the U.S. or Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see merchant_descriptor_contact field description in Credit Card Services Using the SCMP API.--&gt; Contact information for the merchant.  Note These are the maximum data lengths for the following payment processors:  FDC Compass (13) Chase Paymentech (13). 
   * @return contact
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see merchant_descriptor_contact field description in Credit Card Services Using the SCMP API.--> Contact information for the merchant.  Note These are the maximum data lengths for the following payment processors:  FDC Compass (13) Chase Paymentech (13). ")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Merchant&#39;s country.  Country code for your business location. Use the ISO Standard Alpha Country Codes This value might be displayed on the cardholder&#39;s statement.  See https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf  Note If your business is located in the U.S. or Canada and you include this field in a request, you must also include merchantInformation.merchantDescriptor.administrativeArea. 
   * @return country
  **/
  @ApiModelProperty(value = "Merchant's country.  Country code for your business location. Use the ISO Standard Alpha Country Codes This value might be displayed on the cardholder's statement.  See https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf  Note If your business is located in the U.S. or Canada and you include this field in a request, you must also include merchantInformation.merchantDescriptor.administrativeArea. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  City for your business location. This value might be displayed on the cardholder&#39;s statement. 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  City for your business location. This value might be displayed on the cardholder's statement. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Merchant&#39;s business name. This name is displayed on the cardholder&#39;s statement.  Chase Paymentech, Visa Platform Connect: length 22 
   * @return name
  **/
  @ApiModelProperty(value = "Merchant's business name. This name is displayed on the cardholder's statement.  Chase Paymentech, Visa Platform Connect: length 22 ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * The unique id of the merchant&#39;s shop which assigned by the merchant. 
   * @return storeId
  **/
  @ApiModelProperty(value = "The unique id of the merchant's shop which assigned by the merchant. ")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Ptsv1pushfundstransferMerchantInformationMerchantDescriptor postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Merchant&#39;s postal code. This value might be displayed on the cardholder&#39;s statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: 12345-6789  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: A1B 2C3 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Merchant's postal code. This value might be displayed on the cardholder's statement.  If your business is domiciled in the U.S., you can use a 5-digit or 9-digit postal code. A 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: 12345-6789  If your business is domiciled in Canada, you can use a 6-digit or 9-digit postal code. A 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example: A1B 2C3 ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferMerchantInformationMerchantDescriptor ptsv1pushfundstransferMerchantInformationMerchantDescriptor = (Ptsv1pushfundstransferMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.administrativeArea, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.administrativeArea) &&
        Objects.equals(this.contact, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.contact) &&
        Objects.equals(this.country, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.country) &&
        Objects.equals(this.locality, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.name, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.storeId, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.storeId) &&
        Objects.equals(this.postalCode, ptsv1pushfundstransferMerchantInformationMerchantDescriptor.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeArea, contact, country, locality, name, storeId, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

