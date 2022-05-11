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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount {
  @SerializedName("type")
  private String type = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Account type.  Valid values:  - checking : C  - general ledger : G This value is supported only on Wells Fargo ACH  - savings : S (U.S. dollars only)  - corporate checking : X (U.S. dollars only) 
   * @return type
  **/
  @ApiModelProperty(value = "Account type.  Valid values:  - checking : C  - general ledger : G This value is supported only on Wells Fargo ACH  - savings : S (U.S. dollars only)  - corporate checking : X (U.S. dollars only) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount = (Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount) o;
    return Objects.equals(this.type, tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentBankAccount {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

