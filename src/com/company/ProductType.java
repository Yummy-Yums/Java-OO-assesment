package com.company;

public class ProductType <T> {

    private T product_id;
    private T product_value;

    T getProduct_id(){
        return product_id;
    }

    T getProduct_value(){
        return product_value;
    }

    void setX(T x){
//        this.x = x;
    }
}
