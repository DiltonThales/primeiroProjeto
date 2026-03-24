package logicasequencial;

import java.util.Scanner;

public class EntraSaidaDedados {
    public static void main(String[] args) {
        System.out.println("Olá eu faço a impressão e pulo alinha");
        System.out.print("Olá eu faça a impressão e não puslo a lina  ");
        System.out.printf("Olá eu faço a impressão formatada" + "\n" );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Então seu nome é " + nome);


        System.out.println("Digite sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Então sua idade é: " + idade);


        System.out.println("Digite se você está empreado(true) ou não(false): ");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá sou " + nome + " tenho " + idade + " e estou empregado " + empregado);

    }
}
