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
import Model.Ptsv2paymentsProcessorInformationReversal;
import Model.Ptsv2paymentsidreversalsClientReferenceInformation;
import Model.Ptsv2paymentsidreversalsOrderInformation;
import Model.Ptsv2paymentsidreversalsPaymentInformation;
import Model.Ptsv2paymentsidreversalsPointOfSaleInformation;
import Model.Ptsv2paymentsidreversalsProcessingInformation;
import Model.Ptsv2paymentsidreversalsReversalInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuthReversalRequest
 */

public class AuthReversalRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsidreversalsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("reversalInformation")
  private Ptsv2paymentsidreversalsReversalInformation reversalInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentsidreversalsProcessingInformation processingInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsidreversalsOrderInformation orderInformation = null;

  @SerializedName("pointOfSaleInformation")
  private Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentsidreversalsPaymentInformation paymentInformation = null;

  @SerializedName("processorInformation")
  private Ptsv2paymentsProcessorInformationReversal processorInformation = null;

  public AuthReversalRequest clientReferenceInformation(Ptsv2paymentsidreversalsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2paymentsidreversalsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public AuthReversalRequest reversalInformation(Ptsv2paymentsidreversalsReversalInformation reversalInformation) {
    this.reversalInformation = reversalInformation;
    return this;
  }

   /**
   * Get reversalInformation
   * @return reversalInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsReversalInformation getReversalInformation() {
    return reversalInformation;
  }

  public void setReversalInformation(Ptsv2paymentsidreversalsReversalInformation reversalInformation) {
    this.reversalInformation = reversalInformation;
  }

  public AuthReversalRequest processingInformation(Ptsv2paymentsidreversalsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentsidreversalsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public AuthReversalRequest orderInformation(Ptsv2paymentsidreversalsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsidreversalsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public AuthReversalRequest pointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public AuthReversalRequest paymentInformation(Ptsv2paymentsidreversalsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentsidreversalsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public AuthReversalRequest processorInformation(Ptsv2paymentsProcessorInformationReversal processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessorInformationReversal getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(Ptsv2paymentsProcessorInformationReversal processorInformation) {
    this.processorInformation = processorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthReversalRequest authReversalRequest = (AuthReversalRequest) o;
    return Objects.equals(this.clientReferenceInformation, authReversalRequest.clientReferenceInformation) &&
        Objects.equals(this.reversalInformation, authReversalRequest.reversalInformation) &&
        Objects.equals(this.processingInformation, authReversalRequest.processingInformation) &&
        Objects.equals(this.orderInformation, authReversalRequest.orderInformation) &&
        Objects.equals(this.pointOfSaleInformation, authReversalRequest.pointOfSaleInformation) &&
        Objects.equals(this.paymentInformation, authReversalRequest.paymentInformation) &&
        Objects.equals(this.processorInformation, authReversalRequest.processorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, reversalInformation, processingInformation, orderInformation, pointOfSaleInformation, paymentInformation, processorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthReversalRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    reversalInformation: ").append(toIndentedString(reversalInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
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

