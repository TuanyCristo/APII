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

        String[] vetor = texto.split(" ");

        //imprimir vetor
        for (int i = 0; i < vetor.length; i++) {
            //System.out.println(vetor[i]);
        }

        for (int i = 1; i < vetor.length; i++) {
            String aux = vetor[i];
            int j;
            for (j = i - 1; j >= 0 && vetor[j].compareTo(aux) < 0; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = aux;
                System.out.println(vetor[j]);
            }
        }
    }
        
        
    public static void leEvetoriza() throws FileNotFoundException {
        File arquivo = new File("dicionario.txt"); //chama arquivo
        Scanner leitor = new Scanner(arquivo); //lê arquivo

        String texto = "" ; //atribui valor a variál, sem valor ela da erro o.O

        while (leitor.hasNextLine()) { //percorre o texto lendo todas as linhas
            texto += leitor.nextLine() + " "; //
        }

        String[] vetor = texto.split(" ");

        //imprimir vetor
        for (int i = 0; i < vetor.length; i++) {
            //System.out.println(vetor[i]);
        }
    }
    
    public static Integer[] insertionSort(Integer[] txt) {
        for (int i = 1; i < txt.length; i++) {
            int a = txt[i];
            int j;
            for (j = i - 1; j >= 0 && txt[j].compareTo(a) < 0; j--) {
                txt[j + 1] = txt[j];
                txt[j] = a;
                System.out.println(txt[j]);
            }
        }
        return txt;
    }
}
