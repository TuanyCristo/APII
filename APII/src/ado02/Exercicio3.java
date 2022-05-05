/*
 3. (2,0) Temos vários coelhos e cada coelho tem duas orelhas grandes e flexíveis. Queremos calcular o número total
de orelhas em todos os coelhos de forma recursiva (sem loops ou multiplicação). Criar uma função recursiva que
receba um número N representando o número de coelhos e retorne a número total de orelhas.
Exemplos:
orelhasCoelho(0) → 0
orelhasCoelho(1) → 2
orelhasCoelho(2) → 4

 */
package ado02;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Numero de coelhos: ");
        int n = leitor.nextInt(); //pede o numero de coelhos para calcular a quantidade de orelhas
        
        System.out.println(calculaOrelhas(n, 2)); //n = nº de coelhos e 2 a quantidade de orelhas de cada coelho
    }
    
    public static int calculaOrelhas(int n, int m){
        if (n > 0){
            if (n == 1) //caso base
                return m;
            else
                calculaOrelhas(n - 1, m); //recursão para chegar ao caso base
            return m + calculaOrelhas(n - 1, m);
        }
            return 0;
    }
}
