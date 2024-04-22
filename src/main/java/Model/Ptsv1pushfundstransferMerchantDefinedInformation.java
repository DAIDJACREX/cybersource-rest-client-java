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
 * Ptsv1pushfundstransferMerchantDefinedInformation
 */

public class Ptsv1pushfundstransferMerchantDefinedInformation {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public Ptsv1pushfundstransferMerchantDefinedInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The number you assign for as the key for your merchant-defined data field. Valid values are 0 to 100.  For example, to set or access the key for the 2nd merchant-defined data field in the array, you would reference merchantDefinedInformation[1].key.  For Mastercard Send: Name to be displayed in the reconciliation report for this disbursement. This value will appear as a header in the column name of the report. 
   * @return key
  **/
  @ApiModelProperty(value = "The number you assign for as the key for your merchant-defined data field. Valid values are 0 to 100.  For example, to set or access the key for the 2nd merchant-defined data field in the array, you would reference merchantDefinedInformation[1].key.  For Mastercard Send: Name to be displayed in the reconciliation report for this disbursement. This value will appear as a header in the column name of the report. ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Ptsv1pushfundstransferMerchantDefinedInformation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value you assign for your merchant-defined data field.  For details, see merchant_defined_data1 field description in the Credit Card Services Using the SCMP API Guide.  Warning Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver&#39;s license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant&#39;s account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension.  For Mastercard Send: Value to be displayed in the reconciliation report for this disbursement. 
   * @return value
  **/
  @ApiModelProperty(value = "The value you assign for your merchant-defined data field.  For details, see merchant_defined_data1 field description in the Credit Card Services Using the SCMP API Guide.  Warning Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver's license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant's account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension.  For Mastercard Send: Value to be displayed in the reconciliation report for this disbursement. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferMerchantDefinedInformation ptsv1pushfundstransferMerchantDefinedInformation = (Ptsv1pushfundstransferMerchantDefinedInformation) o;
    return Objects.equals(this.key, ptsv1pushfundstransferMerchantDefinedInformation.key) &&
        Objects.equals(this.value, ptsv1pushfundstransferMerchantDefinedInformation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferMerchantDefinedInformation {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

