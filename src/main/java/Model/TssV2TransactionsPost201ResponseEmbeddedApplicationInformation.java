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
import Model.TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications;
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
 * TssV2TransactionsPost201ResponseEmbeddedApplicationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedApplicationInformation {
  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("rCode")
  private String rCode = null;

  @SerializedName("rFlag")
  private String rFlag = null;

  @SerializedName("applications")
  private List<TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications> applications = null;

  @SerializedName("returnCode")
  private Integer returnCode = null;

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Indicates the reason why a request succeeded or failed and possible action to take if a request fails.  For details, see the appendix of reason codes in the documentation for the relevant payment method. 
   * @return reasonCode
  **/
  @ApiModelProperty(value = "Indicates the reason why a request succeeded or failed and possible action to take if a request fails.  For details, see the appendix of reason codes in the documentation for the relevant payment method. ")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation rCode(String rCode) {
    this.rCode = rCode;
    return this;
  }

   /**
   * Indicates whether the service request was successful. Possible values:  - &#x60;-1&#x60;: An error occurred. - &#x60;0&#x60;: The request was declined. - &#x60;1&#x60;: The request was successful. 
   * @return rCode
  **/
  @ApiModelProperty(value = "Indicates whether the service request was successful. Possible values:  - `-1`: An error occurred. - `0`: The request was declined. - `1`: The request was successful. ")
  public String getRCode() {
    return rCode;
  }

  public void setRCode(String rCode) {
    this.rCode = rCode;
  }

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation rFlag(String rFlag) {
    this.rFlag = rFlag;
    return this;
  }

   /**
   * One-word description of the result of the application. 
   * @return rFlag
  **/
  @ApiModelProperty(value = "One-word description of the result of the application. ")
  public String getRFlag() {
    return rFlag;
  }

  public void setRFlag(String rFlag) {
    this.rFlag = rFlag;
  }

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation applications(List<TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications> applications) {
    this.applications = applications;
    return this;
  }

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation addApplicationsItem(TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @ApiModelProperty(value = "")
  public List<TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications> getApplications() {
    return applications;
  }

  public void setApplications(List<TssV2TransactionsPost201ResponseEmbeddedApplicationInformationApplications> applications) {
    this.applications = applications;
  }

  public TssV2TransactionsPost201ResponseEmbeddedApplicationInformation returnCode(Integer returnCode) {
    this.returnCode = returnCode;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return returnCode
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public Integer getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedApplicationInformation tssV2TransactionsPost201ResponseEmbeddedApplicationInformation = (TssV2TransactionsPost201ResponseEmbeddedApplicationInformation) o;
    return Objects.equals(this.reasonCode, tssV2TransactionsPost201ResponseEmbeddedApplicationInformation.reasonCode) &&
        Objects.equals(this.rCode, tssV2TransactionsPost201ResponseEmbeddedApplicationInformation.rCode) &&
        Objects.equals(this.rFlag, tssV2TransactionsPost201ResponseEmbeddedApplicationInformation.rFlag) &&
        Objects.equals(this.applications, tssV2TransactionsPost201ResponseEmbeddedApplicationInformation.applications) &&
        Objects.equals(this.returnCode, tssV2TransactionsPost201ResponseEmbeddedApplicationInformation.returnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, rCode, rFlag, applications, returnCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedApplicationInformation {\n");
    
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
    sb.append("    rFlag: ").append(toIndentedString(rFlag)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
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

