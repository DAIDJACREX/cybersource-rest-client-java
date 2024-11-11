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
import Model.Tmsv2TokenizedCardMetadataCardArtBackgroundAsset;
import Model.Tmsv2TokenizedCardMetadataCardArtBrandLogoAsset;
import Model.Tmsv2TokenizedCardMetadataCardArtCoBrandLogoAsset;
import Model.Tmsv2TokenizedCardMetadataCardArtCombinedAsset;
import Model.Tmsv2TokenizedCardMetadataCardArtIconAsset;
import Model.Tmsv2TokenizedCardMetadataCardArtIssuerLogoAsset;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2TokenizedCardMetadataCardArt
 */

public class Tmsv2TokenizedCardMetadataCardArt {
  @SerializedName("combinedAsset")
  private Tmsv2TokenizedCardMetadataCardArtCombinedAsset combinedAsset = null;

  @SerializedName("brandLogoAsset")
  private Tmsv2TokenizedCardMetadataCardArtBrandLogoAsset brandLogoAsset = null;

  @SerializedName("coBrandLogoAsset")
  private Tmsv2TokenizedCardMetadataCardArtCoBrandLogoAsset coBrandLogoAsset = null;

  @SerializedName("issuerLogoAsset")
  private Tmsv2TokenizedCardMetadataCardArtIssuerLogoAsset issuerLogoAsset = null;

  @SerializedName("iconAsset")
  private Tmsv2TokenizedCardMetadataCardArtIconAsset iconAsset = null;

  @SerializedName("foregroundColor")
  private String foregroundColor = null;

  @SerializedName("backgroundAsset")
  private Tmsv2TokenizedCardMetadataCardArtBackgroundAsset backgroundAsset = null;

  public Tmsv2TokenizedCardMetadataCardArt combinedAsset(Tmsv2TokenizedCardMetadataCardArtCombinedAsset combinedAsset) {
    this.combinedAsset = combinedAsset;
    return this;
  }

   /**
   * Get combinedAsset
   * @return combinedAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtCombinedAsset getCombinedAsset() {
    return combinedAsset;
  }

  public void setCombinedAsset(Tmsv2TokenizedCardMetadataCardArtCombinedAsset combinedAsset) {
    this.combinedAsset = combinedAsset;
  }

  public Tmsv2TokenizedCardMetadataCardArt brandLogoAsset(Tmsv2TokenizedCardMetadataCardArtBrandLogoAsset brandLogoAsset) {
    this.brandLogoAsset = brandLogoAsset;
    return this;
  }

   /**
   * Get brandLogoAsset
   * @return brandLogoAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtBrandLogoAsset getBrandLogoAsset() {
    return brandLogoAsset;
  }

  public void setBrandLogoAsset(Tmsv2TokenizedCardMetadataCardArtBrandLogoAsset brandLogoAsset) {
    this.brandLogoAsset = brandLogoAsset;
  }

  public Tmsv2TokenizedCardMetadataCardArt coBrandLogoAsset(Tmsv2TokenizedCardMetadataCardArtCoBrandLogoAsset coBrandLogoAsset) {
    this.coBrandLogoAsset = coBrandLogoAsset;
    return this;
  }

   /**
   * Get coBrandLogoAsset
   * @return coBrandLogoAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtCoBrandLogoAsset getCoBrandLogoAsset() {
    return coBrandLogoAsset;
  }

  public void setCoBrandLogoAsset(Tmsv2TokenizedCardMetadataCardArtCoBrandLogoAsset coBrandLogoAsset) {
    this.coBrandLogoAsset = coBrandLogoAsset;
  }

  public Tmsv2TokenizedCardMetadataCardArt issuerLogoAsset(Tmsv2TokenizedCardMetadataCardArtIssuerLogoAsset issuerLogoAsset) {
    this.issuerLogoAsset = issuerLogoAsset;
    return this;
  }

   /**
   * Get issuerLogoAsset
   * @return issuerLogoAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtIssuerLogoAsset getIssuerLogoAsset() {
    return issuerLogoAsset;
  }

  public void setIssuerLogoAsset(Tmsv2TokenizedCardMetadataCardArtIssuerLogoAsset issuerLogoAsset) {
    this.issuerLogoAsset = issuerLogoAsset;
  }

  public Tmsv2TokenizedCardMetadataCardArt iconAsset(Tmsv2TokenizedCardMetadataCardArtIconAsset iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

   /**
   * Get iconAsset
   * @return iconAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtIconAsset getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(Tmsv2TokenizedCardMetadataCardArtIconAsset iconAsset) {
    this.iconAsset = iconAsset;
  }

   /**
   * The foreground color of the brand logo asset. 
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "The foreground color of the brand logo asset. ")
  public String getForegroundColor() {
    return foregroundColor;
  }

  public Tmsv2TokenizedCardMetadataCardArt backgroundAsset(Tmsv2TokenizedCardMetadataCardArtBackgroundAsset backgroundAsset) {
    this.backgroundAsset = backgroundAsset;
    return this;
  }

   /**
   * Get backgroundAsset
   * @return backgroundAsset
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtBackgroundAsset getBackgroundAsset() {
    return backgroundAsset;
  }

  public void setBackgroundAsset(Tmsv2TokenizedCardMetadataCardArtBackgroundAsset backgroundAsset) {
    this.backgroundAsset = backgroundAsset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2TokenizedCardMetadataCardArt tmsv2TokenizedCardMetadataCardArt = (Tmsv2TokenizedCardMetadataCardArt) o;
    return Objects.equals(this.combinedAsset, tmsv2TokenizedCardMetadataCardArt.combinedAsset) &&
        Objects.equals(this.brandLogoAsset, tmsv2TokenizedCardMetadataCardArt.brandLogoAsset) &&
        Objects.equals(this.coBrandLogoAsset, tmsv2TokenizedCardMetadataCardArt.coBrandLogoAsset) &&
        Objects.equals(this.issuerLogoAsset, tmsv2TokenizedCardMetadataCardArt.issuerLogoAsset) &&
        Objects.equals(this.iconAsset, tmsv2TokenizedCardMetadataCardArt.iconAsset) &&
        Objects.equals(this.foregroundColor, tmsv2TokenizedCardMetadataCardArt.foregroundColor) &&
        Objects.equals(this.backgroundAsset, tmsv2TokenizedCardMetadataCardArt.backgroundAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinedAsset, brandLogoAsset, coBrandLogoAsset, issuerLogoAsset, iconAsset, foregroundColor, backgroundAsset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2TokenizedCardMetadataCardArt {\n");
    
    sb.append("    combinedAsset: ").append(toIndentedString(combinedAsset)).append("\n");
    sb.append("    brandLogoAsset: ").append(toIndentedString(brandLogoAsset)).append("\n");
    sb.append("    coBrandLogoAsset: ").append(toIndentedString(coBrandLogoAsset)).append("\n");
    sb.append("    issuerLogoAsset: ").append(toIndentedString(issuerLogoAsset)).append("\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundAsset: ").append(toIndentedString(backgroundAsset)).append("\n");
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
