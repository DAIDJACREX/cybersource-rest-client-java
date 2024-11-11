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
 * PushFunds201ResponsePaymentInformationTokenizedCard
 */

public class PushFunds201ResponsePaymentInformationTokenizedCard {
  @SerializedName("assuranceMethod")
  private String assuranceMethod = null;

  public PushFunds201ResponsePaymentInformationTokenizedCard assuranceMethod(String assuranceMethod) {
    this.assuranceMethod = assuranceMethod;
    return this;
  }

   /**
   * Confidence level of the tokenization. This value is assigned by the token service provider.  Valid Values:  Spaces (No value set)  00 &#x3D; No issuer ID&amp;V  10 &#x3D; Card issuer account verification  11 &#x3D; Card issuer interactive cardholder authentication - 1 factor  12 &#x3D; Card issuer interactive cardholder authentication - 2 factor  13 &#x3D; Card issuer risk oriented non-interactive cardholder authentication  14 &#x3D; Card issuer asserted authentication 
   * @return assuranceMethod
  **/
  @ApiModelProperty(value = "Confidence level of the tokenization. This value is assigned by the token service provider.  Valid Values:  Spaces (No value set)  00 = No issuer ID&V  10 = Card issuer account verification  11 = Card issuer interactive cardholder authentication - 1 factor  12 = Card issuer interactive cardholder authentication - 2 factor  13 = Card issuer risk oriented non-interactive cardholder authentication  14 = Card issuer asserted authentication ")
  public String getAssuranceMethod() {
    return assuranceMethod;
  }

  public void setAssuranceMethod(String assuranceMethod) {
    this.assuranceMethod = assuranceMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponsePaymentInformationTokenizedCard pushFunds201ResponsePaymentInformationTokenizedCard = (PushFunds201ResponsePaymentInformationTokenizedCard) o;
    return Objects.equals(this.assuranceMethod, pushFunds201ResponsePaymentInformationTokenizedCard.assuranceMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assuranceMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponsePaymentInformationTokenizedCard {\n");
    
    sb.append("    assuranceMethod: ").append(toIndentedString(assuranceMethod)).append("\n");
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
