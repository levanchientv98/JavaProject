package day6LabOOP.Lab04;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    private Cart cart;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<Order>();
        cart =new Cart();
    }

    public void addToCart(Product product) {
        cart.addProductToCart(product);
    }

    public void removeFromCart(Product product) {
        cart.removeProductToCart(product);
    }

    public void checkout() {
        Order order = new Order();
        for(Product product1 : this.cart.products){
            order.addProduct(product1);
        }
        this.orders.add(order);

//        remove item in cart
        this.cart =new Cart();
//        Check quantity of store

    }
}
