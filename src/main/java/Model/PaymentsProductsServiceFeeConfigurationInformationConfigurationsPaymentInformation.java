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
import java.math.BigDecimal;

/**
 * PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation
 */

public class PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation {
  /**
   * Payment types accepted by this merchant. The supported values are: MASTERDEBIT, MASTERCREDIT, VISACREDIT, VISADEBIT, DISCOVERCREDIT, AMEXCREDIT, ECHECK
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    MASTERDEBIT("MASTERDEBIT"),
    
    MASTERCREDIT("MASTERCREDIT"),
    
    VISACREDIT("VISACREDIT"),
    
    VISADEBIT("VISADEBIT"),
    
    DISCOVERCREDIT("DISCOVERCREDIT"),
    
    AMEXCREDIT("AMEXCREDIT"),
    
    ECHECK("ECHECK");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String text) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("paymentType")
  private PaymentTypeEnum paymentType = null;

  /**
   * Fee type for the selected payment type. Supported values are: Flat or Percentage. 
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    FLAT("FLAT"),
    
    PERCENTAGE("PERCENTAGE");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("feeType")
  private FeeTypeEnum feeType = null;

  @SerializedName("feeAmount")
  private BigDecimal feeAmount = null;

  @SerializedName("percentage")
  private BigDecimal percentage = null;

  @SerializedName("feeCap")
  private BigDecimal feeCap = null;

  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment types accepted by this merchant. The supported values are: MASTERDEBIT, MASTERCREDIT, VISACREDIT, VISADEBIT, DISCOVERCREDIT, AMEXCREDIT, ECHECK
   * @return paymentType
  **/
  @ApiModelProperty(value = "Payment types accepted by this merchant. The supported values are: MASTERDEBIT, MASTERCREDIT, VISACREDIT, VISADEBIT, DISCOVERCREDIT, AMEXCREDIT, ECHECK")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Fee type for the selected payment type. Supported values are: Flat or Percentage. 
   * @return feeType
  **/
  @ApiModelProperty(value = "Fee type for the selected payment type. Supported values are: Flat or Percentage. ")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation feeAmount(BigDecimal feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Fee Amount of the selected payment type if you chose Flat fee type. 
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee Amount of the selected payment type if you chose Flat fee type. ")
  public BigDecimal getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(BigDecimal feeAmount) {
    this.feeAmount = feeAmount;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage of the selected payment type if you chose Percentage Fee type. Supported values use numbers with decimals. For example, 1.0 
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage of the selected payment type if you chose Percentage Fee type. Supported values use numbers with decimals. For example, 1.0 ")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation feeCap(BigDecimal feeCap) {
    this.feeCap = feeCap;
    return this;
  }

   /**
   * Fee cap for the selected payment type. Supported values use numbers with decimals. For example, 1.0 
   * @return feeCap
  **/
  @ApiModelProperty(value = "Fee cap for the selected payment type. Supported values use numbers with decimals. For example, 1.0 ")
  public BigDecimal getFeeCap() {
    return feeCap;
  }

  public void setFeeCap(BigDecimal feeCap) {
    this.feeCap = feeCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation = (PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation) o;
    return Objects.equals(this.paymentType, paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation.paymentType) &&
        Objects.equals(this.feeType, paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation.feeType) &&
        Objects.equals(this.feeAmount, paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation.feeAmount) &&
        Objects.equals(this.percentage, paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation.percentage) &&
        Objects.equals(this.feeCap, paymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation.feeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, feeType, feeAmount, percentage, feeCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    feeCap: ").append(toIndentedString(feeCap)).append("\n");
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

