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
 * Contains address information related to the order
 */
@ApiModel(description = "Contains address information related to the order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class Riskv1liststypeentriesOrderInformationAddress {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Riskv1liststypeentriesOrderInformationAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the street address
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the street address")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Riskv1liststypeentriesOrderInformationAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the street address
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the street address")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Riskv1liststypeentriesOrderInformationAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the street address. Required when adding the address to a list. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the street address. Required when adding the address to a list. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Riskv1liststypeentriesOrderInformationAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the street address. Use the two-character codes located in the Support Center. Required if address1 is present. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the street address. Use the two-character codes located in the Support Center. Required if address1 is present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1liststypeentriesOrderInformationAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State, province, or territory of the street address. Use the two-character codes located in the Support Center.
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State, province, or territory of the street address. Use the two-character codes located in the Support Center.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Riskv1liststypeentriesOrderInformationAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of the street address. Required when adding the address to a list.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of the street address. Required when adding the address to a list.")
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
    Riskv1liststypeentriesOrderInformationAddress riskv1liststypeentriesOrderInformationAddress = (Riskv1liststypeentriesOrderInformationAddress) o;
    return Objects.equals(this.address1, riskv1liststypeentriesOrderInformationAddress.address1) &&
        Objects.equals(this.address2, riskv1liststypeentriesOrderInformationAddress.address2) &&
        Objects.equals(this.locality, riskv1liststypeentriesOrderInformationAddress.locality) &&
        Objects.equals(this.country, riskv1liststypeentriesOrderInformationAddress.country) &&
        Objects.equals(this.administrativeArea, riskv1liststypeentriesOrderInformationAddress.administrativeArea) &&
        Objects.equals(this.postalCode, riskv1liststypeentriesOrderInformationAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, locality, country, administrativeArea, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesOrderInformationAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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

