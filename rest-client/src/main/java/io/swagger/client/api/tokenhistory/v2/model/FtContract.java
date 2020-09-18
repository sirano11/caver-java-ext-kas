/*
 * Token History API
 * # Introduction  Token History API는 KLAY, FT (KIP-7, Labeled ERC-20), NFT (KIP-17, Labeled ERC-721) 토큰 정보, 이들 토큰을 주고받은 기록을 조회하는 기능을 제공합니다. 여러분은 특정 EOA가 KLAY를 주고받은 기록을 확인하거나 EOA가 가지고 있는 NFT 정보를 불러오는 등 Token History API를 다양하게 활용할 수 있습니다.   Token History API 사용에 관한 자세한 내용은 [튜토리얼](https://klaytn.com)을 확인하십시오.   이 문서 혹은 KAS에 관한 문의는 [개발자 포럼](https://forum.klaytn.com/)을 방문해 도움을 받으십시오  
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.tokenhistory.v2.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;
/**
 * FtContract
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-18T08:08:47.543Z[GMT]")
public class FtContract {
  @SerializedName("address")
  private String address = null;

  @SerializedName("decimals")
  private Long decimals = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("status")
  private String status = null;

  public FtContract address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 컨트랙트 주소 (20-byte)
   * @return address
  **/
  @Schema(example = "0x5e47b195eeb11d72f5e1d27aebb6d341f1a9bedb", required = true, description = "컨트랙트 주소 (20-byte)")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public FtContract decimals(Long decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * 토큰 자릿수
   * @return decimals
  **/
  @Schema(example = "8", required = true, description = "토큰 자릿수")
  public Long getDecimals() {
    return decimals;
  }

  public void setDecimals(Long decimals) {
    this.decimals = decimals;
  }

  public FtContract name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 토큰 이름
   * @return name
  **/
  @Schema(example = "Test Coin", required = true, description = "토큰 이름")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FtContract symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * 토큰 심볼
   * @return symbol
  **/
  @Schema(example = "TSTC", required = true, description = "토큰 심볼")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public FtContract status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 컨트랙트 라벨링 상태 (completed, processing, failed, cancelled)
   * @return status
  **/
  @Schema(example = "completed", required = true, description = "컨트랙트 라벨링 상태 (completed, processing, failed, cancelled)")
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
    FtContract ftContract = (FtContract) o;
    return Objects.equals(this.address, ftContract.address) &&
        Objects.equals(this.decimals, ftContract.decimals) &&
        Objects.equals(this.name, ftContract.name) &&
        Objects.equals(this.symbol, ftContract.symbol) &&
        Objects.equals(this.status, ftContract.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, decimals, name, symbol, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtContract {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
