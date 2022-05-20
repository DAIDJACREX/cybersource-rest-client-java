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
 * Contains all of the tax-related fields for the invoice.
 */
@ApiModel(description = "Contains all of the tax-related fields for the invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails {
  @SerializedName("type")
  private String type = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("rate")
  private String rate = null;

  public Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of tax data for the _taxDetails_ object.  Possible values:  - &#x60;alternate&#x60; - &#x60;local&#x60; - &#x60;national&#x60; - &#x60;vat&#x60; - &#x60;other&#x60;  For processor-specific details, see the &#x60;alternate_tax_amount&#x60;, &#x60;local_tax&#x60;, &#x60;national_tax&#x60; or &#x60;vat_tax_amount&#x60; field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of tax data for the _taxDetails_ object.  Possible values:  - `alternate` - `local` - `national` - `vat` - `other`  For processor-specific details, see the `alternate_tax_amount`, `local_tax`, `national_tax` or `vat_tax_amount` field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Indicates the amount of tax based on the &#x60;type&#x60; field as described in the table below:  | type      | type description | | ------------- |:-------------:| | &#x60;alternate&#x60; | Total amount of alternate tax for the order. | | &#x60;local&#x60;     | Sales tax for the order. | | &#x60;national&#x60;  | National tax for the order. | | &#x60;vat&#x60;       | Total amount of value added tax (VAT) included in the order. | | &#x60;other&#x60;     | Other tax. | 
   * @return amount
  **/
  @ApiModelProperty(value = "Indicates the amount of tax based on the `type` field as described in the table below:  | type      | type description | | ------------- |:-------------:| | `alternate` | Total amount of alternate tax for the order. | | `local`     | Sales tax for the order. | | `national`  | National tax for the order. | | `vat`       | Total amount of value added tax (VAT) included in the order. | | `other`     | Other tax. | ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Rate of VAT or other tax for the order.  Example 0.040 (&#x3D;4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated)  For processor-specific details, see the &#x60;alternate_tax_amount&#x60;, &#x60;vat_rate&#x60;, &#x60;vat_tax_rate&#x60;, &#x60;local_tax&#x60;, &#x60;national_tax&#x60;, &#x60;vat_tax_amount&#x60; or &#x60;other_tax#_rate&#x60; field descriptions in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return rate
  **/
  @ApiModelProperty(value = "Rate of VAT or other tax for the order.  Example 0.040 (=4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated)  For processor-specific details, see the `alternate_tax_amount`, `vat_rate`, `vat_tax_rate`, `local_tax`, `national_tax`, `vat_tax_amount` or `other_tax#_rate` field descriptions in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails invoicingv2invoicesOrderInformationAmountDetailsTaxDetails = (Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails) o;
    return Objects.equals(this.type, invoicingv2invoicesOrderInformationAmountDetailsTaxDetails.type) &&
        Objects.equals(this.amount, invoicingv2invoicesOrderInformationAmountDetailsTaxDetails.amount) &&
        Objects.equals(this.rate, invoicingv2invoicesOrderInformationAmountDetailsTaxDetails.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

