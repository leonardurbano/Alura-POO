package application;

import entities.Credit;
import entities.Order;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Credit credit;
        Order order = new Order();
        List<Product> lista = new ArrayList<>();

        System.out.print("Digite o limite do cartão: R$ ");
        credit = new Credit(sc.nextDouble());

        int continua = 1;

        while (continua == 1){
            sc.nextLine();
            System.out.print("Digite o produto da compra: ");
            String name = sc.nextLine();

            System.out.print("Digite o valor R$ ");
            double productValue = sc.nextDouble();

            if (credit.debitValue(productValue)){
                lista.add(new Product(name, productValue));
                order.setItemProduct(lista);
                System.out.println("Digite \"0\" para sair ou \"1\" para continuar");
                continua = sc.nextInt();
            }else {
                System.out.println("Compra não pode ser realizada.");
                continua = 0;
            }
        }

        order.extractOrder();
        credit.extractValue();

        sc.close();
    }
}
