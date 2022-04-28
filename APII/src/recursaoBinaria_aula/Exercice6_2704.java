/*
 6 - A função abaixo calcula o máximo divisor comum dos inteiros positivos m
 e n. Escreva uma função recursiva.
 public static int mdc(int m, int n) {
    int r;
        do {
        r = m % n;
        m = n;
        n = r;
        } while(r != 0);
            return m;
 }
 */
package recursaoBinaria_aula;

public class Exercice6_2704 {

    public static void main(String[] args) {
        System.out.println(mdc(12, 9));
    }
    
    public static int mdc(int m, int n) {
        if (n == 0)
        return m;
        return mdc(n, m % n);
    }
}
