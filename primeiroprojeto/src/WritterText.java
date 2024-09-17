import java.util.Scanner;

public class WritterText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o filme: ");
        String nameMove = sc.nextLine();


        System.out.printf("Seu filme: %s", nameMove);

        sc.close();
    }

}
