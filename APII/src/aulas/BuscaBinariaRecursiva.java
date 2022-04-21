package aulas;

public class BuscaBinariaRecursiva {

    public static void main(String[] args) {
        int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
        int p = buscaBinaria(21, v, 0, v.length - 1);
        System.out.println("Posição dentro do vetor: " + p);
        System.out.println("Número encontrado na busca: " + v[p]);
    }

    public static int buscaBinaria(int x, int v[], int i, int f) {
        if (i > f)
            return -1;
        int m = (i + f) / 2;
            
        if (v[m] == x)
            return m;
        
        if (x < v[m]) // esquerda
            return buscaBinaria(x, v, i, m - 1);
        
        else //x > v[m] - direita
            return buscaBinaria(x, v, m + 1, f);
        
    }
}
