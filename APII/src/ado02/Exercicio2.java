/*
2. (1,0) Criar o diagrama de execução do algoritmo quickSort
para a entrada v[] = {5, 8, 2, 1, 7, 4};
 */
package ado02;

import java.util.Arrays;

public class Exercicio2 {

    public static void main(String[] args) {
        int[] v = {7, 8, 3, 5, 4};
        quickSort(v, 0, v.length - 1); //ordenação

        System.out.println(Arrays.toString(v));

    }
    
    public static void quickSort(int[] v, int inicio, int fim) {
        if (fim > inicio){
           int pivo = dividir(v, inicio, fim);
           quickSort(v, inicio, pivo - 1);
           quickSort(v, pivo + 1, fim);
        }
    }
 
    public static int dividir(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
