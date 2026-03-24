package excecao.naoverificada;

import excecao.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        String verificaCPF = verificarCPF(scanner.nextLine());
        System.out.println(verificaCPF);


    }

    public static String verificarCPF(String cpf){
        try{
        if (cpf.equals("02014685658")){
            throw new ConflictException("CPF já cadastrado" + cpf);
        }else {
            return "CPF válido, usuário cadastro";
        }
    }catch (ConflictException e){
         throw  new ConflictException("CPF já cadastrado " + cpf );
        }
    }
}
