package aula05;

import java.util.Scanner;

public class ExAula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lista = new String[20];
        int count = 0;

        System.out.print("Digite o nome do item para comprar: ");
        String item = sc.nextLine();

        boolean existe = false;

        for (int i = 0; i < count; i++) {
            if (lista[i].equalsIgnoreCase(item)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Item já está na lista. Rejeitado.");
        } else {
            if (count < lista.length) {
                lista[count] = item;
                count++;
                System.out.println("Item adicionado à lista.");
            } else {
                System.out.println("Lista cheia. Não é possível adicionar mais itens.");
            }
        }
    }
}