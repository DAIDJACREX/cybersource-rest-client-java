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
 * Tssv2transactionsemvTagDetailsEmvDetailsList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Tssv2transactionsemvTagDetailsEmvDetailsList {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("emvRequestCombinedTags")
  private String emvRequestCombinedTags = null;

  public Tssv2transactionsemvTagDetailsEmvDetailsList requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public Tssv2transactionsemvTagDetailsEmvDetailsList emvRequestCombinedTags(String emvRequestCombinedTags) {
    this.emvRequestCombinedTags = emvRequestCombinedTags;
    return this;
  }

   /**
   * EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Important** The following tags contain sensitive information and **must not** be included in this field:   - &#x60;56&#x60;: Track 1 equivalent data  - &#x60;57&#x60;: Track 2 equivalent data  - &#x60;5A&#x60;: Application PAN  - &#x60;5F20&#x60;: Cardholder name  - &#x60;5F24&#x60;: Application expiration date (This sensitivity has been relaxed for Credit Mutuel-CIC, American Express Direct, FDC Nashville Global, First Data Merchant Solutions, and SIX)  - &#x60;99&#x60;: Transaction PIN  - &#x60;9F0B&#x60;: Cardholder name (extended)  - &#x60;9F1F&#x60;: Track 1 discretionary data  - &#x60;9F20&#x60;: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - &#x60;95&#x60;: Terminal verification results  - &#x60;9F10&#x60;: Issuer application data  - &#x60;9F26&#x60;: Application cryptogram   #### CyberSource through VisaNet - In Japan: 199 bytes - In other countries: String (252)  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International  #### JCN Gateway The following tags must be included: - &#x60;4F&#x60;: Application identifier - &#x60;84&#x60;: Dedicated file name  Data length: 199 bytes  #### All other processors: String (999)  #### Used by Authorization: Optional Authorization Reversal: Optional Credit: Optional PIN Debit processing (purchase, credit and reversal): Optional 
   * @return emvRequestCombinedTags
  **/
  @ApiModelProperty(required = true, value = "EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Important** The following tags contain sensitive information and **must not** be included in this field:   - `56`: Track 1 equivalent data  - `57`: Track 2 equivalent data  - `5A`: Application PAN  - `5F20`: Cardholder name  - `5F24`: Application expiration date (This sensitivity has been relaxed for Credit Mutuel-CIC, American Express Direct, FDC Nashville Global, First Data Merchant Solutions, and SIX)  - `99`: Transaction PIN  - `9F0B`: Cardholder name (extended)  - `9F1F`: Track 1 discretionary data  - `9F20`: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - `95`: Terminal verification results  - `9F10`: Issuer application data  - `9F26`: Application cryptogram   #### CyberSource through VisaNet - In Japan: 199 bytes - In other countries: String (252)  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International  #### JCN Gateway The following tags must be included: - `4F`: Application identifier - `84`: Dedicated file name  Data length: 199 bytes  #### All other processors: String (999)  #### Used by Authorization: Optional Authorization Reversal: Optional Credit: Optional PIN Debit processing (purchase, credit and reversal): Optional ")
  public String getEmvRequestCombinedTags() {
    return emvRequestCombinedTags;
  }

  public void setEmvRequestCombinedTags(String emvRequestCombinedTags) {
    this.emvRequestCombinedTags = emvRequestCombinedTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tssv2transactionsemvTagDetailsEmvDetailsList tssv2transactionsemvTagDetailsEmvDetailsList = (Tssv2transactionsemvTagDetailsEmvDetailsList) o;
    return Objects.equals(this.requestId, tssv2transactionsemvTagDetailsEmvDetailsList.requestId) &&
        Objects.equals(this.emvRequestCombinedTags, tssv2transactionsemvTagDetailsEmvDetailsList.emvRequestCombinedTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, emvRequestCombinedTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tssv2transactionsemvTagDetailsEmvDetailsList {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    emvRequestCombinedTags: ").append(toIndentedString(emvRequestCombinedTags)).append("\n");
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

