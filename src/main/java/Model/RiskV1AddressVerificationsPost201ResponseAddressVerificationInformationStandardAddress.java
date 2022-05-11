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
import Model.RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress {
  @SerializedName("address1")
  private RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("address3")
  private String address3 = null;

  @SerializedName("address4")
  private String address4 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("county")
  private String county = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("csz")
  private String csz = null;

  @SerializedName("isoCountry")
  private String isoCountry = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress address1(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 getAddress1() {
    return address1;
  }

  public void setAddress1(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 address1) {
    this.address1 = address1;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the standardized address.
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the standardized address.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Third line of the standardized address.
   * @return address3
  **/
  @ApiModelProperty(value = "Third line of the standardized address.")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Fourth line of the standardized address.
   * @return address4
  **/
  @ApiModelProperty(value = "Fourth line of the standardized address.")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Standardized city name.
   * @return locality
  **/
  @ApiModelProperty(value = "Standardized city name.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress county(String county) {
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

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Standardized country name.
   * @return country
  **/
  @ApiModelProperty(value = "Standardized country name.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress csz(String csz) {
    this.csz = csz;
    return this;
  }

   /**
   * Standardized city, state or province, and ZIP +4 code or postal code line.
   * @return csz
  **/
  @ApiModelProperty(value = "Standardized city, state or province, and ZIP +4 code or postal code line.")
  public String getCsz() {
    return csz;
  }

  public void setCsz(String csz) {
    this.csz = csz;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress isoCountry(String isoCountry) {
    this.isoCountry = isoCountry;
    return this;
  }

   /**
   * Standardized two-character ISO country code.
   * @return isoCountry
  **/
  @ApiModelProperty(value = "Standardized two-character ISO country code.")
  public String getIsoCountry() {
    return isoCountry;
  }

  public void setIsoCountry(String isoCountry) {
    this.isoCountry = isoCountry;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * U.S.P.S. standardized state or province abbreviation.
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "U.S.P.S. standardized state or province abbreviation.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Standardized U.S. ZIP + 4 postal code.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Standardized U.S. ZIP + 4 postal code.")
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
    RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress = (RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress) o;
    return Objects.equals(this.address1, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.address1) &&
        Objects.equals(this.address2, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.address2) &&
        Objects.equals(this.address3, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.address3) &&
        Objects.equals(this.address4, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.address4) &&
        Objects.equals(this.locality, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.locality) &&
        Objects.equals(this.county, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.county) &&
        Objects.equals(this.country, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.country) &&
        Objects.equals(this.csz, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.csz) &&
        Objects.equals(this.isoCountry, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.isoCountry) &&
        Objects.equals(this.administrativeArea, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.administrativeArea) &&
        Objects.equals(this.postalCode, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, locality, county, country, csz, isoCountry, administrativeArea, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    csz: ").append(toIndentedString(csz)).append("\n");
    sb.append("    isoCountry: ").append(toIndentedString(isoCountry)).append("\n");
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

