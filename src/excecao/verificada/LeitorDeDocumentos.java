package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeDocumentos {
    public static void main(String[] args) {

        // Corrigir identação Ctl + alt +  L

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\dilto\\Desktop\\JavaNauta\\repositorios\\Texto.txt"));

            //Ler linha por linha
            String linha;

            while ((linha = bufferedReader.readLine()) != null ){
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
