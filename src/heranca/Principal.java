package heranca;

public class Principal {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro();
        cachorro1.latir();
        cachorro1.beberAgua();
        cachorro1.comer("Ração");
        cachorro1.dormir();


        Galinha galinha1 = new Galinha();
        galinha1.ciscar();
        galinha1.beberAgua();
        galinha1.comer("milho");


    }
}
