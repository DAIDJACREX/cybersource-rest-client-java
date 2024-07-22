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
 * InlineResponse2011PayoutInformationPushFunds
 */

public class InlineResponse2011PayoutInformationPushFunds {
  @SerializedName("moneyTransferFastFundsCrossBorder")
  private String moneyTransferFastFundsCrossBorder = null;

  @SerializedName("moneyTransferFastFundsDomestic")
  private String moneyTransferFastFundsDomestic = null;

  @SerializedName("moneyTransferCrossBorder")
  private String moneyTransferCrossBorder = null;

  @SerializedName("moneyTransferDomestic")
  private String moneyTransferDomestic = null;

  @SerializedName("nonMoneyTransferFastFundsCrossBorder")
  private String nonMoneyTransferFastFundsCrossBorder = null;

  @SerializedName("nonMoneyTransferFastFundsDomestic")
  private String nonMoneyTransferFastFundsDomestic = null;

  @SerializedName("nonMoneyTransferCrossBorder")
  private String nonMoneyTransferCrossBorder = null;

  @SerializedName("nonMoneyTransferDomestic")
  private String nonMoneyTransferDomestic = null;

  @SerializedName("onlineGamblingFastFundsCrossBorder")
  private String onlineGamblingFastFundsCrossBorder = null;

  @SerializedName("onlineGamblingFastFundsDomestic")
  private String onlineGamblingFastFundsDomestic = null;

  @SerializedName("onlineGamblingCrossBorder")
  private String onlineGamblingCrossBorder = null;

  @SerializedName("onlineGamblingDomestic")
  private String onlineGamblingDomestic = null;

  @SerializedName("domesticParticipant")
  private String domesticParticipant = null;

  @SerializedName("crossBorderParticipant")
  private String crossBorderParticipant = null;

  public InlineResponse2011PayoutInformationPushFunds moneyTransferFastFundsCrossBorder(String moneyTransferFastFundsCrossBorder) {
    this.moneyTransferFastFundsCrossBorder = moneyTransferFastFundsCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border money transfer OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return moneyTransferFastFundsCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border money transfer OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getMoneyTransferFastFundsCrossBorder() {
    return moneyTransferFastFundsCrossBorder;
  }

  public void setMoneyTransferFastFundsCrossBorder(String moneyTransferFastFundsCrossBorder) {
    this.moneyTransferFastFundsCrossBorder = moneyTransferFastFundsCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds moneyTransferFastFundsDomestic(String moneyTransferFastFundsDomestic) {
    this.moneyTransferFastFundsDomestic = moneyTransferFastFundsDomestic;
    return this;
  }

   /**
   * This field indicates if domestic money transfer OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return moneyTransferFastFundsDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic money transfer OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getMoneyTransferFastFundsDomestic() {
    return moneyTransferFastFundsDomestic;
  }

  public void setMoneyTransferFastFundsDomestic(String moneyTransferFastFundsDomestic) {
    this.moneyTransferFastFundsDomestic = moneyTransferFastFundsDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds moneyTransferCrossBorder(String moneyTransferCrossBorder) {
    this.moneyTransferCrossBorder = moneyTransferCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border money transfer OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return moneyTransferCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border money transfer OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getMoneyTransferCrossBorder() {
    return moneyTransferCrossBorder;
  }

  public void setMoneyTransferCrossBorder(String moneyTransferCrossBorder) {
    this.moneyTransferCrossBorder = moneyTransferCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds moneyTransferDomestic(String moneyTransferDomestic) {
    this.moneyTransferDomestic = moneyTransferDomestic;
    return this;
  }

   /**
   * This field indicates if domestic money transfer OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return moneyTransferDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic money transfer OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getMoneyTransferDomestic() {
    return moneyTransferDomestic;
  }

  public void setMoneyTransferDomestic(String moneyTransferDomestic) {
    this.moneyTransferDomestic = moneyTransferDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds nonMoneyTransferFastFundsCrossBorder(String nonMoneyTransferFastFundsCrossBorder) {
    this.nonMoneyTransferFastFundsCrossBorder = nonMoneyTransferFastFundsCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border non-money transfer OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return nonMoneyTransferFastFundsCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border non-money transfer OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getNonMoneyTransferFastFundsCrossBorder() {
    return nonMoneyTransferFastFundsCrossBorder;
  }

  public void setNonMoneyTransferFastFundsCrossBorder(String nonMoneyTransferFastFundsCrossBorder) {
    this.nonMoneyTransferFastFundsCrossBorder = nonMoneyTransferFastFundsCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds nonMoneyTransferFastFundsDomestic(String nonMoneyTransferFastFundsDomestic) {
    this.nonMoneyTransferFastFundsDomestic = nonMoneyTransferFastFundsDomestic;
    return this;
  }

   /**
   * This field indicates if domestic non-money transfer OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return nonMoneyTransferFastFundsDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic non-money transfer OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getNonMoneyTransferFastFundsDomestic() {
    return nonMoneyTransferFastFundsDomestic;
  }

  public void setNonMoneyTransferFastFundsDomestic(String nonMoneyTransferFastFundsDomestic) {
    this.nonMoneyTransferFastFundsDomestic = nonMoneyTransferFastFundsDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds nonMoneyTransferCrossBorder(String nonMoneyTransferCrossBorder) {
    this.nonMoneyTransferCrossBorder = nonMoneyTransferCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border non-money transfer OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return nonMoneyTransferCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border non-money transfer OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getNonMoneyTransferCrossBorder() {
    return nonMoneyTransferCrossBorder;
  }

  public void setNonMoneyTransferCrossBorder(String nonMoneyTransferCrossBorder) {
    this.nonMoneyTransferCrossBorder = nonMoneyTransferCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds nonMoneyTransferDomestic(String nonMoneyTransferDomestic) {
    this.nonMoneyTransferDomestic = nonMoneyTransferDomestic;
    return this;
  }

   /**
   * This field indicates if domestic non-money transfer OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return nonMoneyTransferDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic non-money transfer OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getNonMoneyTransferDomestic() {
    return nonMoneyTransferDomestic;
  }

  public void setNonMoneyTransferDomestic(String nonMoneyTransferDomestic) {
    this.nonMoneyTransferDomestic = nonMoneyTransferDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds onlineGamblingFastFundsCrossBorder(String onlineGamblingFastFundsCrossBorder) {
    this.onlineGamblingFastFundsCrossBorder = onlineGamblingFastFundsCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border gambling OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return onlineGamblingFastFundsCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border gambling OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getOnlineGamblingFastFundsCrossBorder() {
    return onlineGamblingFastFundsCrossBorder;
  }

  public void setOnlineGamblingFastFundsCrossBorder(String onlineGamblingFastFundsCrossBorder) {
    this.onlineGamblingFastFundsCrossBorder = onlineGamblingFastFundsCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds onlineGamblingFastFundsDomestic(String onlineGamblingFastFundsDomestic) {
    this.onlineGamblingFastFundsDomestic = onlineGamblingFastFundsDomestic;
    return this;
  }

   /**
   * This field indicates if domestic gambling OCTs (fast push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return onlineGamblingFastFundsDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic gambling OCTs (fast push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getOnlineGamblingFastFundsDomestic() {
    return onlineGamblingFastFundsDomestic;
  }

  public void setOnlineGamblingFastFundsDomestic(String onlineGamblingFastFundsDomestic) {
    this.onlineGamblingFastFundsDomestic = onlineGamblingFastFundsDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds onlineGamblingCrossBorder(String onlineGamblingCrossBorder) {
    this.onlineGamblingCrossBorder = onlineGamblingCrossBorder;
    return this;
  }

   /**
   * This field indicates if cross-border gambling OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return onlineGamblingCrossBorder
  **/
  @ApiModelProperty(value = "This field indicates if cross-border gambling OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getOnlineGamblingCrossBorder() {
    return onlineGamblingCrossBorder;
  }

  public void setOnlineGamblingCrossBorder(String onlineGamblingCrossBorder) {
    this.onlineGamblingCrossBorder = onlineGamblingCrossBorder;
  }

  public InlineResponse2011PayoutInformationPushFunds onlineGamblingDomestic(String onlineGamblingDomestic) {
    this.onlineGamblingDomestic = onlineGamblingDomestic;
    return this;
  }

   /**
   * This field indicates if domestic gambling OCTs (push funds) are allowed. Possible values:   - &#x60;Y&#x60;   - &#x60;N&#x60; 
   * @return onlineGamblingDomestic
  **/
  @ApiModelProperty(value = "This field indicates if domestic gambling OCTs (push funds) are allowed. Possible values:   - `Y`   - `N` ")
  public String getOnlineGamblingDomestic() {
    return onlineGamblingDomestic;
  }

  public void setOnlineGamblingDomestic(String onlineGamblingDomestic) {
    this.onlineGamblingDomestic = onlineGamblingDomestic;
  }

  public InlineResponse2011PayoutInformationPushFunds domesticParticipant(String domesticParticipant) {
    this.domesticParticipant = domesticParticipant;
    return this;
  }

   /**
   * This field indicates if domestic OCTs (push funds) are allowed. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service(PPGS). Possible values:   - &#x60;true&#x60;   - &#x60;false&#x60; 
   * @return domesticParticipant
  **/
  @ApiModelProperty(value = "This field indicates if domestic OCTs (push funds) are allowed. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service(PPGS). Possible values:   - `true`   - `false` ")
  public String getDomesticParticipant() {
    return domesticParticipant;
  }

  public void setDomesticParticipant(String domesticParticipant) {
    this.domesticParticipant = domesticParticipant;
  }

  public InlineResponse2011PayoutInformationPushFunds crossBorderParticipant(String crossBorderParticipant) {
    this.crossBorderParticipant = crossBorderParticipant;
    return this;
  }

   /**
   * This field indicates if cross-border OCTs (push funds) are allowed. Note: Supported only in US for cross-border transactions involving Push Payments Gateway Service(PPGS). Possible values:   - &#x60;true&#x60;   - &#x60;false&#x60; 
   * @return crossBorderParticipant
  **/
  @ApiModelProperty(value = "This field indicates if cross-border OCTs (push funds) are allowed. Note: Supported only in US for cross-border transactions involving Push Payments Gateway Service(PPGS). Possible values:   - `true`   - `false` ")
  public String getCrossBorderParticipant() {
    return crossBorderParticipant;
  }

  public void setCrossBorderParticipant(String crossBorderParticipant) {
    this.crossBorderParticipant = crossBorderParticipant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011PayoutInformationPushFunds inlineResponse2011PayoutInformationPushFunds = (InlineResponse2011PayoutInformationPushFunds) o;
    return Objects.equals(this.moneyTransferFastFundsCrossBorder, inlineResponse2011PayoutInformationPushFunds.moneyTransferFastFundsCrossBorder) &&
        Objects.equals(this.moneyTransferFastFundsDomestic, inlineResponse2011PayoutInformationPushFunds.moneyTransferFastFundsDomestic) &&
        Objects.equals(this.moneyTransferCrossBorder, inlineResponse2011PayoutInformationPushFunds.moneyTransferCrossBorder) &&
        Objects.equals(this.moneyTransferDomestic, inlineResponse2011PayoutInformationPushFunds.moneyTransferDomestic) &&
        Objects.equals(this.nonMoneyTransferFastFundsCrossBorder, inlineResponse2011PayoutInformationPushFunds.nonMoneyTransferFastFundsCrossBorder) &&
        Objects.equals(this.nonMoneyTransferFastFundsDomestic, inlineResponse2011PayoutInformationPushFunds.nonMoneyTransferFastFundsDomestic) &&
        Objects.equals(this.nonMoneyTransferCrossBorder, inlineResponse2011PayoutInformationPushFunds.nonMoneyTransferCrossBorder) &&
        Objects.equals(this.nonMoneyTransferDomestic, inlineResponse2011PayoutInformationPushFunds.nonMoneyTransferDomestic) &&
        Objects.equals(this.onlineGamblingFastFundsCrossBorder, inlineResponse2011PayoutInformationPushFunds.onlineGamblingFastFundsCrossBorder) &&
        Objects.equals(this.onlineGamblingFastFundsDomestic, inlineResponse2011PayoutInformationPushFunds.onlineGamblingFastFundsDomestic) &&
        Objects.equals(this.onlineGamblingCrossBorder, inlineResponse2011PayoutInformationPushFunds.onlineGamblingCrossBorder) &&
        Objects.equals(this.onlineGamblingDomestic, inlineResponse2011PayoutInformationPushFunds.onlineGamblingDomestic) &&
        Objects.equals(this.domesticParticipant, inlineResponse2011PayoutInformationPushFunds.domesticParticipant) &&
        Objects.equals(this.crossBorderParticipant, inlineResponse2011PayoutInformationPushFunds.crossBorderParticipant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moneyTransferFastFundsCrossBorder, moneyTransferFastFundsDomestic, moneyTransferCrossBorder, moneyTransferDomestic, nonMoneyTransferFastFundsCrossBorder, nonMoneyTransferFastFundsDomestic, nonMoneyTransferCrossBorder, nonMoneyTransferDomestic, onlineGamblingFastFundsCrossBorder, onlineGamblingFastFundsDomestic, onlineGamblingCrossBorder, onlineGamblingDomestic, domesticParticipant, crossBorderParticipant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011PayoutInformationPushFunds {\n");
    
    sb.append("    moneyTransferFastFundsCrossBorder: ").append(toIndentedString(moneyTransferFastFundsCrossBorder)).append("\n");
    sb.append("    moneyTransferFastFundsDomestic: ").append(toIndentedString(moneyTransferFastFundsDomestic)).append("\n");
    sb.append("    moneyTransferCrossBorder: ").append(toIndentedString(moneyTransferCrossBorder)).append("\n");
    sb.append("    moneyTransferDomestic: ").append(toIndentedString(moneyTransferDomestic)).append("\n");
    sb.append("    nonMoneyTransferFastFundsCrossBorder: ").append(toIndentedString(nonMoneyTransferFastFundsCrossBorder)).append("\n");
    sb.append("    nonMoneyTransferFastFundsDomestic: ").append(toIndentedString(nonMoneyTransferFastFundsDomestic)).append("\n");
    sb.append("    nonMoneyTransferCrossBorder: ").append(toIndentedString(nonMoneyTransferCrossBorder)).append("\n");
    sb.append("    nonMoneyTransferDomestic: ").append(toIndentedString(nonMoneyTransferDomestic)).append("\n");
    sb.append("    onlineGamblingFastFundsCrossBorder: ").append(toIndentedString(onlineGamblingFastFundsCrossBorder)).append("\n");
    sb.append("    onlineGamblingFastFundsDomestic: ").append(toIndentedString(onlineGamblingFastFundsDomestic)).append("\n");
    sb.append("    onlineGamblingCrossBorder: ").append(toIndentedString(onlineGamblingCrossBorder)).append("\n");
    sb.append("    onlineGamblingDomestic: ").append(toIndentedString(onlineGamblingDomestic)).append("\n");
    sb.append("    domesticParticipant: ").append(toIndentedString(domesticParticipant)).append("\n");
    sb.append("    crossBorderParticipant: ").append(toIndentedString(crossBorderParticipant)).append("\n");
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

