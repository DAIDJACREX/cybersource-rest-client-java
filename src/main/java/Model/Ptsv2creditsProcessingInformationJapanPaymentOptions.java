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
 * Ptsv2creditsProcessingInformationJapanPaymentOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class Ptsv2creditsProcessingInformationJapanPaymentOptions {
  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("installments")
  private String installments = null;

  public Ptsv2creditsProcessingInformationJapanPaymentOptions paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) ")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Ptsv2creditsProcessingInformationJapanPaymentOptions installments(String installments) {
    this.installments = installments;
    return this;
  }

   /**
   * Number of Installments. 
   * @return installments
  **/
  @ApiModelProperty(value = "Number of Installments. ")
  public String getInstallments() {
    return installments;
  }

  public void setInstallments(String installments) {
    this.installments = installments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsProcessingInformationJapanPaymentOptions ptsv2creditsProcessingInformationJapanPaymentOptions = (Ptsv2creditsProcessingInformationJapanPaymentOptions) o;
    return Objects.equals(this.paymentMethod, ptsv2creditsProcessingInformationJapanPaymentOptions.paymentMethod) &&
        Objects.equals(this.installments, ptsv2creditsProcessingInformationJapanPaymentOptions.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, installments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsProcessingInformationJapanPaymentOptions {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
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

