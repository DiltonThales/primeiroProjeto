import java.util.Map;
import java.util.TreeMap;

public class EstudoDoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);



        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " +  nota);
        }


        for (Map.Entry<String, Double> nota1 : notasAlunos.entrySet()){
            String nome = nota1.getKey();
            double valorNota = nota1.getValue();
            System.out.println(nome + " :  " + valorNota);
        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Primeira chave: " + notasAlunos.lastKey());


    }
}
