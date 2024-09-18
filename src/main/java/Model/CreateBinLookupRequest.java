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
import Model.Binv1binlookupClientReferenceInformation;
import Model.Binv1binlookupPaymentInformation;
import Model.Binv1binlookupProcessingInformation;
import Model.Binv1binlookupTokenInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateBinLookupRequest
 */

public class CreateBinLookupRequest {
  @SerializedName("clientReferenceInformation")
  private Binv1binlookupClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("paymentInformation")
  private Binv1binlookupPaymentInformation paymentInformation = null;

  @SerializedName("tokenInformation")
  private Binv1binlookupTokenInformation tokenInformation = null;

  @SerializedName("processingInformation")
  private Binv1binlookupProcessingInformation processingInformation = null;

  public CreateBinLookupRequest clientReferenceInformation(Binv1binlookupClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Binv1binlookupClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Binv1binlookupClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CreateBinLookupRequest paymentInformation(Binv1binlookupPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Binv1binlookupPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Binv1binlookupPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CreateBinLookupRequest tokenInformation(Binv1binlookupTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public Binv1binlookupTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(Binv1binlookupTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }

  public CreateBinLookupRequest processingInformation(Binv1binlookupProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Binv1binlookupProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Binv1binlookupProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBinLookupRequest createBinLookupRequest = (CreateBinLookupRequest) o;
    return Objects.equals(this.clientReferenceInformation, createBinLookupRequest.clientReferenceInformation) &&
        Objects.equals(this.paymentInformation, createBinLookupRequest.paymentInformation) &&
        Objects.equals(this.tokenInformation, createBinLookupRequest.tokenInformation) &&
        Objects.equals(this.processingInformation, createBinLookupRequest.processingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, paymentInformation, tokenInformation, processingInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBinLookupRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
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
