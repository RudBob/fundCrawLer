package com.jxnu.fundCrawler.business.model;

/**
 * Created by coder on 2016/7/2.
 */
public class FundNetWorth {
    private String fundCode;
    private String time;
    private Float netWorth;

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Float getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Float netWorth) {
        this.netWorth = netWorth;
    }
}
