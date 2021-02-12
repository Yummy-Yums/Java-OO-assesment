package com.company;

import org.mockito.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stock extends Product {

    String exchange, stock_ticker;

    public Stock(String product_id, int product_value, String stock_ticker, String exchange ) {
        super(product_id, product_value);

        this.exchange     = exchange;
        this.stock_ticker = stock_ticker;
    }

    void get_Product_Stock_ID(){
        System.out.println(getProduct_id());
    }





}
