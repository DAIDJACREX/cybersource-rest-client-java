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
 * TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  public TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. 
   * @return name
  **/
  @ApiModelProperty(value = "Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor tssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor = (TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

