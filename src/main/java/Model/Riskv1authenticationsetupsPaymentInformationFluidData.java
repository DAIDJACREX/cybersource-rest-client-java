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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
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
   * Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution used by the merchant. Used by Authorization and Standalone Credits. Required for authorizations and standalone credits that use a Cybersource suppored Point-to-Point encryption method. Card Present processing This field represents the encrypted payment data generated by the payment terminal/device. 
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Represents the encrypted payment data BLOB. The entry for this field is dependent on the payment solution used by the merchant. Used by Authorization and Standalone Credits. Required for authorizations and standalone credits that use a Cybersource suppored Point-to-Point encryption method. Card Present processing This field represents the encrypted payment data generated by the payment terminal/device. ")
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
   * The identifier for a payment solution, which is sending the encrypted payment data for decryption. Valid values: Samsung Pay: RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ&#x3D; Note: For other payment solutions, the value may be specific to the terminal or device initiatinf the payment. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor. Used by Authorization and Standalone Credits. Required for authorizations and standalone credits.  Card Present processing: Format of the encrypted payment data. The value for Bluefin PCI P2PE is &#x60;Ymx1ZWZpbg&#x3D;&#x3D;&#x60;. paymentInformation.fluidData.encoding must be &#x60;Base64&#x60;. The value for Cybersource P2PE decryption depends on the encoding method used and identified in encoding field. If paymentInformation.fluidData.encoding is &#x60;Base64&#x60;, the value is: &#x60;RklEPUVNVi5QQVlNRU5ULkFQSQ&#x3D;&#x3D;&#x60; If paymentInformation.fluidData.encoding is &#x60;HEX&#x60;, the value is: &#x60;4649443D454D562E5041594D454E542E41504&#x60; 
   * @return descriptor
  **/
  @ApiModelProperty(value = "The identifier for a payment solution, which is sending the encrypted payment data for decryption. Valid values: Samsung Pay: RklEPUNPTU1PTi5TQU1TVU5HLklOQVBQLlBBWU1FTlQ= Note: For other payment solutions, the value may be specific to the terminal or device initiatinf the payment. For example, the descriptor for a Bluefin payment encryption would be a device-generated descriptor. Used by Authorization and Standalone Credits. Required for authorizations and standalone credits.  Card Present processing: Format of the encrypted payment data. The value for Bluefin PCI P2PE is `Ymx1ZWZpbg==`. paymentInformation.fluidData.encoding must be `Base64`. The value for Cybersource P2PE decryption depends on the encoding method used and identified in encoding field. If paymentInformation.fluidData.encoding is `Base64`, the value is: `RklEPUVNVi5QQVlNRU5ULkFQSQ==` If paymentInformation.fluidData.encoding is `HEX`, the value is: `4649443D454D562E5041594D454E542E41504` ")
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
   * Encoding method used to encrypt the payment data. Valid values: &#x60;Base64&#x60;, &#x60;HEX&#x60; If no value is provided, &#x60;Base64&#x60; is taken as the default value. And the &#x60;Base64&#x60; descriptor is used for paymentInformation.fluidData.encoding 
   * @return encoding
  **/
  @ApiModelProperty(value = "Encoding method used to encrypt the payment data. Valid values: `Base64`, `HEX` If no value is provided, `Base64` is taken as the default value. And the `Base64` descriptor is used for paymentInformation.fluidData.encoding ")
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

