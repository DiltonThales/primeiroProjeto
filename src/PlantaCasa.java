public class PlantaCasa {

    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void contruir(){
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar(){
        System.out.println("Cor " + cor);
    }


}
