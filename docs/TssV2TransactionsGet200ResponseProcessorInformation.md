
# TssV2TransactionsGet200ResponseProcessorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processor** | [**TssV2TransactionsGet200ResponseProcessorInformationProcessor**](TssV2TransactionsGet200ResponseProcessorInformationProcessor.md) |  |  [optional]
**transactionId** | **String** | Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;Network Transaction Identifiers\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  |  [optional]
**networkTransactionId** | **String** | The description for this field is not available. |  [optional]
**responseId** | **String** | Response ID sent from the processor.  |  [optional]
**providerTransactionId** | **String** | The description for this field is not available. |  [optional]
**approvalCode** | **String** | Authorization code. Returned only when the processor returns this value.  |  [optional]
**responseCode** | **String** | For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;responseCategoryCode&#x60; field.  |  [optional]
**avs** | [**PtsV2PaymentsPost201ResponseProcessorInformationAvs**](PtsV2PaymentsPost201ResponseProcessorInformationAvs.md) |  |  [optional]
**cardVerification** | [**Riskv1decisionsCardVerification**](Riskv1decisionsCardVerification.md) |  |  [optional]
**achVerification** | [**PtsV2PaymentsPost201ResponseProcessorInformationAchVerification**](PtsV2PaymentsPost201ResponseProcessorInformationAchVerification.md) |  |  [optional]
**electronicVerificationResults** | [**TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults**](TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.md) |  |  [optional]
**systemTraceAuditNumber** | **String** | This field is returned only for **American Express Direct** and **CyberSource through VisaNet**.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt.  For details, see &#x60;receipt_number&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  |  [optional]
**responseCodeSource** | **String** | Used by Visa only and contains the response source/reason code that identifies the source of the response decision.  |  [optional]


