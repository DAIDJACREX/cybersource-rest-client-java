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
 * PtsV2PaymentsPost201ResponsePaymentInformationEWallet
 */

public class PtsV2PaymentsPost201ResponsePaymentInformationEWallet {
  @SerializedName("fundingSource")
  private String fundingSource = null;

  @SerializedName("accountId")
  private String accountId = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationEWallet fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Payment mode for the reference transaction. Possible values: - &#x60;INSTANT_TRANSFER&#x60; - &#x60;MANUAL_BANK_TRANSFER&#x60; - &#x60;DELAYED_TRANSFER&#x60; - &#x60;ECHECK&#x60; 
   * @return fundingSource
  **/
  @ApiModelProperty(value = "Payment mode for the reference transaction. Possible values: - `INSTANT_TRANSFER` - `MANUAL_BANK_TRANSFER` - `DELAYED_TRANSFER` - `ECHECK` ")
  public String getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationEWallet accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the customer, passed in the return_url field by PayPal after customer approval. 
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the customer, passed in the return_url field by PayPal after customer approval. ")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationEWallet ptsV2PaymentsPost201ResponsePaymentInformationEWallet = (PtsV2PaymentsPost201ResponsePaymentInformationEWallet) o;
    return Objects.equals(this.fundingSource, ptsV2PaymentsPost201ResponsePaymentInformationEWallet.fundingSource) &&
        Objects.equals(this.accountId, ptsV2PaymentsPost201ResponsePaymentInformationEWallet.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingSource, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationEWallet {\n");
    
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

