package etapaConstrucao;

public class Casa {
    public static void main(String[] args) {

        //Criando o objeto
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variaveis) (caracteristicas) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //chamada da função (meétodo) da ordem;
        casa.contruir();
        
        casa.pintar();



   }
}
