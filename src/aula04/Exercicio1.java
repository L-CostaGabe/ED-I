package aula04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade;
        System.out.println("Quantos números deseja digitar? ");
        quantidade = scanner.nextInt();
        double[] numeros = new double[quantidade];
        double numero;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextDouble();
            if (i == 0) {
                numeros[i] = numero;
            } else {
                while (numero < numeros[i - 1]) {
                    System.out.println("Número inválido! Digite um valor maior ou igual ao anterior.");
                    System.out.println("Digite novamente: ");
                    numero = scanner.nextDouble();
                }
                numeros[i] = numero;
            }
        }

    }
}