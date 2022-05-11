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
import Model.TssV2TransactionsGet200ResponseClientReferenceInformationPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("applicationUser")
  private String applicationUser = null;

  @SerializedName("partner")
  private TssV2TransactionsGet200ResponseClientReferenceInformationPartner partner = null;

  public TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. 
   * @return code
  **/
  @ApiModelProperty(value = "Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. 
   * @return applicationName
  **/
  @ApiModelProperty(value = "The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. ")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation applicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
    return this;
  }

   /**
   * The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. 
   * @return applicationUser
  **/
  @ApiModelProperty(value = "The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. ")
  public String getApplicationUser() {
    return applicationUser;
  }

  public void setApplicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
  }

  public TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation partner(TssV2TransactionsGet200ResponseClientReferenceInformationPartner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseClientReferenceInformationPartner getPartner() {
    return partner;
  }

  public void setPartner(TssV2TransactionsGet200ResponseClientReferenceInformationPartner partner) {
    this.partner = partner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation tssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation = (TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation) o;
    return Objects.equals(this.code, tssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation.code) &&
        Objects.equals(this.applicationName, tssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation.applicationName) &&
        Objects.equals(this.applicationUser, tssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation.applicationUser) &&
        Objects.equals(this.partner, tssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation.partner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, applicationName, applicationUser, partner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationUser: ").append(toIndentedString(applicationUser)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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

