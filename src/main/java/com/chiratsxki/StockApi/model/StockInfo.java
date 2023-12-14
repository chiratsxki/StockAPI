package com.chiratsxki.StockApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockInfo {

    @JsonProperty("1. open")
    private String open;

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }
}
