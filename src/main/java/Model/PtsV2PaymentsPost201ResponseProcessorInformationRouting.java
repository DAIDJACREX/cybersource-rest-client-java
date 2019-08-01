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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T12:55:52.826+05:30")
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
   * Indicates whether the transaction was routed on a credit network, a debit network, or the STAR signature debit network.  Possible values: - &#x60;C&#x60;: Credit network - &#x60;D&#x60;: Debit network (without signature) - &#x60;S&#x60;: STAR signature debit network  This field is supported only on FDC Nashville Global.  For details, see the &#x60;routing_network_type&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return network
  **/
  @ApiModelProperty(value = "Indicates whether the transaction was routed on a credit network, a debit network, or the STAR signature debit network.  Possible values: - `C`: Credit network - `D`: Debit network (without signature) - `S`: STAR signature debit network  This field is supported only on FDC Nashville Global.  For details, see the `routing_network_type` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
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
   * Name of the network on which the transaction was routed.  This field is supported only on FDC Nashville Global.  For details, see the &#x60;routing_network_label&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return networkName
  **/
  @ApiModelProperty(value = "Name of the network on which the transaction was routed.  This field is supported only on FDC Nashville Global.  For details, see the `routing_network_label` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
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
   * Indicates whether you need to obtain the cardholder&#39;s signature.  Possible values: - &#x60;Y&#x60;: You need to obtain the cardholder&#39;s signature. - &#x60;N&#x60;: You do not need to obtain the cardholder&#39;s signature.  This field is supported only on FDC Nashville Global.  For details, see the &#x60;routing_signature_cvm_required&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return customerSignatureRequired
  **/
  @ApiModelProperty(value = "Indicates whether you need to obtain the cardholder's signature.  Possible values: - `Y`: You need to obtain the cardholder's signature. - `N`: You do not need to obtain the cardholder's signature.  This field is supported only on FDC Nashville Global.  For details, see the `routing_signature_cvm_required` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
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

