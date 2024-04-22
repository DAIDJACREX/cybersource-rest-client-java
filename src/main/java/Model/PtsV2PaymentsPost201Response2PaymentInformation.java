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
import Model.PtsV2PaymentsPost201Response2PaymentInformationEWallet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201Response2PaymentInformation
 */

public class PtsV2PaymentsPost201Response2PaymentInformation {
  @SerializedName("eWallet")
  private PtsV2PaymentsPost201Response2PaymentInformationEWallet eWallet = null;

  public PtsV2PaymentsPost201Response2PaymentInformation eWallet(PtsV2PaymentsPost201Response2PaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
    return this;
  }

   /**
   * Get eWallet
   * @return eWallet
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response2PaymentInformationEWallet getEWallet() {
    return eWallet;
  }

  public void setEWallet(PtsV2PaymentsPost201Response2PaymentInformationEWallet eWallet) {
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
    PtsV2PaymentsPost201Response2PaymentInformation ptsV2PaymentsPost201Response2PaymentInformation = (PtsV2PaymentsPost201Response2PaymentInformation) o;
    return Objects.equals(this.eWallet, ptsV2PaymentsPost201Response2PaymentInformation.eWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eWallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response2PaymentInformation {\n");
    
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

