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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification;
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
import org.joda.time.LocalDate;

/**
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation {
  @SerializedName("companyTaxID")
  private String companyTaxID = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @SerializedName("personalIdentification")
  private List<Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification> personalIdentification = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation companyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
    return this;
  }

   /**
   * Company’s tax identifier. This is only used for eCheck service. 
   * @return companyTaxID
  **/
  @ApiModelProperty(value = "Company’s tax identifier. This is only used for eCheck service. ")
  public String getCompanyTaxID() {
    return companyTaxID;
  }

  public void setCompanyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \&quot;Features for Debit Cards and Prepaid Cards\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \"Features for Debit Cards and Prepaid Cards\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth of the customer. Format: YYYY-MM-DD 
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "1960-12-30", value = "Date of birth of the customer. Format: YYYY-MM-DD ")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation personalIdentification(List<Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation addPersonalIdentificationItem(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation = (Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation) o;
    return Objects.equals(this.companyTaxID, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation.companyTaxID) &&
        Objects.equals(this.currency, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation.currency) &&
        Objects.equals(this.dateOfBirth, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation.dateOfBirth) &&
        Objects.equals(this.personalIdentification, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyTaxID, currency, dateOfBirth, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformation {\n");
    
    sb.append("    companyTaxID: ").append(toIndentedString(companyTaxID)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
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

