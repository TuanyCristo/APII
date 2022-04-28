/*
4) Implemente uma função recursiva que receba como parâmetro um
número natural e apresente o seu correspondente binário.
 */
package recursaoBinaria_aula;

import java.util.Scanner;

public class Exercice04_1304 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número natural: ");
        int num = leitor.nextInt();

        System.out.println(calculaBinario(num));
        calculaBinarioProfessor(num);
    }
    
    public static void calculaBinarioProfessor(int n){
        if (n < 2) {
            System.out.print(n);
        } else {
            calculaBinarioProfessor ( n / 2);
            calculaBinarioProfessor ( n % 2);
        } 
    }

    public static String calculaBinario(int n){
        String valorAgora = "0";  
        
        if (n == 1) {
            return "1";
        }
        
        if ((n % 2) != 0){
            valorAgora = "1";
        }
        
        return calculaBinario(n / 2) + valorAgora;
    }

    public static int result(int n) {
        if (n == 1) {
            return 2;
        } 
        else {
            return 2 * result(n - 1);
        }
    }

    public static int recursao(int n) {
        if (n <= 10) {
            return n * 2;
        } else {
            return recursao(recursao(n / 3));
        }
    }
}
