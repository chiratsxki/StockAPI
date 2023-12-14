package com.chiratsxki.StockApi.controller;

import com.chiratsxki.StockApi.model.StockData;
import com.chiratsxki.StockApi.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Microsoft")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public StockData getStock() {
        return stockService.getStockData();
    }
}
