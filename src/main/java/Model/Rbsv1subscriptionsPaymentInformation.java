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
import Model.Rbsv1subscriptionsPaymentInformationCustomer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rbsv1subscriptionsPaymentInformation
 */

public class Rbsv1subscriptionsPaymentInformation {
  @SerializedName("customer")
  private Rbsv1subscriptionsPaymentInformationCustomer customer = null;

  public Rbsv1subscriptionsPaymentInformation customer(Rbsv1subscriptionsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Rbsv1subscriptionsPaymentInformationCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rbsv1subscriptionsPaymentInformation rbsv1subscriptionsPaymentInformation = (Rbsv1subscriptionsPaymentInformation) o;
    return Objects.equals(this.customer, rbsv1subscriptionsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rbsv1subscriptionsPaymentInformation {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

