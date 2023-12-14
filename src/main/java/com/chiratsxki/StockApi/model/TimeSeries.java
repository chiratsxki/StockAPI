package com.chiratsxki.StockApi.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.Map;

public class TimeSeries {

    private Map<String, StockInfo> stockInfoMap;

    public Map<String, StockInfo> getStockInfoMap() {
        return stockInfoMap;
    }

    @JsonAnySetter
    public void setStockInfo(String key, StockInfo stockInfo) {
        this.stockInfoMap = stockInfoMap;
    }
}
