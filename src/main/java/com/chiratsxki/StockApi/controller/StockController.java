package com.chiratsxki.StockApi.controller;

import com.chiratsxki.StockApi.model.StockData;
import com.chiratsxki.StockApi.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Microsoft")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{companySymbol}")
    public StockData getStock(@PathVariable String companySymbol) {
        return stockService.getStockData(companySymbol);
    }
}
