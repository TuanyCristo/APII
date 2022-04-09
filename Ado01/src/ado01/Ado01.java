package ado01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ado01 {

    public static void main(String[] args) throws FileNotFoundException {
       File arquivo = new File("dicionario.txt"); //chama arquivo
        Scanner leitor = new Scanner(arquivo); //lê arquivo

        String texto = "" ; //atribui valor a variál, sem valor ela da erro o.O

        while (leitor.hasNextLine()) { //percorre o texto lendo todas as linhas
            texto += leitor.nextLine() + " "; //
        }
        //texto = texto.toLowerCase();
        String[] vetor = texto.split(" ");

        //imprimir vetor
        for (int i = 0; i < vetor.length; i++) {
            //System.out.println(vetor[i]);
        }
        
        String aux;
        
        for (int i = 1; i > vetor.length; i++) { //percorre o vetor
            for (int j = i-1; j < vetor.length; j--){
                int posicao = j;
                if (vetor[j].compareTo(vetor[j + 1]) > 0) { //trocar elementos  
                    aux = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = aux;
                    //System.out.println(vetor[posicao]);
                }
                System.out.println(vetor[posicao]);
            }
            
        }
        
        String[] vetorOrdeando = new String[1000];
        
        for (int i = 0; i < vetor.length; i++) {
            int posicaoVetor = 0;
            
            if (!ExistePalavra(vetor[i], vetorOrdeando)) {
                // inserir no vetor ordenado
                vetorOrdeando[posicaoVetor] = vetor[i];
                
                posicaoVetor++;
                
            }
        }
        
        ImprimirVetor(vetorOrdeando);
    }
    
    
    public static Boolean ExistePalavra(String palavra, String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == palavra) {
                return true;
            }
        }
                
        return false;
    }
    
    public static void ImprimirVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null)
                System.out.println(vetor[i]);
        }
    }
}
            
//        for (int j = 0; j < vetor.length; j++) { // analisar os dois valores
//            if (vetor[j] == null) { //trocar elementos
//                vetor[j] = texto;
//                //break;
//            } else if (texto.compareTo(vetor[j]) < 0) {
//                posicao = j;
//
//                for (int i = vetor.length - 1; i > j; i--) {
//                    vetor[i] = vetor[i - 1];
//                }
//
//                vetor[posicao] = texto;
                //break;
//            }
//            System.out.println(vetor[j].toLowerCase());
//        }

        
//    public static void leEvetoriza() throws FileNotFoundException {
//        File arquivo = new File("dicionario.txt"); //chama arquivo
//        Scanner leitor = new Scanner(arquivo); //lê arquivo
//
//        String texto = "" ; //atribui valor a variál, sem valor ela da erro o.O
//
//        while (leitor.hasNextLine()) { //percorre o texto lendo todas as linhas
//            texto += leitor.nextLine() + " "; //
//        }
//
//        String[] vetor = texto.split(" ");
//
//        //imprimir vetor
//        for (int i = 0; i < vetor.length; i++) {
//            //System.out.println(vetor[i]);
//        }
//    }
//    
//    public static Integer[] insertionSort(Integer[] txt) {
//        for (int i = 1; i < txt.length; i++) {
//            int a = txt[i];
//            int j;
//            for (j = i - 1; j >= 0 && txt[j].compareTo(a) < 0; j--) {
//                txt[j + 1] = txt[j];
//                txt[j] = a;
//                System.out.println(txt[j]);
//            }
//        }
//        return txt;
//    }
//}
    
