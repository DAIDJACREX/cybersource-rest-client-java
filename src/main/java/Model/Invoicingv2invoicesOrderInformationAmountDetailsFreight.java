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
 * Contains all of the shipping-related fields for the invoice.
 */
@ApiModel(description = "Contains all of the shipping-related fields for the invoice.")

public class Invoicingv2invoicesOrderInformationAmountDetailsFreight {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("taxRate")
  private String taxRate = null;

  public Invoicingv2invoicesOrderInformationAmountDetailsFreight amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field. 
   * @return amount
  **/
  @ApiModelProperty(value = "Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field. ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetailsFreight taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values &gt; 0.  If you do not include any &#x60;lineItems[].taxAmount&#x60; values in your request, CyberSource does not include &#x60;invoiceDetails.taxable&#x60; in the data it sends to the processor.  For processor-specific information, see the &#x60;tax_indicator&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html)  Possible values:  - **true**  - **false** 
   * @return taxable
  **/
  @ApiModelProperty(value = "Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values > 0.  If you do not include any `lineItems[].taxAmount` values in your request, CyberSource does not include `invoiceDetails.taxable` in the data it sends to the processor.  For processor-specific information, see the `tax_indicator` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html)  Possible values:  - **true**  - **false** ")
  public Boolean isTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public Invoicingv2invoicesOrderInformationAmountDetailsFreight taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Shipping Tax rate applied to the freight amount.  **Visa**: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  **Mastercard**: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). 
   * @return taxRate
  **/
  @ApiModelProperty(value = "Shipping Tax rate applied to the freight amount.  **Visa**: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  **Mastercard**: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). ")
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoicingv2invoicesOrderInformationAmountDetailsFreight invoicingv2invoicesOrderInformationAmountDetailsFreight = (Invoicingv2invoicesOrderInformationAmountDetailsFreight) o;
    return Objects.equals(this.amount, invoicingv2invoicesOrderInformationAmountDetailsFreight.amount) &&
        Objects.equals(this.taxable, invoicingv2invoicesOrderInformationAmountDetailsFreight.taxable) &&
        Objects.equals(this.taxRate, invoicingv2invoicesOrderInformationAmountDetailsFreight.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, taxable, taxRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoicingv2invoicesOrderInformationAmountDetailsFreight {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

