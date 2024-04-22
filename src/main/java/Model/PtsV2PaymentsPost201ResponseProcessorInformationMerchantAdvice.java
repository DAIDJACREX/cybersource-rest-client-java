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
 * PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice
 */

public class PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice {
  @SerializedName("code")
  private String code = null;

  @SerializedName("codeRaw")
  private String codeRaw = null;

  @SerializedName("nameMatch")
  private String nameMatch = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice code(String code) {
    this.code = code;
    return this;
  }

   /**
   * - Merchant should update their retry logic to ensure retry is not attempted for the cards for which Issuer won&#39;t approve the transactions and where the retry is allowed. - Card Processing Associations provides this data which is being passed through in the following data element irrespective of the Card Associations.   Usage of this data must be always associated with the Card Associations card types for merchant processing retry logic. - In additions to the Merchant Advice code, Associations also provides the decline response codes which provides the reason for decline.  Association response code will be a pass-through value.  #### Processors supported:   - HSBC   - Barclays   - FDC Nash   - FDI Global   - Elavon America   - VPC   - Rede   - Payment tech Salem   #### Possible values: | Card Type   | Advice Code   |  Description                                | | ----------- | ------------- | ------------------------------------------- | | VISA        | 1             | Issuer never approves                       | | VISA        | 2             | Issuer cannot approve at this time          | | VISA        | 3             | Data quality/revalidate payment information | | MasterCard  | 01            | New account information available           | | MasterCard  | 02            | Try Again Later                             | | MasterCard  | 03            | Do Not Try Again                            | | MasterCard  | 04            | Token not supported                         | | MasterCard  | 21            | Do not honor                                | | MasterCard  | 22            | Merchant does not qualify for product code  | | MasterCard  | 24            | Retry after 1 hour                          | | MasterCard  | 25            | Retry after 24 hours                        | | MasterCard  | 26            | Retry after 2 days                          | | MasterCard  | 27            | Retry after 4 days                          | | MasterCard  | 28            | Retry after 6 days                          | | MasterCard  | 29            | Retry after 8 days                          | | MasterCard  | 30            | Retry after 10 days                         | | MasterCard  | 40            | Consumer non-reloadable prepaid card        | | MasterCard  | 41            | Consumer single-use virtual card number     | | MasterCard  | 42            | Sanctions score exceeds threshold value     | | MasterCard  | 99            | Do Not Try Again                            |  For processor-specific information, see the &#x60;auth_merchant_advice_code&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return code
  **/
  @ApiModelProperty(value = "- Merchant should update their retry logic to ensure retry is not attempted for the cards for which Issuer won't approve the transactions and where the retry is allowed. - Card Processing Associations provides this data which is being passed through in the following data element irrespective of the Card Associations.   Usage of this data must be always associated with the Card Associations card types for merchant processing retry logic. - In additions to the Merchant Advice code, Associations also provides the decline response codes which provides the reason for decline.  Association response code will be a pass-through value.  #### Processors supported:   - HSBC   - Barclays   - FDC Nash   - FDI Global   - Elavon America   - VPC   - Rede   - Payment tech Salem   #### Possible values: | Card Type   | Advice Code   |  Description                                | | ----------- | ------------- | ------------------------------------------- | | VISA        | 1             | Issuer never approves                       | | VISA        | 2             | Issuer cannot approve at this time          | | VISA        | 3             | Data quality/revalidate payment information | | MasterCard  | 01            | New account information available           | | MasterCard  | 02            | Try Again Later                             | | MasterCard  | 03            | Do Not Try Again                            | | MasterCard  | 04            | Token not supported                         | | MasterCard  | 21            | Do not honor                                | | MasterCard  | 22            | Merchant does not qualify for product code  | | MasterCard  | 24            | Retry after 1 hour                          | | MasterCard  | 25            | Retry after 24 hours                        | | MasterCard  | 26            | Retry after 2 days                          | | MasterCard  | 27            | Retry after 4 days                          | | MasterCard  | 28            | Retry after 6 days                          | | MasterCard  | 29            | Retry after 8 days                          | | MasterCard  | 30            | Retry after 10 days                         | | MasterCard  | 40            | Consumer non-reloadable prepaid card        | | MasterCard  | 41            | Consumer single-use virtual card number     | | MasterCard  | 42            | Sanctions score exceeds threshold value     | | MasterCard  | 99            | Do Not Try Again                            |  For processor-specific information, see the `auth_merchant_advice_code` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice codeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
    return this;
  }

   /**
   * Raw merchant advice code sent directly from the processor. This field is used only for Mastercard.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR7 - Position: 96-99 - Field: Response Data-Merchant Advice Code   For processor-specific information, see the &#x60;auth_merchant_advice_code_raw&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return codeRaw
  **/
  @ApiModelProperty(value = "Raw merchant advice code sent directly from the processor. This field is used only for Mastercard.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR7 - Position: 96-99 - Field: Response Data-Merchant Advice Code   For processor-specific information, see the `auth_merchant_advice_code_raw` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCodeRaw() {
    return codeRaw;
  }

  public void setCodeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice nameMatch(String nameMatch) {
    this.nameMatch = nameMatch;
    return this;
  }

   /**
   * #### Visa Platform Connect The field contains will contain the Account Name Request Result for zero amount Authorization request. Valid values are:  00 &#x3D; Name Match Performed 01 &#x3D; Name Match not Performed 02 &#x3D; Name Match not supported 
   * @return nameMatch
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect The field contains will contain the Account Name Request Result for zero amount Authorization request. Valid values are:  00 = Name Match Performed 01 = Name Match not Performed 02 = Name Match not supported ")
  public String getNameMatch() {
    return nameMatch;
  }

  public void setNameMatch(String nameMatch) {
    this.nameMatch = nameMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice = (PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice) o;
    return Objects.equals(this.code, ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice.code) &&
        Objects.equals(this.codeRaw, ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice.codeRaw) &&
        Objects.equals(this.nameMatch, ptsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice.nameMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeRaw, nameMatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeRaw: ").append(toIndentedString(codeRaw)).append("\n");
    sb.append("    nameMatch: ").append(toIndentedString(nameMatch)).append("\n");
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

