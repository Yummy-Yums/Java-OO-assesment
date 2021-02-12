package tests;

import com.company.Product;
import com.company.ProductAlreadyRegisteredException;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ProductTest {

    Product test_product;
    ArrayList all_products;

    public void setup_Mockito(){

        test_product = new Product("23", 23);



    }

    @BeforeAll
    public void setupAll(){
        System.out.println("Test has began");
    }

    @Test
    @DisplayName("Should Create a Product")
    public void should_create_a_product(){

        Product test_product = new Product("23", 23);

        Assertions.assertTrue(test_product.getProduct_id().equals("23"));
        Assertions.assertEquals(23,test_product.getProduct_value());

    }

    @Test
    @DisplayName("Should not create a product when product id is null")
    public void should_throw_Runtime_Exception_When_Product_id_Is_Null(){

        Product test_product = new Product(null, 23);
        Assertions.assertThrows(RuntimeException.class, () ->{

            all_products.add(test_product);

        });
    }

    @Test
    @DisplayName("Should not create a product when product id is null")
    public void should_throw_Runtime_Exception_When_Product_Vale_Is_zero(){

        Product test_product = new Product("ohk", 0);
        Assertions.assertThrows(RuntimeException.class, () ->{

            if ( test_product.getProduct_value() == 0) {
                System.out.println("pruduct value is 0");
            }

            all_products.add(test_product);

        });
    }

    @Test
    @DisplayName("Should not create a product when product value is null")
    public void should_throw_Runtime_Exception_When_Product_Value_is_less_than_Zero(){

        Product test_product = new Product("ohk", -1);
        Assertions.assertThrows(RuntimeException.class, () ->{

            if ( test_product.getProduct_value() <= -1 ) {
                System.out.println("pruduct value is 0");
            }

            all_products.add(test_product);

        });
    }


    public void testPrice() {
    }


}