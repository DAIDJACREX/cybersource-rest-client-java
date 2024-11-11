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
 * Ptsv1pushfundstransferProcessingInformationPayoutsOptions
 */

public class Ptsv1pushfundstransferProcessingInformationPayoutsOptions {
  @SerializedName("sourceCurrency")
  private String sourceCurrency = null;

  @SerializedName("destinationCurrency")
  private String destinationCurrency = null;

  @SerializedName("sourceAmount")
  private String sourceAmount = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  @SerializedName("accountFundingReferenceId")
  private String accountFundingReferenceId = null;

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * Use a 3-character alpha currency code for source currency of the funds transfer.  Required if sending processingInformation.payoutsOptions.sourceAmount.  ISO standard currencies: http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf 
   * @return sourceCurrency
  **/
  @ApiModelProperty(value = "Use a 3-character alpha currency code for source currency of the funds transfer.  Required if sending processingInformation.payoutsOptions.sourceAmount.  ISO standard currencies: http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf ")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions destinationCurrency(String destinationCurrency) {
    this.destinationCurrency = destinationCurrency;
    return this;
  }

   /**
   * Use a 3-character alpha currency code for destination currency of the funds transfer.  Yellow Pepper  Supported for cross border funds transfers.  ISO standard currencies: http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf 
   * @return destinationCurrency
  **/
  @ApiModelProperty(value = "Use a 3-character alpha currency code for destination currency of the funds transfer.  Yellow Pepper  Supported for cross border funds transfers.  ISO standard currencies: http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf ")
  public String getDestinationCurrency() {
    return destinationCurrency;
  }

  public void setDestinationCurrency(String destinationCurrency) {
    this.destinationCurrency = destinationCurrency;
  }

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions sourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
    return this;
  }

   /**
   * Source Amount is required in certain markets to identify the transaction amount entered in the sender&#39;s currency code prior to FX conversion by the originating entity.  Format:  Minimum Value: 0  Maximum value: 999999999.99  Allowed fractional digits: 2 
   * @return sourceAmount
  **/
  @ApiModelProperty(value = "Source Amount is required in certain markets to identify the transaction amount entered in the sender's currency code prior to FX conversion by the originating entity.  Format:  Minimum Value: 0  Maximum value: 999999999.99  Allowed fractional digits: 2 ")
  public String getSourceAmount() {
    return sourceAmount;
  }

  public void setSourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
  }

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * Unique reference number returned by the processor that identifies the transaction at the network. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "Unique reference number returned by the processor that identifies the transaction at the network. ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions accountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
    return this;
  }

   /**
   * Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. 
   * @return accountFundingReferenceId
  **/
  @ApiModelProperty(value = "Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. ")
  public String getAccountFundingReferenceId() {
    return accountFundingReferenceId;
  }

  public void setAccountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferProcessingInformationPayoutsOptions ptsv1pushfundstransferProcessingInformationPayoutsOptions = (Ptsv1pushfundstransferProcessingInformationPayoutsOptions) o;
    return Objects.equals(this.sourceCurrency, ptsv1pushfundstransferProcessingInformationPayoutsOptions.sourceCurrency) &&
        Objects.equals(this.destinationCurrency, ptsv1pushfundstransferProcessingInformationPayoutsOptions.destinationCurrency) &&
        Objects.equals(this.sourceAmount, ptsv1pushfundstransferProcessingInformationPayoutsOptions.sourceAmount) &&
        Objects.equals(this.retrievalReferenceNumber, ptsv1pushfundstransferProcessingInformationPayoutsOptions.retrievalReferenceNumber) &&
        Objects.equals(this.accountFundingReferenceId, ptsv1pushfundstransferProcessingInformationPayoutsOptions.accountFundingReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, destinationCurrency, sourceAmount, retrievalReferenceNumber, accountFundingReferenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferProcessingInformationPayoutsOptions {\n");
    
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    destinationCurrency: ").append(toIndentedString(destinationCurrency)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    accountFundingReferenceId: ").append(toIndentedString(accountFundingReferenceId)).append("\n");
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

