package estruturarepeticao;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add("Feijão");


        listaDeCompras.add(1,"Banana");


        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho:" + item);


        listaDeCompras.remove("Sabão em pó");

        for (String item2 : listaDeCompras) {
            System.out.println(item2);
        }

        Boolean eVazia = listaDeCompras.isEmpty();
        System.out.println(eVazia);

        int tamanho = listaDeCompras.size(); // tamanho da lista
        System.out.println("o tamanho é: " + tamanho);

        boolean contem = listaDeCompras.contains("Arroz"); // se contem arroz
        System.out.println("Cotem? " + contem);

        System.out.println("A lista esta vazia? " + eVazia + ", qual o tamanho da lista? " + tamanho + " alista contem o item Arroz? " + contem);

        //listaDeCompras.clear(); //limpa a lista
        System.out.println("A lista está vazia?" + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto)); // para cada um dos produtos é impremido
    }
}
