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
 * Ptsv2paymentsPaymentInformationCustomer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class Ptsv2paymentsPaymentInformationCustomer {
  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("id")
  private String id = null;

  public Ptsv2paymentsPaymentInformationCustomer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique identifier for the customer&#39;s card and billing information.  When you use Payment Tokenization or Recurring Billing and you include this value in your request, many of the fields that are normally required for an authorization or credit become optional.  **NOTE** When you use Payment Tokenization or Recurring Billing, the value for the Customer ID is actually the Cybersource payment token for a customer. This token stores information such as the consumer’s card number so it can be applied towards bill payments, recurring payments, or one-time payments. By using this token in a payment API request, the merchant doesn&#39;t need to pass in data such as the card number or expiration date in the request itself.  For details, see the &#x60;subscription_id&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return customerId
  **/
  @ApiModelProperty(value = "Unique identifier for the customer's card and billing information.  When you use Payment Tokenization or Recurring Billing and you include this value in your request, many of the fields that are normally required for an authorization or credit become optional.  **NOTE** When you use Payment Tokenization or Recurring Billing, the value for the Customer ID is actually the Cybersource payment token for a customer. This token stores information such as the consumer’s card number so it can be applied towards bill payments, recurring payments, or one-time payments. By using this token in a payment API request, the merchant doesn't need to pass in data such as the card number or expiration date in the request itself.  For details, see the `subscription_id` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Ptsv2paymentsPaymentInformationCustomer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Customer token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. 
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the Customer token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationCustomer ptsv2paymentsPaymentInformationCustomer = (Ptsv2paymentsPaymentInformationCustomer) o;
    return Objects.equals(this.customerId, ptsv2paymentsPaymentInformationCustomer.customerId) &&
        Objects.equals(this.id, ptsv2paymentsPaymentInformationCustomer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationCustomer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

