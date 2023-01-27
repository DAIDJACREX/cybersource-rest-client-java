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
import Model.Ptsv2paymentsAcquirerInformation;
import Model.Ptsv2paymentsAggregatorInformation;
import Model.Ptsv2paymentsBuyerInformation;
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsConsumerAuthenticationInformation;
import Model.Ptsv2paymentsDeviceInformation;
import Model.Ptsv2paymentsHealthCareInformation;
import Model.Ptsv2paymentsInstallmentInformation;
import Model.Ptsv2paymentsInvoiceDetails;
import Model.Ptsv2paymentsIssuerInformation;
import Model.Ptsv2paymentsMerchantDefinedInformation;
import Model.Ptsv2paymentsMerchantInformation;
import Model.Ptsv2paymentsOrderInformation;
import Model.Ptsv2paymentsPaymentInformation;
import Model.Ptsv2paymentsPointOfSaleInformation;
import Model.Ptsv2paymentsProcessingInformation;
import Model.Ptsv2paymentsProcessorInformation;
import Model.Ptsv2paymentsPromotionInformation;
import Model.Ptsv2paymentsRecipientInformation;
import Model.Ptsv2paymentsRecurringPaymentInformation;
import Model.Ptsv2paymentsRiskInformation;
import Model.Ptsv2paymentsTokenInformation;
import Model.Ptsv2paymentsTravelInformation;
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
 * CreatePaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class CreatePaymentRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentsProcessingInformation processingInformation = null;

  @SerializedName("issuerInformation")
  private Ptsv2paymentsIssuerInformation issuerInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Ptsv2paymentsBuyerInformation buyerInformation = null;

  @SerializedName("recipientInformation")
  private Ptsv2paymentsRecipientInformation recipientInformation = null;

  @SerializedName("deviceInformation")
  private Ptsv2paymentsDeviceInformation deviceInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2paymentsMerchantInformation merchantInformation = null;

  @SerializedName("aggregatorInformation")
  private Ptsv2paymentsAggregatorInformation aggregatorInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private Ptsv2paymentsConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("pointOfSaleInformation")
  private Ptsv2paymentsPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("installmentInformation")
  private Ptsv2paymentsInstallmentInformation installmentInformation = null;

  @SerializedName("travelInformation")
  private Ptsv2paymentsTravelInformation travelInformation = null;

  @SerializedName("healthCareInformation")
  private Ptsv2paymentsHealthCareInformation healthCareInformation = null;

  @SerializedName("promotionInformation")
  private Ptsv2paymentsPromotionInformation promotionInformation = null;

  @SerializedName("tokenInformation")
  private Ptsv2paymentsTokenInformation tokenInformation = null;

  @SerializedName("invoiceDetails")
  private Ptsv2paymentsInvoiceDetails invoiceDetails = null;

  @SerializedName("processorInformation")
  private Ptsv2paymentsProcessorInformation processorInformation = null;

  @SerializedName("riskInformation")
  private Ptsv2paymentsRiskInformation riskInformation = null;

  @SerializedName("acquirerInformation")
  private Ptsv2paymentsAcquirerInformation acquirerInformation = null;

  @SerializedName("recurringPaymentInformation")
  private Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation = null;

  public CreatePaymentRequest clientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CreatePaymentRequest processingInformation(Ptsv2paymentsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public CreatePaymentRequest issuerInformation(Ptsv2paymentsIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsIssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(Ptsv2paymentsIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }

  public CreatePaymentRequest paymentInformation(Ptsv2paymentsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CreatePaymentRequest orderInformation(Ptsv2paymentsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public CreatePaymentRequest buyerInformation(Ptsv2paymentsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Ptsv2paymentsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public CreatePaymentRequest recipientInformation(Ptsv2paymentsRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
    return this;
  }

   /**
   * Get recipientInformation
   * @return recipientInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRecipientInformation getRecipientInformation() {
    return recipientInformation;
  }

  public void setRecipientInformation(Ptsv2paymentsRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
  }

  public CreatePaymentRequest deviceInformation(Ptsv2paymentsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Ptsv2paymentsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public CreatePaymentRequest merchantInformation(Ptsv2paymentsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2paymentsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public CreatePaymentRequest aggregatorInformation(Ptsv2paymentsAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
    return this;
  }

   /**
   * Get aggregatorInformation
   * @return aggregatorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsAggregatorInformation getAggregatorInformation() {
    return aggregatorInformation;
  }

  public void setAggregatorInformation(Ptsv2paymentsAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
  }

  public CreatePaymentRequest consumerAuthenticationInformation(Ptsv2paymentsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(Ptsv2paymentsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public CreatePaymentRequest pointOfSaleInformation(Ptsv2paymentsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(Ptsv2paymentsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public CreatePaymentRequest merchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public CreatePaymentRequest addMerchantDefinedInformationItem(Ptsv2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Ptsv2paymentsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * The object containing the custom data that the merchant defines. 
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "The object containing the custom data that the merchant defines. ")
  public List<Ptsv2paymentsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public CreatePaymentRequest installmentInformation(Ptsv2paymentsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(Ptsv2paymentsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }

  public CreatePaymentRequest travelInformation(Ptsv2paymentsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Ptsv2paymentsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }

  public CreatePaymentRequest healthCareInformation(Ptsv2paymentsHealthCareInformation healthCareInformation) {
    this.healthCareInformation = healthCareInformation;
    return this;
  }

   /**
   * Get healthCareInformation
   * @return healthCareInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsHealthCareInformation getHealthCareInformation() {
    return healthCareInformation;
  }

  public void setHealthCareInformation(Ptsv2paymentsHealthCareInformation healthCareInformation) {
    this.healthCareInformation = healthCareInformation;
  }

  public CreatePaymentRequest promotionInformation(Ptsv2paymentsPromotionInformation promotionInformation) {
    this.promotionInformation = promotionInformation;
    return this;
  }

   /**
   * Get promotionInformation
   * @return promotionInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPromotionInformation getPromotionInformation() {
    return promotionInformation;
  }

  public void setPromotionInformation(Ptsv2paymentsPromotionInformation promotionInformation) {
    this.promotionInformation = promotionInformation;
  }

  public CreatePaymentRequest tokenInformation(Ptsv2paymentsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(Ptsv2paymentsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }

  public CreatePaymentRequest invoiceDetails(Ptsv2paymentsInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(Ptsv2paymentsInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public CreatePaymentRequest processorInformation(Ptsv2paymentsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(Ptsv2paymentsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public CreatePaymentRequest riskInformation(Ptsv2paymentsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Ptsv2paymentsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public CreatePaymentRequest acquirerInformation(Ptsv2paymentsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
    return this;
  }

   /**
   * Get acquirerInformation
   * @return acquirerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsAcquirerInformation getAcquirerInformation() {
    return acquirerInformation;
  }

  public void setAcquirerInformation(Ptsv2paymentsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
  }

  public CreatePaymentRequest recurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
    return this;
  }

   /**
   * Get recurringPaymentInformation
   * @return recurringPaymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRecurringPaymentInformation getRecurringPaymentInformation() {
    return recurringPaymentInformation;
  }

  public void setRecurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) o;
    return Objects.equals(this.clientReferenceInformation, createPaymentRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, createPaymentRequest.processingInformation) &&
        Objects.equals(this.issuerInformation, createPaymentRequest.issuerInformation) &&
        Objects.equals(this.paymentInformation, createPaymentRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, createPaymentRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, createPaymentRequest.buyerInformation) &&
        Objects.equals(this.recipientInformation, createPaymentRequest.recipientInformation) &&
        Objects.equals(this.deviceInformation, createPaymentRequest.deviceInformation) &&
        Objects.equals(this.merchantInformation, createPaymentRequest.merchantInformation) &&
        Objects.equals(this.aggregatorInformation, createPaymentRequest.aggregatorInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, createPaymentRequest.consumerAuthenticationInformation) &&
        Objects.equals(this.pointOfSaleInformation, createPaymentRequest.pointOfSaleInformation) &&
        Objects.equals(this.merchantDefinedInformation, createPaymentRequest.merchantDefinedInformation) &&
        Objects.equals(this.installmentInformation, createPaymentRequest.installmentInformation) &&
        Objects.equals(this.travelInformation, createPaymentRequest.travelInformation) &&
        Objects.equals(this.healthCareInformation, createPaymentRequest.healthCareInformation) &&
        Objects.equals(this.promotionInformation, createPaymentRequest.promotionInformation) &&
        Objects.equals(this.tokenInformation, createPaymentRequest.tokenInformation) &&
        Objects.equals(this.invoiceDetails, createPaymentRequest.invoiceDetails) &&
        Objects.equals(this.processorInformation, createPaymentRequest.processorInformation) &&
        Objects.equals(this.riskInformation, createPaymentRequest.riskInformation) &&
        Objects.equals(this.acquirerInformation, createPaymentRequest.acquirerInformation) &&
        Objects.equals(this.recurringPaymentInformation, createPaymentRequest.recurringPaymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, issuerInformation, paymentInformation, orderInformation, buyerInformation, recipientInformation, deviceInformation, merchantInformation, aggregatorInformation, consumerAuthenticationInformation, pointOfSaleInformation, merchantDefinedInformation, installmentInformation, travelInformation, healthCareInformation, promotionInformation, tokenInformation, invoiceDetails, processorInformation, riskInformation, acquirerInformation, recurringPaymentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    recipientInformation: ").append(toIndentedString(recipientInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    aggregatorInformation: ").append(toIndentedString(aggregatorInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
    sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
    sb.append("    healthCareInformation: ").append(toIndentedString(healthCareInformation)).append("\n");
    sb.append("    promotionInformation: ").append(toIndentedString(promotionInformation)).append("\n");
    sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    acquirerInformation: ").append(toIndentedString(acquirerInformation)).append("\n");
    sb.append("    recurringPaymentInformation: ").append(toIndentedString(recurringPaymentInformation)).append("\n");
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

