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
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model.NftContract;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model.Transaction;
/**
 * NftTransfer
 */


public class NftTransfer implements AnyOfTransferArrayItems {
  @SerializedName("contract")
  private NftContract contract = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("transaction")
  private Transaction transaction = null;

  @SerializedName("transferType")
  private String transferType = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  public NftTransfer contract(NftContract contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @Schema(required = true, description = "")
  public NftContract getContract() {
    return contract;
  }

  public void setContract(NftContract contract) {
    this.contract = contract;
  }

  public NftTransfer from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Sender EOA (20-byte)
   * @return from
  **/
  @Schema(example = "0x5e47b195eeb11d72f5e1d27aebb6d341f1a9bedb", required = true, description = "Sender EOA (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public NftTransfer to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Recipient EOA (20-byte)
   * @return to
  **/
  @Schema(example = "0xb4bf60383c64d47f2e667f2fe8f7ed0c9380f770", required = true, description = "Recipient EOA (20-byte)")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public NftTransfer transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @Schema(required = true, description = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public NftTransfer transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Transaction type
   * @return transferType
  **/
  @Schema(example = "nft", required = true, description = "Transaction type")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public NftTransfer tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token Identifier (in hexadecimal)
   * @return tokenId
  **/
  @Schema(example = "0x1", required = true, description = "Token Identifier (in hexadecimal)")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftTransfer nftTransfer = (NftTransfer) o;
    return Objects.equals(this.contract, nftTransfer.contract) &&
        Objects.equals(this.from, nftTransfer.from) &&
        Objects.equals(this.to, nftTransfer.to) &&
        Objects.equals(this.transaction, nftTransfer.transaction) &&
        Objects.equals(this.transferType, nftTransfer.transferType) &&
        Objects.equals(this.tokenId, nftTransfer.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, from, to, transaction, transferType, tokenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftTransfer {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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
