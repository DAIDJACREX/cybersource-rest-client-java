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
 * Ptsv1pushfundstransferProcessingInformationPayoutsOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Ptsv1pushfundstransferProcessingInformationPayoutsOptions {
  @SerializedName("accountFundingReferenceId")
  private String accountFundingReferenceId = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions accountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
    return this;
  }

   /**
   * Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request.  Applicable only for Visa Platform Connect 
   * @return accountFundingReferenceId
  **/
  @ApiModelProperty(value = "Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request.  Applicable only for Visa Platform Connect ")
  public String getAccountFundingReferenceId() {
    return accountFundingReferenceId;
  }

  public void setAccountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
  }

  public Ptsv1pushfundstransferProcessingInformationPayoutsOptions retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Format: Positions 1-4: The yddd equivalent of the date, where y &#x3D; 0-9 and ddd &#x3D; 001 – 366. Positions 5-12: A unique identification number generated by the merchant  Applicable only for Visa Platform Connect 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Format: Positions 1-4: The yddd equivalent of the date, where y = 0-9 and ddd = 001 – 366. Positions 5-12: A unique identification number generated by the merchant  Applicable only for Visa Platform Connect ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
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
    return Objects.equals(this.accountFundingReferenceId, ptsv1pushfundstransferProcessingInformationPayoutsOptions.accountFundingReferenceId) &&
        Objects.equals(this.retrievalReferenceNumber, ptsv1pushfundstransferProcessingInformationPayoutsOptions.retrievalReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountFundingReferenceId, retrievalReferenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferProcessingInformationPayoutsOptions {\n");
    
    sb.append("    accountFundingReferenceId: ").append(toIndentedString(accountFundingReferenceId)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
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

