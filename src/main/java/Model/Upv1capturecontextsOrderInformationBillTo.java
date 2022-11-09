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
import Model.Upv1capturecontextsOrderInformationBillToCompany;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Upv1capturecontextsOrderInformationBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class Upv1capturecontextsOrderInformationBillTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("address3")
  private String address3 = null;

  @SerializedName("address4")
  private String address4 = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("buildingNumber")
  private String buildingNumber = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("company")
  private Upv1capturecontextsOrderInformationBillToCompany company = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("nameSuffix")
  private String nameSuffix = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("phoneType")
  private String phoneType = null;

  public Upv1capturecontextsOrderInformationBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Payment card billing street address as it appears on the credit card issuer’s records. 
   * @return address1
  **/
  @ApiModelProperty(example = "277 Park Avenue", value = "Payment card billing street address as it appears on the credit card issuer’s records. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Upv1capturecontextsOrderInformationBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Used for additional address information. For example: _Attention: Accounts Payable_ Optional field. 
   * @return address2
  **/
  @ApiModelProperty(example = "50th Floor", value = "Used for additional address information. For example: _Attention: Accounts Payable_ Optional field. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Upv1capturecontextsOrderInformationBillTo address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Additional address information (third line of the billing address)
   * @return address3
  **/
  @ApiModelProperty(example = "Desk NY-50110", value = "Additional address information (third line of the billing address)")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Upv1capturecontextsOrderInformationBillTo address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Additional address information (fourth line of the billing address) 
   * @return address4
  **/
  @ApiModelProperty(example = "address4", value = "Additional address information (fourth line of the billing address) ")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Upv1capturecontextsOrderInformationBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). 
   * @return administrativeArea
  **/
  @ApiModelProperty(example = "NY", value = "State or province of the billing address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Upv1capturecontextsOrderInformationBillTo buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Building number in the street address. 
   * @return buildingNumber
  **/
  @ApiModelProperty(example = "buildingNumber", value = "Building number in the street address. ")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Upv1capturecontextsOrderInformationBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Payment card billing country. Use the two-character [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). 
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Payment card billing country. Use the two-character [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Upv1capturecontextsOrderInformationBillTo district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Customer’s neighborhood, community, or region (a barrio in Brazil) within the city or municipality 
   * @return district
  **/
  @ApiModelProperty(example = "district", value = "Customer’s neighborhood, community, or region (a barrio in Brazil) within the city or municipality ")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Upv1capturecontextsOrderInformationBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Payment card billing city. 
   * @return locality
  **/
  @ApiModelProperty(example = "New York", value = "Payment card billing city. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Upv1capturecontextsOrderInformationBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits. 
   * @return postalCode
  **/
  @ApiModelProperty(example = "10172", value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Upv1capturecontextsOrderInformationBillTo company(Upv1capturecontextsOrderInformationBillToCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Upv1capturecontextsOrderInformationBillToCompany getCompany() {
    return company;
  }

  public void setCompany(Upv1capturecontextsOrderInformationBillToCompany company) {
    this.company = company;
  }

  public Upv1capturecontextsOrderInformationBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address, including the full domain name. 
   * @return email
  **/
  @ApiModelProperty(example = "john.doe@visa.com", value = "Customer's email address, including the full domain name. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Upv1capturecontextsOrderInformationBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer’s first name. This name must be the same as the name on the card
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "Customer’s first name. This name must be the same as the name on the card")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Upv1capturecontextsOrderInformationBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer’s last name. This name must be the same as the name on the card. 
   * @return lastName
  **/
  @ApiModelProperty(example = "Doe", value = "Customer’s last name. This name must be the same as the name on the card. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Upv1capturecontextsOrderInformationBillTo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Customer’s middle name. 
   * @return middleName
  **/
  @ApiModelProperty(example = "F", value = "Customer’s middle name. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Upv1capturecontextsOrderInformationBillTo nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * Customer’s name suffix. 
   * @return nameSuffix
  **/
  @ApiModelProperty(example = "Jr", value = "Customer’s name suffix. ")
  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  public Upv1capturecontextsOrderInformationBillTo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title. 
   * @return title
  **/
  @ApiModelProperty(example = "Mr", value = "Title. ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Upv1capturecontextsOrderInformationBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer’s phone number. 
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "1234567890", value = "Customer’s phone number. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Upv1capturecontextsOrderInformationBillTo phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Customer&#39;s phone number type.  #### For Payouts: This field may be sent only for FDC Compass.  Possible Values: * day * home * night * work 
   * @return phoneType
  **/
  @ApiModelProperty(example = "phoneType", value = "Customer's phone number type.  #### For Payouts: This field may be sent only for FDC Compass.  Possible Values: * day * home * night * work ")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upv1capturecontextsOrderInformationBillTo upv1capturecontextsOrderInformationBillTo = (Upv1capturecontextsOrderInformationBillTo) o;
    return Objects.equals(this.address1, upv1capturecontextsOrderInformationBillTo.address1) &&
        Objects.equals(this.address2, upv1capturecontextsOrderInformationBillTo.address2) &&
        Objects.equals(this.address3, upv1capturecontextsOrderInformationBillTo.address3) &&
        Objects.equals(this.address4, upv1capturecontextsOrderInformationBillTo.address4) &&
        Objects.equals(this.administrativeArea, upv1capturecontextsOrderInformationBillTo.administrativeArea) &&
        Objects.equals(this.buildingNumber, upv1capturecontextsOrderInformationBillTo.buildingNumber) &&
        Objects.equals(this.country, upv1capturecontextsOrderInformationBillTo.country) &&
        Objects.equals(this.district, upv1capturecontextsOrderInformationBillTo.district) &&
        Objects.equals(this.locality, upv1capturecontextsOrderInformationBillTo.locality) &&
        Objects.equals(this.postalCode, upv1capturecontextsOrderInformationBillTo.postalCode) &&
        Objects.equals(this.company, upv1capturecontextsOrderInformationBillTo.company) &&
        Objects.equals(this.email, upv1capturecontextsOrderInformationBillTo.email) &&
        Objects.equals(this.firstName, upv1capturecontextsOrderInformationBillTo.firstName) &&
        Objects.equals(this.lastName, upv1capturecontextsOrderInformationBillTo.lastName) &&
        Objects.equals(this.middleName, upv1capturecontextsOrderInformationBillTo.middleName) &&
        Objects.equals(this.nameSuffix, upv1capturecontextsOrderInformationBillTo.nameSuffix) &&
        Objects.equals(this.title, upv1capturecontextsOrderInformationBillTo.title) &&
        Objects.equals(this.phoneNumber, upv1capturecontextsOrderInformationBillTo.phoneNumber) &&
        Objects.equals(this.phoneType, upv1capturecontextsOrderInformationBillTo.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, administrativeArea, buildingNumber, country, district, locality, postalCode, company, email, firstName, lastName, middleName, nameSuffix, title, phoneNumber, phoneType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upv1capturecontextsOrderInformationBillTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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

