package com.chiratsxki.StockApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class StockData {

    @JsonProperty("Time Series (1min)")
    private Map<String, StockInfo> timeSeries;

    public Map<String, StockInfo> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, StockInfo> timeSeries) {
        this.timeSeries = timeSeries;
    }

}
