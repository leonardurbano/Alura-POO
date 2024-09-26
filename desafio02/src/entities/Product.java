package entities;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Compra realizada!");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + " - R$ " + String.format("%.2f%n", getPrice());
    }
}
