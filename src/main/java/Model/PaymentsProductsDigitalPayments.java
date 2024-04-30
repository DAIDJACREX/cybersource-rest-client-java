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
import Model.PaymentsProductsDigitalPaymentsSubscriptionInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProductsDigitalPayments
 */

public class PaymentsProductsDigitalPayments {
  @SerializedName("subscriptionInformation")
  private PaymentsProductsDigitalPaymentsSubscriptionInformation subscriptionInformation = null;

  public PaymentsProductsDigitalPayments subscriptionInformation(PaymentsProductsDigitalPaymentsSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
    return this;
  }

   /**
   * Get subscriptionInformation
   * @return subscriptionInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsDigitalPaymentsSubscriptionInformation getSubscriptionInformation() {
    return subscriptionInformation;
  }

  public void setSubscriptionInformation(PaymentsProductsDigitalPaymentsSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsDigitalPayments paymentsProductsDigitalPayments = (PaymentsProductsDigitalPayments) o;
    return Objects.equals(this.subscriptionInformation, paymentsProductsDigitalPayments.subscriptionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsDigitalPayments {\n");
    
    sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
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

