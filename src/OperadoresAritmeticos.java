public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;

        double valorTotal = pao + queijo + acucar;
        System.out.println("valor total: " + valorTotal);
        double valorTotalDesconto = valorTotal / 2;
        System.out.println("valor com desconto" + valorTotalDesconto);
    }
}
