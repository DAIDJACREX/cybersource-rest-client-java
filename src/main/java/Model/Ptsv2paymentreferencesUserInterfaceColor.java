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
 * Ptsv2paymentreferencesUserInterfaceColor
 */

public class Ptsv2paymentreferencesUserInterfaceColor {
  @SerializedName("border")
  private String border = null;

  @SerializedName("borderSelected")
  private String borderSelected = null;

  @SerializedName("button")
  private String button = null;

  @SerializedName("buttonText")
  private String buttonText = null;

  @SerializedName("checkbox")
  private String checkbox = null;

  @SerializedName("checkboxCheckMark")
  private String checkboxCheckMark = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("text")
  private String text = null;

  public Ptsv2paymentreferencesUserInterfaceColor border(String border) {
    this.border = border;
    return this;
  }

   /**
   * Border Color 
   * @return border
  **/
  @ApiModelProperty(value = "Border Color ")
  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  public Ptsv2paymentreferencesUserInterfaceColor borderSelected(String borderSelected) {
    this.borderSelected = borderSelected;
    return this;
  }

   /**
   * Selected Border Color 
   * @return borderSelected
  **/
  @ApiModelProperty(value = "Selected Border Color ")
  public String getBorderSelected() {
    return borderSelected;
  }

  public void setBorderSelected(String borderSelected) {
    this.borderSelected = borderSelected;
  }

  public Ptsv2paymentreferencesUserInterfaceColor button(String button) {
    this.button = button;
    return this;
  }

   /**
   * Button Color 
   * @return button
  **/
  @ApiModelProperty(value = "Button Color ")
  public String getButton() {
    return button;
  }

  public void setButton(String button) {
    this.button = button;
  }

  public Ptsv2paymentreferencesUserInterfaceColor buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Button Text Color 
   * @return buttonText
  **/
  @ApiModelProperty(value = "Button Text Color ")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public Ptsv2paymentreferencesUserInterfaceColor checkbox(String checkbox) {
    this.checkbox = checkbox;
    return this;
  }

   /**
   * Checkbox Color 
   * @return checkbox
  **/
  @ApiModelProperty(value = "Checkbox Color ")
  public String getCheckbox() {
    return checkbox;
  }

  public void setCheckbox(String checkbox) {
    this.checkbox = checkbox;
  }

  public Ptsv2paymentreferencesUserInterfaceColor checkboxCheckMark(String checkboxCheckMark) {
    this.checkboxCheckMark = checkboxCheckMark;
    return this;
  }

   /**
   * Checkbox Checkmark Color 
   * @return checkboxCheckMark
  **/
  @ApiModelProperty(value = "Checkbox Checkmark Color ")
  public String getCheckboxCheckMark() {
    return checkboxCheckMark;
  }

  public void setCheckboxCheckMark(String checkboxCheckMark) {
    this.checkboxCheckMark = checkboxCheckMark;
  }

  public Ptsv2paymentreferencesUserInterfaceColor header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Header Color 
   * @return header
  **/
  @ApiModelProperty(value = "Header Color ")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Ptsv2paymentreferencesUserInterfaceColor link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Link Color 
   * @return link
  **/
  @ApiModelProperty(value = "Link Color ")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Ptsv2paymentreferencesUserInterfaceColor text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text Color 
   * @return text
  **/
  @ApiModelProperty(value = "Text Color ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesUserInterfaceColor ptsv2paymentreferencesUserInterfaceColor = (Ptsv2paymentreferencesUserInterfaceColor) o;
    return Objects.equals(this.border, ptsv2paymentreferencesUserInterfaceColor.border) &&
        Objects.equals(this.borderSelected, ptsv2paymentreferencesUserInterfaceColor.borderSelected) &&
        Objects.equals(this.button, ptsv2paymentreferencesUserInterfaceColor.button) &&
        Objects.equals(this.buttonText, ptsv2paymentreferencesUserInterfaceColor.buttonText) &&
        Objects.equals(this.checkbox, ptsv2paymentreferencesUserInterfaceColor.checkbox) &&
        Objects.equals(this.checkboxCheckMark, ptsv2paymentreferencesUserInterfaceColor.checkboxCheckMark) &&
        Objects.equals(this.header, ptsv2paymentreferencesUserInterfaceColor.header) &&
        Objects.equals(this.link, ptsv2paymentreferencesUserInterfaceColor.link) &&
        Objects.equals(this.text, ptsv2paymentreferencesUserInterfaceColor.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, borderSelected, button, buttonText, checkbox, checkboxCheckMark, header, link, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesUserInterfaceColor {\n");
    
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    borderSelected: ").append(toIndentedString(borderSelected)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    checkbox: ").append(toIndentedString(checkbox)).append("\n");
    sb.append("    checkboxCheckMark: ").append(toIndentedString(checkboxCheckMark)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

