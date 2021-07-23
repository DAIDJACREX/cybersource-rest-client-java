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
 * PtsV2PaymentsPost201ResponseProcessorInformationRouting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationRouting {
  @SerializedName("network")
  private String network = null;

  @SerializedName("networkName")
  private String networkName = null;

  @SerializedName("customerSignatureRequired")
  private String customerSignatureRequired = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationRouting network(String network) {
    this.network = network;
    return this;
  }

   /**
   * PIN Debit Services: Contains the ID of the debit network to which the transaction was routed.  | Code | Network | | --- | --- | | 0000 | Priority Routing or Generic File Update | | 0002 | Visa programs, Private Label and non-Visa Authorization Gateway Services | | 0003 | Interlink | | 0004 | Plus | | 0008 | Star | | 0009 | Pulse| | 0010 | Star | | 0011 | Star | | 0012 | Star (primary network ID) | | 0013 | AFFN | | 0015 | Star | | 0016 | Maestro | | 0017 | Pulse (primary network ID) | | 0018 | NYCE (primary network ID) | | 0019 | Pulse | | 0020 | Accel | | 0023 | NETS | | 0024 | CU24 | | 0025 | Alaska Option | | 0027 | NYCE | | 0028 | Shazam | | 0029 | EBT POS |  FDC Nashville Global authorization service:  Indicates whether the transaction was routed to a credit network, a debit network, or the STAR signature debit network. - &#x60;C&#x60;: Credit network - &#x60;D&#x60;: Debit network (without signature) - &#x60;S&#x60;: STAR signature debit network 
   * @return network
  **/
  @ApiModelProperty(value = "PIN Debit Services: Contains the ID of the debit network to which the transaction was routed.  | Code | Network | | --- | --- | | 0000 | Priority Routing or Generic File Update | | 0002 | Visa programs, Private Label and non-Visa Authorization Gateway Services | | 0003 | Interlink | | 0004 | Plus | | 0008 | Star | | 0009 | Pulse| | 0010 | Star | | 0011 | Star | | 0012 | Star (primary network ID) | | 0013 | AFFN | | 0015 | Star | | 0016 | Maestro | | 0017 | Pulse (primary network ID) | | 0018 | NYCE (primary network ID) | | 0019 | Pulse | | 0020 | Accel | | 0023 | NETS | | 0024 | CU24 | | 0025 | Alaska Option | | 0027 | NYCE | | 0028 | Shazam | | 0029 | EBT POS |  FDC Nashville Global authorization service:  Indicates whether the transaction was routed to a credit network, a debit network, or the STAR signature debit network. - `C`: Credit network - `D`: Debit network (without signature) - `S`: STAR signature debit network ")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationRouting networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

   /**
   * Name of the network to which the transaction was routed. 
   * @return networkName
  **/
  @ApiModelProperty(value = "Name of the network to which the transaction was routed. ")
  public String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationRouting customerSignatureRequired(String customerSignatureRequired) {
    this.customerSignatureRequired = customerSignatureRequired;
    return this;
  }

   /**
   * Indicates whether you need to obtain the cardholder&#39;s signature.  Possible values: - &#x60;Y&#x60;: You need to obtain the cardholder&#39;s signature. - &#x60;N&#x60;: You do not need to obtain the cardholder&#39;s signature. 
   * @return customerSignatureRequired
  **/
  @ApiModelProperty(value = "Indicates whether you need to obtain the cardholder's signature.  Possible values: - `Y`: You need to obtain the cardholder's signature. - `N`: You do not need to obtain the cardholder's signature. ")
  public String getCustomerSignatureRequired() {
    return customerSignatureRequired;
  }

  public void setCustomerSignatureRequired(String customerSignatureRequired) {
    this.customerSignatureRequired = customerSignatureRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationRouting ptsV2PaymentsPost201ResponseProcessorInformationRouting = (PtsV2PaymentsPost201ResponseProcessorInformationRouting) o;
    return Objects.equals(this.network, ptsV2PaymentsPost201ResponseProcessorInformationRouting.network) &&
        Objects.equals(this.networkName, ptsV2PaymentsPost201ResponseProcessorInformationRouting.networkName) &&
        Objects.equals(this.customerSignatureRequired, ptsV2PaymentsPost201ResponseProcessorInformationRouting.customerSignatureRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, networkName, customerSignatureRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationRouting {\n");
    
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    customerSignatureRequired: ").append(toIndentedString(customerSignatureRequired)).append("\n");
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

