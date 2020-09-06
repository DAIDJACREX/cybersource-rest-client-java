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
 * Ptsv2paymentsInstallmentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-06T20:16:20.516+05:30")
public class Ptsv2paymentsInstallmentInformation {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("frequency")
  private String frequency = null;

  @SerializedName("planType")
  private String planType = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("firstInstallmentDate")
  private String firstInstallmentDate = null;

  @SerializedName("invoiceData")
  private String invoiceData = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("eligibilityInquiry")
  private String eligibilityInquiry = null;

  @SerializedName("gracePeriodDuration")
  private String gracePeriodDuration = null;

  @SerializedName("gracePeriodDurationType")
  private String gracePeriodDurationType = null;

  @SerializedName("firstInstallmentAmount")
  private String firstInstallmentAmount = null;

  public Ptsv2paymentsInstallmentInformation amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount for the current installment payment.  This field is supported only for CyberSource through VisaNet.  For details, see &#x60;installment_amount&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return amount
  **/
  @ApiModelProperty(value = "Amount for the current installment payment.  This field is supported only for CyberSource through VisaNet.  For details, see `installment_amount` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Ptsv2paymentsInstallmentInformation frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency of the installment payments. When you do not include this field in a request for a Crediario installment payment, CyberSource sends a space character to the processor.  For details, see &#x60;installment_frequency&#x60; field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for CyberSource through VisaNet. Possible values: - &#x60;B&#x60;: Biweekly - &#x60;M&#x60;: Monthly - &#x60;W&#x60;: Weekly  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR9 - Position: 41 - Field: Installment Frequency  For details, see \&quot;Installment Payments\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return frequency
  **/
  @ApiModelProperty(value = "Frequency of the installment payments. When you do not include this field in a request for a Crediario installment payment, CyberSource sends a space character to the processor.  For details, see `installment_frequency` field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for CyberSource through VisaNet. Possible values: - `B`: Biweekly - `M`: Monthly - `W`: Weekly  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR9 - Position: 41 - Field: Installment Frequency  For details, see \"Installment Payments\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public Ptsv2paymentsInstallmentInformation planType(String planType) {
    this.planType = planType;
    return this;
  }

   /**
   * #### American Express Direct, Cielo, and CyberSource Latin American Processing Flag that indicates the type of funding for the installment plan associated with the payment.  Possible values: - &#x60;1&#x60;: Merchant-funded installment plan - &#x60;2&#x60;: Issuer-funded installment plan If you do not include this field in the request, CyberSource uses the value in your CyberSource account.  To change the value in your CyberSource account, contact CyberSource Customer Service. For details, see &#x60;installment_plan_type&#x60; field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### CyberSource through VisaNet and American Express Defined code that indicates the type of installment plan for this transaction.  Contact American Express for: - Information about the kinds of installment plans that American Express provides - Values for this field  For installment payments with American Express in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR3 - Position: 5-6 - Field: Plan Type  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies.  #### CyberSource through VisaNet with Visa or Mastercard Flag indicating the type of funding for the installment plan associated with the payment. Possible values: - 1 or 01: Merchant-funded installment plan - 2 or 02: Issuer-funded installment plan - 43: Crediario installment plan—only with Visa in Brazil For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For installment payments with Visa in Brazil, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 5-6 - Field: Installment Type  For all other kinds of installment payments, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR5 - Position: 39-40 - Field: Installment Plan Type (Issuer or Merchant) 
   * @return planType
  **/
  @ApiModelProperty(value = "#### American Express Direct, Cielo, and CyberSource Latin American Processing Flag that indicates the type of funding for the installment plan associated with the payment.  Possible values: - `1`: Merchant-funded installment plan - `2`: Issuer-funded installment plan If you do not include this field in the request, CyberSource uses the value in your CyberSource account.  To change the value in your CyberSource account, contact CyberSource Customer Service. For details, see `installment_plan_type` field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### CyberSource through VisaNet and American Express Defined code that indicates the type of installment plan for this transaction.  Contact American Express for: - Information about the kinds of installment plans that American Express provides - Values for this field  For installment payments with American Express in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR3 - Position: 5-6 - Field: Plan Type  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies.  #### CyberSource through VisaNet with Visa or Mastercard Flag indicating the type of funding for the installment plan associated with the payment. Possible values: - 1 or 01: Merchant-funded installment plan - 2 or 02: Issuer-funded installment plan - 43: Crediario installment plan—only with Visa in Brazil For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For installment payments with Visa in Brazil, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 5-6 - Field: Installment Type  For all other kinds of installment payments, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR5 - Position: 39-40 - Field: Installment Plan Type (Issuer or Merchant) ")
  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }

  public Ptsv2paymentsInstallmentInformation sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Installment number when making payments in installments. Used along with &#x60;totalCount&#x60; to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as &#x60;sequence&#x60; &#x3D; 2 and &#x60;totalCount&#x60; &#x3D; 5.  For details, see \&quot;Installment Payments\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors. For details, see \&quot;Chase Paymentech Solutions Merchant Descriptors\&quot; and \&quot;FDC Compass Merchant Descriptors\&quot; in the [Merchant Descriptors Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### CyberSource through VisaNet When you do not include this field in a request for a Crediario installment payment, CyberSource sends a value of 0 to the processor.  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 38-40 - Field: Installment Payment Number  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. 
   * maximum: 99
   * @return sequence
  **/
  @ApiModelProperty(value = "Installment number when making payments in installments. Used along with `totalCount` to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as `sequence` = 2 and `totalCount` = 5.  For details, see \"Installment Payments\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors. For details, see \"Chase Paymentech Solutions Merchant Descriptors\" and \"FDC Compass Merchant Descriptors\" in the [Merchant Descriptors Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### CyberSource through VisaNet When you do not include this field in a request for a Crediario installment payment, CyberSource sends a value of 0 to the processor.  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 38-40 - Field: Installment Payment Number  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. ")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public Ptsv2paymentsInstallmentInformation totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of the loan that is being paid in installments. This field is supported only for CyberSource through VisaNet.  For details, see \&quot;Installment Payments\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount of the loan that is being paid in installments. This field is supported only for CyberSource through VisaNet.  For details, see \"Installment Payments\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Ptsv2paymentsInstallmentInformation totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of installments when making payments in installments.  For details, see \&quot;Installment Payments\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors.  For details, see \&quot;Chase Paymentech Solutions Merchant Descriptors\&quot; and \&quot;FDC Compass Merchant Descriptors\&quot; in the [Merchant Descriptors Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### American Express Direct, Cielo, and Comercio Latino This value is the total number of installments you approved.  #### CyberSource Latin American Processing in Brazil This value is the total number of installments that you approved. The default is 1.  #### All Other Processors This value is used along with _sequence_ to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as _sequence_ &#x3D; 2 and _totalCount_ &#x3D; 5.  #### CyberSource through VisaNet For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 23-25 - Field: Number of Installments  For installment payments with American Express in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR3 - Position: 7-8 - Field: Number of Installments  For installment payments with Visa in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR1 - Position: 7-8 - Field: Number of Installments  For all other kinds of installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR5 - Position: 20-22 - Field: Installment Total Count  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. 
   * maximum: 99
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of installments when making payments in installments.  For details, see \"Installment Payments\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors.  For details, see \"Chase Paymentech Solutions Merchant Descriptors\" and \"FDC Compass Merchant Descriptors\" in the [Merchant Descriptors Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### American Express Direct, Cielo, and Comercio Latino This value is the total number of installments you approved.  #### CyberSource Latin American Processing in Brazil This value is the total number of installments that you approved. The default is 1.  #### All Other Processors This value is used along with _sequence_ to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as _sequence_ = 2 and _totalCount_ = 5.  #### CyberSource through VisaNet For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 23-25 - Field: Number of Installments  For installment payments with American Express in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR3 - Position: 7-8 - Field: Number of Installments  For installment payments with Visa in Brazil, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP07 TCR1 - Position: 7-8 - Field: Number of Installments  For all other kinds of installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR5 - Position: 20-22 - Field: Installment Total Count  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. ")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Ptsv2paymentsInstallmentInformation firstInstallmentDate(String firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
    return this;
  }

   /**
   * Date of the first installment payment. Format: YYMMDD. When you do not include this field, CyberSource sends a string of six zeros (000000) to the processor. For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR9 - Position: 42-47 - Field: Date of First Installment 
   * @return firstInstallmentDate
  **/
  @ApiModelProperty(value = "Date of the first installment payment. Format: YYMMDD. When you do not include this field, CyberSource sends a string of six zeros (000000) to the processor. For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR9 - Position: 42-47 - Field: Date of First Installment ")
  public String getFirstInstallmentDate() {
    return firstInstallmentDate;
  }

  public void setFirstInstallmentDate(String firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
  }

  public Ptsv2paymentsInstallmentInformation invoiceData(String invoiceData) {
    this.invoiceData = invoiceData;
    return this;
  }

   /**
   * Invoice information that you want to provide to the issuer. This value is similar to a tracking number and is the same for all installment payments for one purchase.  This field is supported only for installment payments with Mastercard on CyberSource through VisaNet in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR4 - Position: 51-70 - Field: Purchase Identification 
   * @return invoiceData
  **/
  @ApiModelProperty(value = "Invoice information that you want to provide to the issuer. This value is similar to a tracking number and is the same for all installment payments for one purchase.  This field is supported only for installment payments with Mastercard on CyberSource through VisaNet in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR4 - Position: 51-70 - Field: Purchase Identification ")
  public String getInvoiceData() {
    return invoiceData;
  }

  public void setInvoiceData(String invoiceData) {
    this.invoiceData = invoiceData;
  }

  public Ptsv2paymentsInstallmentInformation paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment plan for the installments.  Possible values: - 0 (default): Regular installment. This value is not allowed for airline transactions. - 1: Installment payment with down payment. - 2: Installment payment without down payment. This value is supported only for airline transactions. - 3: Installment payment; down payment and boarding fee will follow. This value is supported only for airline transactions. - 4: Down payment only; regular installment payment will follow. - 5: Boarding fee only. This value is supported only for airline transactions.  This field is supported only for installment payments with Visa on CyberSource through VisaNet in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 9 - Field: Merchant Installment Supporting Information 
   * @return paymentType
  **/
  @ApiModelProperty(value = "Payment plan for the installments.  Possible values: - 0 (default): Regular installment. This value is not allowed for airline transactions. - 1: Installment payment with down payment. - 2: Installment payment without down payment. This value is supported only for airline transactions. - 3: Installment payment; down payment and boarding fee will follow. This value is supported only for airline transactions. - 4: Down payment only; regular installment payment will follow. - 5: Boarding fee only. This value is supported only for airline transactions.  This field is supported only for installment payments with Visa on CyberSource through VisaNet in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR1 - Position: 9 - Field: Merchant Installment Supporting Information ")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Ptsv2paymentsInstallmentInformation eligibilityInquiry(String eligibilityInquiry) {
    this.eligibilityInquiry = eligibilityInquiry;
    return this;
  }

   /**
   * Indicates whether the authorization request is a Crediario eligibility inquiry.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  Set the value for this field to &#x60;Crediario&#x60;.  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet. 
   * @return eligibilityInquiry
  **/
  @ApiModelProperty(value = "Indicates whether the authorization request is a Crediario eligibility inquiry.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  Set the value for this field to `Crediario`.  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet. ")
  public String getEligibilityInquiry() {
    return eligibilityInquiry;
  }

  public void setEligibilityInquiry(String eligibilityInquiry) {
    this.eligibilityInquiry = eligibilityInquiry;
  }

  public Ptsv2paymentsInstallmentInformation gracePeriodDuration(String gracePeriodDuration) {
    this.gracePeriodDuration = gracePeriodDuration;
    return this;
  }

   /**
   * Grace period requested by the customer before the first installment payment is due.  When you include this field in a request, you must also include the grace period duration type field.  The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR5, Position: 100-101, Field: Mastercard Grace Period Details.  This field is supported only for Mastercard installment payments in Brazil and Greece. 
   * @return gracePeriodDuration
  **/
  @ApiModelProperty(value = "Grace period requested by the customer before the first installment payment is due.  When you include this field in a request, you must also include the grace period duration type field.  The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR5, Position: 100-101, Field: Mastercard Grace Period Details.  This field is supported only for Mastercard installment payments in Brazil and Greece. ")
  public String getGracePeriodDuration() {
    return gracePeriodDuration;
  }

  public void setGracePeriodDuration(String gracePeriodDuration) {
    this.gracePeriodDuration = gracePeriodDuration;
  }

  public Ptsv2paymentsInstallmentInformation gracePeriodDurationType(String gracePeriodDurationType) {
    this.gracePeriodDurationType = gracePeriodDurationType;
    return this;
  }

   /**
   * Unit for the requested grace period duration.  Possible values: - &#x60;D&#x60;: Days - &#x60;W&#x60;: Weeks - &#x60;M&#x60;: Months  The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR5, Position: 99, Field: Mastercard Grace Period Details  This field is supported only for Mastercard installment payments in Brazil and Greece on CyberSource through VisaNet. 
   * @return gracePeriodDurationType
  **/
  @ApiModelProperty(value = "Unit for the requested grace period duration.  Possible values: - `D`: Days - `W`: Weeks - `M`: Months  The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR5, Position: 99, Field: Mastercard Grace Period Details  This field is supported only for Mastercard installment payments in Brazil and Greece on CyberSource through VisaNet. ")
  public String getGracePeriodDurationType() {
    return gracePeriodDurationType;
  }

  public void setGracePeriodDurationType(String gracePeriodDurationType) {
    this.gracePeriodDurationType = gracePeriodDurationType;
  }

  public Ptsv2paymentsInstallmentInformation firstInstallmentAmount(String firstInstallmentAmount) {
    this.firstInstallmentAmount = firstInstallmentAmount;
    return this;
  }

   /**
   * Amount of the first installment payment. The issuer provides this value when the first installment payment is successful. This field is supported for Mastercard installment payments on CyberSource through VisaNet in all countries except Brazil,Croatia, Georgia, and Greece. The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR5 - Position: 23-34 - Field: Amount of Each Installment 
   * @return firstInstallmentAmount
  **/
  @ApiModelProperty(value = "Amount of the first installment payment. The issuer provides this value when the first installment payment is successful. This field is supported for Mastercard installment payments on CyberSource through VisaNet in all countries except Brazil,Croatia, Georgia, and Greece. The value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCR5 - Position: 23-34 - Field: Amount of Each Installment ")
  public String getFirstInstallmentAmount() {
    return firstInstallmentAmount;
  }

  public void setFirstInstallmentAmount(String firstInstallmentAmount) {
    this.firstInstallmentAmount = firstInstallmentAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsInstallmentInformation ptsv2paymentsInstallmentInformation = (Ptsv2paymentsInstallmentInformation) o;
    return Objects.equals(this.amount, ptsv2paymentsInstallmentInformation.amount) &&
        Objects.equals(this.frequency, ptsv2paymentsInstallmentInformation.frequency) &&
        Objects.equals(this.planType, ptsv2paymentsInstallmentInformation.planType) &&
        Objects.equals(this.sequence, ptsv2paymentsInstallmentInformation.sequence) &&
        Objects.equals(this.totalAmount, ptsv2paymentsInstallmentInformation.totalAmount) &&
        Objects.equals(this.totalCount, ptsv2paymentsInstallmentInformation.totalCount) &&
        Objects.equals(this.firstInstallmentDate, ptsv2paymentsInstallmentInformation.firstInstallmentDate) &&
        Objects.equals(this.invoiceData, ptsv2paymentsInstallmentInformation.invoiceData) &&
        Objects.equals(this.paymentType, ptsv2paymentsInstallmentInformation.paymentType) &&
        Objects.equals(this.eligibilityInquiry, ptsv2paymentsInstallmentInformation.eligibilityInquiry) &&
        Objects.equals(this.gracePeriodDuration, ptsv2paymentsInstallmentInformation.gracePeriodDuration) &&
        Objects.equals(this.gracePeriodDurationType, ptsv2paymentsInstallmentInformation.gracePeriodDurationType) &&
        Objects.equals(this.firstInstallmentAmount, ptsv2paymentsInstallmentInformation.firstInstallmentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, frequency, planType, sequence, totalAmount, totalCount, firstInstallmentDate, invoiceData, paymentType, eligibilityInquiry, gracePeriodDuration, gracePeriodDurationType, firstInstallmentAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsInstallmentInformation {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    firstInstallmentDate: ").append(toIndentedString(firstInstallmentDate)).append("\n");
    sb.append("    invoiceData: ").append(toIndentedString(invoiceData)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    eligibilityInquiry: ").append(toIndentedString(eligibilityInquiry)).append("\n");
    sb.append("    gracePeriodDuration: ").append(toIndentedString(gracePeriodDuration)).append("\n");
    sb.append("    gracePeriodDurationType: ").append(toIndentedString(gracePeriodDurationType)).append("\n");
    sb.append("    firstInstallmentAmount: ").append(toIndentedString(firstInstallmentAmount)).append("\n");
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

