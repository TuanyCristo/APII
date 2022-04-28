/*
3) Implemente uma função recursiva para calcular a potência a elevado a n,
supondo que tanto a quanto n sejam números inteiros positivos.
*/

package recursaoBinaria_aula;

import java.util.Scanner;

public class Exercice03_1304 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o valor de a: ");
        int a = leitor.nextInt();

        System.out.println("Escreva o valor de n: ");
        int n = leitor.nextInt();
        
        if (a >= 0 && n > 0)
            System.out.printf("Base: %d \nExpoente: %d \nResultado: %d\n", a, n, potencia(a, n));
        else
            System.out.println("Número inválido");
    }

    public static int potencia(int a, int n) {
            if (n == 0) {
                return 1;
            } else {
                return a * potencia(a, n - 1);
            }
    }
}
