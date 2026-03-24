package abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das orquideas", "Santa Rita", "32", "MG", "37540-000","joão paulo", "vendedor");
        Cliente joana = new Cliente("D","Rio de janeiro","RJ","3754000","joana","8455");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
