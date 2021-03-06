/*
 * Anchor API
 * # Introduction This document discusses Klaytn API Service (KAS) Anchor API. Anchor API features functions for sending metadata to prove data reliability and ensuring the reliability of service chain data to the Klaytn main chain.     # Error Codes  ## 400: Bad Request   | Code | Messages |   | --- | --- |   | 1071010 | data don't exist 1071615 | its value is out of range; size 1072100 | same payload ID or payload was already anchored 1072101 | all configured accounts have insufficient funds |   # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.AnchorTransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of anchoring transactions
 */
@Schema(description = "List of anchoring transactions")

public class AnchorTransactions {
  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("items")
  private List<AnchorTransaction> items = null;

  public AnchorTransactions cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Cursor information on last searched location
   * @return cursor
  **/
  @Schema(required = true, description = "Cursor information on last searched location")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public AnchorTransactions items(List<AnchorTransaction> items) {
    this.items = items;
    return this;
  }

  public AnchorTransactions addItemsItem(AnchorTransaction itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AnchorTransaction>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<AnchorTransaction> getItems() {
    return items;
  }

  public void setItems(List<AnchorTransaction> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnchorTransactions anchorTransactions = (AnchorTransactions) o;
    return Objects.equals(this.cursor, anchorTransactions.cursor) &&
        Objects.equals(this.items, anchorTransactions.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnchorTransactions {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
