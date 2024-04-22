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
 * Boardingv1registrationsOrganizationInformationKYCDepositBankAccount
 */

public class Boardingv1registrationsOrganizationInformationKYCDepositBankAccount {
  @SerializedName("accountHolderName")
  private String accountHolderName = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings"),
    
    CORPORATECHECKING("corporatechecking"),
    
    CORPORATESAVINGS("corporatesavings");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("accountType")
  private AccountTypeEnum accountType = null;

  @SerializedName("accountRoutingNumber")
  private String accountRoutingNumber = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  public Boardingv1registrationsOrganizationInformationKYCDepositBankAccount accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Get accountHolderName
   * @return accountHolderName
  **/
  @ApiModelProperty(example = "John Doe", required = true, value = "")
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public Boardingv1registrationsOrganizationInformationKYCDepositBankAccount accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(example = "checking", required = true, value = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public Boardingv1registrationsOrganizationInformationKYCDepositBankAccount accountRoutingNumber(String accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
    return this;
  }

   /**
   * Get accountRoutingNumber
   * @return accountRoutingNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountRoutingNumber() {
    return accountRoutingNumber;
  }

  public void setAccountRoutingNumber(String accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
  }

  public Boardingv1registrationsOrganizationInformationKYCDepositBankAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsOrganizationInformationKYCDepositBankAccount boardingv1registrationsOrganizationInformationKYCDepositBankAccount = (Boardingv1registrationsOrganizationInformationKYCDepositBankAccount) o;
    return Objects.equals(this.accountHolderName, boardingv1registrationsOrganizationInformationKYCDepositBankAccount.accountHolderName) &&
        Objects.equals(this.accountType, boardingv1registrationsOrganizationInformationKYCDepositBankAccount.accountType) &&
        Objects.equals(this.accountRoutingNumber, boardingv1registrationsOrganizationInformationKYCDepositBankAccount.accountRoutingNumber) &&
        Objects.equals(this.accountNumber, boardingv1registrationsOrganizationInformationKYCDepositBankAccount.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderName, accountType, accountRoutingNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsOrganizationInformationKYCDepositBankAccount {\n");
    
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountRoutingNumber: ").append(toIndentedString(accountRoutingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

