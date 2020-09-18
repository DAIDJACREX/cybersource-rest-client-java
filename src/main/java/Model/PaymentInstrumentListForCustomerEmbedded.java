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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Payment Instrument Resources. 
 */
@ApiModel(description = "Payment Instrument Resources. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class PaymentInstrumentListForCustomerEmbedded {
  @SerializedName("paymentInstruments")
  private List<Tmsv2customersEmbeddedDefaultPaymentInstrument> paymentInstruments = null;

  public PaymentInstrumentListForCustomerEmbedded paymentInstruments(List<Tmsv2customersEmbeddedDefaultPaymentInstrument> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public PaymentInstrumentListForCustomerEmbedded addPaymentInstrumentsItem(Tmsv2customersEmbeddedDefaultPaymentInstrument paymentInstrumentsItem) {
    if (this.paymentInstruments == null) {
      this.paymentInstruments = new ArrayList<Tmsv2customersEmbeddedDefaultPaymentInstrument>();
    }
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "")
  public List<Tmsv2customersEmbeddedDefaultPaymentInstrument> getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(List<Tmsv2customersEmbeddedDefaultPaymentInstrument> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentListForCustomerEmbedded paymentInstrumentListForCustomerEmbedded = (PaymentInstrumentListForCustomerEmbedded) o;
    return Objects.equals(this.paymentInstruments, paymentInstrumentListForCustomerEmbedded.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentListForCustomerEmbedded {\n");
    
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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

