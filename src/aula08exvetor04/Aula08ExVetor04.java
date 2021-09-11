package aula08exvetor04;

public class Aula08ExVetor04 {

    
    public static void main(String[] args) {
    //Crie dois vetores A e B com 10 elementos inteiros. 
    //Crie também um vetor C com 10 elementos inteiros que seja a 
    //subtração/multiplicação/divisão dos elementos em cada posição dos vetores 
    //A e B. Ou seja C[i] = A[i]-B[i]. C[i] = A[i]*B[i]. C[i] = A[i]/B[i]
 

        int[] vetorA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] vetorB = {2, 5, 6, 8, 2, 5, 5, 8, 5, 2};
        int[] vetorC1 = new int[10]; //subtração
        int[] vetorC2 = new int[10]; //multiplicação
        int[] vetorC3 = new int[10]; //divisão

        for (int i=0; i<vetorC1.length; i++) {
           vetorC1[i] = vetorA[i] - vetorB[i];
        }
        
        for (int i=0; i<vetorC2.length; i++) {
           vetorC2[i] = vetorA[i] * vetorB[i];
        }
        
        for (int i=0; i<vetorC3.length; i++) {
           vetorC3[i] = vetorA[i] / vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        
        System.out.println(); // apenas para pular linha
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
        
        System.out.println(); // apenas para pular linha
        
        System.out.print("Vetor C1 = ");
        for (int i=0; i<vetorC1.length; i++) {
           System.out.print(vetorC1[i] + " ");
        }
        System.out.println(); // apenas para pular linha

        System.out.print("Vetor C2 = ");
        for (int i=0; i<vetorC2.length; i++) {
           System.out.print(vetorC2[i] + " ");
        }
        System.out.println(); // apenas para pular linha
        
        System.out.print("Vetor C3 = ");
        for (int i=0; i<vetorC3.length; i++) {
           System.out.print(vetorC3[i] + " ");
        }
        System.out.println(); // apenas para pular linha
        
  
    }
    
}
