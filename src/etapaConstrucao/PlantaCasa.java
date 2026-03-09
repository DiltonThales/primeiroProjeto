package etapaConstrucao;

public class PlantaCasa {

    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    public void contruir(){
        System.out.println("A casa foi contruída, as características são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void  alteracaoCaracteristicas(int metros, int quartos, int banheiro, String mat) {
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        contruir();
    }

    public void mudarCorDaParede(String novaCor){
        cor = novaCor;
        pintar();
    }




    public static void main(String[] args) {

        PlantaCasa casa = new PlantaCasa();

        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //chamada da função (meétodo) da ordem;
        casa.contruir();

        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println(resultado);


        casa.mudarCorDaParede("branco");

        casa.alteracaoCaracteristicas(100,2,2,"Madeira");

    }

}
