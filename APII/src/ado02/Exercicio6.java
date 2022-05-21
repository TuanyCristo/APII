/*
6. (2,0) A multiplicação Russa consiste em:
a) Escrever os números A e B, que se deseja multiplicar na parte superior das colunas;
b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, escrever os resultados da coluna A;
c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, escrever os resultados sucessivos na coluna
B;
d) Somar todos os números da coluna B que estejam ao lado de um número ímpar da coluna A.
Exemplo: 27 x 82 = 2214
A B Parcelas
27 82 82
13 164 164
6 328 -
3 656 656
1 1312 1312
Soma: 2214
Criar uma função recursiva que permita fazer à multiplicação russa de 2 entradas.
 */
package ado02;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da entrada A e B, respectivamente: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        
        int contador = divideA(a);
        
        
        System.out.printf("| A = %d | B = %d | Parcelas  |\n", a, b);
        //System.out.println(profundidade(divideA(a)));
        System.out.println("dividiu " + divideA(a) + " vezes");
        System.out.println("dividiu B " + multiplicaB(b, contador) + " vezes");
//        while (a > 0){
//        System.out.println(divideA(a));
//    }
    }
    
    public static void multiplicacaoRussa(int a, int b) {
        divideA(a);
        //multiplicaB(b, );
        int soma;
        if (a % 2 == 0) {
            soma = 0;
        } else{
            soma = a + b;
        }
    }
    
    public static int divideA(int a) {
        System.out.printf("| A = %d |\n", a );
        if (a / 2  == 0) 
            return 1;
        else 
            return divideA(a / 2) + 1;
    }

    public static int multiplicaB(int b, int a) {
        System.out.printf("| B = %d |\n", b );
        int contador = a;
        System.out.println("contador: " + contador);
        while (contador >= multiplicaB(b,a)){
       if (contador == 1){
            return b * 2;
        } else{
            return multiplicaB((b * 2), - 1);
        }
        }
    }
        
    public static int profundidade(int a) {
        if (a < 2) {
            return 0;
        }
        return profundidade(a - 1) + profundidade(a - 2) + 2;
    }
}
