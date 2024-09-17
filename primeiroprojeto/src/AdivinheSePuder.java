import java.util.Random;
import java.util.Scanner;

public class AdivinheSePuder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sorteado = new Random().nextInt(100);
        int numero;

        System.out.println("Digite um número de 0 à 100");
        System.out.println("Você tem #05 tentativas");
        for (int i = 1; i < 6; i++) {
            System.out.printf("#0%d - Tentativa: ", i);
            numero = sc.nextInt();
            if (sorteado == numero) {
                System.out.println("Você acertou!! O número sorteado: " + numero);
                break;
            }else if(sorteado > numero){
                System.out.println("Você ErRou!! O nùmero deve ser maior.");
            }else {
                System.out.println("Você ErRou!! O nùmero deve ser menor.");
            }
            if (i == 5){
                System.out.println("Numero de tentativas excedidas...");
                System.out.printf("Número sorteado foi: %d%n", sorteado);
            }
        }







        sc.close();
    }
}
