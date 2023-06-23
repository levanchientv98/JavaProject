package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    private final HashMap<String, List<Product>> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void put(Product product) {
        String name = product.getName();
        List<Product> productList = products.getOrDefault(name, new ArrayList<>());
        productList.add(product);
        products.put(name, productList);
    }

    public List<Product> get(String name) {
        return products.getOrDefault(name, new ArrayList<>());
    }

    public boolean remove(String name) {
        return products.remove(name) != null;
    }

    public double totalPriceOf(String name) {
        List<Product> productList = products.getOrDefault(name, new ArrayList<>());
        double totalPrice = 0;

        for (Product product : productList) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public int countTotal(String name) {
        List<Product> productList = products.getOrDefault(name, new ArrayList<>());
        return productList.size();
    }
}
