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
import Model.Ptsv2billingagreementsAggregatorInformation;
import Model.Ptsv2billingagreementsClientReferenceInformation;
import Model.Ptsv2billingagreementsConsumerAuthenticationInformation;
import Model.Ptsv2billingagreementsDeviceInformation;
import Model.Ptsv2billingagreementsInstallmentInformation;
import Model.Ptsv2billingagreementsMerchantInformation;
import Model.Ptsv2billingagreementsOrderInformation;
import Model.Ptsv2billingagreementsPaymentInformation;
import Model.Ptsv2billingagreementsidAgreementInformation;
import Model.Ptsv2billingagreementsidBuyerInformation;
import Model.Ptsv2billingagreementsidProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModifyBillingAgreement
 */

public class ModifyBillingAgreement {
  @SerializedName("agreementInformation")
  private Ptsv2billingagreementsidAgreementInformation agreementInformation = null;

  @SerializedName("clientReferenceInformation")
  private Ptsv2billingagreementsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("aggregatorInformation")
  private Ptsv2billingagreementsAggregatorInformation aggregatorInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private Ptsv2billingagreementsConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("deviceInformation")
  private Ptsv2billingagreementsDeviceInformation deviceInformation = null;

  @SerializedName("installmentInformation")
  private Ptsv2billingagreementsInstallmentInformation installmentInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2billingagreementsMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2billingagreementsOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2billingagreementsPaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2billingagreementsidProcessingInformation processingInformation = null;

  @SerializedName("buyerInformation")
  private Ptsv2billingagreementsidBuyerInformation buyerInformation = null;

  public ModifyBillingAgreement agreementInformation(Ptsv2billingagreementsidAgreementInformation agreementInformation) {
    this.agreementInformation = agreementInformation;
    return this;
  }

   /**
   * Get agreementInformation
   * @return agreementInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsidAgreementInformation getAgreementInformation() {
    return agreementInformation;
  }

  public void setAgreementInformation(Ptsv2billingagreementsidAgreementInformation agreementInformation) {
    this.agreementInformation = agreementInformation;
  }

  public ModifyBillingAgreement clientReferenceInformation(Ptsv2billingagreementsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2billingagreementsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public ModifyBillingAgreement aggregatorInformation(Ptsv2billingagreementsAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
    return this;
  }

   /**
   * Get aggregatorInformation
   * @return aggregatorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsAggregatorInformation getAggregatorInformation() {
    return aggregatorInformation;
  }

  public void setAggregatorInformation(Ptsv2billingagreementsAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
  }

  public ModifyBillingAgreement consumerAuthenticationInformation(Ptsv2billingagreementsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(Ptsv2billingagreementsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public ModifyBillingAgreement deviceInformation(Ptsv2billingagreementsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Ptsv2billingagreementsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public ModifyBillingAgreement installmentInformation(Ptsv2billingagreementsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(Ptsv2billingagreementsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }

  public ModifyBillingAgreement merchantInformation(Ptsv2billingagreementsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2billingagreementsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public ModifyBillingAgreement orderInformation(Ptsv2billingagreementsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2billingagreementsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public ModifyBillingAgreement paymentInformation(Ptsv2billingagreementsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2billingagreementsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public ModifyBillingAgreement processingInformation(Ptsv2billingagreementsidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsidProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2billingagreementsidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public ModifyBillingAgreement buyerInformation(Ptsv2billingagreementsidBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsidBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Ptsv2billingagreementsidBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBillingAgreement modifyBillingAgreement = (ModifyBillingAgreement) o;
    return Objects.equals(this.agreementInformation, modifyBillingAgreement.agreementInformation) &&
        Objects.equals(this.clientReferenceInformation, modifyBillingAgreement.clientReferenceInformation) &&
        Objects.equals(this.aggregatorInformation, modifyBillingAgreement.aggregatorInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, modifyBillingAgreement.consumerAuthenticationInformation) &&
        Objects.equals(this.deviceInformation, modifyBillingAgreement.deviceInformation) &&
        Objects.equals(this.installmentInformation, modifyBillingAgreement.installmentInformation) &&
        Objects.equals(this.merchantInformation, modifyBillingAgreement.merchantInformation) &&
        Objects.equals(this.orderInformation, modifyBillingAgreement.orderInformation) &&
        Objects.equals(this.paymentInformation, modifyBillingAgreement.paymentInformation) &&
        Objects.equals(this.processingInformation, modifyBillingAgreement.processingInformation) &&
        Objects.equals(this.buyerInformation, modifyBillingAgreement.buyerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementInformation, clientReferenceInformation, aggregatorInformation, consumerAuthenticationInformation, deviceInformation, installmentInformation, merchantInformation, orderInformation, paymentInformation, processingInformation, buyerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBillingAgreement {\n");
    
    sb.append("    agreementInformation: ").append(toIndentedString(agreementInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    aggregatorInformation: ").append(toIndentedString(aggregatorInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
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

