/*
 * Token History API
 * # Introduction  Token History API allows users to search for information and transfer records on KLAY, FT (KIP-7, Labeled ERC-20), and NFT (KIP-17, Labeled ERC-721) tokens. You can use Token History API to check the records of a specific EOA transferring KLAY, retrieve NFT information, or other purposes.  For more details on Token History API, refer to our [tutorial](https://klaytn.com).  For any questions regarding this document or KAS, visit [the developer forum](https://forum.klaytn.com/).  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model.Mt;
/**
 * PageableMts
 */


public class PageableMts {
  @SerializedName("items")
  private List<Mt> items = new ArrayList<Mt>();

  @SerializedName("cursor")
  private String cursor = null;

  public PageableMts items(List<Mt> items) {
    this.items = items;
    return this;
  }

  public PageableMts addItemsItem(Mt itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<Mt> getItems() {
    return items;
  }

  public void setItems(List<Mt> items) {
    this.items = items;
  }

  public PageableMts cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Next page cursor
   * @return cursor
  **/
  @Schema(example = "z2o87adeLbW4Aqm53gpq6VbGZg3JmE5vodrwD9XKmY5vMl4Gkw9PZO1NoBpV8LR83y0Edb3Aar7eKQqzJWDg6X2xOe1P27l4kzY0xQa8LNABMWv0VJQ6MpNlr9O1xBDE", required = true, description = "Next page cursor")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableMts pageableMts = (PageableMts) o;
    return Objects.equals(this.items, pageableMts.items) &&
        Objects.equals(this.cursor, pageableMts.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableMts {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
