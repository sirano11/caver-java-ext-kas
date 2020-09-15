/*
 * Anchor API
 * # Introduction 이 문서는 KAS\\(Klaytn API Service\\)의 Anchor API를 소개하는 문서입니다. Anchor API는 서비스 체인 데이터의 신뢰성을 보장하기 위해 데이터 신뢰성을 증명할 수 있는 메타데이터를 Klaytn 메인 체인에 전송하는 기능을 제공합니다.  자세한 사용 예시는 [튜토리얼](링크)를 확인하십시오.  
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.anchor.v1.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;
/**
 * 앵커링 트랜잭션 정보
 */
@Schema(description = "앵커링 트랜잭션 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T04:17:34.087Z[GMT]")
public class AnchorBlockTransactions {
  @SerializedName("payload")
  private AnchorBlockPayload payload = null;

  @SerializedName("transactionHash")
  private String transactionHash = null;

  public AnchorBlockTransactions payload(AnchorBlockPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(required = true, description = "")
  public AnchorBlockPayload getPayload() {
    return payload;
  }

  public void setPayload(AnchorBlockPayload payload) {
    this.payload = payload;
  }

  public AnchorBlockTransactions transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * 앵커링 트랜잭션의 트랜잭션 해시
   * @return transactionHash
  **/
  @Schema(example = "0x5aeb4ddc5d77b9ce977a87461573da00c0aed0ac59962892ecf58ec09296e79d", required = true, description = "앵커링 트랜잭션의 트랜잭션 해시")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnchorBlockTransactions anchorBlockTransactions = (AnchorBlockTransactions) o;
    return Objects.equals(this.payload, anchorBlockTransactions.payload) &&
        Objects.equals(this.transactionHash, anchorBlockTransactions.transactionHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, transactionHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnchorBlockTransactions {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
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