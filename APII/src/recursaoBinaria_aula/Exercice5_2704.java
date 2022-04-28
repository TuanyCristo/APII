/* Dado um vetor de números inteiros positivos, implemente funções
recursivas para:
a) Fazer a busca linear de um elemento no vetor;
b) Encontrar o menor elemento no vetor;
c) Fazer a soma dos elementos no vetor;
d) Calcular a média aritmética dos elementos no vetor.*/

package recursaoBinaria_aula;

import java.util.Arrays;
import java.util.Random;

public class Exercice5_2704 {


    public static void main(String[] args) {
        int[] vetor = gerarVetor();
        
        //Questão a:
        int busca = buscaLinear(vetor, 12);
        
        if (busca >= 0) {
            System.out.println("\nNumero 12 na posicao: " + busca);
        } else {
            System.out.println("\nNumero 12 nao consta no vetor.");
        }
        
        //Questão b:
        System.out.println("Menor elemento do vetor: " + menorElemento(vetor, vetor.length));
        
        //Questão c:
        System.out.println("Soma dos elementos do vetor: " + somaRecursiva(vetor, 0));
        
        //Questão d:
        System.out.println("Media aritimetica do vetor: " + mediaRecursiva(vetor, 0));
        
        
        
    }

    
    public static int[] gerarVetor() {
        Random random = new Random();
        int[] vetor = new int[10]; // 10 números serão gerados.
        System.out.print("Vetor gerado: ");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(20); // Gera números aleatórios com limite 50.
            System.out.print(vetor[i] + " "); // Saída, são gerados 10 números.
        }
        return vetor;
    }
    
    public static int buscaLinear(int[] v, int x){
        for(int i = 0; i < v.length; i++){
            if (v[i] == x)
                return i; //retorna a posição do vetor.
        }
        return -1;
    }
    
    public static int menorElemento(int[] vetor, int posicao) {
        if (posicao == 1) {
            return vetor[0];
        }
        
        int x = menorElemento(vetor, posicao - 1);
        
        if (x < vetor[posicao - 1]) {
            return x;
        } else {
            return vetor[posicao - 1];
        }
    }

    public static int somaRecursiva(int[] vetor, int posicao) {
        if (posicao == vetor.length) {
            return 0;
        }
        return vetor[posicao] + somaRecursiva(vetor, posicao + 1);
    }
    
        public static float mediaRecursiva(int[] vetor, int posicao) {
        if (posicao == vetor.length) 
            return 0;
        float soma = vetor[posicao] + mediaRecursiva(vetor, posicao + 1);
        if (posicao == 0)
            return soma / vetor.length;
        return soma;
    }
}
