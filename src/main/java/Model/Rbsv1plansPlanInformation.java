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
import Model.GetAllPlansResponsePlanInformationBillingPeriod;
import Model.Rbsv1plansPlanInformationBillingCycles;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rbsv1plansPlanInformation
 */

public class Rbsv1plansPlanInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("billingPeriod")
  private GetAllPlansResponsePlanInformationBillingPeriod billingPeriod = null;

  @SerializedName("billingCycles")
  private Rbsv1plansPlanInformationBillingCycles billingCycles = null;

  public Rbsv1plansPlanInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Plan code is an optional field, If not provided system generates and assign one 
   * @return code
  **/
  @ApiModelProperty(value = "Plan code is an optional field, If not provided system generates and assign one ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Rbsv1plansPlanInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Plan name 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Plan name ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Rbsv1plansPlanInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Plan description 
   * @return description
  **/
  @ApiModelProperty(value = "Plan description ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Rbsv1plansPlanInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Plan Status:  - &#x60;DRAFT&#x60;  - &#x60;ACTIVE&#x60; (default) 
   * @return status
  **/
  @ApiModelProperty(value = "Plan Status:  - `DRAFT`  - `ACTIVE` (default) ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Rbsv1plansPlanInformation billingPeriod(GetAllPlansResponsePlanInformationBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

   /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @ApiModelProperty(value = "")
  public GetAllPlansResponsePlanInformationBillingPeriod getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(GetAllPlansResponsePlanInformationBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public Rbsv1plansPlanInformation billingCycles(Rbsv1plansPlanInformationBillingCycles billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

   /**
   * Get billingCycles
   * @return billingCycles
  **/
  @ApiModelProperty(value = "")
  public Rbsv1plansPlanInformationBillingCycles getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(Rbsv1plansPlanInformationBillingCycles billingCycles) {
    this.billingCycles = billingCycles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rbsv1plansPlanInformation rbsv1plansPlanInformation = (Rbsv1plansPlanInformation) o;
    return Objects.equals(this.code, rbsv1plansPlanInformation.code) &&
        Objects.equals(this.name, rbsv1plansPlanInformation.name) &&
        Objects.equals(this.description, rbsv1plansPlanInformation.description) &&
        Objects.equals(this.status, rbsv1plansPlanInformation.status) &&
        Objects.equals(this.billingPeriod, rbsv1plansPlanInformation.billingPeriod) &&
        Objects.equals(this.billingCycles, rbsv1plansPlanInformation.billingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description, status, billingPeriod, billingCycles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rbsv1plansPlanInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    billingCycles: ").append(toIndentedString(billingCycles)).append("\n");
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

