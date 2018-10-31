/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2002DeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2002DeviceInformation {
  @SerializedName("id")
  private String id = null;

  @SerializedName("fingerprintId")
  private String fingerprintId = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  public InlineResponse2002DeviceInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * TBD
   * @return id - getID.
  **/
  @ApiModelProperty(value = "TBD")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2002DeviceInformation fingerprintId(String fingerprintId) {
    this.fingerprintId = fingerprintId;
    return this;
  }

   /**
   * TBD
   * @return fingerprintId - ID.
  **/
  @ApiModelProperty(value = "TBD")
  public String getFingerprintId() {
    return fingerprintId;
  }

  public void setFingerprintId(String fingerprintId) {
    this.fingerprintId = fingerprintId;
  }

  public InlineResponse2002DeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.
   * @return ipAddress IP address of the customer.
  **/
  @ApiModelProperty(value = "IP address of the customer.")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002DeviceInformation inlineResponse2002DeviceInformation = (InlineResponse2002DeviceInformation) o;
    return Objects.equals(this.id, inlineResponse2002DeviceInformation.id) &&
        Objects.equals(this.fingerprintId, inlineResponse2002DeviceInformation.fingerprintId) &&
        Objects.equals(this.ipAddress, inlineResponse2002DeviceInformation.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fingerprintId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002DeviceInformation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fingerprintId: ").append(toIndentedString(fingerprintId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

