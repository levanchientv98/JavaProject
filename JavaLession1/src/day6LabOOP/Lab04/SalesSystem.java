package day6LabOOP.Lab04;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesSystem {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);
        Product product3 = new Product("Product 3", 20.0);

        products.add(product1);
        products.add(product2);
        products.add(product3);

//        Danh sách sản phẩm
        System.out.println("Danh sách sản phẩm: ");
        for (Product pr : products) {
            System.out.println(pr);
        }

        // Tạo khách hàng
        Customer customer = new Customer("John");

        // Thêm sản phẩm vào giỏ hàng
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Xóa sản phẩm khỏi giỏ hàng
        customer.removeFromCart(product2);

//        In hóa đơn
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        order.printOrder();

        // Tính tổng số tiền
        System.out.println("Tổng số tiền phải trả:");
        System.out.println("Total amount: $" + order.getTotalAmount());
    }
}
