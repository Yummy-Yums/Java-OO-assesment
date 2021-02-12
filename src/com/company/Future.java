package com.company;

public class Future extends Product implements ProductPricingService{

    int month,year;
    String exchange, ticker;


    Product product;

    public Future(String product_id, int product_value, int month, int year, String exchange){

        super(product_id, product_value);

        this.month    = month;
        this.exchange = exchange;
        this.year     = year;
    }

    double price( String exchange, String ticker){
        return 20.2;
    }

    double price(String exchange, String contractCode, int year, int month){
        return 20.2;
    }
}
