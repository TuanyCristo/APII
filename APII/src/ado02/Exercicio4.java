/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado02;

import java.util.Scanner;
import java.io.File;

public class Exercicio4 {

    public static void main(String[] args) throws Exception {

        int quantidade = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        System.out.print("Caractere: ");
        char c = teclado.next().charAt(0);

        quantidade += contaCaracter(frase, c);

        System.out.printf("Quantidade de %c = %d\n", c, quantidade);
    }

    public static int contaCaracter(String s, char c) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cont++;
            }
        }
        return cont;
    }
}
