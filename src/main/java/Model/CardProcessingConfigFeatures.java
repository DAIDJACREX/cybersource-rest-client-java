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
import Model.CardProcessingConfigFeaturesCardNotPresent;
import Model.CardProcessingConfigFeaturesCardPresent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CardProcessingConfigFeatures
 */

public class CardProcessingConfigFeatures {
  @SerializedName("cardNotPresent")
  private CardProcessingConfigFeaturesCardNotPresent cardNotPresent = null;

  @SerializedName("cardPresent")
  private CardProcessingConfigFeaturesCardPresent cardPresent = null;

  public CardProcessingConfigFeatures cardNotPresent(CardProcessingConfigFeaturesCardNotPresent cardNotPresent) {
    this.cardNotPresent = cardNotPresent;
    return this;
  }

   /**
   * Get cardNotPresent
   * @return cardNotPresent
  **/
  @ApiModelProperty(value = "")
  public CardProcessingConfigFeaturesCardNotPresent getCardNotPresent() {
    return cardNotPresent;
  }

  public void setCardNotPresent(CardProcessingConfigFeaturesCardNotPresent cardNotPresent) {
    this.cardNotPresent = cardNotPresent;
  }

  public CardProcessingConfigFeatures cardPresent(CardProcessingConfigFeaturesCardPresent cardPresent) {
    this.cardPresent = cardPresent;
    return this;
  }

   /**
   * Get cardPresent
   * @return cardPresent
  **/
  @ApiModelProperty(value = "")
  public CardProcessingConfigFeaturesCardPresent getCardPresent() {
    return cardPresent;
  }

  public void setCardPresent(CardProcessingConfigFeaturesCardPresent cardPresent) {
    this.cardPresent = cardPresent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProcessingConfigFeatures cardProcessingConfigFeatures = (CardProcessingConfigFeatures) o;
    return Objects.equals(this.cardNotPresent, cardProcessingConfigFeatures.cardNotPresent) &&
        Objects.equals(this.cardPresent, cardProcessingConfigFeatures.cardPresent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNotPresent, cardPresent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigFeatures {\n");
    
    sb.append("    cardNotPresent: ").append(toIndentedString(cardNotPresent)).append("\n");
    sb.append("    cardPresent: ").append(toIndentedString(cardPresent)).append("\n");
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

