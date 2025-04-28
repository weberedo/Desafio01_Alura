/*
        Inicializar dados do cliente
        Menu de opções
        Visualização do saldo
        Enviar valor
        Receber valor

*/

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        String tipoDeConta = "Corrente";
        double saldo = 2500;
        String nome = "Jaqueline Oliveira";


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");


        String menu = """
                
                Digite a opção desejada:
                
                1. Consultar saldo
                2. Receber valor
                3. Transferir valor
                4. Sair   
                
                """;
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Saldo atual: R$ " + saldo);
        } else if (opcao == 2) {
            System.out.println("Digite o valor a ser recebido: ");
            double valorRecebido = scanner.nextDouble();
            saldo = saldo + valorRecebido;
            System.out.println("Saldo atualizado: R$ " + saldo);
        } else if (opcao == 3) {
            System.out.println("Digite o valor a ser transferido: ");
            double valorTransferido = scanner.nextDouble();
            saldo = saldo - valorTransferido;
            System.out.println("Saldo atualizado: R$ " + saldo);
        } else {
            System.out.println("Operação cancelada");
            System.exit(0);
        }
    }
}
