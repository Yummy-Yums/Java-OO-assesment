package com.company;



public class Product_Register {

    String product_id;
    int value;

    public Product_Register(String product_id, int value){

        this.product_id = product_id;
        this.value      = value;

    }

    void register_Product( Product product){

//       String product = product.getProduct_id();



    }

    String type_of_Exchange(){

        String[] exchanges = {"LSE","NYSE", "GSE"};

        return exchanges[2];


    }


}
