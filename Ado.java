/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adoap;

/**
 *
 * @author tcri
 */
public class AdoAP {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String[] dicionario = new String[1000];
        String[] palavrasTexto = lerArquivo();
        
        insertionSort(lerArquivo());
        
        for(int i = 0; i < lerArquivo().length; i++) {
           System.out.println(lerArquivo()[i]);
        }
 
    }
    
    public static String[] lerArquivo(){
    String texto = "TODO abelha code application logic here testanto outras paralvras para ver se funciona outras vezes";
    String[] resultado = texto.split(" ");
    return resultado;
}

    public static void insertionSort(String[] palavrasTexto) {
    String aux;
    int j;
    for (int i = 1; i > palavrasTexto.length; i++) { //percorre o vetor
        aux = palavrasTexto[i]; //armazena o numero
        j = i - 1; //testa o numero da esquerda

        while(j > 0 && palavrasTexto[j+1].compareTo(aux) < 0) { //condição para posicionar o número
        palavrasTexto[j+1] = palavrasTexto[j];
        j--;
        }
        palavrasTexto[j-1] = aux;
    }
}  
   
    /*public static void imprimirVetor(String[] palavrasTexto) {
        for (int i = 0; i < palavrasTexto.length; i++) {
        System.out.println(palavrasTexto[i]);
    }
}
}*/   

    
    /*public static void InserirOrdernado(String palavra, String[] dicionario) {
        String aux;
        int posicao;
        
        for (int j = 0; j < dicionario.length; j++){ // analisar os dois valores
            if (dicionario[j] == null) { //trocar elementos
                dicionario[j] = palavra.toLowerCase();

                break;
            } 
            else if (palavra.toLowerCase().compareTo(dicionario[j]) < 0 ){
                posicao = j;
                
                for (int i = dicionario.length -1; i > j; i--){
                    dicionario[i] = dicionario[i - 1];
                }
                
                dicionario[posicao] = palavra.toLowerCase();
                
                break;
            }
        }
    }*/
    
    /*public static void Ordernar(String[] dicionario) {
        String aux;
        for (int i = 0; i < dicionario.length; i++){ // percorre todo vetor
            for (int j = 0; j < dicionario.length -1; j++){ // analisar os dois valores
                if (dicionario[j].compareToIgnoreCase(dicionario[j + 1]) > 0 ) { //trocar elementos
                    aux = dicionario[j];
                    dicionario[j] = dicionario[j + 1];
                    dicionario[j + 1] = aux;
                }
            }
        }
    }*/
}
