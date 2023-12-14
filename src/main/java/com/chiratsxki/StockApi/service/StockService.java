package com.chiratsxki.StockApi.service;

import com.chiratsxki.StockApi.model.StockData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    @Value("${alphaVantage.apiKey}")
    private String apiKey;

    private final RestTemplate restTemplate;


    public StockService(RestTemplateBuilder restTemplate) {
        this.restTemplate = restTemplate.build();
    }

    public StockData getStockData(String companySymbol) {
        String apiUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + companySymbol + "&interval=1min&apikey=" + apiKey;
        return restTemplate.getForObject(apiUrl, StockData.class);
    }
}
