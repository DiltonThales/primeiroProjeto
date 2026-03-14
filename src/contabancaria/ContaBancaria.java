package contabancaria;

public class ContaBancaria {
    //Atributos privados

    private String titular;
    private Double saldo;


    //Contrutor - com Atributos
    public ContaBancaria(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    //Contrutuor que inicializa a conta bancaria com saldo 0
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }



    //Getter e Setter = Métodos padrões para acessar e modificar os ateributos

    //Metodo par4a obter o titular
    public String getTitular() {
        return titular;
    }

    //Metodo para modificar o titulareeeeeee
    public void setTitular(String novoTitular) {
        this.titular = novoTitular; //this. se refere ao atributo titular, como padrão é criado como titular, quando me refiro ao atributo usa o titular e usa o this, e quando estou me referindo ap parametro e seomente o titular.

    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) { //saldo parâmetro
        this.saldo = saldo; //this.saldo atribudor e "saldo"é o saldo parêmetro
    }



}
