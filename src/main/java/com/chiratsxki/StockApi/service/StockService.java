package com.chiratsxki.StockApi.service;

import com.chiratsxki.StockApi.model.StockData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    private static final Logger log = LoggerFactory.getLogger(StockService.class);

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

    public String getGlobalStockPrice(String companySymbol) {

        String apiUrl = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" +
                companySymbol + "&apikey=" + apiKey;


        String jsonResponse = restTemplate.getForObject(apiUrl, String.class);

        // Return the JSON response
        return jsonResponse;
    }

}
