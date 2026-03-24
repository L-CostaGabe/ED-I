package aula05;

import java.util.Random;

public class ExRandom {
    public static void main(String[] args) {

        new ExRandom();

    }

    public ExRandom() {
        float[] vet = new float[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = geraFloat();
        }
        
    }

    public float geraFloat() { // Gerar um número float aleatório entre 0 e 10
        Random rnd = new Random();
        float numero = rnd.nextFloat();
        return numero * 10;

    }

    public void visualizaVetor(float vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " || ");
        }
        System.out.println();
    }
}
