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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank
 */

public class PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank {
  @SerializedName("iban")
  private String iban = null;

  public PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN). 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN). ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank ptsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank = (PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank) o;
    return Objects.equals(this.iban, ptsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

