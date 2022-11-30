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
 * Ptsv2voidsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Ptsv2voidsProcessingInformation {
  @SerializedName("paymentId")
  private String paymentId = null;

  public Ptsv2voidsProcessingInformation paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * This field is to accept the id of credit/capture in the body of L1 requests so the type of void can be identified and processed correctly downstream.
   * @return paymentId
  **/
  @ApiModelProperty(value = "This field is to accept the id of credit/capture in the body of L1 requests so the type of void can be identified and processed correctly downstream.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2voidsProcessingInformation ptsv2voidsProcessingInformation = (Ptsv2voidsProcessingInformation) o;
    return Objects.equals(this.paymentId, ptsv2voidsProcessingInformation.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2voidsProcessingInformation {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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

