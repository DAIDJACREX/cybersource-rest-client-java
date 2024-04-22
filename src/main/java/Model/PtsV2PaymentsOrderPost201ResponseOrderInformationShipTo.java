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
 * PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo
 */

public class PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo {
  @SerializedName("method")
  private String method = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo method(String method) {
    this.method = method;
    return this;
  }

   /**
   * shipping method for the product. Possible values are: - &#x60;sameday&#x60; - &#x60;oneday&#x60; - &#x60;twoday&#x60; - &#x60;threeday&#x60; - &#x60;lowcost&#x60; - &#x60;pickup&#x60; - &#x60;other&#x60; - &#x60;none&#x60; 
   * @return method
  **/
  @ApiModelProperty(value = "shipping method for the product. Possible values are: - `sameday` - `oneday` - `twoday` - `threeday` - `lowcost` - `pickup` - `other` - `none` ")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient. 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the recipient. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the recipient. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the recipient. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of shipping address. Consists of 5 to 9 digits. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of shipping address. Consists of 5 to 9 digits. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of shipping address. This is a State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of shipping address. This is a State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of shipping address. This is a two-character ISO Standard Country Codes. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of shipping address. This is a two-character ISO Standard Country Codes. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number of shipping address. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number of shipping address. ")
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
    PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo = (PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo) o;
    return Objects.equals(this.method, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.method) &&
        Objects.equals(this.firstName, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.lastName) &&
        Objects.equals(this.address1, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.address2) &&
        Objects.equals(this.locality, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.locality) &&
        Objects.equals(this.postalCode, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.postalCode) &&
        Objects.equals(this.administrativeArea, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.country, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.country) &&
        Objects.equals(this.phoneNumber, ptsV2PaymentsOrderPost201ResponseOrderInformationShipTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, firstName, lastName, address1, address2, locality, postalCode, administrativeArea, country, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

