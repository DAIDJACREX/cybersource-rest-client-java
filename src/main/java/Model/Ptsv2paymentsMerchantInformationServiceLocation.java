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
 * Ptsv2paymentsMerchantInformationServiceLocation
 */

public class Ptsv2paymentsMerchantInformationServiceLocation {
  @SerializedName("locality")
  private String locality = null;

  @SerializedName("countrySubdivisionCode")
  private String countrySubdivisionCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Ptsv2paymentsMerchantInformationServiceLocation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * #### Visa Platform Connect  Merchant’s service location city name. When merchant provides services from a location other than the location identified as merchant location. 
   * @return locality
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect  Merchant’s service location city name. When merchant provides services from a location other than the location identified as merchant location. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsMerchantInformationServiceLocation countrySubdivisionCode(String countrySubdivisionCode) {
    this.countrySubdivisionCode = countrySubdivisionCode;
    return this;
  }

   /**
   * #### Visa Platform Connect  Merchant’s service location country subdivision code. When merchant provides services from a location other than the location identified as merchant location. 
   * @return countrySubdivisionCode
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect  Merchant’s service location country subdivision code. When merchant provides services from a location other than the location identified as merchant location. ")
  public String getCountrySubdivisionCode() {
    return countrySubdivisionCode;
  }

  public void setCountrySubdivisionCode(String countrySubdivisionCode) {
    this.countrySubdivisionCode = countrySubdivisionCode;
  }

  public Ptsv2paymentsMerchantInformationServiceLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * #### Visa Platform Connect  Merchant’s service location country code. When merchant provides services from a location other than the location identified as merchant location. 
   * @return countryCode
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect  Merchant’s service location country code. When merchant provides services from a location other than the location identified as merchant location. ")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Ptsv2paymentsMerchantInformationServiceLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * #### Visa Platform Connect  Merchant’s service location postal code. When merchant provides services from a location other than the location identified as merchant location. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect  Merchant’s service location postal code. When merchant provides services from a location other than the location identified as merchant location. ")
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
    Ptsv2paymentsMerchantInformationServiceLocation ptsv2paymentsMerchantInformationServiceLocation = (Ptsv2paymentsMerchantInformationServiceLocation) o;
    return Objects.equals(this.locality, ptsv2paymentsMerchantInformationServiceLocation.locality) &&
        Objects.equals(this.countrySubdivisionCode, ptsv2paymentsMerchantInformationServiceLocation.countrySubdivisionCode) &&
        Objects.equals(this.countryCode, ptsv2paymentsMerchantInformationServiceLocation.countryCode) &&
        Objects.equals(this.postalCode, ptsv2paymentsMerchantInformationServiceLocation.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locality, countrySubdivisionCode, countryCode, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformationServiceLocation {\n");
    
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    countrySubdivisionCode: ").append(toIndentedString(countrySubdivisionCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

