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
import Model.TssV2TransactionsGet200ResponsePaymentInformationBankAccount;
import Model.TssV2TransactionsGet200ResponsePaymentInformationBankMandate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePaymentInformationBank
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationBank {
  @SerializedName("routingNumber")
  private String routingNumber = null;

  @SerializedName("branchCode")
  private String branchCode = null;

  @SerializedName("swiftCode")
  private String swiftCode = null;

  @SerializedName("bankCode")
  private String bankCode = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("account")
  private TssV2TransactionsGet200ResponsePaymentInformationBankAccount account = null;

  @SerializedName("mandate")
  private TssV2TransactionsGet200ResponsePaymentInformationBankMandate mandate = null;

  public TssV2TransactionsGet200ResponsePaymentInformationBank routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Bank routing number. This is also called the transit number.  For details, see &#x60;ecp_rdfi&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return routingNumber
  **/
  @ApiModelProperty(value = "Bank routing number. This is also called the transit number.  For details, see `ecp_rdfi` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

   /**
   * Code used to identify the branch of the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN. Use this field only when scoring a direct debit transaction.  For all possible values, see the &#x60;branch_code&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return branchCode
  **/
  @ApiModelProperty(value = "Code used to identify the branch of the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN. Use this field only when scoring a direct debit transaction.  For all possible values, see the `branch_code` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Bank’s SWIFT code. You can use this field only when scoring a direct debit transaction. Required only for crossborder transactions.  For all possible values, see the &#x60;bank_swiftcode&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return swiftCode
  **/
  @ApiModelProperty(value = "Bank’s SWIFT code. You can use this field only when scoring a direct debit transaction. Required only for crossborder transactions.  For all possible values, see the `bank_swiftcode` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Country-specific code used to identify the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN instead. You can use this field only when scoring a direct debit transaction.  For all possible values, see the &#x60;bank_code&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return bankCode
  **/
  @ApiModelProperty(value = "Country-specific code used to identify the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN instead. You can use this field only when scoring a direct debit transaction.  For all possible values, see the `bank_code` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction.  For all possible values, see the &#x60;bank_iban&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction.  For all possible values, see the `bank_iban` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank account(TssV2TransactionsGet200ResponsePaymentInformationBankAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount getAccount() {
    return account;
  }

  public void setAccount(TssV2TransactionsGet200ResponsePaymentInformationBankAccount account) {
    this.account = account;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBank mandate(TssV2TransactionsGet200ResponsePaymentInformationBankMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Get mandate
   * @return mandate
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationBankMandate getMandate() {
    return mandate;
  }

  public void setMandate(TssV2TransactionsGet200ResponsePaymentInformationBankMandate mandate) {
    this.mandate = mandate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationBank tssV2TransactionsGet200ResponsePaymentInformationBank = (TssV2TransactionsGet200ResponsePaymentInformationBank) o;
    return Objects.equals(this.routingNumber, tssV2TransactionsGet200ResponsePaymentInformationBank.routingNumber) &&
        Objects.equals(this.branchCode, tssV2TransactionsGet200ResponsePaymentInformationBank.branchCode) &&
        Objects.equals(this.swiftCode, tssV2TransactionsGet200ResponsePaymentInformationBank.swiftCode) &&
        Objects.equals(this.bankCode, tssV2TransactionsGet200ResponsePaymentInformationBank.bankCode) &&
        Objects.equals(this.iban, tssV2TransactionsGet200ResponsePaymentInformationBank.iban) &&
        Objects.equals(this.account, tssV2TransactionsGet200ResponsePaymentInformationBank.account) &&
        Objects.equals(this.mandate, tssV2TransactionsGet200ResponsePaymentInformationBank.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, branchCode, swiftCode, bankCode, iban, account, mandate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationBank {\n");
    
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

