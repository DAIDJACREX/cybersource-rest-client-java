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
import Model.Riskv1decisionsClientReferenceInformationPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class Riskv1decisionsClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("pausedRequestId")
  private String pausedRequestId = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("partner")
  private Riskv1decisionsClientReferenceInformationPartner partner = null;

  public Riskv1decisionsClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. 
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Riskv1decisionsClientReferenceInformation pausedRequestId(String pausedRequestId) {
    this.pausedRequestId = pausedRequestId;
    return this;
  }

   /**
   * Used to resume a transaction that was paused for an order modification rule to allow for payer authentication to complete. To resume and continue with the authorization/decision service flow, call the services and include the request id from the prior decision call. 
   * @return pausedRequestId
  **/
  @ApiModelProperty(value = "Used to resume a transaction that was paused for an order modification rule to allow for payer authentication to complete. To resume and continue with the authorization/decision service flow, call the services and include the request id from the prior decision call. ")
  public String getPausedRequestId() {
    return pausedRequestId;
  }

  public void setPausedRequestId(String pausedRequestId) {
    this.pausedRequestId = pausedRequestId;
  }

  public Riskv1decisionsClientReferenceInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Brief description of the order or any comment you wish to add to the order. 
   * @return comments
  **/
  @ApiModelProperty(value = "Brief description of the order or any comment you wish to add to the order. ")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Riskv1decisionsClientReferenceInformation partner(Riskv1decisionsClientReferenceInformationPartner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsClientReferenceInformationPartner getPartner() {
    return partner;
  }

  public void setPartner(Riskv1decisionsClientReferenceInformationPartner partner) {
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
    Riskv1decisionsClientReferenceInformation riskv1decisionsClientReferenceInformation = (Riskv1decisionsClientReferenceInformation) o;
    return Objects.equals(this.code, riskv1decisionsClientReferenceInformation.code) &&
        Objects.equals(this.pausedRequestId, riskv1decisionsClientReferenceInformation.pausedRequestId) &&
        Objects.equals(this.comments, riskv1decisionsClientReferenceInformation.comments) &&
        Objects.equals(this.partner, riskv1decisionsClientReferenceInformation.partner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, pausedRequestId, comments, partner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    pausedRequestId: ").append(toIndentedString(pausedRequestId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

