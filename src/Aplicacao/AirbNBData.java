package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class AirbNBData {

    private String filename;
    public AirbNBData(String filename) {
        this.filename = filename;
    }

    public int[] getAll(int arraySize) {
        int[] data = readFromFile(arraySize);
        return data;
    }

    private int[] readFromFile(int arraySize) {
        int[] aux = new int[arraySize];
        try (BufferedReader buffer_entrada = new BufferedReader(new FileReader(filename))) {
            String idSTR;
            int i = 0;
            while (i < arraySize) {
                idSTR = buffer_entrada.readLine();
                try {
                    String[] arrayEntrada = idSTR.split("\t");

                    aux[i] = Integer.parseInt(arrayEntrada[0].replace(" ", ""));
                } catch (Exception e) {
                    System.out.println(e);
                }
                i++;
            }
            return aux;
        } catch (Exception e) {
            System.out.println("Erro na abertura do Arquivo! \n Verifique o nome do arquivo e tente novamente.");
        }
        return null;
    }
}
