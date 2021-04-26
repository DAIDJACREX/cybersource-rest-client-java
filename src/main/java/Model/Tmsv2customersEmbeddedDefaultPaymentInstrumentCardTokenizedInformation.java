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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation {
  @SerializedName("requestorID")
  private String requestorID = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation requestorID(String requestorID) {
    this.requestorID = requestorID;
    return this;
  }

   /**
   * Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. 
   * @return requestorID
  **/
  @ApiModelProperty(value = "Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. ")
  public String getRequestorID() {
    return requestorID;
  }

  public void setRequestorID(String requestorID) {
    this.requestorID = requestorID;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Set the value for this field to 1. An application on the customer’s mobile device provided the token data. 
   * @return transactionType
  **/
  @ApiModelProperty(value = "Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Set the value for this field to 1. An application on the customer’s mobile device provided the token data. ")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation = (Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation) o;
    return Objects.equals(this.requestorID, tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation.requestorID) &&
        Objects.equals(this.transactionType, tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestorID, transactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation {\n");
    
    sb.append("    requestorID: ").append(toIndentedString(requestorID)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

