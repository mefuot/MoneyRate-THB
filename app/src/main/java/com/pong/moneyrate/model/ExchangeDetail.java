package com.pong.moneyrate.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by User on 27/7/2560.
 */

@Parcel(Parcel.Serialization.BEAN)
public class ExchangeDetail {

    /**
     * period : 2017-07-26
     * currency_id : USD
     * currency_name_th : สหรัฐอเมริกา : ดอลลาร์ (USD)
     * currency_name_eng : USA : DOLLAR (USD)
     * buying_sight : 33.2589000
     * buying_transfer : 33.3400000
     * selling : 33.6586000
     * mid_rate : 33.4993000
     */

    private String period;
    @SerializedName("currency_id")
    private String currencyId;
    @SerializedName("currency_name_th")
    private String currencyNameTh;
    @SerializedName("currency_name_eng")
    private String currencyNameEng;
    @SerializedName("buying_sight")
    private String buyingSight;
    @SerializedName("buying_transfer")
    private String buyingTransfer;
    private String selling;
    @SerializedName("mid_rate")
    private String midRate;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyNameTh() {
        return currencyNameTh;
    }

    public void setCurrencyNameTh(String currencyNameTh) {
        this.currencyNameTh = currencyNameTh;
    }

    public String getCurrencyNameEng() {
        return currencyNameEng;
    }

    public void setCurrencyNameEng(String currencyNameEng) {
        this.currencyNameEng = currencyNameEng;
    }

    public String getBuyingSight() {
        return buyingSight;
    }

    public void setBuyingSight(String buyingSight) {
        this.buyingSight = buyingSight;
    }

    public String getBuyingTransfer() {
        return buyingTransfer;
    }

    public void setBuyingTransfer(String buyingTransfer) {
        this.buyingTransfer = buyingTransfer;
    }

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public String getMidRate() {
        return midRate;
    }

    public void setMidRate(String midRate) {
        this.midRate = midRate;
    }
}
