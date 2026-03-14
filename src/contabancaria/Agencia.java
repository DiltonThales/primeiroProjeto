package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Dilton",500.0);

        minhaConta.setTitular("Dilton Thales");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é " + titularConta + " e o saldo final é " + saldoFinal);




        ContaBancaria contaDaMinhaMae = new ContaBancaria("Maria");
        System.out.println("O titular da conta é " + contaDaMinhaMae.getTitular() + " e o saldo final é " + contaDaMinhaMae.getSaldo());

        //Isso que é o encapsulamento, sempre começa os atributos com private e acessa os artibutos através dos métodos que são os get e setter e construtores com atributos ou sem atributos para inicializar o objeto.

    }
}
