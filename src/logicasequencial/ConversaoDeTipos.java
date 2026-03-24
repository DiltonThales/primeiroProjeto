package logicasequencial;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Long numeroLong = 10L;
        String numeroStringLong = numeroLong.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);


        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroString);
        System.out.println(numeroConvertido);
    }
}
