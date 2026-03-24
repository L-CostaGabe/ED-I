package aula03;

import java.util.ArrayList;

public class Sobremesas {
    public static void main(String[] args) {
        ArrayList<String> sobremesas = new ArrayList<>();
        sobremesas.add("Banoff");
        sobremesas.add("Pavê");
        sobremesas.add("Mousse de Maracujá");   
        sobremesas.add("Torta de Limão");

        System.out.println(sobremesas);

        sobremesas.add(0, "Brigadeiro");
        System.out.println(sobremesas);
        System.out.println(sobremesas.get(2));
        sobremesas.set(2, "Mousse de Maracujá");
        System.out.println(sobremesas);
    }
    
}
