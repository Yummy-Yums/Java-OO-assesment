package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;


public class ProductManager implements MontrealTradedProducts {

    LocalTime time_now;

    ArrayList<Product> productList = new ArrayList<Product>();


    public void addNewProduct (Product product) throws ProductAlreadyRegisteredException{

        for (Product checked_product: productList) {
            if (checked_product = productList[i]){
                throw new ProductAlreadyRegisteredException("product already exist");
            }

        }
        productList.add(product);

    }

    int  totalTradeQuantityForDay(Product product, int quantity){
        for (Product products_traded: productList) {
// Check whether the day being checked is today, wrong implementation must be fixed
             if(time_now = time_now + 24 || time_now = time_now - 24){
                System.out.println("Please chcek the day ");
             }
             int total_traded = products_traded.getProduct_value();
             int total_trade = 0;

             total_trade=+ total_traded;

             return total_trade;

        }

    }

    double totalValueOfDaysofTradedProducts(){


    }

    public ArrayList<Product> getAllProducts(){

        productList.size();


    }


}
