package day6LabOOP.Lab04;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> productList;
    private double totalAmount;

    public Order() {
        productList = new ArrayList<>();
        totalAmount = 0;
    }

    public void addProduct(Product product){
        productList.add(product);
        totalAmount += product.getPrice();
    }

    public void removeProduct(Product product){
        productList.remove(product);
        totalAmount -= product.getPrice();
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void printOrder(){
        System.out.println("SuperMarket Bill");
        for (Product product : productList){
            System.out.println("Product name: " +product.getName() + "\t; Price: $"+product.getPrice());
        }
    }


}
