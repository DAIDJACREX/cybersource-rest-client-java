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
 * Riskv1exportcomplianceinquiriesOrderInformationShipTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Riskv1exportcomplianceinquiriesOrderInformationShipTo {
  @SerializedName("country")
  private String country = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  public Riskv1exportcomplianceinquiriesOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationShipTo firstName(String firstName) {
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

  public Riskv1exportcomplianceinquiriesOrderInformationShipTo lastName(String lastName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesOrderInformationShipTo riskv1exportcomplianceinquiriesOrderInformationShipTo = (Riskv1exportcomplianceinquiriesOrderInformationShipTo) o;
    return Objects.equals(this.country, riskv1exportcomplianceinquiriesOrderInformationShipTo.country) &&
        Objects.equals(this.firstName, riskv1exportcomplianceinquiriesOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, riskv1exportcomplianceinquiriesOrderInformationShipTo.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesOrderInformationShipTo {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

