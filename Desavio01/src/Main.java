import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double valor;
        boolean opcao = true;
        int escolha;

        System.out.printf("""
                ******************************************
                 Dados iniciais do cliente:
                 Nome...........: %s
                 Tipo conta.....: %s
                 Saldo inicial..: R$ %.2f
                ******************************************%n
                """, nome, tipoConta, saldo);

        while (opcao){
            System.out.println("""
                    ##########################################
                    ## Operações
                    1 - Consultar saldo;
                    2 - Receber valor (R$);
                    3 - Transferir valor (R$); ou
                    4 - Sair
                    ##########################################""");
            System.out.print("Digite a opção desejada: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    continue;
                case 2:
                    System.out.print("Digite o valor a ser depositado (R$): ");
                    valor = sc.nextDouble();
                    if(valor < 0){
                        System.out.println("Por favor informe um valor positivo");
                    }else{
                        saldo += valor;
                    }
                    System.out.printf("Saldo atual R$ %.2f%n", saldo);
                    continue;
                case 3:
                    System.out.print("Digite o valor a ser transferido (R$): ");
                    valor = sc.nextDouble();
                    if(valor > saldo){
                        System.out.println("Saldo insuficiente para transferência.");
                    }else{
                        saldo -= valor;
                    }
                    System.out.printf("Saldo atual R$ %.2f%n", saldo);
                    continue;
                case 4:
                    System.out.println("Programa será finalizado...");
                    opcao = false;
                    continue;
                default:
                    System.out.println("Opção inválda, tente novamente");
            }
        }
        sc.close();
    }
}
