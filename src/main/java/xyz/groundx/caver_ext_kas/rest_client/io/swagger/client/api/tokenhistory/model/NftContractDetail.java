/*
 * Token History API
 * # Introduction  Token History API allows you to query the transaction history of KLAY, FTs (KIP-7 and Labelled ERC-20), NFTs (KIP-17 and Labelled ERC-721), and MTs (KIP-37 and Labelled ERC-1155). You can track KLAY's transaction history or retrieve NFT-related data of a certain EOA.   For more details on using Token History API, please refer to the [Tutorial](https://docs.klaytnapi.com/tutorial).   For any inquiries on this document or KAS in general, please visit [Developer Forum](https://forum.klaytn.com/).  
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
/**
 * NftContractDetail
 */


public class NftContractDetail {
  @SerializedName("address")
  private String address = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("totalSupply")
  private String totalSupply = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  @SerializedName("deletedAt")
  private Long deletedAt = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  public NftContractDetail address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Contract address (20-byte)
   * @return address
  **/
  @Schema(example = "0xc7565d24af561fe783aa73747ca0eda1f09f1118", required = true, description = "Contract address (20-byte)")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NftContractDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Token name
   * @return name
  **/
  @Schema(example = "Test Token", required = true, description = "Token name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NftContractDetail symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Token symbol
   * @return symbol
  **/
  @Schema(example = "TSTC", required = true, description = "Token symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public NftContractDetail totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Total issued amount (in hexadecimal)
   * @return totalSupply
  **/
  @Schema(example = "0x174876e800", required = true, description = "Total issued amount (in hexadecimal)")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  public NftContractDetail createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time of labelling (timestamp)
   * @return createdAt
  **/
  @Schema(example = "1592180992", required = true, description = "Time of labelling (timestamp)")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public NftContractDetail updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last change in token in labelling (timestamp)
   * @return updatedAt
  **/
  @Schema(example = "1592180992", required = true, description = "Last change in token in labelling (timestamp)")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NftContractDetail deletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Time of removal of labelling (timestamp); 0 if not removed
   * @return deletedAt
  **/
  @Schema(example = "1592180992", required = true, description = "Time of removal of labelling (timestamp); 0 if not removed")
  public Long getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
  }

  public NftContractDetail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Contract type (KIP-17, ERC-721)
   * @return type
  **/
  @Schema(example = "KIP-7", required = true, description = "Contract type (KIP-17, ERC-721)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NftContractDetail status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Contract labelling status (completed, processing, failed, cancelled)
   * @return status
  **/
  @Schema(example = "completed", required = true, description = "Contract labelling status (completed, processing, failed, cancelled)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftContractDetail nftContractDetail = (NftContractDetail) o;
    return Objects.equals(this.address, nftContractDetail.address) &&
        Objects.equals(this.name, nftContractDetail.name) &&
        Objects.equals(this.symbol, nftContractDetail.symbol) &&
        Objects.equals(this.totalSupply, nftContractDetail.totalSupply) &&
        Objects.equals(this.createdAt, nftContractDetail.createdAt) &&
        Objects.equals(this.updatedAt, nftContractDetail.updatedAt) &&
        Objects.equals(this.deletedAt, nftContractDetail.deletedAt) &&
        Objects.equals(this.type, nftContractDetail.type) &&
        Objects.equals(this.status, nftContractDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, symbol, totalSupply, createdAt, updatedAt, deletedAt, type, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftContractDetail {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
