package ado01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ado01 {

    public static void main(String[] args) throws FileNotFoundException {
        String[] vetor = leEprocessa();
        String[] dicionario = new String[1000];
          dicionario = vetor;
        for (i = 0; i < dicionario.length; i++) {
          posicao = dicionario[i];
        }
  
        insertionSort(vetorOrdenado);
        
        buscaBinaria(dicionario, posicao);
        
        imprimirOrdenado(dici7onario);
 
    }

    public static String[] leEprocessa() throws FileNotFoundException {
        File arquivo = new File("dicionario.txt"); //chama arquivo
        Scanner leitor = new Scanner(arquivo); //lê arquivo

        String texto = ""; //atribui valor a variál, sem valor ela da erro o.O

        while (leitor.hasNextLine()) { //percorre o texto
            texto += leitor.nextLine() + " "; //lê todas as linhas
        }

        String[] resultado = texto.split(" "); //quebra o vetor nos espaços
         for (int i = 0; i < resultado.length; i++) { //percorre o vetor
            // retira espaço antes e depois da palavra
            // deixa todas as palavras em minúsculo
            resultado[i] = resultado[i].trim().toLowerCase();
        }
         return resultado;
    } 
    
     public static void insertionSort(String[] texto) {
        for (int i = 1; i < texto.length; i++) { // percorre o vetor
            int j = i; //cria a posição j para comparação
            String aux = texto[j]; // atribui o valor da posição de j a várial auxiliar
           
            while (j > 0 && texto[j-1].compareTo(aux) > 0) { //compara para ornedar
                texto[j] = texto[j-1];
                j--;
            }
            texto[j] = aux;
        }
    }
     
    public static void imprimirOrdenado(String[] texto) {
        for (int i = 0; i < texto.length; i++) { //percorre o vetor
            System.out.println(texto[i] + " ");
        }
    }

    public static int buscaBinaria(String[] texto, String palavra) {
        int i = 0; //posição inicial
        int f = texto.length - 1; //posição final
        int m = (i + f) / 2;
        while (i <= f) {
            if (texto[m].equals(texto[i])) {
                return m;
            }else if (texto[m].compareTo(texto[i]) < 0) { // esquerda
                    f = m - 1;
                }
                else { //direita
                    i = m + 1;
                }
        }
        return -1;
    }
}
