package estruturarepeticao;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notasDosAlunos = new HashMap<>();

        notasDosAlunos.put("Alice", 10.5);
        notasDosAlunos.put("Mateus", 8.0);
        notasDosAlunos.put("Maria", 9.9);

        for (String nome : notasDosAlunos.keySet()) {
            double nota = notasDosAlunos.get(nome);
            System.out.println(nome + " : " +  nota);
        }


        double nota = notasDosAlunos.get("Alice");
        System.out.println(" A nota da alice é " + nota);


        for (Map.Entry<String, Double> nota1 : notasDosAlunos.entrySet()){
            String nome = nota1.getKey();
            double valorNota = nota1.getValue();
            System.out.println(nome + " :  " + valorNota);
        }

        int tamanhoDoHash = notasDosAlunos.size();
        notasDosAlunos.remove("Alice");

    }
}
