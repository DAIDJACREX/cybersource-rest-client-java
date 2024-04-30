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
import Model.PtsV2PaymentsOrderPost201ResponseProcessorInformationSellerProtection;
import Model.PtsV2PaymentsPost201Response1ProcessorInformationAvs;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsOrderPost201ResponseProcessorInformation
 */

public class PtsV2PaymentsOrderPost201ResponseProcessorInformation {
  @SerializedName("sellerProtection")
  private PtsV2PaymentsOrderPost201ResponseProcessorInformationSellerProtection sellerProtection = null;

  @SerializedName("avs")
  private PtsV2PaymentsPost201Response1ProcessorInformationAvs avs = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("responseDetails")
  private String responseDetails = null;

  public PtsV2PaymentsOrderPost201ResponseProcessorInformation sellerProtection(PtsV2PaymentsOrderPost201ResponseProcessorInformationSellerProtection sellerProtection) {
    this.sellerProtection = sellerProtection;
    return this;
  }

   /**
   * Get sellerProtection
   * @return sellerProtection
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseProcessorInformationSellerProtection getSellerProtection() {
    return sellerProtection;
  }

  public void setSellerProtection(PtsV2PaymentsOrderPost201ResponseProcessorInformationSellerProtection sellerProtection) {
    this.sellerProtection = sellerProtection;
  }

  public PtsV2PaymentsOrderPost201ResponseProcessorInformation avs(PtsV2PaymentsPost201Response1ProcessorInformationAvs avs) {
    this.avs = avs;
    return this;
  }

   /**
   * Get avs
   * @return avs
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1ProcessorInformationAvs getAvs() {
    return avs;
  }

  public void setAvs(PtsV2PaymentsPost201Response1ProcessorInformationAvs avs) {
    this.avs = avs;
  }

  public PtsV2PaymentsOrderPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;Network Transaction Identifiers\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID &#x3D; 66012345 - Shift number &#x3D; 001 - Batch number &#x3D; 069 - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \"Network Transaction Identifiers\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID = 66012345 - Shift number = 001 - Batch number = 069 - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PaymentsOrderPost201ResponseProcessorInformation responseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
    return this;
  }

   /**
   * This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. 
   * @return responseDetails
  **/
  @ApiModelProperty(value = "This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. ")
  public String getResponseDetails() {
    return responseDetails;
  }

  public void setResponseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsOrderPost201ResponseProcessorInformation ptsV2PaymentsOrderPost201ResponseProcessorInformation = (PtsV2PaymentsOrderPost201ResponseProcessorInformation) o;
    return Objects.equals(this.sellerProtection, ptsV2PaymentsOrderPost201ResponseProcessorInformation.sellerProtection) &&
        Objects.equals(this.avs, ptsV2PaymentsOrderPost201ResponseProcessorInformation.avs) &&
        Objects.equals(this.transactionId, ptsV2PaymentsOrderPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.responseDetails, ptsV2PaymentsOrderPost201ResponseProcessorInformation.responseDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerProtection, avs, transactionId, responseDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponseProcessorInformation {\n");
    
    sb.append("    sellerProtection: ").append(toIndentedString(sellerProtection)).append("\n");
    sb.append("    avs: ").append(toIndentedString(avs)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    responseDetails: ").append(toIndentedString(responseDetails)).append("\n");
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

