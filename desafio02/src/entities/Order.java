package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Order {
    List<Product> itemProduct = new ArrayList<>();

    public void setItemProduct(List<Product> itemProduct) {
        this.itemProduct = itemProduct;
    }

    public void extractOrder(){
        System.out.println("****************************");
        System.out.println("**** COMPRAS REALIZADAS ****");
        itemProduct.sort(Comparator.comparing(Product::getPrice));
        itemProduct.forEach(System.out::print);
        System.out.println("****************************");
    }
}
