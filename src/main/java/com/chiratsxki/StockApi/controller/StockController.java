package com.chiratsxki.StockApi.controller;

import com.chiratsxki.StockApi.model.StockData;
import com.chiratsxki.StockApi.service.StockService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{companySymbol}")
    public StockData getStock(@PathVariable String companySymbol) {
        return stockService.getStockData(companySymbol);
    }

    @GetMapping("/{companySymbol}/global")
    public String getCurrentStockPrice(@PathVariable String companySymbol) {
        return stockService.getGlobalStockPrice(companySymbol);
    }

}
