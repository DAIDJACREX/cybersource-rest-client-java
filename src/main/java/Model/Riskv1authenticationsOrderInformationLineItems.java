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
import Model.Ptsv2paymentsOrderInformationPassenger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class Riskv1authenticationsOrderInformationLineItems {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("giftCardCurrency")
  private Integer giftCardCurrency = null;

  @SerializedName("productSKU")
  private String productSKU = null;

  @SerializedName("productDescription")
  private String productDescription = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("passenger")
  private Ptsv2paymentsOrderInformationPassenger passenger = null;

  @SerializedName("shippingDestinationTypes")
  private String shippingDestinationTypes = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  public Riskv1authenticationsOrderInformationLineItems totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount for the item. Normally calculated as the unit price times quantity.  When &#x60;orderInformation.lineItems[].productCode&#x60; is \&quot;gift_card\&quot;, this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD &#x3D; 123 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount for the item. Normally calculated as the unit price times quantity.  When `orderInformation.lineItems[].productCode` is \"gift_card\", this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD = 123 ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Riskv1authenticationsOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) 
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Riskv1authenticationsOrderInformationLineItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of units for this order. Must be a non-negative integer.  The default is &#x60;1&#x60;. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * minimum: 1
   * maximum: 999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of units for this order. Must be a non-negative integer.  The default is `1`. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Riskv1authenticationsOrderInformationLineItems giftCardCurrency(Integer giftCardCurrency) {
    this.giftCardCurrency = giftCardCurrency;
    return this;
  }

   /**
   * When &#x60;orderInformation.lineItems[].productCode&#x60; is \&quot;gift_card\&quot;, this is the currency used for the gift card purchase.  For details, see &#x60;pa_gift_card_currency&#x60; field description in [CyberSource Payer Authentication Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/Payer_Authentication_SCMP_API.pdf)  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) 
   * @return giftCardCurrency
  **/
  @ApiModelProperty(value = "When `orderInformation.lineItems[].productCode` is \"gift_card\", this is the currency used for the gift card purchase.  For details, see `pa_gift_card_currency` field description in [CyberSource Payer Authentication Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/Payer_Authentication_SCMP_API.pdf)  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) ")
  public Integer getGiftCardCurrency() {
    return giftCardCurrency;
  }

  public void setGiftCardCurrency(Integer giftCardCurrency) {
    this.giftCardCurrency = giftCardCurrency;
  }

  public Riskv1authenticationsOrderInformationLineItems productSKU(String productSKU) {
    this.productSKU = productSKU;
    return this;
  }

   /**
   * Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the values related to shipping and/or handling. 
   * @return productSKU
  **/
  @ApiModelProperty(value = "Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the values related to shipping and/or handling. ")
  public String getProductSKU() {
    return productSKU;
  }

  public void setProductSKU(String productSKU) {
    this.productSKU = productSKU;
  }

  public Riskv1authenticationsOrderInformationLineItems productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

   /**
   * Brief description of item.
   * @return productDescription
  **/
  @ApiModelProperty(value = "Brief description of item.")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Riskv1authenticationsOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * @return productName
  **/
  @ApiModelProperty(value = "For an authorization or capture transaction (`processingOptions.capture` is `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Riskv1authenticationsOrderInformationLineItems passenger(Ptsv2paymentsOrderInformationPassenger passenger) {
    this.passenger = passenger;
    return this;
  }

   /**
   * Get passenger
   * @return passenger
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationPassenger getPassenger() {
    return passenger;
  }

  public void setPassenger(Ptsv2paymentsOrderInformationPassenger passenger) {
    this.passenger = passenger;
  }

  public Riskv1authenticationsOrderInformationLineItems shippingDestinationTypes(String shippingDestinationTypes) {
    this.shippingDestinationTypes = shippingDestinationTypes;
    return this;
  }

   /**
   * Destination to where the item will be shipped. Example: Commercial, Residential, Store 
   * @return shippingDestinationTypes
  **/
  @ApiModelProperty(value = "Destination to where the item will be shipped. Example: Commercial, Residential, Store ")
  public String getShippingDestinationTypes() {
    return shippingDestinationTypes;
  }

  public void setShippingDestinationTypes(String shippingDestinationTypes) {
    this.shippingDestinationTypes = shippingDestinationTypes;
  }

  public Riskv1authenticationsOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount=10.00, quantity=1, and taxAmount=0.80  ..- 2nd line item has amount=20.00, quantity=1, and taxAmount=1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsOrderInformationLineItems riskv1authenticationsOrderInformationLineItems = (Riskv1authenticationsOrderInformationLineItems) o;
    return Objects.equals(this.totalAmount, riskv1authenticationsOrderInformationLineItems.totalAmount) &&
        Objects.equals(this.unitPrice, riskv1authenticationsOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.quantity, riskv1authenticationsOrderInformationLineItems.quantity) &&
        Objects.equals(this.giftCardCurrency, riskv1authenticationsOrderInformationLineItems.giftCardCurrency) &&
        Objects.equals(this.productSKU, riskv1authenticationsOrderInformationLineItems.productSKU) &&
        Objects.equals(this.productDescription, riskv1authenticationsOrderInformationLineItems.productDescription) &&
        Objects.equals(this.productName, riskv1authenticationsOrderInformationLineItems.productName) &&
        Objects.equals(this.passenger, riskv1authenticationsOrderInformationLineItems.passenger) &&
        Objects.equals(this.shippingDestinationTypes, riskv1authenticationsOrderInformationLineItems.shippingDestinationTypes) &&
        Objects.equals(this.taxAmount, riskv1authenticationsOrderInformationLineItems.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, unitPrice, quantity, giftCardCurrency, productSKU, productDescription, productName, passenger, shippingDestinationTypes, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsOrderInformationLineItems {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    giftCardCurrency: ").append(toIndentedString(giftCardCurrency)).append("\n");
    sb.append("    productSKU: ").append(toIndentedString(productSKU)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    shippingDestinationTypes: ").append(toIndentedString(shippingDestinationTypes)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

