package recursaoBinaria_aula;

/*
7) Escreva uma função recursiva que calcula o produto de a*b, em que a e b
são inteiros maiores que zero. considere que o produto pode ser definido
como a somado a si mesmo b vezes, usando uma definição recursiva
temos:
a*b = a se b = 1
a*b = a * (b – 1) + a se b > 1
package aulas;
 */

public class Exercice7_2704 {

    public static void main(String[] args) {
        System.out.println(produto(3,7));
    }
    
    public static int produto(int a, int b) {
        if (b == 1)
            return a;
        return produto(a, b-1) + a;
    }
}
