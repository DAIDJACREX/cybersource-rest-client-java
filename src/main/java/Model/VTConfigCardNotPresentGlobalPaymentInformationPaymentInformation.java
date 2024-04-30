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
import java.util.ArrayList;
import java.util.List;

/**
 * VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation
 */

public class VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation {
  /**
   * Gets or Sets displayCardVerificationValue
   */
  @JsonAdapter(DisplayCardVerificationValueEnum.Adapter.class)
  public enum DisplayCardVerificationValueEnum {
    VISA("VISA"),
    
    MASTER_CARD("MASTER_CARD"),
    
    AMEX("AMEX"),
    
    DISCOVER("DISCOVER"),
    
    DINERS_CLUB("DINERS_CLUB"),
    
    CARTE_BLANCHE("CARTE_BLANCHE"),
    
    JCB("JCB"),
    
    ENROUTE("ENROUTE"),
    
    JAL("JAL"),
    
    SWITCH_SOLO("SWITCH_SOLO"),
    
    DELTA("DELTA"),
    
    VISA_ELECTRON("VISA_ELECTRON"),
    
    DANKORT("DANKORT"),
    
    LASER("LASER"),
    
    CARTE_SBANCAIRES("CARTE_SBANCAIRES"),
    
    CARTASI("CARTASI"),
    
    MAESTRO_INTERNATIONAL("MAESTRO_INTERNATIONAL"),
    
    GE_MONEY_UK_CARD("GE_MONEY_UK_CARD"),
    
    HIPER_CARD("HIPER_CARD"),
    
    ELO("ELO");

    private String value;

    DisplayCardVerificationValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayCardVerificationValueEnum fromValue(String text) {
      for (DisplayCardVerificationValueEnum b : DisplayCardVerificationValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayCardVerificationValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayCardVerificationValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayCardVerificationValueEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisplayCardVerificationValueEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("displayCardVerificationValue")
  private List<DisplayCardVerificationValueEnum> displayCardVerificationValue = null;

  /**
   * Gets or Sets requireCardVerificationValue
   */
  @JsonAdapter(RequireCardVerificationValueEnum.Adapter.class)
  public enum RequireCardVerificationValueEnum {
    VISA("VISA"),
    
    MASTER_CARD("MASTER_CARD"),
    
    AMEX("AMEX"),
    
    DISCOVER("DISCOVER"),
    
    DINERS_CLUB("DINERS_CLUB"),
    
    CARTE_BLANCHE("CARTE_BLANCHE"),
    
    JCB("JCB"),
    
    ENROUTE("ENROUTE"),
    
    JAL("JAL"),
    
    SWITCH_SOLO("SWITCH_SOLO"),
    
    DELTA("DELTA"),
    
    VISA_ELECTRON("VISA_ELECTRON"),
    
    DANKORT("DANKORT"),
    
    LASER("LASER"),
    
    CARTE_SBANCAIRES("CARTE_SBANCAIRES"),
    
    CARTASI("CARTASI"),
    
    MAESTRO_INTERNATIONAL("MAESTRO_INTERNATIONAL"),
    
    GE_MONEY_UK_CARD("GE_MONEY_UK_CARD"),
    
    HIPER_CARD("HIPER_CARD"),
    
    ELO("ELO");

    private String value;

    RequireCardVerificationValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequireCardVerificationValueEnum fromValue(String text) {
      for (RequireCardVerificationValueEnum b : RequireCardVerificationValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RequireCardVerificationValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequireCardVerificationValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequireCardVerificationValueEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RequireCardVerificationValueEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("requireCardVerificationValue")
  private List<RequireCardVerificationValueEnum> requireCardVerificationValue = null;

  /**
   * Gets or Sets acceptedCardTypes
   */
  @JsonAdapter(AcceptedCardTypesEnum.Adapter.class)
  public enum AcceptedCardTypesEnum {
    VISA("VISA"),
    
    MASTER_CARD("MASTER_CARD"),
    
    AMEX("AMEX"),
    
    DISCOVER("DISCOVER"),
    
    DINERS_CLUB("DINERS_CLUB"),
    
    CARTE_BLANCHE("CARTE_BLANCHE"),
    
    JCB("JCB"),
    
    ENROUTE("ENROUTE"),
    
    JAL("JAL"),
    
    SWITCH_SOLO("SWITCH_SOLO"),
    
    DELTA("DELTA"),
    
    VISA_ELECTRON("VISA_ELECTRON"),
    
    DANKORT("DANKORT"),
    
    LASER("LASER"),
    
    CARTE_SBANCAIRES("CARTE_SBANCAIRES"),
    
    CARTASI("CARTASI"),
    
    MAESTRO_INTERNATIONAL("MAESTRO_INTERNATIONAL"),
    
    GE_MONEY_UK_CARD("GE_MONEY_UK_CARD"),
    
    HIPER_CARD("HIPER_CARD"),
    
    ELO("ELO");

    private String value;

    AcceptedCardTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AcceptedCardTypesEnum fromValue(String text) {
      for (AcceptedCardTypesEnum b : AcceptedCardTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AcceptedCardTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcceptedCardTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AcceptedCardTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AcceptedCardTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("acceptedCardTypes")
  private List<AcceptedCardTypesEnum> acceptedCardTypes = null;

  @SerializedName("displayCreditCards")
  private Boolean displayCreditCards = null;

  @SerializedName("displayEchecks")
  private Boolean displayEchecks = null;

  @SerializedName("displayDebtIndicator")
  private Boolean displayDebtIndicator = null;

  @SerializedName("displayBillPayment")
  private Boolean displayBillPayment = null;

  @SerializedName("enableEchecks")
  private Boolean enableEchecks = null;

  @SerializedName("displayIgnoreECheckAvsCheckbox")
  private Boolean displayIgnoreECheckAvsCheckbox = null;

  @SerializedName("firstNameRequired")
  private Boolean firstNameRequired = null;

  @SerializedName("lastNameRequired")
  private Boolean lastNameRequired = null;

  @SerializedName("displayFirstName")
  private Boolean displayFirstName = null;

  @SerializedName("displayLastName")
  private Boolean displayLastName = null;

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayCardVerificationValue(List<DisplayCardVerificationValueEnum> displayCardVerificationValue) {
    this.displayCardVerificationValue = displayCardVerificationValue;
    return this;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation addDisplayCardVerificationValueItem(DisplayCardVerificationValueEnum displayCardVerificationValueItem) {
    if (this.displayCardVerificationValue == null) {
      this.displayCardVerificationValue = new ArrayList<DisplayCardVerificationValueEnum>();
    }
    this.displayCardVerificationValue.add(displayCardVerificationValueItem);
    return this;
  }

   /**
   * Get displayCardVerificationValue
   * @return displayCardVerificationValue
  **/
  @ApiModelProperty(value = "")
  public List<DisplayCardVerificationValueEnum> getDisplayCardVerificationValue() {
    return displayCardVerificationValue;
  }

  public void setDisplayCardVerificationValue(List<DisplayCardVerificationValueEnum> displayCardVerificationValue) {
    this.displayCardVerificationValue = displayCardVerificationValue;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation requireCardVerificationValue(List<RequireCardVerificationValueEnum> requireCardVerificationValue) {
    this.requireCardVerificationValue = requireCardVerificationValue;
    return this;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation addRequireCardVerificationValueItem(RequireCardVerificationValueEnum requireCardVerificationValueItem) {
    if (this.requireCardVerificationValue == null) {
      this.requireCardVerificationValue = new ArrayList<RequireCardVerificationValueEnum>();
    }
    this.requireCardVerificationValue.add(requireCardVerificationValueItem);
    return this;
  }

   /**
   * Get requireCardVerificationValue
   * @return requireCardVerificationValue
  **/
  @ApiModelProperty(value = "")
  public List<RequireCardVerificationValueEnum> getRequireCardVerificationValue() {
    return requireCardVerificationValue;
  }

  public void setRequireCardVerificationValue(List<RequireCardVerificationValueEnum> requireCardVerificationValue) {
    this.requireCardVerificationValue = requireCardVerificationValue;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation acceptedCardTypes(List<AcceptedCardTypesEnum> acceptedCardTypes) {
    this.acceptedCardTypes = acceptedCardTypes;
    return this;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation addAcceptedCardTypesItem(AcceptedCardTypesEnum acceptedCardTypesItem) {
    if (this.acceptedCardTypes == null) {
      this.acceptedCardTypes = new ArrayList<AcceptedCardTypesEnum>();
    }
    this.acceptedCardTypes.add(acceptedCardTypesItem);
    return this;
  }

   /**
   * Get acceptedCardTypes
   * @return acceptedCardTypes
  **/
  @ApiModelProperty(value = "")
  public List<AcceptedCardTypesEnum> getAcceptedCardTypes() {
    return acceptedCardTypes;
  }

  public void setAcceptedCardTypes(List<AcceptedCardTypesEnum> acceptedCardTypes) {
    this.acceptedCardTypes = acceptedCardTypes;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayCreditCards(Boolean displayCreditCards) {
    this.displayCreditCards = displayCreditCards;
    return this;
  }

   /**
   * Get displayCreditCards
   * @return displayCreditCards
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayCreditCards() {
    return displayCreditCards;
  }

  public void setDisplayCreditCards(Boolean displayCreditCards) {
    this.displayCreditCards = displayCreditCards;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayEchecks(Boolean displayEchecks) {
    this.displayEchecks = displayEchecks;
    return this;
  }

   /**
   * Get displayEchecks
   * @return displayEchecks
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayEchecks() {
    return displayEchecks;
  }

  public void setDisplayEchecks(Boolean displayEchecks) {
    this.displayEchecks = displayEchecks;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayDebtIndicator(Boolean displayDebtIndicator) {
    this.displayDebtIndicator = displayDebtIndicator;
    return this;
  }

   /**
   * Get displayDebtIndicator
   * @return displayDebtIndicator
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayDebtIndicator() {
    return displayDebtIndicator;
  }

  public void setDisplayDebtIndicator(Boolean displayDebtIndicator) {
    this.displayDebtIndicator = displayDebtIndicator;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayBillPayment(Boolean displayBillPayment) {
    this.displayBillPayment = displayBillPayment;
    return this;
  }

   /**
   * Get displayBillPayment
   * @return displayBillPayment
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayBillPayment() {
    return displayBillPayment;
  }

  public void setDisplayBillPayment(Boolean displayBillPayment) {
    this.displayBillPayment = displayBillPayment;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation enableEchecks(Boolean enableEchecks) {
    this.enableEchecks = enableEchecks;
    return this;
  }

   /**
   * Get enableEchecks
   * @return enableEchecks
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableEchecks() {
    return enableEchecks;
  }

  public void setEnableEchecks(Boolean enableEchecks) {
    this.enableEchecks = enableEchecks;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayIgnoreECheckAvsCheckbox(Boolean displayIgnoreECheckAvsCheckbox) {
    this.displayIgnoreECheckAvsCheckbox = displayIgnoreECheckAvsCheckbox;
    return this;
  }

   /**
   * Get displayIgnoreECheckAvsCheckbox
   * @return displayIgnoreECheckAvsCheckbox
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayIgnoreECheckAvsCheckbox() {
    return displayIgnoreECheckAvsCheckbox;
  }

  public void setDisplayIgnoreECheckAvsCheckbox(Boolean displayIgnoreECheckAvsCheckbox) {
    this.displayIgnoreECheckAvsCheckbox = displayIgnoreECheckAvsCheckbox;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation firstNameRequired(Boolean firstNameRequired) {
    this.firstNameRequired = firstNameRequired;
    return this;
  }

   /**
   * Get firstNameRequired
   * @return firstNameRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isFirstNameRequired() {
    return firstNameRequired;
  }

  public void setFirstNameRequired(Boolean firstNameRequired) {
    this.firstNameRequired = firstNameRequired;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation lastNameRequired(Boolean lastNameRequired) {
    this.lastNameRequired = lastNameRequired;
    return this;
  }

   /**
   * Get lastNameRequired
   * @return lastNameRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isLastNameRequired() {
    return lastNameRequired;
  }

  public void setLastNameRequired(Boolean lastNameRequired) {
    this.lastNameRequired = lastNameRequired;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayFirstName(Boolean displayFirstName) {
    this.displayFirstName = displayFirstName;
    return this;
  }

   /**
   * Get displayFirstName
   * @return displayFirstName
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayFirstName() {
    return displayFirstName;
  }

  public void setDisplayFirstName(Boolean displayFirstName) {
    this.displayFirstName = displayFirstName;
  }

  public VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation displayLastName(Boolean displayLastName) {
    this.displayLastName = displayLastName;
    return this;
  }

   /**
   * Get displayLastName
   * @return displayLastName
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayLastName() {
    return displayLastName;
  }

  public void setDisplayLastName(Boolean displayLastName) {
    this.displayLastName = displayLastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation = (VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation) o;
    return Objects.equals(this.displayCardVerificationValue, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayCardVerificationValue) &&
        Objects.equals(this.requireCardVerificationValue, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.requireCardVerificationValue) &&
        Objects.equals(this.acceptedCardTypes, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.acceptedCardTypes) &&
        Objects.equals(this.displayCreditCards, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayCreditCards) &&
        Objects.equals(this.displayEchecks, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayEchecks) &&
        Objects.equals(this.displayDebtIndicator, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayDebtIndicator) &&
        Objects.equals(this.displayBillPayment, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayBillPayment) &&
        Objects.equals(this.enableEchecks, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.enableEchecks) &&
        Objects.equals(this.displayIgnoreECheckAvsCheckbox, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayIgnoreECheckAvsCheckbox) &&
        Objects.equals(this.firstNameRequired, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.firstNameRequired) &&
        Objects.equals(this.lastNameRequired, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.lastNameRequired) &&
        Objects.equals(this.displayFirstName, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayFirstName) &&
        Objects.equals(this.displayLastName, vtConfigCardNotPresentGlobalPaymentInformationPaymentInformation.displayLastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayCardVerificationValue, requireCardVerificationValue, acceptedCardTypes, displayCreditCards, displayEchecks, displayDebtIndicator, displayBillPayment, enableEchecks, displayIgnoreECheckAvsCheckbox, firstNameRequired, lastNameRequired, displayFirstName, displayLastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VTConfigCardNotPresentGlobalPaymentInformationPaymentInformation {\n");
    
    sb.append("    displayCardVerificationValue: ").append(toIndentedString(displayCardVerificationValue)).append("\n");
    sb.append("    requireCardVerificationValue: ").append(toIndentedString(requireCardVerificationValue)).append("\n");
    sb.append("    acceptedCardTypes: ").append(toIndentedString(acceptedCardTypes)).append("\n");
    sb.append("    displayCreditCards: ").append(toIndentedString(displayCreditCards)).append("\n");
    sb.append("    displayEchecks: ").append(toIndentedString(displayEchecks)).append("\n");
    sb.append("    displayDebtIndicator: ").append(toIndentedString(displayDebtIndicator)).append("\n");
    sb.append("    displayBillPayment: ").append(toIndentedString(displayBillPayment)).append("\n");
    sb.append("    enableEchecks: ").append(toIndentedString(enableEchecks)).append("\n");
    sb.append("    displayIgnoreECheckAvsCheckbox: ").append(toIndentedString(displayIgnoreECheckAvsCheckbox)).append("\n");
    sb.append("    firstNameRequired: ").append(toIndentedString(firstNameRequired)).append("\n");
    sb.append("    lastNameRequired: ").append(toIndentedString(lastNameRequired)).append("\n");
    sb.append("    displayFirstName: ").append(toIndentedString(displayFirstName)).append("\n");
    sb.append("    displayLastName: ").append(toIndentedString(displayLastName)).append("\n");
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

