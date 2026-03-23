package associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Carro fusca = new Carro(160);
        fusca.mostrarCilidradas();


        Funcionarios joao = new Funcionarios("joão");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios mateus = new Funcionarios("Masteus");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(mateus);


        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncinarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncinarios();

    }
}
