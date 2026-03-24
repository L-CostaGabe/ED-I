package aula01;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        String[] materias = { "portugues", "matematica" };
        String[] alunos = new String[4];
        double notas[][] = new double[4][2];
        int x = 0;
        Scanner leitor = new Scanner(System.in);

        while (x < 4) {
            System.out.println(x + 1 + "º aluno");
            alunos[x] = leitor.nextLine();

            for (int i = 0; i < 2; i++) {
                System.out.println("Nota " + materias[i]);
                notas[x][i] = leitor.nextInt();
            } leitor.nextLine();

            x++;

        }
        for (int i = 0; i < 4; i++) {
            System.out.println("aluno " + (i + 1) + ": " + alunos[i]);
        }

    }
}