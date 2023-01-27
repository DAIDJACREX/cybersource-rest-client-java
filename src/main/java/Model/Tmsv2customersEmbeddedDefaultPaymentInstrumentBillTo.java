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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer’s first name. This name must be the same as the name on the card. 
   * @return firstName
  **/
  @ApiModelProperty(value = "Customer’s first name. This name must be the same as the name on the card. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer’s last name. This name must be the same as the name on the card. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Customer’s last name. This name must be the same as the name on the card. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the customer’s company. 
   * @return company
  **/
  @ApiModelProperty(value = "Name of the customer’s company. ")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Payment card billing street address as it appears on the credit card issuer’s records. 
   * @return address1
  **/
  @ApiModelProperty(value = "Payment card billing street address as it appears on the credit card issuer’s records. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Additional address information. 
   * @return address2
  **/
  @ApiModelProperty(value = "Additional address information. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Payment card billing city. 
   * @return locality
  **/
  @ApiModelProperty(value = "Payment card billing city. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  **Example** &#x60;12345-6789&#x60;  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  **Example** &#x60;A1B 2C3&#x60; 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  **Example** `12345-6789`  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  **Example** `A1B 2C3` ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Payment card billing country. Use the two-character ISO Standard Country Codes. 
   * @return country
  **/
  @ApiModelProperty(value = "Payment card billing country. Use the two-character ISO Standard Country Codes. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address, including the full domain name. 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's email address, including the full domain name. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer’s phone number. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Customer’s phone number. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo = (Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo) o;
    return Objects.equals(this.firstName, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.firstName) &&
        Objects.equals(this.lastName, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.lastName) &&
        Objects.equals(this.company, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.company) &&
        Objects.equals(this.address1, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.address1) &&
        Objects.equals(this.address2, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.address2) &&
        Objects.equals(this.locality, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.locality) &&
        Objects.equals(this.administrativeArea, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.postalCode) &&
        Objects.equals(this.country, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.country) &&
        Objects.equals(this.email, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.email) &&
        Objects.equals(this.phoneNumber, tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, company, address1, address2, locality, administrativeArea, postalCode, country, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentBillTo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

