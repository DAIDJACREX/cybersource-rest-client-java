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
import Model.TmsPaymentInstrumentProcessingInfoBankTransferOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsPaymentInstrumentProcessingInfo
 */

public class TmsPaymentInstrumentProcessingInfo {
  @SerializedName("billPaymentProgramEnabled")
  private Boolean billPaymentProgramEnabled = null;

  @SerializedName("bankTransferOptions")
  private TmsPaymentInstrumentProcessingInfoBankTransferOptions bankTransferOptions = null;

  public TmsPaymentInstrumentProcessingInfo billPaymentProgramEnabled(Boolean billPaymentProgramEnabled) {
    this.billPaymentProgramEnabled = billPaymentProgramEnabled;
    return this;
  }

   /**
   * Flag that indicates that this is a payment for a bill or for an existing contractual loan. Possible Values: - &#x60;true&#x60;: Bill payment or loan payment. - &#x60;false&#x60; (default): Not a bill payment or loan payment. 
   * @return billPaymentProgramEnabled
  **/
  @ApiModelProperty(value = "Flag that indicates that this is a payment for a bill or for an existing contractual loan. Possible Values: - `true`: Bill payment or loan payment. - `false` (default): Not a bill payment or loan payment. ")
  public Boolean isBillPaymentProgramEnabled() {
    return billPaymentProgramEnabled;
  }

  public void setBillPaymentProgramEnabled(Boolean billPaymentProgramEnabled) {
    this.billPaymentProgramEnabled = billPaymentProgramEnabled;
  }

  public TmsPaymentInstrumentProcessingInfo bankTransferOptions(TmsPaymentInstrumentProcessingInfoBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public TmsPaymentInstrumentProcessingInfoBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(TmsPaymentInstrumentProcessingInfoBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsPaymentInstrumentProcessingInfo tmsPaymentInstrumentProcessingInfo = (TmsPaymentInstrumentProcessingInfo) o;
    return Objects.equals(this.billPaymentProgramEnabled, tmsPaymentInstrumentProcessingInfo.billPaymentProgramEnabled) &&
        Objects.equals(this.bankTransferOptions, tmsPaymentInstrumentProcessingInfo.bankTransferOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billPaymentProgramEnabled, bankTransferOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsPaymentInstrumentProcessingInfo {\n");
    
    sb.append("    billPaymentProgramEnabled: ").append(toIndentedString(billPaymentProgramEnabled)).append("\n");
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
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

