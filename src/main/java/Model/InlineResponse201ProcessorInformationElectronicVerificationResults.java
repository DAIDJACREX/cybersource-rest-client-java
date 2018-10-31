/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse201ProcessorInformationElectronicVerificationResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse201ProcessorInformationElectronicVerificationResults {
  @SerializedName("code")
  private String code = null;

  @SerializedName("codeRaw")
  private String codeRaw = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("emailRaw")
  private String emailRaw = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("phoneNumberRaw")
  private String phoneNumberRaw = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("postalCodeRaw")
  private String postalCodeRaw = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("streetRaw")
  private String streetRaw = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameRaw")
  private String nameRaw = null;

  public InlineResponse201ProcessorInformationElectronicVerificationResults code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customerâ€™s name. 
   * @return code
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customerâ€™s name. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults codeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customerâ€™s last name
   * @return codeRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customerâ€™s last name")
  public String getCodeRaw() {
    return codeRaw;
  }

  public void setCodeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customerâ€™s email address. 
   * @return email
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customerâ€™s email address. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults emailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customerâ€™s email address.
   * @return emailRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customerâ€™s email address.")
  public String getEmailRaw() {
    return emailRaw;
  }

  public void setEmailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customerâ€™s phone number. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customerâ€™s phone number. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults phoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customerâ€™s phone number.
   * @return phoneNumberRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customerâ€™s phone number.")
  public String getPhoneNumberRaw() {
    return phoneNumberRaw;
  }

  public void setPhoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customerâ€™s postal code. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customerâ€™s postal code. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults postalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customerâ€™s postal code.
   * @return postalCodeRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customerâ€™s postal code.")
  public String getPostalCodeRaw() {
    return postalCodeRaw;
  }

  public void setPostalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customerâ€™s street address. 
   * @return street
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customerâ€™s street address. ")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults streetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customerâ€™s street address.
   * @return streetRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customerâ€™s street address.")
  public String getStreetRaw() {
    return streetRaw;
  }

  public void setStreetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults name(String name) {
    this.name = name;
    return this;
  }

   /**
   * TODO 
   * @return name
  **/
  @ApiModelProperty(value = "TODO ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse201ProcessorInformationElectronicVerificationResults nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * TODO
   * @return nameRaw
  **/
  @ApiModelProperty(value = "TODO")
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201ProcessorInformationElectronicVerificationResults inlineResponse201ProcessorInformationElectronicVerificationResults = (InlineResponse201ProcessorInformationElectronicVerificationResults) o;
    return Objects.equals(this.code, inlineResponse201ProcessorInformationElectronicVerificationResults.code) &&
        Objects.equals(this.codeRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.codeRaw) &&
        Objects.equals(this.email, inlineResponse201ProcessorInformationElectronicVerificationResults.email) &&
        Objects.equals(this.emailRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.emailRaw) &&
        Objects.equals(this.phoneNumber, inlineResponse201ProcessorInformationElectronicVerificationResults.phoneNumber) &&
        Objects.equals(this.phoneNumberRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.phoneNumberRaw) &&
        Objects.equals(this.postalCode, inlineResponse201ProcessorInformationElectronicVerificationResults.postalCode) &&
        Objects.equals(this.postalCodeRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.postalCodeRaw) &&
        Objects.equals(this.street, inlineResponse201ProcessorInformationElectronicVerificationResults.street) &&
        Objects.equals(this.streetRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.streetRaw) &&
        Objects.equals(this.name, inlineResponse201ProcessorInformationElectronicVerificationResults.name) &&
        Objects.equals(this.nameRaw, inlineResponse201ProcessorInformationElectronicVerificationResults.nameRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeRaw, email, emailRaw, phoneNumber, phoneNumberRaw, postalCode, postalCodeRaw, street, streetRaw, name, nameRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201ProcessorInformationElectronicVerificationResults {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeRaw: ").append(toIndentedString(codeRaw)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailRaw: ").append(toIndentedString(emailRaw)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberRaw: ").append(toIndentedString(phoneNumberRaw)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postalCodeRaw: ").append(toIndentedString(postalCodeRaw)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetRaw: ").append(toIndentedString(streetRaw)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
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

