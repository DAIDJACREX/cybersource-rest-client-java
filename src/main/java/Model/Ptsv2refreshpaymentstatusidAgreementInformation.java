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
 * Ptsv2refreshpaymentstatusidAgreementInformation
 */

public class Ptsv2refreshpaymentstatusidAgreementInformation {
  @SerializedName("agreementId")
  private String agreementId = null;

  public Ptsv2refreshpaymentstatusidAgreementInformation agreementId(String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

   /**
   * The identifier for the billing agreement. 
   * @return agreementId
  **/
  @ApiModelProperty(value = "The identifier for the billing agreement. ")
  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2refreshpaymentstatusidAgreementInformation ptsv2refreshpaymentstatusidAgreementInformation = (Ptsv2refreshpaymentstatusidAgreementInformation) o;
    return Objects.equals(this.agreementId, ptsv2refreshpaymentstatusidAgreementInformation.agreementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2refreshpaymentstatusidAgreementInformation {\n");
    
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
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

