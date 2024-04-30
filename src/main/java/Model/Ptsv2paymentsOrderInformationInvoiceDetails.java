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
import Model.Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsOrderInformationInvoiceDetails
 */

public class Ptsv2paymentsOrderInformationInvoiceDetails {
  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("barcodeNumber")
  private String barcodeNumber = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("purchaseOrderDate")
  private String purchaseOrderDate = null;

  @SerializedName("purchaseContactName")
  private String purchaseContactName = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("vatInvoiceReferenceNumber")
  private String vatInvoiceReferenceNumber = null;

  @SerializedName("commodityCode")
  private String commodityCode = null;

  @SerializedName("merchandiseCode")
  private Integer merchandiseCode = null;

  @SerializedName("transactionAdviceAddendum")
  private List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum = null;

  @SerializedName("referenceDataCode")
  private String referenceDataCode = null;

  @SerializedName("referenceDataNumber")
  private String referenceDataNumber = null;

  @SerializedName("salesSlipNumber")
  private Integer salesSlipNumber = null;

  @SerializedName("invoiceDate")
  private String invoiceDate = null;

  @SerializedName("costCenter")
  private String costCenter = null;

  @SerializedName("issuerMessage")
  private String issuerMessage = null;

  @SerializedName("productDescription")
  private String productDescription = null;

  public Ptsv2paymentsOrderInformationInvoiceDetails invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Invoice Number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails barcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
    return this;
  }

   /**
   * Barcode Number.
   * @return barcodeNumber
  **/
  @ApiModelProperty(value = "Barcode Number.")
  public String getBarcodeNumber() {
    return barcodeNumber;
  }

  public void setBarcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration Date.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Expiration Date.")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the &#x60;user_po&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(value = "Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the `user_po` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * Date the order was processed. &#x60;Format: YYYY-MM-DD&#x60;.  For processor-specific information, see the &#x60;purchaser_order_date&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderDate
  **/
  @ApiModelProperty(value = "Date the order was processed. `Format: YYYY-MM-DD`.  For processor-specific information, see the `purchaser_order_date` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseContactName(String purchaseContactName) {
    this.purchaseContactName = purchaseContactName;
    return this;
  }

   /**
   * The name of the individual or the company contacted for company authorized purchases.  For processor-specific information, see the &#x60;authorized_contact_name&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseContactName
  **/
  @ApiModelProperty(value = "The name of the individual or the company contacted for company authorized purchases.  For processor-specific information, see the `authorized_contact_name` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseContactName() {
    return purchaseContactName;
  }

  public void setPurchaseContactName(String purchaseContactName) {
    this.purchaseContactName = purchaseContactName;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails taxable(Boolean taxable) {
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

  public Ptsv2paymentsOrderInformationInvoiceDetails vatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
    return this;
  }

   /**
   * VAT invoice number associated with the transaction.  For processor-specific information, see the &#x60;vat_invoice_ref_number&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatInvoiceReferenceNumber
  **/
  @ApiModelProperty(value = "VAT invoice number associated with the transaction.  For processor-specific information, see the `vat_invoice_ref_number` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatInvoiceReferenceNumber() {
    return vatInvoiceReferenceNumber;
  }

  public void setVatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * International description code of the overall order&#39;s goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the &#x60;summary_commodity_code&#x60; field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return commodityCode
  **/
  @ApiModelProperty(value = "International description code of the overall order's goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the `summary_commodity_code` field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails merchandiseCode(Integer merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
    return this;
  }

   /**
   * Identifier for the merchandise. This field is supported only on the processors listed in this field description.  #### American Express Direct Possible value: - 1000: Gift card  #### CyberSource through VisaNet This value must be right justified. In Japan, this value is called a _goods code_.  #### JCN Gateway This value must be right justified. In Japan, this value is called a _goods code_. 
   * @return merchandiseCode
  **/
  @ApiModelProperty(value = "Identifier for the merchandise. This field is supported only on the processors listed in this field description.  #### American Express Direct Possible value: - 1000: Gift card  #### CyberSource through VisaNet This value must be right justified. In Japan, this value is called a _goods code_.  #### JCN Gateway This value must be right justified. In Japan, this value is called a _goods code_. ")
  public Integer getMerchandiseCode() {
    return merchandiseCode;
  }

  public void setMerchandiseCode(Integer merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails transactionAdviceAddendum(List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
    return this;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails addTransactionAdviceAddendumItem(Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum transactionAdviceAddendumItem) {
    if (this.transactionAdviceAddendum == null) {
      this.transactionAdviceAddendum = new ArrayList<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum>();
    }
    this.transactionAdviceAddendum.add(transactionAdviceAddendumItem);
    return this;
  }

   /**
   * Get transactionAdviceAddendum
   * @return transactionAdviceAddendum
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> getTransactionAdviceAddendum() {
    return transactionAdviceAddendum;
  }

  public void setTransactionAdviceAddendum(List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails referenceDataCode(String referenceDataCode) {
    this.referenceDataCode = referenceDataCode;
    return this;
  }

   /**
   * Code that identifies the value of the &#x60;referenceDataNumber&#x60; field.  For the possible values, see \&quot;Reference Data Codes\&quot; in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/).  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. 
   * @return referenceDataCode
  **/
  @ApiModelProperty(value = "Code that identifies the value of the `referenceDataNumber` field.  For the possible values, see \"Reference Data Codes\" in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/).  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. ")
  public String getReferenceDataCode() {
    return referenceDataCode;
  }

  public void setReferenceDataCode(String referenceDataCode) {
    this.referenceDataCode = referenceDataCode;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails referenceDataNumber(String referenceDataNumber) {
    this.referenceDataNumber = referenceDataNumber;
    return this;
  }

   /**
   * Reference number. The meaning of this value is identified by the value of the &#x60;referenceDataCode&#x60; field.  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. 
   * @return referenceDataNumber
  **/
  @ApiModelProperty(value = "Reference number. The meaning of this value is identified by the value of the `referenceDataCode` field.  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. ")
  public String getReferenceDataNumber() {
    return referenceDataNumber;
  }

  public void setReferenceDataNumber(String referenceDataNumber) {
    this.referenceDataNumber = referenceDataNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails salesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
    return this;
  }

   /**
   * Transaction identifier that is generated. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway.  Optional field.  #### Card Present processing message If you included this field in the request, the returned value is the value that you sent in the request. If you did not include this field in the request, the system generated this value for you.  The difference between this reply field and the &#x60;processorInformation.systemTraceAuditNumber&#x60; field is that the system generates the system trace audit number (STAN), and you must print the receipt number on the receipt; whereas you can generate the sales slip number, and you can choose to print the sales slip number on the receipt. 
   * maximum: 99999
   * @return salesSlipNumber
  **/
  @ApiModelProperty(value = "Transaction identifier that is generated. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway.  Optional field.  #### Card Present processing message If you included this field in the request, the returned value is the value that you sent in the request. If you did not include this field in the request, the system generated this value for you.  The difference between this reply field and the `processorInformation.systemTraceAuditNumber` field is that the system generates the system trace audit number (STAN), and you must print the receipt number on the receipt; whereas you can generate the sales slip number, and you can choose to print the sales slip number on the receipt. ")
  public Integer getSalesSlipNumber() {
    return salesSlipNumber;
  }

  public void setSalesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Date of the tax calculation. Use format YYYYMMDD. You can provide a date in the past if you are calculating tax for a refund and want to know what the tax was on the date the order was placed. You can provide a date in the future if you are calculating the tax for a future date, such as an upcoming tax holiday.  The default is the date, in Pacific time, that the bank receives the request. Keep this in mind if you are in a different time zone and want the tax calculated with the rates that are applicable on a specific date.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "Date of the tax calculation. Use format YYYYMMDD. You can provide a date in the past if you are calculating tax for a refund and want to know what the tax was on the date the order was placed. You can provide a date in the future if you are calculating the tax for a future date, such as an upcoming tax holiday.  The default is the date, in Pacific time, that the bank receives the request. Keep this in mind if you are in a different time zone and want the tax calculated with the rates that are applicable on a specific date.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Cost centre of the merchant
   * @return costCenter
  **/
  @ApiModelProperty(value = "Cost centre of the merchant")
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails issuerMessage(String issuerMessage) {
    this.issuerMessage = issuerMessage;
    return this;
  }

   /**
   * Text message from the issuer. If you give the customer a receipt, display this value on the receipt.
   * @return issuerMessage
  **/
  @ApiModelProperty(value = "Text message from the issuer. If you give the customer a receipt, display this value on the receipt.")
  public String getIssuerMessage() {
    return issuerMessage;
  }

  public void setIssuerMessage(String issuerMessage) {
    this.issuerMessage = issuerMessage;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails productDescription(String productDescription) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationInvoiceDetails ptsv2paymentsOrderInformationInvoiceDetails = (Ptsv2paymentsOrderInformationInvoiceDetails) o;
    return Objects.equals(this.invoiceNumber, ptsv2paymentsOrderInformationInvoiceDetails.invoiceNumber) &&
        Objects.equals(this.barcodeNumber, ptsv2paymentsOrderInformationInvoiceDetails.barcodeNumber) &&
        Objects.equals(this.expirationDate, ptsv2paymentsOrderInformationInvoiceDetails.expirationDate) &&
        Objects.equals(this.purchaseOrderNumber, ptsv2paymentsOrderInformationInvoiceDetails.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderDate, ptsv2paymentsOrderInformationInvoiceDetails.purchaseOrderDate) &&
        Objects.equals(this.purchaseContactName, ptsv2paymentsOrderInformationInvoiceDetails.purchaseContactName) &&
        Objects.equals(this.taxable, ptsv2paymentsOrderInformationInvoiceDetails.taxable) &&
        Objects.equals(this.vatInvoiceReferenceNumber, ptsv2paymentsOrderInformationInvoiceDetails.vatInvoiceReferenceNumber) &&
        Objects.equals(this.commodityCode, ptsv2paymentsOrderInformationInvoiceDetails.commodityCode) &&
        Objects.equals(this.merchandiseCode, ptsv2paymentsOrderInformationInvoiceDetails.merchandiseCode) &&
        Objects.equals(this.transactionAdviceAddendum, ptsv2paymentsOrderInformationInvoiceDetails.transactionAdviceAddendum) &&
        Objects.equals(this.referenceDataCode, ptsv2paymentsOrderInformationInvoiceDetails.referenceDataCode) &&
        Objects.equals(this.referenceDataNumber, ptsv2paymentsOrderInformationInvoiceDetails.referenceDataNumber) &&
        Objects.equals(this.salesSlipNumber, ptsv2paymentsOrderInformationInvoiceDetails.salesSlipNumber) &&
        Objects.equals(this.invoiceDate, ptsv2paymentsOrderInformationInvoiceDetails.invoiceDate) &&
        Objects.equals(this.costCenter, ptsv2paymentsOrderInformationInvoiceDetails.costCenter) &&
        Objects.equals(this.issuerMessage, ptsv2paymentsOrderInformationInvoiceDetails.issuerMessage) &&
        Objects.equals(this.productDescription, ptsv2paymentsOrderInformationInvoiceDetails.productDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, barcodeNumber, expirationDate, purchaseOrderNumber, purchaseOrderDate, purchaseContactName, taxable, vatInvoiceReferenceNumber, commodityCode, merchandiseCode, transactionAdviceAddendum, referenceDataCode, referenceDataNumber, salesSlipNumber, invoiceDate, costCenter, issuerMessage, productDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationInvoiceDetails {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    barcodeNumber: ").append(toIndentedString(barcodeNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    purchaseContactName: ").append(toIndentedString(purchaseContactName)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    vatInvoiceReferenceNumber: ").append(toIndentedString(vatInvoiceReferenceNumber)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    merchandiseCode: ").append(toIndentedString(merchandiseCode)).append("\n");
    sb.append("    transactionAdviceAddendum: ").append(toIndentedString(transactionAdviceAddendum)).append("\n");
    sb.append("    referenceDataCode: ").append(toIndentedString(referenceDataCode)).append("\n");
    sb.append("    referenceDataNumber: ").append(toIndentedString(referenceDataNumber)).append("\n");
    sb.append("    salesSlipNumber: ").append(toIndentedString(salesSlipNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    issuerMessage: ").append(toIndentedString(issuerMessage)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
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

