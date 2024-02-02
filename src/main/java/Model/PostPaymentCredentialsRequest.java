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
 * PostPaymentCredentialsRequest
 */

public class PostPaymentCredentialsRequest {
  @SerializedName("paymentCredentialType")
  private String paymentCredentialType = null;

  public PostPaymentCredentialsRequest paymentCredentialType(String paymentCredentialType) {
    this.paymentCredentialType = paymentCredentialType;
    return this;
  }

   /**
   * The type of payment credentials to be returned. By default, payment credentials include network token and cryptogram or dynamic CVV. If \&quot;NETWORK_TOKEN\&quot; is supplied then only network token will be returned and cryptogram or dynamic CVV will be excluded.   Possible Values:   - NETWORK_TOKEN 
   * @return paymentCredentialType
  **/
  @ApiModelProperty(value = "The type of payment credentials to be returned. By default, payment credentials include network token and cryptogram or dynamic CVV. If \"NETWORK_TOKEN\" is supplied then only network token will be returned and cryptogram or dynamic CVV will be excluded.   Possible Values:   - NETWORK_TOKEN ")
  public String getPaymentCredentialType() {
    return paymentCredentialType;
  }

  public void setPaymentCredentialType(String paymentCredentialType) {
    this.paymentCredentialType = paymentCredentialType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentCredentialsRequest postPaymentCredentialsRequest = (PostPaymentCredentialsRequest) o;
    return Objects.equals(this.paymentCredentialType, postPaymentCredentialsRequest.paymentCredentialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCredentialType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentCredentialsRequest {\n");
    
    sb.append("    paymentCredentialType: ").append(toIndentedString(paymentCredentialType)).append("\n");
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

