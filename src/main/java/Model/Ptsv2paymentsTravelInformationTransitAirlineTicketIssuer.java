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
 * Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer code(String code) {
    this.code = code;
    return this;
  }

   /**
   * IATA2 airline code. Format: English characters only. 
   * @return code
  **/
  @ApiModelProperty(value = "IATA2 airline code. Format: English characters only. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the ticket issuer. If you do not include this field, CyberSource uses the value for your merchant name that is in the CyberSource merchant configuration database. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the ticket issuer. If you do not include this field, CyberSource uses the value for your merchant name that is in the CyberSource merchant configuration database. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of the company issuing the ticket. 
   * @return address
  **/
  @ApiModelProperty(value = "Address of the company issuing the ticket. ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City in which the transactionoccurred. If the name of the city exceeds 18 characters, use meaningful abbreviations. Format: English characters only 
   * @return locality
  **/
  @ApiModelProperty(value = "City in which the transactionoccurred. If the name of the city exceeds 18 characters, use meaningful abbreviations. Format: English characters only ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State in which transaction occured. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State in which transaction occured. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip code of the city in which transaction occured. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Zip code of the city in which transaction occured. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country in which transaction occured. 
   * @return country
  **/
  @ApiModelProperty(value = "Country in which transaction occured. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer ptsv2paymentsTravelInformationTransitAirlineTicketIssuer = (Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer) o;
    return Objects.equals(this.code, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.code) &&
        Objects.equals(this.name, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.name) &&
        Objects.equals(this.address, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.address) &&
        Objects.equals(this.locality, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.administrativeArea) &&
        Objects.equals(this.postalCode, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.postalCode) &&
        Objects.equals(this.country, ptsv2paymentsTravelInformationTransitAirlineTicketIssuer.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, address, locality, administrativeArea, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationTransitAirlineTicketIssuer {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
