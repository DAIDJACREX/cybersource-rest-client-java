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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor {
  @SerializedName("alternateName")
  private String alternateName = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * Alternate contact information for your business,such as an email address or URL. This value might be displayed on the cardholder’s statement. When you do not include this value in your capture or credit request, CyberSource uses the merchant URL from your CyberSource account. Important This value must consist of English characters 
   * @return alternateName
  **/
  @ApiModelProperty(value = "Alternate contact information for your business,such as an email address or URL. This value might be displayed on the cardholder’s statement. When you do not include this value in your capture or credit request, CyberSource uses the merchant URL from your CyberSource account. Important This value must consist of English characters ")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor = (Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.alternateName, tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor.alternateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
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

