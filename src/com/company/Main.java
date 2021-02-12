package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Stock test_stock = new Stock("023", 23);

//        test_stock.get_Product_Stock_ID();

        int value;
        String id;

        System.out.println("Enter Your Product Id");
        Scanner product_id = new Scanner(System.in);
        id = product_id.next();


        System.out.println("Enter your value");
        Scanner value_of_product = new Scanner(System.in);
        value = value_of_product.nextInt();

        product_id.close();
        value_of_product.close();

        Product p1 = new Product(id, value);
        p1.getProduct_id();
        p1.getProduct_value();

    }
}
