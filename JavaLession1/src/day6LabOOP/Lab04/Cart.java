package day6LabOOP.Lab04;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public ArrayList<Product> products = new ArrayList<>();

    public Cart() {

    }
    public void addProductToCart(Product product){
        this.products.add(product);
    }

    public void removeProductToCart(Product product){
        this.products.remove(product);
    }

}
