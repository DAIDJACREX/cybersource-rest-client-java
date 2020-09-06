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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidreversalsClientReferenceInformationPartner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Ptsv2paymentsidreversalsClientReferenceInformationPartner {
  @SerializedName("developerId")
  private String developerId = null;

  @SerializedName("solutionId")
  private String solutionId = null;

  @SerializedName("thirdPartyCertificationNumber")
  private String thirdPartyCertificationNumber = null;

  public Ptsv2paymentsidreversalsClientReferenceInformationPartner developerId(String developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Identifier for the developer that helped integrate a partner solution to CyberSource.  Send this value in all requests that are sent through the partner solutions built by that developer. CyberSource assigns the ID to the developer.  **Note** When you see a developer ID of 999 in reports, the developer ID that was submitted is incorrect. 
   * @return developerId
  **/
  @ApiModelProperty(value = "Identifier for the developer that helped integrate a partner solution to CyberSource.  Send this value in all requests that are sent through the partner solutions built by that developer. CyberSource assigns the ID to the developer.  **Note** When you see a developer ID of 999 in reports, the developer ID that was submitted is incorrect. ")
  public String getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformationPartner solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  **Note** When you see a solutionId of 999 in reports, the solutionId that was submitted is incorrect. 
   * @return solutionId
  **/
  @ApiModelProperty(value = "Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  **Note** When you see a solutionId of 999 in reports, the solutionId that was submitted is incorrect. ")
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformationPartner thirdPartyCertificationNumber(String thirdPartyCertificationNumber) {
    this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
    return this;
  }

   /**
   * Value that identifies the application vendor and application version for a third party gateway. CyberSource provides you with this value during testing and validation. This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization, Authorization Reversal, Capture, Credit, Incremental Authorization, and Void** Optional field.  #### PIN debit Required field for PIN debit credit, PIN debit purchase, or PIN debit reversal request. 
   * @return thirdPartyCertificationNumber
  **/
  @ApiModelProperty(value = "Value that identifies the application vendor and application version for a third party gateway. CyberSource provides you with this value during testing and validation. This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization, Authorization Reversal, Capture, Credit, Incremental Authorization, and Void** Optional field.  #### PIN debit Required field for PIN debit credit, PIN debit purchase, or PIN debit reversal request. ")
  public String getThirdPartyCertificationNumber() {
    return thirdPartyCertificationNumber;
  }

  public void setThirdPartyCertificationNumber(String thirdPartyCertificationNumber) {
    this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsClientReferenceInformationPartner ptsv2paymentsidreversalsClientReferenceInformationPartner = (Ptsv2paymentsidreversalsClientReferenceInformationPartner) o;
    return Objects.equals(this.developerId, ptsv2paymentsidreversalsClientReferenceInformationPartner.developerId) &&
        Objects.equals(this.solutionId, ptsv2paymentsidreversalsClientReferenceInformationPartner.solutionId) &&
        Objects.equals(this.thirdPartyCertificationNumber, ptsv2paymentsidreversalsClientReferenceInformationPartner.thirdPartyCertificationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerId, solutionId, thirdPartyCertificationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsClientReferenceInformationPartner {\n");
    
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    thirdPartyCertificationNumber: ").append(toIndentedString(thirdPartyCertificationNumber)).append("\n");
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

