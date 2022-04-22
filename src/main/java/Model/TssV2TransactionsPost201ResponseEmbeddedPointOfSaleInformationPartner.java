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
 * TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner {
  @SerializedName("originalTransactionId")
  private String originalTransactionId = null;

  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner originalTransactionId(String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
    return this;
  }

   /**
   * Value that links the previous transaction to the current follow-on request. This value is assigned by the client software that is installed on the POS terminal, which makes it available to the terminal’s software and to CyberSource. Therefore, you can use this value to reconcile transactions between CyberSource and the terminal’s software.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. 
   * @return originalTransactionId
  **/
  @ApiModelProperty(value = "Value that links the previous transaction to the current follow-on request. This value is assigned by the client software that is installed on the POS terminal, which makes it available to the terminal’s software and to CyberSource. Therefore, you can use this value to reconcile transactions between CyberSource and the terminal’s software.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX. ")
  public String getOriginalTransactionId() {
    return originalTransactionId;
  }

  public void setOriginalTransactionId(String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner = (TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner) o;
    return Objects.equals(this.originalTransactionId, tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner.originalTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner {\n");
    
    sb.append("    originalTransactionId: ").append(toIndentedString(originalTransactionId)).append("\n");
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

