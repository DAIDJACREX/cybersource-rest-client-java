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
import Model.Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator {
  @SerializedName("type")
  private String type = null;

  @SerializedName("credentialStoredOnFile")
  private String credentialStoredOnFile = null;

  @SerializedName("storedCredentialUsed")
  private String storedCredentialUsed = null;

  @SerializedName("merchantInitiatedTransaction")
  private Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction = null;

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This field indicates whether the transaction is a merchant-initiated transaction or customer-initiated transaction.  Valid values: - **customer** - **merchant** 
   * @return type
  **/
  @ApiModelProperty(value = "This field indicates whether the transaction is a merchant-initiated transaction or customer-initiated transaction.  Valid values: - **customer** - **merchant** ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator credentialStoredOnFile(String credentialStoredOnFile) {
    this.credentialStoredOnFile = credentialStoredOnFile;
    return this;
  }

   /**
   * Indicates to the issuing bank two things: - The merchant has received consent from the cardholder to store their card details on file - The merchant wants the issuing bank to check out the card details before the merchant initiates their first transaction for this cardholder. The purpose of the merchant-initiated transaction is to ensure that the cardholder’s credentials are valid (that the card is not stolen or has restrictions) and that the card details are good to be stored on the merchant’s file for future transactions.  Valid values: - &#x60;Y&#x60; means merchant will use this transaction to store payment credentials for follow-up merchant-initiated transactions. - &#x60;N&#x60; means merchant will not use this transaction to store payment credentials for follow-up merchant-initiated transactions.  For details, see &#x60;subsequent_auth_first&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  **NOTE:** The value for this field does not correspond to any data in the TC 33 capture file5.  This field is supported only for Visa transactions on CyberSource through VisaNet. 
   * @return credentialStoredOnFile
  **/
  @ApiModelProperty(value = "Indicates to the issuing bank two things: - The merchant has received consent from the cardholder to store their card details on file - The merchant wants the issuing bank to check out the card details before the merchant initiates their first transaction for this cardholder. The purpose of the merchant-initiated transaction is to ensure that the cardholder’s credentials are valid (that the card is not stolen or has restrictions) and that the card details are good to be stored on the merchant’s file for future transactions.  Valid values: - `Y` means merchant will use this transaction to store payment credentials for follow-up merchant-initiated transactions. - `N` means merchant will not use this transaction to store payment credentials for follow-up merchant-initiated transactions.  For details, see `subsequent_auth_first` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  **NOTE:** The value for this field does not correspond to any data in the TC 33 capture file5.  This field is supported only for Visa transactions on CyberSource through VisaNet. ")
  public String getCredentialStoredOnFile() {
    return credentialStoredOnFile;
  }

  public void setCredentialStoredOnFile(String credentialStoredOnFile) {
    this.credentialStoredOnFile = credentialStoredOnFile;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator storedCredentialUsed(String storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
    return this;
  }

   /**
   * Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **Y** means the merchant-initiated transaction came from a card that was already stored on file. - **N**  means the merchant-initiated transaction came from a card that was not stored on file. 
   * @return storedCredentialUsed
  **/
  @ApiModelProperty(value = "Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **Y** means the merchant-initiated transaction came from a card that was already stored on file. - **N**  means the merchant-initiated transaction came from a card that was not stored on file. ")
  public String getStoredCredentialUsed() {
    return storedCredentialUsed;
  }

  public void setStoredCredentialUsed(String storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator merchantInitiatedTransaction(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
    return this;
  }

   /**
   * Get merchantInitiatedTransaction
   * @return merchantInitiatedTransaction
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction getMerchantInitiatedTransaction() {
    return merchantInitiatedTransaction;
  }

  public void setMerchantInitiatedTransaction(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator = (TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator) o;
    return Objects.equals(this.type, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator.type) &&
        Objects.equals(this.credentialStoredOnFile, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator.credentialStoredOnFile) &&
        Objects.equals(this.storedCredentialUsed, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator.storedCredentialUsed) &&
        Objects.equals(this.merchantInitiatedTransaction, tssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator.merchantInitiatedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, credentialStoredOnFile, storedCredentialUsed, merchantInitiatedTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptionsInitiator {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    credentialStoredOnFile: ").append(toIndentedString(credentialStoredOnFile)).append("\n");
    sb.append("    storedCredentialUsed: ").append(toIndentedString(storedCredentialUsed)).append("\n");
    sb.append("    merchantInitiatedTransaction: ").append(toIndentedString(merchantInitiatedTransaction)).append("\n");
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

