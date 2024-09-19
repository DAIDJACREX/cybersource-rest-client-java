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
import Model.Tmsv2TokenizedCardMetadataCardArtIconAssetLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2TokenizedCardMetadataCardArtIconAsset
 */

public class Tmsv2TokenizedCardMetadataCardArtIconAsset {
  @SerializedName("id")
  private String id = null;

  @SerializedName("_links")
  private Tmsv2TokenizedCardMetadataCardArtIconAssetLinks links = null;

   /**
   * The Id of the icon asset. 
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the icon asset. ")
  public String getId() {
    return id;
  }

  public Tmsv2TokenizedCardMetadataCardArtIconAsset links(Tmsv2TokenizedCardMetadataCardArtIconAssetLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtIconAssetLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2TokenizedCardMetadataCardArtIconAssetLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2TokenizedCardMetadataCardArtIconAsset tmsv2TokenizedCardMetadataCardArtIconAsset = (Tmsv2TokenizedCardMetadataCardArtIconAsset) o;
    return Objects.equals(this.id, tmsv2TokenizedCardMetadataCardArtIconAsset.id) &&
        Objects.equals(this.links, tmsv2TokenizedCardMetadataCardArtIconAsset.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2TokenizedCardMetadataCardArtIconAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

