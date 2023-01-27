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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails {
  @SerializedName("pointsBeforeRedemption")
  private String pointsBeforeRedemption = null;

  @SerializedName("pointsValueBeforeRedemption")
  private String pointsValueBeforeRedemption = null;

  @SerializedName("pointsRedeemed")
  private String pointsRedeemed = null;

  @SerializedName("pointsValueRedeemed")
  private String pointsValueRedeemed = null;

  @SerializedName("pointsAfterRedemption")
  private String pointsAfterRedemption = null;

  @SerializedName("pointsValueAfterRedemption")
  private String pointsValueAfterRedemption = null;

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsBeforeRedemption(String pointsBeforeRedemption) {
    this.pointsBeforeRedemption = pointsBeforeRedemption;
    return this;
  }

   /**
   * Loyalty points total balance before redemption. For Example: Points, such as 100 
   * @return pointsBeforeRedemption
  **/
  @ApiModelProperty(value = "Loyalty points total balance before redemption. For Example: Points, such as 100 ")
  public String getPointsBeforeRedemption() {
    return pointsBeforeRedemption;
  }

  public void setPointsBeforeRedemption(String pointsBeforeRedemption) {
    this.pointsBeforeRedemption = pointsBeforeRedemption;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsValueBeforeRedemption(String pointsValueBeforeRedemption) {
    this.pointsValueBeforeRedemption = pointsValueBeforeRedemption;
    return this;
  }

   /**
   * The total value of loyalty points before redemption in the default currency. Max characters is 12 excluding the \&quot;.\&quot; symbol For Example: Points, such as 20.00 
   * @return pointsValueBeforeRedemption
  **/
  @ApiModelProperty(value = "The total value of loyalty points before redemption in the default currency. Max characters is 12 excluding the \".\" symbol For Example: Points, such as 20.00 ")
  public String getPointsValueBeforeRedemption() {
    return pointsValueBeforeRedemption;
  }

  public void setPointsValueBeforeRedemption(String pointsValueBeforeRedemption) {
    this.pointsValueBeforeRedemption = pointsValueBeforeRedemption;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsRedeemed(String pointsRedeemed) {
    this.pointsRedeemed = pointsRedeemed;
    return this;
  }

   /**
   * Number of loyalty points that were redeemed. For Example: Points, such as 100 
   * @return pointsRedeemed
  **/
  @ApiModelProperty(value = "Number of loyalty points that were redeemed. For Example: Points, such as 100 ")
  public String getPointsRedeemed() {
    return pointsRedeemed;
  }

  public void setPointsRedeemed(String pointsRedeemed) {
    this.pointsRedeemed = pointsRedeemed;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsValueRedeemed(String pointsValueRedeemed) {
    this.pointsValueRedeemed = pointsValueRedeemed;
    return this;
  }

   /**
   * The value of the loyalty points that were redeemed in the default currency. Max characters is 12 excluding the \&quot;.\&quot; symbol For Example: Points, such as 100.00 
   * @return pointsValueRedeemed
  **/
  @ApiModelProperty(value = "The value of the loyalty points that were redeemed in the default currency. Max characters is 12 excluding the \".\" symbol For Example: Points, such as 100.00 ")
  public String getPointsValueRedeemed() {
    return pointsValueRedeemed;
  }

  public void setPointsValueRedeemed(String pointsValueRedeemed) {
    this.pointsValueRedeemed = pointsValueRedeemed;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsAfterRedemption(String pointsAfterRedemption) {
    this.pointsAfterRedemption = pointsAfterRedemption;
    return this;
  }

   /**
   * Loyalty Points remaining total balance after redemption. For Example: Points, such as 20.00 
   * @return pointsAfterRedemption
  **/
  @ApiModelProperty(value = "Loyalty Points remaining total balance after redemption. For Example: Points, such as 20.00 ")
  public String getPointsAfterRedemption() {
    return pointsAfterRedemption;
  }

  public void setPointsAfterRedemption(String pointsAfterRedemption) {
    this.pointsAfterRedemption = pointsAfterRedemption;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails pointsValueAfterRedemption(String pointsValueAfterRedemption) {
    this.pointsValueAfterRedemption = pointsValueAfterRedemption;
    return this;
  }

   /**
   * The value of the remaining loyalty points after redumption in the default currency. Max characters is 12 excluding the \&quot;.\&quot; symbol For Example: Points, such as 20.00 
   * @return pointsValueAfterRedemption
  **/
  @ApiModelProperty(value = "The value of the remaining loyalty points after redumption in the default currency. Max characters is 12 excluding the \".\" symbol For Example: Points, such as 20.00 ")
  public String getPointsValueAfterRedemption() {
    return pointsValueAfterRedemption;
  }

  public void setPointsValueAfterRedemption(String pointsValueAfterRedemption) {
    this.pointsValueAfterRedemption = pointsValueAfterRedemption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails = (PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails) o;
    return Objects.equals(this.pointsBeforeRedemption, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsBeforeRedemption) &&
        Objects.equals(this.pointsValueBeforeRedemption, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsValueBeforeRedemption) &&
        Objects.equals(this.pointsRedeemed, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsRedeemed) &&
        Objects.equals(this.pointsValueRedeemed, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsValueRedeemed) &&
        Objects.equals(this.pointsAfterRedemption, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsAfterRedemption) &&
        Objects.equals(this.pointsValueAfterRedemption, ptsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails.pointsValueAfterRedemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsBeforeRedemption, pointsValueBeforeRedemption, pointsRedeemed, pointsValueRedeemed, pointsAfterRedemption, pointsValueAfterRedemption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseOrderInformationRewardPointsDetails {\n");
    
    sb.append("    pointsBeforeRedemption: ").append(toIndentedString(pointsBeforeRedemption)).append("\n");
    sb.append("    pointsValueBeforeRedemption: ").append(toIndentedString(pointsValueBeforeRedemption)).append("\n");
    sb.append("    pointsRedeemed: ").append(toIndentedString(pointsRedeemed)).append("\n");
    sb.append("    pointsValueRedeemed: ").append(toIndentedString(pointsValueRedeemed)).append("\n");
    sb.append("    pointsAfterRedemption: ").append(toIndentedString(pointsAfterRedemption)).append("\n");
    sb.append("    pointsValueAfterRedemption: ").append(toIndentedString(pointsValueAfterRedemption)).append("\n");
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

