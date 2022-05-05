/*
 1) Construa o Diagrama de Execução para a função mergeSort com a
entrada v[] = {7, 8, 3, 5, 4}.
 */
package ado02;

import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] v = {5, 8, 2, 1, 7, 4};
        int[] ordenado = new int[v.length];
        mergeSort(v, ordenado, 0, v.length-1);
        
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
    
    public static void intercala(int a[], int[] b, int ini, int m, int f) {
        for (int i = ini; i <= f; i++) {
            b[i] = a[i];
        }

        int esquerda = ini;
        int direita = m + 1;

        for (int i = ini; i <= f; i++) {
            if (esquerda > m) {
                a[i] = b[direita++];
            } else if (direita > f) {
                a[i] = b[esquerda++];
            } else if (b[esquerda] < b[direita]) {
                a[i] = b[esquerda++];
            } else {
                a[i] = b[direita++];
            }
        }
    }
}
