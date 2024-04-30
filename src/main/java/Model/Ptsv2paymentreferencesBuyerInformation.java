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
import Model.Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification;
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
 * Ptsv2paymentreferencesBuyerInformation
 */

public class Ptsv2paymentreferencesBuyerInformation {
  @SerializedName("dateOfBirth")
  private String dateOfBirth = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("noteToSeller")
  private String noteToSeller = null;

  @SerializedName("personalIdentification")
  private List<Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification> personalIdentification = null;

  public Ptsv2paymentreferencesBuyerInformation dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Recipient&#39;s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a &#x60;pass-through&#x60;, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  For more details, see &#x60;recipient_date_of_birth&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Recipient's date of birth. **Format**: `YYYYMMDD`.  This field is a `pass-through`, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  For more details, see `recipient_date_of_birth` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Ptsv2paymentreferencesBuyerInformation gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Customer&#39;s gender. Possible values are F (female), M (male),O (other).
   * @return gender
  **/
  @ApiModelProperty(value = "Customer's gender. Possible values are F (female), M (male),O (other).")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Ptsv2paymentreferencesBuyerInformation language(String language) {
    this.language = language;
    return this;
  }

   /**
   * language setting of the user
   * @return language
  **/
  @ApiModelProperty(value = "language setting of the user")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Ptsv2paymentreferencesBuyerInformation noteToSeller(String noteToSeller) {
    this.noteToSeller = noteToSeller;
    return this;
  }

   /**
   * Note to the recipient of the funds in this transaction
   * @return noteToSeller
  **/
  @ApiModelProperty(value = "Note to the recipient of the funds in this transaction")
  public String getNoteToSeller() {
    return noteToSeller;
  }

  public void setNoteToSeller(String noteToSeller) {
    this.noteToSeller = noteToSeller;
  }

  public Ptsv2paymentreferencesBuyerInformation personalIdentification(List<Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Ptsv2paymentreferencesBuyerInformation addPersonalIdentificationItem(Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification> personalIdentification) {
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
    Ptsv2paymentreferencesBuyerInformation ptsv2paymentreferencesBuyerInformation = (Ptsv2paymentreferencesBuyerInformation) o;
    return Objects.equals(this.dateOfBirth, ptsv2paymentreferencesBuyerInformation.dateOfBirth) &&
        Objects.equals(this.gender, ptsv2paymentreferencesBuyerInformation.gender) &&
        Objects.equals(this.language, ptsv2paymentreferencesBuyerInformation.language) &&
        Objects.equals(this.noteToSeller, ptsv2paymentreferencesBuyerInformation.noteToSeller) &&
        Objects.equals(this.personalIdentification, ptsv2paymentreferencesBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, gender, language, noteToSeller, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesBuyerInformation {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    noteToSeller: ").append(toIndentedString(noteToSeller)).append("\n");
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

