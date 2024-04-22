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
import Model.GetAllSubscriptionsResponseLinks;
import Model.GetAllSubscriptionsResponseOrderInformation;
import Model.GetAllSubscriptionsResponsePaymentInformation;
import Model.GetAllSubscriptionsResponsePlanInformation;
import Model.GetAllSubscriptionsResponseSubscriptionInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Subscription list
 */
@ApiModel(description = "Subscription list")

public class GetAllSubscriptionsResponseSubscriptions {
  @SerializedName("_links")
  private GetAllSubscriptionsResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("planInformation")
  private GetAllSubscriptionsResponsePlanInformation planInformation = null;

  @SerializedName("subscriptionInformation")
  private GetAllSubscriptionsResponseSubscriptionInformation subscriptionInformation = null;

  @SerializedName("paymentInformation")
  private GetAllSubscriptionsResponsePaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private GetAllSubscriptionsResponseOrderInformation orderInformation = null;

  public GetAllSubscriptionsResponseSubscriptions links(GetAllSubscriptionsResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponseLinks getLinks() {
    return links;
  }

  public void setLinks(GetAllSubscriptionsResponseLinks links) {
    this.links = links;
  }

  public GetAllSubscriptionsResponseSubscriptions id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetAllSubscriptionsResponseSubscriptions planInformation(GetAllSubscriptionsResponsePlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponsePlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(GetAllSubscriptionsResponsePlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public GetAllSubscriptionsResponseSubscriptions subscriptionInformation(GetAllSubscriptionsResponseSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
    return this;
  }

   /**
   * Get subscriptionInformation
   * @return subscriptionInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponseSubscriptionInformation getSubscriptionInformation() {
    return subscriptionInformation;
  }

  public void setSubscriptionInformation(GetAllSubscriptionsResponseSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
  }

  public GetAllSubscriptionsResponseSubscriptions paymentInformation(GetAllSubscriptionsResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(GetAllSubscriptionsResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public GetAllSubscriptionsResponseSubscriptions orderInformation(GetAllSubscriptionsResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(GetAllSubscriptionsResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllSubscriptionsResponseSubscriptions getAllSubscriptionsResponseSubscriptions = (GetAllSubscriptionsResponseSubscriptions) o;
    return Objects.equals(this.links, getAllSubscriptionsResponseSubscriptions.links) &&
        Objects.equals(this.id, getAllSubscriptionsResponseSubscriptions.id) &&
        Objects.equals(this.planInformation, getAllSubscriptionsResponseSubscriptions.planInformation) &&
        Objects.equals(this.subscriptionInformation, getAllSubscriptionsResponseSubscriptions.subscriptionInformation) &&
        Objects.equals(this.paymentInformation, getAllSubscriptionsResponseSubscriptions.paymentInformation) &&
        Objects.equals(this.orderInformation, getAllSubscriptionsResponseSubscriptions.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, planInformation, subscriptionInformation, paymentInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllSubscriptionsResponseSubscriptions {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

