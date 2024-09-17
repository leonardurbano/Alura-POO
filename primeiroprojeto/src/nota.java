import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int index = 0;
        int contador = 0;
        double media = 0.0;

        System.out.println("Digite as notas ou -1 para finalizar");

        while(sc.nextInt() >= 0){
            nota += sc.nextInt();
            index++;
            if(sc.nextInt() < 0){
                media = (double) nota / index;
            }
        }

        System.out.println("Media: " + media);


        sc.close();
    }
}
