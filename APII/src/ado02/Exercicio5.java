/*
5. (2,0) Temos triângulos feito de blocos. A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, a
próxima linha tem 3 blocos e assim por diante. Criar uma função recursiva que calcule (sem loops ou multiplicação)
o número total de blocos em um triângulo com o número especificado de linhas.
Exemplos:
triangulo(0) → 0
triangulo(1) → 1
triangulo(2) → 3
 */
package ado02;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
               Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o múnero de linhas: ");
        int n = leitor.nextInt(); //pede o numero de linhas para calcular a quantidade de blocos
        
        System.out.println(calculaBlocos(n)); //n = nº de linhas
    }
    
    public static int calculaBlocos(int n){
        if (n > 0){
            if (n == 1) //caso base
                return n;
            else
            return n + calculaBlocos(n - 1); //recursão para chegar ao caso base
        }
            return 0;
    }
}
    
