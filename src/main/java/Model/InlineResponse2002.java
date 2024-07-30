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
import Model.Boardingv1registrationsDocumentInformation;
import Model.Boardingv1registrationsOrganizationInformation;
import Model.Boardingv1registrationsProductInformation;
import Model.Boardingv1registrationsRegistrationInformation;
import Model.InlineResponse2002IntegrationInformation;
import Model.InlineResponse2012ProductInformationSetups;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InlineResponse2002
 */

public class InlineResponse2002 {
  @SerializedName("registrationInformation")
  private Boardingv1registrationsRegistrationInformation registrationInformation = null;

  @SerializedName("integrationInformation")
  private InlineResponse2002IntegrationInformation integrationInformation = null;

  @SerializedName("organizationInformation")
  private Boardingv1registrationsOrganizationInformation organizationInformation = null;

  @SerializedName("productInformation")
  private Boardingv1registrationsProductInformation productInformation = null;

  @SerializedName("productInformationSetups")
  private List<InlineResponse2012ProductInformationSetups> productInformationSetups = null;

  @SerializedName("documentInformation")
  private Boardingv1registrationsDocumentInformation documentInformation = null;

  @SerializedName("details")
  private Map<String, List<Object>> details = null;

  public InlineResponse2002 registrationInformation(Boardingv1registrationsRegistrationInformation registrationInformation) {
    this.registrationInformation = registrationInformation;
    return this;
  }

   /**
   * Get registrationInformation
   * @return registrationInformation
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsRegistrationInformation getRegistrationInformation() {
    return registrationInformation;
  }

  public void setRegistrationInformation(Boardingv1registrationsRegistrationInformation registrationInformation) {
    this.registrationInformation = registrationInformation;
  }

  public InlineResponse2002 integrationInformation(InlineResponse2002IntegrationInformation integrationInformation) {
    this.integrationInformation = integrationInformation;
    return this;
  }

   /**
   * Get integrationInformation
   * @return integrationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2002IntegrationInformation getIntegrationInformation() {
    return integrationInformation;
  }

  public void setIntegrationInformation(InlineResponse2002IntegrationInformation integrationInformation) {
    this.integrationInformation = integrationInformation;
  }

  public InlineResponse2002 organizationInformation(Boardingv1registrationsOrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
    return this;
  }

   /**
   * Get organizationInformation
   * @return organizationInformation
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsOrganizationInformation getOrganizationInformation() {
    return organizationInformation;
  }

  public void setOrganizationInformation(Boardingv1registrationsOrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
  }

  public InlineResponse2002 productInformation(Boardingv1registrationsProductInformation productInformation) {
    this.productInformation = productInformation;
    return this;
  }

   /**
   * Get productInformation
   * @return productInformation
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformation getProductInformation() {
    return productInformation;
  }

  public void setProductInformation(Boardingv1registrationsProductInformation productInformation) {
    this.productInformation = productInformation;
  }

  public InlineResponse2002 productInformationSetups(List<InlineResponse2012ProductInformationSetups> productInformationSetups) {
    this.productInformationSetups = productInformationSetups;
    return this;
  }

  public InlineResponse2002 addProductInformationSetupsItem(InlineResponse2012ProductInformationSetups productInformationSetupsItem) {
    if (this.productInformationSetups == null) {
      this.productInformationSetups = new ArrayList<InlineResponse2012ProductInformationSetups>();
    }
    this.productInformationSetups.add(productInformationSetupsItem);
    return this;
  }

   /**
   * Get productInformationSetups
   * @return productInformationSetups
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2012ProductInformationSetups> getProductInformationSetups() {
    return productInformationSetups;
  }

  public void setProductInformationSetups(List<InlineResponse2012ProductInformationSetups> productInformationSetups) {
    this.productInformationSetups = productInformationSetups;
  }

  public InlineResponse2002 documentInformation(Boardingv1registrationsDocumentInformation documentInformation) {
    this.documentInformation = documentInformation;
    return this;
  }

   /**
   * Get documentInformation
   * @return documentInformation
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsDocumentInformation getDocumentInformation() {
    return documentInformation;
  }

  public void setDocumentInformation(Boardingv1registrationsDocumentInformation documentInformation) {
    this.documentInformation = documentInformation;
  }

  public InlineResponse2002 details(Map<String, List<Object>> details) {
    this.details = details;
    return this;
  }

  public InlineResponse2002 putDetailsItem(String key, List<Object> detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, List<Object>>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<Object>> getDetails() {
    return details;
  }

  public void setDetails(Map<String, List<Object>> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.registrationInformation, inlineResponse2002.registrationInformation) &&
        Objects.equals(this.integrationInformation, inlineResponse2002.integrationInformation) &&
        Objects.equals(this.organizationInformation, inlineResponse2002.organizationInformation) &&
        Objects.equals(this.productInformation, inlineResponse2002.productInformation) &&
        Objects.equals(this.productInformationSetups, inlineResponse2002.productInformationSetups) &&
        Objects.equals(this.documentInformation, inlineResponse2002.documentInformation) &&
        Objects.equals(this.details, inlineResponse2002.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationInformation, integrationInformation, organizationInformation, productInformation, productInformationSetups, documentInformation, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    registrationInformation: ").append(toIndentedString(registrationInformation)).append("\n");
    sb.append("    integrationInformation: ").append(toIndentedString(integrationInformation)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    productInformationSetups: ").append(toIndentedString(productInformationSetups)).append("\n");
    sb.append("    documentInformation: ").append(toIndentedString(documentInformation)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

