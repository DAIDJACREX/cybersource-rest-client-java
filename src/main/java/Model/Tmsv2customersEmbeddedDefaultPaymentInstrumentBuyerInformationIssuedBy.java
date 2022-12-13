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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy {
  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The State or province where the customer’s driver’s license was issued.  Use the two-character State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The State or province where the customer’s driver’s license was issued.  Use the two-character State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy = (Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy) o;
    return Objects.equals(this.administrativeArea, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy.administrativeArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy {\n");
    
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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

