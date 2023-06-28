package day6LabOOP.Lab04;

public class Customer {
    private String name;
    private Order order;

    public Customer(String name) {
        this.name = name;
        order = new Order();
    }

    public void addToCart(Product product) {
        order.addProduct(product);
    }

    public void removeFromCart(Product product) {
        order.removeProduct(product);
    }

    public double checkout() {
        return order.getTotalAmount();
    }
}
