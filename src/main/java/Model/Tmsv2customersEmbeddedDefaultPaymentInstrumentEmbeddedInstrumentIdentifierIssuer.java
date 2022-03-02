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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer {
  @SerializedName("paymentAccountReference")
  private String paymentAccountReference = null;

   /**
   * This reference number serves as a link to the cardholder account and to all transactions for that account. 
   * @return paymentAccountReference
  **/
  @ApiModelProperty(value = "This reference number serves as a link to the cardholder account and to all transactions for that account. ")
  public String getPaymentAccountReference() {
    return paymentAccountReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer = (Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer) o;
    return Objects.equals(this.paymentAccountReference, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer.paymentAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAccountReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer {\n");
    
    sb.append("    paymentAccountReference: ").append(toIndentedString(paymentAccountReference)).append("\n");
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

