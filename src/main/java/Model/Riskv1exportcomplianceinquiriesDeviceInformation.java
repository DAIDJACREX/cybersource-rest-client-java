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
 * Riskv1exportcomplianceinquiriesDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Riskv1exportcomplianceinquiriesDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("hostName")
  private String hostName = null;

  public Riskv1exportcomplianceinquiriesDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Riskv1exportcomplianceinquiriesDeviceInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * DNS resolved hostname from &#x60;ipAddress&#x60;.
   * @return hostName
  **/
  @ApiModelProperty(value = "DNS resolved hostname from `ipAddress`.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesDeviceInformation riskv1exportcomplianceinquiriesDeviceInformation = (Riskv1exportcomplianceinquiriesDeviceInformation) o;
    return Objects.equals(this.ipAddress, riskv1exportcomplianceinquiriesDeviceInformation.ipAddress) &&
        Objects.equals(this.hostName, riskv1exportcomplianceinquiriesDeviceInformation.hostName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, hostName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesDeviceInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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

