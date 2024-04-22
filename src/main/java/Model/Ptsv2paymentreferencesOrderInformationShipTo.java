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
 * Ptsv2paymentreferencesOrderInformationShipTo
 */

public class Ptsv2paymentreferencesOrderInformationShipTo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("buildingNumber")
  private String buildingNumber = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("immutable")
  private String immutable = null;

  @SerializedName("notApplicable")
  private String notApplicable = null;

  @SerializedName("county")
  private String county = null;

  public Ptsv2paymentreferencesOrderInformationShipTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s primary email address, including the full domain name. 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's primary email address, including the full domain name. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the person receiving the product.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the person receiving the product.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. 
   * @return middleName
  **/
  @ApiModelProperty(value = "Middle name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the customer&#39;s company.  For processor-specific information, see the company_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return company
  **/
  @ApiModelProperty(value = "Name of the customer's company.  For processor-specific information, see the company_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address.  Optional field.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address.  Optional field.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Neighborhood, community, or region within a city or municipality.
   * @return district
  **/
  @ApiModelProperty(value = "Neighborhood, community, or region within a city or municipality.")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) (maximum length: 2)   Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf) (maximum length: 2)   Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder&#39;s location when shipTo objects are not present. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder's location when shipTo objects are not present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Building number in the street address. For example, the building number is 187 in the following address:  Rua da Quitanda 187 
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "Building number in the street address. For example, the building number is 187 in the following address:  Rua da Quitanda 187 ")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number associated with the shipping address.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the shipping address.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo immutable(String immutable) {
    this.immutable = immutable;
    return this;
  }

   /**
   * Indicates whether customers are permitted to edit the shipping address in their PayPal account. Possible values: - true: Customer cannot edit the shipping address. - false (default): Customer can edit the shipping address. 
   * @return immutable
  **/
  @ApiModelProperty(value = "Indicates whether customers are permitted to edit the shipping address in their PayPal account. Possible values: - true: Customer cannot edit the shipping address. - false (default): Customer can edit the shipping address. ")
  public String getImmutable() {
    return immutable;
  }

  public void setImmutable(String immutable) {
    this.immutable = immutable;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo notApplicable(String notApplicable) {
    this.notApplicable = notApplicable;
    return this;
  }

   /**
   * Indicates whether the shipping address is displayed to the customer in their PayPal account. Possible values: - true: Shipping address is not displayed. - false (default): Shipping address is displayed. For example, for digital downloads and services in which a shipping address is not required, set the value to true. 
   * @return notApplicable
  **/
  @ApiModelProperty(value = "Indicates whether the shipping address is displayed to the customer in their PayPal account. Possible values: - true: Shipping address is not displayed. - false (default): Shipping address is displayed. For example, for digital downloads and services in which a shipping address is not required, set the value to true. ")
  public String getNotApplicable() {
    return notApplicable;
  }

  public void setNotApplicable(String notApplicable) {
    this.notApplicable = notApplicable;
  }

  public Ptsv2paymentreferencesOrderInformationShipTo county(String county) {
    this.county = county;
    return this;
  }

   /**
   * U.S. county if available.
   * @return county
  **/
  @ApiModelProperty(value = "U.S. county if available.")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesOrderInformationShipTo ptsv2paymentreferencesOrderInformationShipTo = (Ptsv2paymentreferencesOrderInformationShipTo) o;
    return Objects.equals(this.email, ptsv2paymentreferencesOrderInformationShipTo.email) &&
        Objects.equals(this.title, ptsv2paymentreferencesOrderInformationShipTo.title) &&
        Objects.equals(this.firstName, ptsv2paymentreferencesOrderInformationShipTo.firstName) &&
        Objects.equals(this.middleName, ptsv2paymentreferencesOrderInformationShipTo.middleName) &&
        Objects.equals(this.lastName, ptsv2paymentreferencesOrderInformationShipTo.lastName) &&
        Objects.equals(this.company, ptsv2paymentreferencesOrderInformationShipTo.company) &&
        Objects.equals(this.address1, ptsv2paymentreferencesOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, ptsv2paymentreferencesOrderInformationShipTo.address2) &&
        Objects.equals(this.district, ptsv2paymentreferencesOrderInformationShipTo.district) &&
        Objects.equals(this.locality, ptsv2paymentreferencesOrderInformationShipTo.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentreferencesOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.postalCode, ptsv2paymentreferencesOrderInformationShipTo.postalCode) &&
        Objects.equals(this.country, ptsv2paymentreferencesOrderInformationShipTo.country) &&
        Objects.equals(this.buildingNumber, ptsv2paymentreferencesOrderInformationShipTo.buildingNumber) &&
        Objects.equals(this.phoneNumber, ptsv2paymentreferencesOrderInformationShipTo.phoneNumber) &&
        Objects.equals(this.immutable, ptsv2paymentreferencesOrderInformationShipTo.immutable) &&
        Objects.equals(this.notApplicable, ptsv2paymentreferencesOrderInformationShipTo.notApplicable) &&
        Objects.equals(this.county, ptsv2paymentreferencesOrderInformationShipTo.county);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, title, firstName, middleName, lastName, company, address1, address2, district, locality, administrativeArea, postalCode, country, buildingNumber, phoneNumber, immutable, notApplicable, county);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesOrderInformationShipTo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
    sb.append("    notApplicable: ").append(toIndentedString(notApplicable)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
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

