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
 * Riskv1authenticationsetupsPaymentInformationFluidData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Riskv1authenticationsetupsPaymentInformationFluidData {
  @SerializedName("value")
  private String value = null;

  @SerializedName("keySerialNumber")
  private String keySerialNumber = null;

  @SerializedName("descriptor")
  private String descriptor = null;

  @SerializedName("encoding")
  private String encoding = null;

  public Riskv1authenticationsetupsPaymentInformationFluidData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution a merchant uses.  #### Used by **Authorization and Standalone Credits** Required for authorizations and standalone credits that use Bluefin PCI P2PE.  #### Card Present processing This field represents the encrypted Bluefin PCI P2PE payment data. Obtain the encrypted payment data from a Bluefin-supported device. 
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution a merchant uses.  #### Used by **Authorization and Standalone Credits** Required for authorizations and standalone credits that use Bluefin PCI P2PE.  #### Card Present processing This field represents the encrypted Bluefin PCI P2PE payment data. Obtain the encrypted payment data from a Bluefin-supported device. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Riskv1authenticationsetupsPaymentInformationFluidData keySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
    return this;
  }

   /**
   * The encoded or encrypted value that a payment solution returns for an authorization request. For details about the valid values for a key, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) 
   * @return keySerialNumber
  **/
  @ApiModelProperty(value = "The encoded or encrypted value that a payment solution returns for an authorization request. For details about the valid values for a key, see [Creating an Online Authorization](https://developer.cybersource.com/api/developer-guides/dita-payments/CreatingOnlineAuth.html) ")
  public String getKeySerialNumber() {
    return keySerialNumber;
  }

  public void setKeySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
  }

  public Riskv1authenticationsetupsPaymentInformationFluidData descriptor(String descriptor) {
    this.descriptor = descriptor;
    return this;
  }

   /**
   * The identifier for a payment solution, which is sending the encrypted payment data for decryption. Valid values: - Samsung Pay: &#x60;RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ&#x3D;&#x60;  **Note**: For other payment solutions, the value may be specific to the customer&#39;s mobile device. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor.  #### Used by **Authorization and Standalone Credits** Required for authorizations and standalone credits that use Bluefin PCI P2PE.  #### Card Present processing Format of the encrypted payment data. The value for Bluefin PCI P2PE is &#x60;Ymx1ZWZpbg&#x3D;&#x3D;&#x60;. 
   * @return descriptor
  **/
  @ApiModelProperty(value = "The identifier for a payment solution, which is sending the encrypted payment data for decryption. Valid values: - Samsung Pay: `RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ=`  **Note**: For other payment solutions, the value may be specific to the customer's mobile device. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor.  #### Used by **Authorization and Standalone Credits** Required for authorizations and standalone credits that use Bluefin PCI P2PE.  #### Card Present processing Format of the encrypted payment data. The value for Bluefin PCI P2PE is `Ymx1ZWZpbg==`. ")
  public String getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
  }

  public Riskv1authenticationsetupsPaymentInformationFluidData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding method used to encrypt the payment data.  Valid value: Base64 
   * @return encoding
  **/
  @ApiModelProperty(value = "Encoding method used to encrypt the payment data.  Valid value: Base64 ")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsetupsPaymentInformationFluidData riskv1authenticationsetupsPaymentInformationFluidData = (Riskv1authenticationsetupsPaymentInformationFluidData) o;
    return Objects.equals(this.value, riskv1authenticationsetupsPaymentInformationFluidData.value) &&
        Objects.equals(this.keySerialNumber, riskv1authenticationsetupsPaymentInformationFluidData.keySerialNumber) &&
        Objects.equals(this.descriptor, riskv1authenticationsetupsPaymentInformationFluidData.descriptor) &&
        Objects.equals(this.encoding, riskv1authenticationsetupsPaymentInformationFluidData.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, keySerialNumber, descriptor, encoding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsetupsPaymentInformationFluidData {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    keySerialNumber: ").append(toIndentedString(keySerialNumber)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

