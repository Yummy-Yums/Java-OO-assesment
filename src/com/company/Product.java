package com.company;

public class Product {

    private String product_id;
    private int product_value;

    public Product(String product_id, int product_value){

        this.product_id    = product_id;
        this.product_value = product_value;

    }

    public String getProduct_id(){
       return product_id;
    }
    public int getProduct_value() {
        return product_value;
    }

    void setProduct_id(Product product_id){
        generateUniqueId(product_id);
    }

//    void setProduct_value(Product product_value){
//
//    }

    private String generateUniqueId(Product product) {
        return String.format("%s-%s", product.getProduct_id(), product.getProduct_value());
    }


}
