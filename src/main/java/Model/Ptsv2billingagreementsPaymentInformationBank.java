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
import Model.Ptsv2billingagreementsPaymentInformationBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2billingagreementsPaymentInformationBank
 */

public class Ptsv2billingagreementsPaymentInformationBank {
  @SerializedName("account")
  private Ptsv2billingagreementsPaymentInformationBankAccount account = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("swiftCode")
  private String swiftCode = null;

  @SerializedName("scheme")
  private String scheme = null;

  public Ptsv2billingagreementsPaymentInformationBank account(Ptsv2billingagreementsPaymentInformationBankAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformationBankAccount getAccount() {
    return account;
  }

  public void setAccount(Ptsv2billingagreementsPaymentInformationBankAccount account) {
    this.account = account;
  }

  public Ptsv2billingagreementsPaymentInformationBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN). #### SEPA Required for mandates services 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN). #### SEPA Required for mandates services ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Ptsv2billingagreementsPaymentInformationBank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Bank&#39;s SWIFT code. You can use this field only when scoring a direct debit transaction. #### BACS Required for mandates services 
   * @return swiftCode
  **/
  @ApiModelProperty(value = "Bank's SWIFT code. You can use this field only when scoring a direct debit transaction. #### BACS Required for mandates services ")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public Ptsv2billingagreementsPaymentInformationBank scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme that sets the rules for the direct debit process. Possible values:   - SEPA   - BACS #### SEPA/BACS Required for mandates services 
   * @return scheme
  **/
  @ApiModelProperty(value = "The scheme that sets the rules for the direct debit process. Possible values:   - SEPA   - BACS #### SEPA/BACS Required for mandates services ")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsPaymentInformationBank ptsv2billingagreementsPaymentInformationBank = (Ptsv2billingagreementsPaymentInformationBank) o;
    return Objects.equals(this.account, ptsv2billingagreementsPaymentInformationBank.account) &&
        Objects.equals(this.iban, ptsv2billingagreementsPaymentInformationBank.iban) &&
        Objects.equals(this.swiftCode, ptsv2billingagreementsPaymentInformationBank.swiftCode) &&
        Objects.equals(this.scheme, ptsv2billingagreementsPaymentInformationBank.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, iban, swiftCode, scheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsPaymentInformationBank {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

