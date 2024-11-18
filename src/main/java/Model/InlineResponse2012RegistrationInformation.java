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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2012RegistrationInformation
 */

public class InlineResponse2012RegistrationInformation {
  @SerializedName("boardingPackageId")
  private String boardingPackageId = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("salesRepId")
  private String salesRepId = null;

   /**
   * Get boardingPackageId
   * @return boardingPackageId
  **/
  @ApiModelProperty(example = "1004001", value = "")
  public String getBoardingPackageId() {
    return boardingPackageId;
  }

  public InlineResponse2012RegistrationInformation mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * In case mode is not provided the API will use COMPLETE as default Possible Values:   - &#39;COMPLETE&#39;   - &#39;PARTIAL&#39; 
   * @return mode
  **/
  @ApiModelProperty(value = "In case mode is not provided the API will use COMPLETE as default Possible Values:   - 'COMPLETE'   - 'PARTIAL' ")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public InlineResponse2012RegistrationInformation salesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
    return this;
  }

   /**
   * Get salesRepId
   * @return salesRepId
  **/
  @ApiModelProperty(example = "Rep1", value = "")
  public String getSalesRepId() {
    return salesRepId;
  }

  public void setSalesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2012RegistrationInformation inlineResponse2012RegistrationInformation = (InlineResponse2012RegistrationInformation) o;
    return Objects.equals(this.boardingPackageId, inlineResponse2012RegistrationInformation.boardingPackageId) &&
        Objects.equals(this.mode, inlineResponse2012RegistrationInformation.mode) &&
        Objects.equals(this.salesRepId, inlineResponse2012RegistrationInformation.salesRepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardingPackageId, mode, salesRepId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012RegistrationInformation {\n");
    
    sb.append("    boardingPackageId: ").append(toIndentedString(boardingPackageId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    salesRepId: ").append(toIndentedString(salesRepId)).append("\n");
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

