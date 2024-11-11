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
import Model.Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Flexv2sessionsFieldsOrderInformationShipTo
 */

public class Flexv2sessionsFieldsOrderInformationShipTo {
  @SerializedName("address1")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address1 = null;

  @SerializedName("address2")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address2 = null;

  @SerializedName("administrativeArea")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount administrativeArea = null;

  @SerializedName("buildingNumber")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount buildingNumber = null;

  @SerializedName("country")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount country = null;

  @SerializedName("district")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount district = null;

  @SerializedName("locality")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount locality = null;

  @SerializedName("postalCode")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount postalCode = null;

  @SerializedName("firstName")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount firstName = null;

  @SerializedName("lastName")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount lastName = null;

  @SerializedName("company")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount company = null;

  public Flexv2sessionsFieldsOrderInformationShipTo address1(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getAddress1() {
    return address1;
  }

  public void setAddress1(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address1) {
    this.address1 = address1;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo address2(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getAddress2() {
    return address2;
  }

  public void setAddress2(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount address2) {
    this.address2 = address2;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo administrativeArea(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Get administrativeArea
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo buildingNumber(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo country(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getCountry() {
    return country;
  }

  public void setCountry(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount country) {
    this.country = country;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo district(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getDistrict() {
    return district;
  }

  public void setDistrict(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount district) {
    this.district = district;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo locality(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getLocality() {
    return locality;
  }

  public void setLocality(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount locality) {
    this.locality = locality;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo postalCode(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount postalCode) {
    this.postalCode = postalCode;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo firstName(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getFirstName() {
    return firstName;
  }

  public void setFirstName(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount firstName) {
    this.firstName = firstName;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo lastName(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getLastName() {
    return lastName;
  }

  public void setLastName(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount lastName) {
    this.lastName = lastName;
  }

  public Flexv2sessionsFieldsOrderInformationShipTo company(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getCompany() {
    return company;
  }

  public void setCompany(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flexv2sessionsFieldsOrderInformationShipTo flexv2sessionsFieldsOrderInformationShipTo = (Flexv2sessionsFieldsOrderInformationShipTo) o;
    return Objects.equals(this.address1, flexv2sessionsFieldsOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, flexv2sessionsFieldsOrderInformationShipTo.address2) &&
        Objects.equals(this.administrativeArea, flexv2sessionsFieldsOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.buildingNumber, flexv2sessionsFieldsOrderInformationShipTo.buildingNumber) &&
        Objects.equals(this.country, flexv2sessionsFieldsOrderInformationShipTo.country) &&
        Objects.equals(this.district, flexv2sessionsFieldsOrderInformationShipTo.district) &&
        Objects.equals(this.locality, flexv2sessionsFieldsOrderInformationShipTo.locality) &&
        Objects.equals(this.postalCode, flexv2sessionsFieldsOrderInformationShipTo.postalCode) &&
        Objects.equals(this.firstName, flexv2sessionsFieldsOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, flexv2sessionsFieldsOrderInformationShipTo.lastName) &&
        Objects.equals(this.company, flexv2sessionsFieldsOrderInformationShipTo.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, administrativeArea, buildingNumber, country, district, locality, postalCode, firstName, lastName, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flexv2sessionsFieldsOrderInformationShipTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
