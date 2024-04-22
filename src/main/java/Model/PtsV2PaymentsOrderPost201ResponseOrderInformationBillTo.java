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
 * PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo
 */

public class PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo {
  @SerializedName("title")
  private String title = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("nameSuffix")
  private String nameSuffix = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("verificationStatus")
  private String verificationStatus = null;

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title. 
   * @return title
  **/
  @ApiModelProperty(value = "Title. ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer&#39;s first name. This name must be the same as the name on the card.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### SEPA Required for Create Mandate and Import Mandate #### BACS Required for Import Mandate  #### CyberSource Latin American Processing **Important** For an authorization request, CyberSource Latin American Processing concatenates &#x60;orderInformation.billTo.firstName&#x60; and &#x60;orderInformation.billTo.lastName&#x60;. If the concatenated value exceeds 30 characters, CyberSource Latin American Processing declines the authorization request.\\ **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called _CyberSource Latin American Processing_. It is not for any other Latin American processors that CyberSource supports.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return firstName
  **/
  @ApiModelProperty(value = "Customer's first name. This name must be the same as the name on the card.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### SEPA Required for Create Mandate and Import Mandate #### BACS Required for Import Mandate  #### CyberSource Latin American Processing **Important** For an authorization request, CyberSource Latin American Processing concatenates `orderInformation.billTo.firstName` and `orderInformation.billTo.lastName`. If the concatenated value exceeds 30 characters, CyberSource Latin American Processing declines the authorization request.\\ **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called _CyberSource Latin American Processing_. It is not for any other Latin American processors that CyberSource supports.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Customer&#39;s middle name. 
   * @return middleName
  **/
  @ApiModelProperty(value = "Customer's middle name. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer&#39;s last name. This name must be the same as the name on the card.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### SEPA Required for Create Mandate and Import Mandate #### BACS Required for Import Mandate #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### CyberSource Latin American Processing **Important** For an authorization request, CyberSource Latin American Processing concatenates &#x60;orderInformation.billTo.firstName&#x60; and &#x60;orderInformation.billTo.lastName&#x60;. If the concatenated value exceeds 30 characters, CyberSource Latin American Processing declines the authorization request.\\ **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### OmniPay Direct Optional field.  #### RBS WorldPay Atlanta Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Customer's last name. This name must be the same as the name on the card.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### SEPA Required for Create Mandate and Import Mandate #### BACS Required for Import Mandate #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### CyberSource Latin American Processing **Important** For an authorization request, CyberSource Latin American Processing concatenates `orderInformation.billTo.firstName` and `orderInformation.billTo.lastName`. If the concatenated value exceeds 30 characters, CyberSource Latin American Processing declines the authorization request.\\ **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### OmniPay Direct Optional field.  #### RBS WorldPay Atlanta Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * Customer&#39;s name suffix. 
   * @return nameSuffix
  **/
  @ApiModelProperty(value = "Customer's name suffix. ")
  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the billing street address. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the billing street address. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the billing street address. 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the billing street address. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the billing address. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the billing address. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: 12345-6789 When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric] Example: A1B 2C3 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits] Example: 12345-6789 When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric] Example: A1B 2C3 ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the billing address. Use the two-character ISO Standard Country Codes. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the billing address. Use the two-character ISO Standard Country Codes. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address. 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's email address. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer&#39;s phone number.  It is recommended that you include the country code when the order is from outside the U.S.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Optional field.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Customer's phone number.  It is recommended that you include the country code when the order is from outside the U.S.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Optional field.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Whether buyer has verified their identity. Used in case of PayPal transactions.  Possible Values: * VERIFIED * UNVERIFIED 
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "Whether buyer has verified their identity. Used in case of PayPal transactions.  Possible Values: * VERIFIED * UNVERIFIED ")
  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo = (PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo) o;
    return Objects.equals(this.title, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.title) &&
        Objects.equals(this.firstName, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.firstName) &&
        Objects.equals(this.middleName, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.middleName) &&
        Objects.equals(this.lastName, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.lastName) &&
        Objects.equals(this.nameSuffix, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.nameSuffix) &&
        Objects.equals(this.address1, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.address1) &&
        Objects.equals(this.address2, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.address2) &&
        Objects.equals(this.locality, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.locality) &&
        Objects.equals(this.postalCode, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.postalCode) &&
        Objects.equals(this.administrativeArea, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.administrativeArea) &&
        Objects.equals(this.country, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.country) &&
        Objects.equals(this.email, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.email) &&
        Objects.equals(this.phoneNumber, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.phoneNumber) &&
        Objects.equals(this.verificationStatus, ptsV2PaymentsOrderPost201ResponseOrderInformationBillTo.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, middleName, lastName, nameSuffix, address1, address2, locality, postalCode, administrativeArea, country, email, phoneNumber, verificationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

