package aula05;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numeros = { 5, 2, 9, 1, 5 };

        System.out.println("Antes da ordenação: ");
        visualizaVetor(numeros);

        bubbleSort(numeros);
        System.out.println("Depois da ordenação: ");
        visualizaVetor(numeros);
    
    }

    public static void bubbleSort(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
            System.out.println("iteração: " + i + " : " + j);
                if (numeros[j] > numeros[j + 1]) {

                    int temp = numeros[j];  
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
                visualizaVetor(numeros);
            }
        }
    }

    public static void visualizaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " || ");
        }
        System.out.println();
    }

}
