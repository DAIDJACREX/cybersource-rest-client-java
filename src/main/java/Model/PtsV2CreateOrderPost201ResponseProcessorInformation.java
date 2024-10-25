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
 * PtsV2CreateOrderPost201ResponseProcessorInformation
 */

public class PtsV2CreateOrderPost201ResponseProcessorInformation {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("networkTransactionId")
  private String networkTransactionId = null;

  @SerializedName("paymentUrl")
  private String paymentUrl = null;

  public PtsV2CreateOrderPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;processorInformation.networkTransactionId\&quot; in [REST API Fields](https://developer.cybersource.com/content/dam/docs/cybs/en-us/apifields/reference/all/rest/api-fields.pdf)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID &#x3D; 66012345 - Shift number &#x3D; 001 - Batch number &#x3D; 069 - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \"processorInformation.networkTransactionId\" in [REST API Fields](https://developer.cybersource.com/content/dam/docs/cybs/en-us/apifields/reference/all/rest/api-fields.pdf)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID = 66012345 - Shift number = 001 - Batch number = 069 - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2CreateOrderPost201ResponseProcessorInformation networkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
    return this;
  }

   /**
   * Same value as &#x60;processorInformation.transactionId&#x60;
   * @return networkTransactionId
  **/
  @ApiModelProperty(value = "Same value as `processorInformation.transactionId`")
  public String getNetworkTransactionId() {
    return networkTransactionId;
  }

  public void setNetworkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
  }

  public PtsV2CreateOrderPost201ResponseProcessorInformation paymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * Direct the customer to this URL to complete the payment.
   * @return paymentUrl
  **/
  @ApiModelProperty(value = "Direct the customer to this URL to complete the payment.")
  public String getPaymentUrl() {
    return paymentUrl;
  }

  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreateOrderPost201ResponseProcessorInformation ptsV2CreateOrderPost201ResponseProcessorInformation = (PtsV2CreateOrderPost201ResponseProcessorInformation) o;
    return Objects.equals(this.transactionId, ptsV2CreateOrderPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.networkTransactionId, ptsV2CreateOrderPost201ResponseProcessorInformation.networkTransactionId) &&
        Objects.equals(this.paymentUrl, ptsV2CreateOrderPost201ResponseProcessorInformation.paymentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, networkTransactionId, paymentUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreateOrderPost201ResponseProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
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

