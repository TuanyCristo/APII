/*
 1) Construa o Diagrama de Execução para a função mergeSort com a
entrada v[] = {7, 8, 3, 5, 4}.
 */
package ado02;

import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] v = {7, 8, 3, 5, 4};
        int[] auxiliar = new int[v.length]; //vetor auxiliar para armazenar e realocar 
        mergeSort(v, auxiliar, 0, v.length-1); //ordenação
        
        System.out.println(Arrays.toString(v));
        
        }
    
    public static void mergeSort(int[] v, int[] w, int inicio, int fim) {
        if (inicio < fim){
           int  meio = (inicio + fim) / 2;
           mergeSort(v, w, inicio, meio);
           mergeSort(v, w, meio + 1, fim);
           intercala(v, w, inicio, meio, fim);
        }
    }
    
    public static void intercala(int v[], int[] w, int ini, int m, int f) {
        for (int i = ini; i <= f; i++) {
            w[i] = v[i];
        }

        int esquerda = ini;
        int direita = m + 1;

        for (int i = ini; i <= f; i++) {
            if (esquerda > m) {
                v[i] = w[direita++];
            } else if (direita > f) {
                v[i] = w[esquerda++];
            } else if (w[esquerda] < w[direita]) {
                v[i] = w[esquerda++];
            } else {
                v[i] = w[direita++];
            }
        }
    }
}
