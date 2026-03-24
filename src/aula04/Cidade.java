package aula04;

import java.util.ArrayList;

public class Cidade {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();
        cidades.add("São Paulo");
        cidades.add("Santos");
        cidades.add("Ribeirão Preto");

        System.out.println(cidades + "\n");

        cidades.add(0, "Campinas");
        System.out.println(cidades + "\n");

        System.out.println(cidades.get(2));
        cidades.set(3, "Mirassol");
        System.out.println(cidades);

        cidades.remove(1);
        System.out.println(cidades);

        System.out.println("Número de cidades: " + cidades.size());

        System.out.println("Lista de cidades com laço FOR:");
        for (int i = 0; i < cidades.size(); i++) {
            System.out.println(cidades.get(i));
        }

        System.out.println("\nLista de cidades com laço FOR EACH:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}