package aulas;

public class Fibonacci2004 {

    public static void main(String[] args) {
        int num = 300;
        for (int i = 0; i <= num; i++) {
            System.out.println(fib(i) + " ");
        }
        System.out.println(profundidade(num));
    }
    
    public static int fib(int n) {
        if (n < 2){
        return n;
        }
         return fib(n - 1) + fib(n - 2);
    } 
    
    public static int profundidade(int n) {
        if (n < 2){
        return 0;
        }
         return profundidade(n - 1) + profundidade(n - 2) + 2;
    } 
}
