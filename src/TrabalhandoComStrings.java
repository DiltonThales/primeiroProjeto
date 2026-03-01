public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "dilton";
        String nomeDois = "Thales";

        System.out.println("Olá " + nome);
        int tamanhoString = nome.length();
        boolean saoIgual = nome.equals(nomeDois);
        String juntaNomes = nome.concat(nomeDois);


        System.out.println("Olá " + nome.toUpperCase() + " seu noem tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIgual);
        System.out.println("Nome Completo: " + juntaNomes);
    }
}
