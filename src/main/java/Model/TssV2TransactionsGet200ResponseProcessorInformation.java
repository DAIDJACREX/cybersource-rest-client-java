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
import Model.PtsV2PaymentsPost201ResponseProcessorInformationAchVerification;
import Model.PtsV2PaymentsPost201ResponseProcessorInformationAvs;
import Model.Riskv1decisionsProcessorInformationCardVerification;
import Model.TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults;
import Model.TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting;
import Model.TssV2TransactionsGet200ResponseProcessorInformationProcessor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TssV2TransactionsGet200ResponseProcessorInformation
 */

public class TssV2TransactionsGet200ResponseProcessorInformation {
  @SerializedName("processor")
  private TssV2TransactionsGet200ResponseProcessorInformationProcessor processor = null;

  @SerializedName("multiProcessorRouting")
  private List<TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting> multiProcessorRouting = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("networkTransactionId")
  private String networkTransactionId = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  @SerializedName("responseId")
  private String responseId = null;

  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("avs")
  private PtsV2PaymentsPost201ResponseProcessorInformationAvs avs = null;

  @SerializedName("cardVerification")
  private Riskv1decisionsProcessorInformationCardVerification cardVerification = null;

  @SerializedName("achVerification")
  private PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification = null;

  @SerializedName("electronicVerificationResults")
  private TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("responseCodeSource")
  private String responseCodeSource = null;

  @SerializedName("paymentAccountReferenceNumber")
  private String paymentAccountReferenceNumber = null;

  public TssV2TransactionsGet200ResponseProcessorInformation processor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationProcessor getProcessor() {
    return processor;
  }

  public void setProcessor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation multiProcessorRouting(List<TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting> multiProcessorRouting) {
    this.multiProcessorRouting = multiProcessorRouting;
    return this;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation addMultiProcessorRoutingItem(TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting multiProcessorRoutingItem) {
    if (this.multiProcessorRouting == null) {
      this.multiProcessorRouting = new ArrayList<TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting>();
    }
    this.multiProcessorRouting.add(multiProcessorRoutingItem);
    return this;
  }

   /**
   * An array of object that contains the list of acquirer response codes &amp; reasons if a transaction is routed to multiple acquirers.
   * @return multiProcessorRouting
  **/
  @ApiModelProperty(value = "An array of object that contains the list of acquirer response codes & reasons if a transaction is routed to multiple acquirers.")
  public List<TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting> getMultiProcessorRouting() {
    return multiProcessorRouting;
  }

  public void setMultiProcessorRouting(List<TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting> multiProcessorRouting) {
    this.multiProcessorRouting = multiProcessorRouting;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation transactionId(String transactionId) {
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

  public TssV2TransactionsGet200ResponseProcessorInformation networkTransactionId(String networkTransactionId) {
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

  public TssV2TransactionsGet200ResponseProcessorInformation retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * #### Ingenico ePayments Unique number that CyberSource generates to identify the transaction. You can use this value to identify transactions in the Ingenico ePayments Collections Report, which provides settlement information. Contact customer support for information about the report.  ### CyberSource through VisaNet Retrieval request number. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "#### Ingenico ePayments Unique number that CyberSource generates to identify the transaction. You can use this value to identify transactions in the Ingenico ePayments Collections Report, which provides settlement information. Contact customer support for information about the report.  ### CyberSource through VisaNet Retrieval request number. ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * Response ID sent from the processor. 
   * @return responseId
  **/
  @ApiModelProperty(value = "Response ID sent from the processor. ")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;processorInformation.responseCategoryCode&#x60; field. String (3) 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `processorInformation.responseCategoryCode` field. String (3) ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation avs(PtsV2PaymentsPost201ResponseProcessorInformationAvs avs) {
    this.avs = avs;
    return this;
  }

   /**
   * Get avs
   * @return avs
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationAvs getAvs() {
    return avs;
  }

  public void setAvs(PtsV2PaymentsPost201ResponseProcessorInformationAvs avs) {
    this.avs = avs;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation cardVerification(Riskv1decisionsProcessorInformationCardVerification cardVerification) {
    this.cardVerification = cardVerification;
    return this;
  }

   /**
   * Get cardVerification
   * @return cardVerification
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsProcessorInformationCardVerification getCardVerification() {
    return cardVerification;
  }

  public void setCardVerification(Riskv1decisionsProcessorInformationCardVerification cardVerification) {
    this.cardVerification = cardVerification;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation achVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
    return this;
  }

   /**
   * Get achVerification
   * @return achVerification
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationAchVerification getAchVerification() {
    return achVerification;
  }

  public void setAchVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation electronicVerificationResults(TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults) {
    this.electronicVerificationResults = electronicVerificationResults;
    return this;
  }

   /**
   * Get electronicVerificationResults
   * @return electronicVerificationResults
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults getElectronicVerificationResults() {
    return electronicVerificationResults;
  }

  public void setElectronicVerificationResults(TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults) {
    this.electronicVerificationResults = electronicVerificationResults;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
    return this;
  }

   /**
   * Used by Visa only and contains the response source/reason code that identifies the source of the response decision. 
   * @return responseCodeSource
  **/
  @ApiModelProperty(value = "Used by Visa only and contains the response source/reason code that identifies the source of the response decision. ")
  public String getResponseCodeSource() {
    return responseCodeSource;
  }

  public void setResponseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation paymentAccountReferenceNumber(String paymentAccountReferenceNumber) {
    this.paymentAccountReferenceNumber = paymentAccountReferenceNumber;
    return this;
  }

   /**
   * Visa-generated reference number that identifies a card-present transaction for which you provided one of the following:   - Visa primary account number (PAN)  - Visa-generated token for a PAN  This reference number serves as a link to the cardholder account and to all transactions for that account. This reply field is returned only for CyberSource through VisaNet.  **Note** On CyberSource through VisaNet, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR8 - Position: 79-110 - Field: Payment Account Reference  The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment networks. 
   * @return paymentAccountReferenceNumber
  **/
  @ApiModelProperty(value = "Visa-generated reference number that identifies a card-present transaction for which you provided one of the following:   - Visa primary account number (PAN)  - Visa-generated token for a PAN  This reference number serves as a link to the cardholder account and to all transactions for that account. This reply field is returned only for CyberSource through VisaNet.  **Note** On CyberSource through VisaNet, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR8 - Position: 79-110 - Field: Payment Account Reference  The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment networks. ")
  public String getPaymentAccountReferenceNumber() {
    return paymentAccountReferenceNumber;
  }

  public void setPaymentAccountReferenceNumber(String paymentAccountReferenceNumber) {
    this.paymentAccountReferenceNumber = paymentAccountReferenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessorInformation tssV2TransactionsGet200ResponseProcessorInformation = (TssV2TransactionsGet200ResponseProcessorInformation) o;
    return Objects.equals(this.processor, tssV2TransactionsGet200ResponseProcessorInformation.processor) &&
        Objects.equals(this.multiProcessorRouting, tssV2TransactionsGet200ResponseProcessorInformation.multiProcessorRouting) &&
        Objects.equals(this.transactionId, tssV2TransactionsGet200ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.networkTransactionId, tssV2TransactionsGet200ResponseProcessorInformation.networkTransactionId) &&
        Objects.equals(this.retrievalReferenceNumber, tssV2TransactionsGet200ResponseProcessorInformation.retrievalReferenceNumber) &&
        Objects.equals(this.responseId, tssV2TransactionsGet200ResponseProcessorInformation.responseId) &&
        Objects.equals(this.approvalCode, tssV2TransactionsGet200ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.responseCode, tssV2TransactionsGet200ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.avs, tssV2TransactionsGet200ResponseProcessorInformation.avs) &&
        Objects.equals(this.cardVerification, tssV2TransactionsGet200ResponseProcessorInformation.cardVerification) &&
        Objects.equals(this.achVerification, tssV2TransactionsGet200ResponseProcessorInformation.achVerification) &&
        Objects.equals(this.electronicVerificationResults, tssV2TransactionsGet200ResponseProcessorInformation.electronicVerificationResults) &&
        Objects.equals(this.systemTraceAuditNumber, tssV2TransactionsGet200ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.responseCodeSource, tssV2TransactionsGet200ResponseProcessorInformation.responseCodeSource) &&
        Objects.equals(this.paymentAccountReferenceNumber, tssV2TransactionsGet200ResponseProcessorInformation.paymentAccountReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processor, multiProcessorRouting, transactionId, networkTransactionId, retrievalReferenceNumber, responseId, approvalCode, responseCode, avs, cardVerification, achVerification, electronicVerificationResults, systemTraceAuditNumber, responseCodeSource, paymentAccountReferenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessorInformation {\n");
    
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    multiProcessorRouting: ").append(toIndentedString(multiProcessorRouting)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    avs: ").append(toIndentedString(avs)).append("\n");
    sb.append("    cardVerification: ").append(toIndentedString(cardVerification)).append("\n");
    sb.append("    achVerification: ").append(toIndentedString(achVerification)).append("\n");
    sb.append("    electronicVerificationResults: ").append(toIndentedString(electronicVerificationResults)).append("\n");
    sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    sb.append("    responseCodeSource: ").append(toIndentedString(responseCodeSource)).append("\n");
    sb.append("    paymentAccountReferenceNumber: ").append(toIndentedString(paymentAccountReferenceNumber)).append("\n");
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

