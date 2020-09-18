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
 * TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint {
  @SerializedName("true_ipaddress")
  private String trueIpaddress = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("smartId")
  private String smartId = null;

  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint trueIpaddress(String trueIpaddress) {
    this.trueIpaddress = trueIpaddress;
    return this;
  }

   /**
   * Customer’s true IP address detected by the application.  For details, see the &#x60;true_ipaddress&#x60; field description in _Device Fingerprinting Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Device Fingerprinting Guide_ (PDF link). 
   * @return trueIpaddress
  **/
  @ApiModelProperty(value = "Customer’s true IP address detected by the application.  For details, see the `true_ipaddress` field description in _Device Fingerprinting Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Device Fingerprinting Guide_ (PDF link). ")
  public String getTrueIpaddress() {
    return trueIpaddress;
  }

  public void setTrueIpaddress(String trueIpaddress) {
    this.trueIpaddress = trueIpaddress;
  }

  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier of the device that is returned in the &#x60;riskInformation.providers.fingerprint.device_fingerprint_hash&#x60; API reply field.  NOTE: For details about the value of this field, see the &#x60;decision_provider_#_field_#_value&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link).  For more details about this field, see the &#x60;device_fingerprint_hash&#x60; field description in the _Device Fingerprinting Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Device Fingerprinting Guide_ (PDF link). 
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier of the device that is returned in the `riskInformation.providers.fingerprint.device_fingerprint_hash` API reply field.  NOTE: For details about the value of this field, see the `decision_provider_#_field_#_value` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link).  For more details about this field, see the `device_fingerprint_hash` field description in the _Device Fingerprinting Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Device Fingerprinting Guide_ (PDF link). ")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint smartId(String smartId) {
    this.smartId = smartId;
    return this;
  }

   /**
   * The device identifier generated from attributes collected during profiling. Returned by a 3rd party when you use device fingerprinting.  For details, see the &#x60;device_fingerprint_smart_id&#x60; field description in [CyberSource Decision Manager Device Fingerprinting Guide.](https://www.cybersource.com/developers/documentation/fraud_management) 
   * @return smartId
  **/
  @ApiModelProperty(value = "The device identifier generated from attributes collected during profiling. Returned by a 3rd party when you use device fingerprinting.  For details, see the `device_fingerprint_smart_id` field description in [CyberSource Decision Manager Device Fingerprinting Guide.](https://www.cybersource.com/developers/documentation/fraud_management) ")
  public String getSmartId() {
    return smartId;
  }

  public void setSmartId(String smartId) {
    this.smartId = smartId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint tssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint = (TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint) o;
    return Objects.equals(this.trueIpaddress, tssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint.trueIpaddress) &&
        Objects.equals(this.hash, tssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint.hash) &&
        Objects.equals(this.smartId, tssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint.smartId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trueIpaddress, hash, smartId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint {\n");
    
    sb.append("    trueIpaddress: ").append(toIndentedString(trueIpaddress)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    smartId: ").append(toIndentedString(smartId)).append("\n");
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

