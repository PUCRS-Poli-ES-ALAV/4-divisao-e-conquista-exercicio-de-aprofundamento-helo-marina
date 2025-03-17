package br.pucrs;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        int[] a = {1,5,8,2,7,3};
        int[] b = mergeSort(a);
        for (int i = 0; i < a.length; i++){
        System.out.println(b[i]);}

        
    }

    //  Vamos começar com um algorítmo já estudado e conhecido (em AEDI). O Merge Sort é um algorítmo de ordenação baseado nos seguintes passos:

    //  recursivamente ordene a metade esquerda do vetor
    //  recursivamente ordene a metade direita do vetor
    //  mescle (faça o merge) das duas metades para ter o vetor ordenado.
    //  Assim:
    
    //  implemente o algortimo abaixo;
    //  teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048 e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto;
    //  MERGE-SORT(L: List with n elements) : Ordered list with n elements
    //      IF (list L has one element)
    //          RETURN L.x
    //      Divide the list into two halves A and B.
    //      A ← MERGE-SORT(A).
    //      B ← MERGE-SORT(B).
    //      L ← MERGE(A, B).
    //      RETURN L. 
    public static int[] mergeSort(int[] vet){
        if (vet.length == 1){
            return vet;
        }
        int meio = vet.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[vet.length - meio];
        
        for (int i = 0; i < meio; i++){
            esquerda[i] = vet[i];
        }
        for (int j = 0; j < vet.length - meio; j++){
            direita[j] = vet[meio + j];
        }
        esquerda = mergeSort(esquerda);
        direita = mergeSort(direita);
        
        return merge(esquerda, direita);
    }
    private static int[] merge(int[] a, int[] b){
        int[] resultado = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                resultado[k++] = a[i++];
            } else {
                resultado[k++] = b[j++];
            }
        }
        
        while (i < a.length) {
            resultado[k++] = a[i++];
        }
        
        while (j < b.length) {
            resultado[k++] = b[j++];
        }
        
        return resultado;    }
    
        // O algoritmo a seguir (que não utiliza divisão-e-conquista) encontra o maior valor em um vetor.

        // Assim, novamente:
        
        // implemente o algortimo abaixo;
        // teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048 e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto;
    
        long maxVal1(long A[], int n) {  
        long max = A[0];
        for (int i = 1; i < n; i++) {  
            if( A[i] > max ) 
                max = A[i];
        }
        return max;
    }

}
