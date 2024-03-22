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
import Model.Ptsv2paymentreferencesidintentsPaymentInformationEWallet;
import Model.Ptsv2paymentsidreversalsPaymentInformationPaymentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentreferencesidintentsPaymentInformation
 */

public class Ptsv2paymentreferencesidintentsPaymentInformation {
  @SerializedName("paymentType")
  private Ptsv2paymentsidreversalsPaymentInformationPaymentType paymentType = null;

  @SerializedName("eWallet")
  private Ptsv2paymentreferencesidintentsPaymentInformationEWallet eWallet = null;

  public Ptsv2paymentreferencesidintentsPaymentInformation paymentType(Ptsv2paymentsidreversalsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Ptsv2paymentsidreversalsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public Ptsv2paymentreferencesidintentsPaymentInformation eWallet(Ptsv2paymentreferencesidintentsPaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
    return this;
  }

   /**
   * Get eWallet
   * @return eWallet
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesidintentsPaymentInformationEWallet getEWallet() {
    return eWallet;
  }

  public void setEWallet(Ptsv2paymentreferencesidintentsPaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesidintentsPaymentInformation ptsv2paymentreferencesidintentsPaymentInformation = (Ptsv2paymentreferencesidintentsPaymentInformation) o;
    return Objects.equals(this.paymentType, ptsv2paymentreferencesidintentsPaymentInformation.paymentType) &&
        Objects.equals(this.eWallet, ptsv2paymentreferencesidintentsPaymentInformation.eWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, eWallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesidintentsPaymentInformation {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    eWallet: ").append(toIndentedString(eWallet)).append("\n");
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

