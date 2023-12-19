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
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsCheckout;
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsContactInformation;
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsNotifications;
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentMethods;
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes;
import Model.PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsService;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations
 */

public class PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations {
  @SerializedName("parentProfileId")
  private String parentProfileId = null;

  @SerializedName("contactInformation")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsContactInformation contactInformation = null;

  @SerializedName("notifications")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsNotifications notifications = null;

  @SerializedName("service")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsService service = null;

  @SerializedName("paymentMethods")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentMethods paymentMethods = null;

  @SerializedName("checkout")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsCheckout checkout = null;

  @SerializedName("paymentTypes")
  private PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes paymentTypes = null;

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations parentProfileId(String parentProfileId) {
    this.parentProfileId = parentProfileId;
    return this;
  }

   /**
   * You can group Secure Acceptance profiles under parent profiles. By changing the parent profile, you can update all profiles underneath that parent. Specify the Parent Profile ID here.
   * @return parentProfileId
  **/
  @ApiModelProperty(value = "You can group Secure Acceptance profiles under parent profiles. By changing the parent profile, you can update all profiles underneath that parent. Specify the Parent Profile ID here.")
  public String getParentProfileId() {
    return parentProfileId;
  }

  public void setParentProfileId(String parentProfileId) {
    this.parentProfileId = parentProfileId;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations contactInformation(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsContactInformation contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsContactInformation getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsContactInformation contactInformation) {
    this.contactInformation = contactInformation;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations notifications(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsNotifications notifications) {
    this.notifications = notifications;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations service(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsService service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsService getService() {
    return service;
  }

  public void setService(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsService service) {
    this.service = service;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations paymentMethods(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentMethods paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

   /**
   * Get paymentMethods
   * @return paymentMethods
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentMethods getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentMethods paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations checkout(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsCheckout checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsCheckout getCheckout() {
    return checkout;
  }

  public void setCheckout(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsCheckout checkout) {
    this.checkout = checkout;
  }

  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations paymentTypes(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes paymentTypes) {
    this.paymentTypes = paymentTypes;
    return this;
  }

   /**
   * Get paymentTypes
   * @return paymentTypes
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes getPaymentTypes() {
    return paymentTypes;
  }

  public void setPaymentTypes(PaymentsProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes paymentTypes) {
    this.paymentTypes = paymentTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations paymentsProductsSecureAcceptanceConfigurationInformationConfigurations = (PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations) o;
    return Objects.equals(this.parentProfileId, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.parentProfileId) &&
        Objects.equals(this.contactInformation, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.contactInformation) &&
        Objects.equals(this.notifications, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.notifications) &&
        Objects.equals(this.service, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.service) &&
        Objects.equals(this.paymentMethods, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.paymentMethods) &&
        Objects.equals(this.checkout, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.checkout) &&
        Objects.equals(this.paymentTypes, paymentsProductsSecureAcceptanceConfigurationInformationConfigurations.paymentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentProfileId, contactInformation, notifications, service, paymentMethods, checkout, paymentTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsSecureAcceptanceConfigurationInformationConfigurations {\n");
    
    sb.append("    parentProfileId: ").append(toIndentedString(parentProfileId)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    paymentTypes: ").append(toIndentedString(paymentTypes)).append("\n");
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

