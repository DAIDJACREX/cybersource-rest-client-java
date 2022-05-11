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
import Model.Riskv1decisionsClientReferenceInformationPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Kmsv2keyssymClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class Kmsv2keyssymClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("partner")
  private Riskv1decisionsClientReferenceInformationPartner partner = null;

  public Kmsv2keyssymClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Client-generated order reference or tracking number. CyberSource recommends that you send a unique value. 
   * @return code
  **/
  @ApiModelProperty(value = "Client-generated order reference or tracking number. CyberSource recommends that you send a unique value. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Kmsv2keyssymClientReferenceInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @ApiModelProperty(value = "Comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Kmsv2keyssymClientReferenceInformation partner(Riskv1decisionsClientReferenceInformationPartner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsClientReferenceInformationPartner getPartner() {
    return partner;
  }

  public void setPartner(Riskv1decisionsClientReferenceInformationPartner partner) {
    this.partner = partner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kmsv2keyssymClientReferenceInformation kmsv2keyssymClientReferenceInformation = (Kmsv2keyssymClientReferenceInformation) o;
    return Objects.equals(this.code, kmsv2keyssymClientReferenceInformation.code) &&
        Objects.equals(this.comments, kmsv2keyssymClientReferenceInformation.comments) &&
        Objects.equals(this.partner, kmsv2keyssymClientReferenceInformation.partner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, comments, partner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kmsv2keyssymClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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

