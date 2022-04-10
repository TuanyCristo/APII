package ado01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ado01 {

    public static void main(String[] args) throws FileNotFoundException {
        String[] dicionario = new String[1000];
        String[] vetorTexto = leEprocessa();

        for (int i = 0; i < vetorTexto.length; i++) {
            String palavra = vetorTexto[i];
            
            if (buscaBinaria(dicionario, palavra) == -1 && !palavra.equals("")) {
                insereOrdenado(dicionario, palavra);
            }

        }
        
        imprimirOrdenado(dicionario);
        System.out.println("total de palavras diferentes no dicionario = " + posicoesPreenchidas(dicionario));
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
    
    public static void insereOrdenado(String[] dicionario, String palavra) {   
        for (int j = 0; j < dicionario.length; j++){ // percorre o vetor
            if (dicionario[j] == null) { // palavra novba encontra posição nula
                dicionario[j] = palavra; // palavra nova é adionada a posição nula
                break;
            } 
            else if (palavra.compareTo(dicionario[j]) < 0 ){ // palavra é menor que a palavra da posição comparada
                for (int i = dicionario.length -1; i >= j && i > 0 ; i--){ // percorre as 1000 posições movimentando os elementos para inserir a palavra nova
                    dicionario[i] = dicionario[i - 1]; 
                }
                dicionario[j] = palavra;
                break;
            }
        }
    }    
     
    public static void imprimirOrdenado(String[] texto) {
        for (int i = 0; i < texto.length; i++) { //percorre o vetor
            if (texto[i] != null) {
                System.out.println(texto[i] + " ");
            }
        }
    }

    public static int buscaBinaria(String[] texto, String palavra) {
        int m;
        int i = 0; //posição inicial
        int f = posicoesPreenchidas(texto) - 1; //posição final
        
        while (i <= f) {
            m = (i + f) / 2;
            
            if (texto[m].equals(palavra)) {
                return m;
            }else if (palavra.compareTo(texto[m]) < 0) { // esquerda
                    f = m - 1;
                }
                else { //direita
                    i = m + 1;
                }
        }
        return -1;
    }
    
    public static int posicoesPreenchidas(String[] texto){
        int posicoes = 0;
        
        for (int i = 0; i < texto.length; i++) {
            if (texto[i] != null) {
                posicoes++;
            }
        }
        
        return posicoes;
    }
}
