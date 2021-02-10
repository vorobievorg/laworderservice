package org.vorobiev.lawOrder.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Договор, который является предметов решения суда
 */
@ApiModel(description = "Договор, который является предметов решения суда")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")

@Entity
@Table(name = "deal")
public class Deal  {

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;

  @Column(name="dealid")
  @JsonProperty("dealId")
  private UUID dealId;

  @Column(name="number")
  @JsonProperty("number")
  private String number;

  @Column(name="date")
  @JsonProperty("date")
  private Date date;

  /**
   * Валюта договора
   */
  public enum FundEnum {
    _810("810"),
    
    _840("840"),
    
    _978("978"),
    
    _756("756"),
    
    _826("826");

    private String value;

    FundEnum(String value) {
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
    public static FundEnum fromValue(String value) {
      for (FundEnum b : FundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @Enumerated(EnumType.STRING)
  @Column(name="fund")
  @JsonProperty("fund")
  private FundEnum fund = FundEnum._810;

  /**
   * Валюта по решению суда
   */
  public enum LawOrderFundEnum {
    _810("810"),
    
    _840("840"),
    
    _978("978"),
    
    _756("756"),
    
    _826("826");

    private String value;

    LawOrderFundEnum(String value) {
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
    public static LawOrderFundEnum fromValue(String value) {
      for (LawOrderFundEnum b : LawOrderFundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Enumerated(EnumType.STRING)
  @Column(name="laworderfund")
  @JsonProperty("lawOrderFund")
  private LawOrderFundEnum lawOrderFund = LawOrderFundEnum._810;

  @Column(name="laworderfundrate")
  @JsonProperty("lawOrderFundRate")
  private float lawOrderFundRate;

  @JsonProperty("lawOrderCreditRate")
  @Column(name="lawordercreditrate")
  private float lawOrderCreditRate;

  @JsonProperty("lawOrderFeeRate")
  @Column(name="laworderfeerate")
  private float lawOrderFeeRate;

  /**
   * Тип стваки пени
   */
  public enum LawOrderFeeRateTypeEnum {
    year("Год"),
    
    day("День");

    private String value;

    LawOrderFeeRateTypeEnum(String value) {
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
    public static LawOrderFeeRateTypeEnum fromValue(String value) {
      for (LawOrderFeeRateTypeEnum b : LawOrderFeeRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Enumerated(EnumType.STRING)
  @JsonProperty("lawOrderFeeRateType")
  @Column(name = "laworderfeeratetype")
  private LawOrderFeeRateTypeEnum lawOrderFeeRateType = LawOrderFeeRateTypeEnum.day;

  @JsonProperty("dealDebtItems")
  @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
  @JoinColumn(name = "deal_id")
  private List<DealDebtItem> dealDebtItems = null;

  public Deal dealId(UUID dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * идентификатор
   * @return dealId
  */

  public UUID getDealId() {
    return dealId;
  }

  public void setDealId(UUID dealId) {
    this.dealId = dealId;
  }


  /**
   * номер договора
   * @return numebr
  */
  @ApiModelProperty(example = "0000-КУ/00", value = "номер договора")



  public Deal date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * дата договора
   * @return date
  */
  @ApiModelProperty(example = "Tue Jan 01 00:00:00 UTC 2019", value = "дата договора")


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Deal fund(FundEnum fund) {
    this.fund = fund;
    return this;
  }

  /**
   * Валюта договора
   * @return fund
  */
  @ApiModelProperty(example = "810", value = "Валюта договора")


  public FundEnum getFund() {
    return fund;
  }

  public void setFund(FundEnum fund) {
    this.fund = fund;
  }

  public Deal lawOrderFund(LawOrderFundEnum lawOrderFund) {
    this.lawOrderFund = lawOrderFund;
    return this;
  }

  /**
   * Валюта по решению суда
   * @return lawOrderFund
  */
  @ApiModelProperty(example = "810", value = "Валюта по решению суда")


  public LawOrderFundEnum getLawOrderFund() {
    return lawOrderFund;
  }

  public void setLawOrderFund(LawOrderFundEnum lawOrderFund) {
    this.lawOrderFund = lawOrderFund;
  }

  public Deal lawOrderFundRate(float lawOrderFundRate) {
    this.lawOrderFundRate = lawOrderFundRate;
    return this;
  }

  /**
   * Курс установленный по решению суда
   * @return lawOrderFundRate
  */
  @ApiModelProperty(example = "70.77", value = "Курс установленный по решению суда")



  public float getLawOrderFundRate() {
    return lawOrderFundRate;
  }

  public void setLawOrderFundRate(float lawOrderFundRate) {
    this.lawOrderFundRate = lawOrderFundRate;
  }

  public Deal lawOrderCreditRate(float lawOrderCreditRate) {
    this.lawOrderCreditRate = lawOrderCreditRate;
    return this;
  }

  /**
   * Процентная ставка по решению суда в %
   * @return lawOrderCreditRate
  */
  @ApiModelProperty(example = "10.5", value = "Процентная ставка по решению суда в %")


  public float getLawOrderCreditRate() {
    return lawOrderCreditRate;
  }

  public void setLawOrderCreditRate(float lawOrderCreditRate) {
    this.lawOrderCreditRate = lawOrderCreditRate;
  }

  public Deal lawOrderFeeRate(float lawOrderFeeRate) {
    this.lawOrderFeeRate = lawOrderFeeRate;
    return this;
  }

  /**
   * Ставка по пеням по решению суда
   * @return lawOrderFeeRate
  */
  @ApiModelProperty(example = "0.2", value = "Ставка по пеням по решению суда")


  public float getLawOrderFeeRate() {
    return lawOrderFeeRate;
  }

  public void setLawOrderFeeRate(float lawOrderFeeRate) {
    this.lawOrderFeeRate = lawOrderFeeRate;
  }

  public Deal lawOrderFeeRateType(LawOrderFeeRateTypeEnum lawOrderFeeRateType) {
    this.lawOrderFeeRateType = lawOrderFeeRateType;
    return this;
  }

  /**
   * Тип стваки пени
   * @return lawOrderFeeRateType
  */
  @ApiModelProperty(example = "День", value = "Тип стваки пени")


  public LawOrderFeeRateTypeEnum getLawOrderFeeRateType() {
    return lawOrderFeeRateType;
  }

  public void setLawOrderFeeRateType(LawOrderFeeRateTypeEnum lawOrderFeeRateType) {
    this.lawOrderFeeRateType = lawOrderFeeRateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deal deal = (Deal) o;
    return Objects.equals(this.dealId, deal.dealId) &&
        Objects.equals(this.number, deal.number) &&
        Objects.equals(this.date, deal.date) &&
        Objects.equals(this.fund, deal.fund) &&
        Objects.equals(this.lawOrderFund, deal.lawOrderFund) &&
        Objects.equals(this.lawOrderFundRate, deal.lawOrderFundRate) &&
        Objects.equals(this.lawOrderCreditRate, deal.lawOrderCreditRate) &&
        Objects.equals(this.lawOrderFeeRate, deal.lawOrderFeeRate) &&
        Objects.equals(this.lawOrderFeeRateType, deal.lawOrderFeeRateType) &&
        Objects.equals(this.dealDebtItems, deal.dealDebtItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, number, date, fund, lawOrderFund, lawOrderFundRate, lawOrderCreditRate, lawOrderFeeRate, lawOrderFeeRateType, dealDebtItems);
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

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public List<DealDebtItem> getDealDebtItems() {
    return dealDebtItems;
  }

  public void setDealDebtItems(List<DealDebtItem> dealDebtItems) {
    this.dealDebtItems = dealDebtItems;
  }

  public Deal() {
  }

  public Deal(UUID dealId, String number, Date date, FundEnum fund, LawOrderFundEnum lawOrderFund, float lawOrderFundRate, float lawOrderCreditRate, float lawOrderFeeRate, LawOrderFeeRateTypeEnum lawOrderFeeRateType, List<DealDebtItem> dealDebtItems) {
    this.dealId = dealId;
    this.number = number;
    this.date = date;
    this.fund = fund;
    this.lawOrderFund = lawOrderFund;
    this.lawOrderFundRate = lawOrderFundRate;
    this.lawOrderCreditRate = lawOrderCreditRate;
    this.lawOrderFeeRate = lawOrderFeeRate;
    this.lawOrderFeeRateType = lawOrderFeeRateType;
    this.dealDebtItems = dealDebtItems;
  }
}

