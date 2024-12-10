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
import Model.TmsNetworkTokenServices;
import Model.TmsNullify;
import Model.TmsSensitivePrivileges;
import Model.TmsTokenFormats;
import Model.TokenPermissions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault
 */

public class CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault {
  @SerializedName("defaultTokenType")
  private String defaultTokenType = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("tokenFormats")
  private TmsTokenFormats tokenFormats = null;

  @SerializedName("tokenPermissions")
  private TokenPermissions tokenPermissions = null;

  @SerializedName("sensitivePrivileges")
  private TmsSensitivePrivileges sensitivePrivileges = null;

  @SerializedName("nullify")
  private TmsNullify nullify = null;

  @SerializedName("networkTokenServices")
  private TmsNetworkTokenServices networkTokenServices = null;

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault defaultTokenType(String defaultTokenType) {
    this.defaultTokenType = defaultTokenType;
    return this;
  }

   /**
   * Default token type to be used. Possible Values:   - &#39;CUSTOMER&#39;  - &#39;PAYMENT_INSTRUMENT&#39;  - &#39;INSTRUMENT_IDENTIFIER&#39; 
   * @return defaultTokenType
  **/
  @ApiModelProperty(example = "CUSTOMER", value = "Default token type to be used. Possible Values:   - 'CUSTOMER'  - 'PAYMENT_INSTRUMENT'  - 'INSTRUMENT_IDENTIFIER' ")
  public String getDefaultTokenType() {
    return defaultTokenType;
  }

  public void setDefaultTokenType(String defaultTokenType) {
    this.defaultTokenType = defaultTokenType;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location where the vault will be stored.  Use &#39;IDC&#39; (the Indian Data Centre) when merchant is storing token data in India  or &#39;GDC&#39; (the Global Data Centre) for all other cases.  Possible Values:    - &#39;IDC&#39;   - &#39;GDC&#39; 
   * @return location
  **/
  @ApiModelProperty(example = "GDC", value = "Location where the vault will be stored.  Use 'IDC' (the Indian Data Centre) when merchant is storing token data in India  or 'GDC' (the Global Data Centre) for all other cases.  Possible Values:    - 'IDC'   - 'GDC' ")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault tokenFormats(TmsTokenFormats tokenFormats) {
    this.tokenFormats = tokenFormats;
    return this;
  }

   /**
   * Get tokenFormats
   * @return tokenFormats
  **/
  @ApiModelProperty(value = "")
  public TmsTokenFormats getTokenFormats() {
    return tokenFormats;
  }

  public void setTokenFormats(TmsTokenFormats tokenFormats) {
    this.tokenFormats = tokenFormats;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault tokenPermissions(TokenPermissions tokenPermissions) {
    this.tokenPermissions = tokenPermissions;
    return this;
  }

   /**
   * Get tokenPermissions
   * @return tokenPermissions
  **/
  @ApiModelProperty(value = "")
  public TokenPermissions getTokenPermissions() {
    return tokenPermissions;
  }

  public void setTokenPermissions(TokenPermissions tokenPermissions) {
    this.tokenPermissions = tokenPermissions;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault sensitivePrivileges(TmsSensitivePrivileges sensitivePrivileges) {
    this.sensitivePrivileges = sensitivePrivileges;
    return this;
  }

   /**
   * Get sensitivePrivileges
   * @return sensitivePrivileges
  **/
  @ApiModelProperty(value = "")
  public TmsSensitivePrivileges getSensitivePrivileges() {
    return sensitivePrivileges;
  }

  public void setSensitivePrivileges(TmsSensitivePrivileges sensitivePrivileges) {
    this.sensitivePrivileges = sensitivePrivileges;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault nullify(TmsNullify nullify) {
    this.nullify = nullify;
    return this;
  }

   /**
   * Get nullify
   * @return nullify
  **/
  @ApiModelProperty(value = "")
  public TmsNullify getNullify() {
    return nullify;
  }

  public void setNullify(TmsNullify nullify) {
    this.nullify = nullify;
  }

  public CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault networkTokenServices(TmsNetworkTokenServices networkTokenServices) {
    this.networkTokenServices = networkTokenServices;
    return this;
  }

   /**
   * Get networkTokenServices
   * @return networkTokenServices
  **/
  @ApiModelProperty(value = "")
  public TmsNetworkTokenServices getNetworkTokenServices() {
    return networkTokenServices;
  }

  public void setNetworkTokenServices(TmsNetworkTokenServices networkTokenServices) {
    this.networkTokenServices = networkTokenServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault = (CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault) o;
    return Objects.equals(this.defaultTokenType, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.defaultTokenType) &&
        Objects.equals(this.location, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.location) &&
        Objects.equals(this.tokenFormats, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.tokenFormats) &&
        Objects.equals(this.tokenPermissions, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.tokenPermissions) &&
        Objects.equals(this.sensitivePrivileges, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.sensitivePrivileges) &&
        Objects.equals(this.nullify, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.nullify) &&
        Objects.equals(this.networkTokenServices, commerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault.networkTokenServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTokenType, location, tokenFormats, tokenPermissions, sensitivePrivileges, nullify, networkTokenServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault {\n");
    
    sb.append("    defaultTokenType: ").append(toIndentedString(defaultTokenType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tokenFormats: ").append(toIndentedString(tokenFormats)).append("\n");
    sb.append("    tokenPermissions: ").append(toIndentedString(tokenPermissions)).append("\n");
    sb.append("    sensitivePrivileges: ").append(toIndentedString(sensitivePrivileges)).append("\n");
    sb.append("    nullify: ").append(toIndentedString(nullify)).append("\n");
    sb.append("    networkTokenServices: ").append(toIndentedString(networkTokenServices)).append("\n");
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
