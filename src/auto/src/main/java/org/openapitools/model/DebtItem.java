package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Элемент задолженности
 */
@ApiModel(description = "Элемент задолженности")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")


public class DebtItem extends RepresentationModel<DebtItem>   {
  /**
   * вид задолженности
   */
  public enum DebtItemTypeEnum {
    BASEQTY("BASEQTY"),
    
    PERCENTQTY("PERCENTQTY"),
    
    DEBTBASEQTY("DEBTBASEQTY"),
    
    PERCENTDEBTBASEQTY("PERCENTDEBTBASEQTY"),
    
    DEBTPERCENTQTY("DEBTPERCENTQTY"),
    
    FINEQTY("FINEQTY"),
    
    BASEFEEQTY("BASEFEEQTY"),
    
    PERCENTFEEQTY("PERCENTFEEQTY"),
    
    MONTHLYREWARDQTY("MONTHLYREWARDQTY"),
    
    DOCDUEFINEQTY("DOCDUEFINEQTY"),
    
    PREMFEEQTY("PREMFEEQTY"),
    
    FEELAWQTY("FEELAWQTY"),
    
    DUELAWQTY("DUELAWQTY"),
    
    DEBTNDBASEQTY("DEBTNDBASEQTY"),
    
    DEBTNPERCENTQTY("DEBTNPERCENTQTY"),
    
    POSTAGELAWQTY("POSTAGELAWQTY"),
    
    ADLITEMLAWQTY("ADLITEMLAWQTY"),
    
    VALHOSTAGELAWQTY("VALHOSTAGELAWQTY"),
    
    DEBTNDPERCENTQTY("DEBTNDPERCENTQTY"),
    
    NDBASEQTY("NDBASEQTY"),
    
    NDPERCENTQTY("NDPERCENTQTY"),
    
    NPERCENTQTY("NPERCENTQTY"),
    
    PREMPERCENTQTY("PremPercentQty"),
    
    PERCENTDEBTCREDITQTY("PERCENTDEBTCREDITQTY"),
    
    RESTRUCTFEEQTY("RESTRUCTFEEQTY");

    private String value;

    DebtItemTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DebtItemTypeEnum fromValue(String value) {
      for (DebtItemTypeEnum b : DebtItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("debtItemType")
  private DebtItemTypeEnum debtItemType;

  @JsonProperty("debtQty")
  private BigDecimal debtQty;

  @JsonProperty("debtBalanceOut")
  private BigDecimal debtBalanceOut;

  @JsonProperty("priority")
  private Integer priority;

  public DebtItem debtItemType(DebtItemTypeEnum debtItemType) {
    this.debtItemType = debtItemType;
    return this;
  }

  /**
   * вид задолженности
   * @return debtItemType
  */
  @ApiModelProperty(value = "вид задолженности")


  public DebtItemTypeEnum getDebtItemType() {
    return debtItemType;
  }

  public void setDebtItemType(DebtItemTypeEnum debtItemType) {
    this.debtItemType = debtItemType;
  }

  public DebtItem debtQty(BigDecimal debtQty) {
    this.debtQty = debtQty;
    return this;
  }

  /**
   * сумма по решению суда
   * @return debtQty
  */
  @ApiModelProperty(example = "10000.22", value = "сумма по решению суда")

  @Valid

  public BigDecimal getDebtQty() {
    return debtQty;
  }

  public void setDebtQty(BigDecimal debtQty) {
    this.debtQty = debtQty;
  }

  public DebtItem debtBalanceOut(BigDecimal debtBalanceOut) {
    this.debtBalanceOut = debtBalanceOut;
    return this;
  }

  /**
   * остаток задолженности
   * @return debtBalanceOut
  */
  @ApiModelProperty(example = "10000.22", value = "остаток задолженности")

  @Valid

  public BigDecimal getDebtBalanceOut() {
    return debtBalanceOut;
  }

  public void setDebtBalanceOut(BigDecimal debtBalanceOut) {
    this.debtBalanceOut = debtBalanceOut;
  }

  public DebtItem priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * приоритет погашения, чем меньше, тем раньше
   * @return priority
  */
  @ApiModelProperty(example = "0", value = "приоритет погашения, чем меньше, тем раньше")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtItem debtItem = (DebtItem) o;
    return Objects.equals(this.debtItemType, debtItem.debtItemType) &&
        Objects.equals(this.debtQty, debtItem.debtQty) &&
        Objects.equals(this.debtBalanceOut, debtItem.debtBalanceOut) &&
        Objects.equals(this.priority, debtItem.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtItemType, debtQty, debtBalanceOut, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtItem {\n");
    
    sb.append("    debtItemType: ").append(toIndentedString(debtItemType)).append("\n");
    sb.append("    debtQty: ").append(toIndentedString(debtQty)).append("\n");
    sb.append("    debtBalanceOut: ").append(toIndentedString(debtBalanceOut)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

