package aula03;

public class Vetor {
    public static void main(String[] args) {
        new Vetor();
        System.out.println("Rodou!!");
    }

    public Vetor() {
        double a[] = { 10, 20, 30, 4.3, 3.2, -1, -2 };
        String msg = "Vetor de valores reais";
        visualizarVetor(msg, a);
      //  visualizarVetor(msg, a);
        calcularSomaDosElementos(a);
        calcularSomaDosElementosPositivos(a);


    }
    
    public void calcularSomaDosElementosPositivos(double positivos[]) {
        double soma = 0;
        for (int x = 0; x < positivos.length; x++) {
            if (positivos[x] > 0) {
                soma += positivos[x];
            }
        }
        System.out.println("A soma dos elementos positivos do vetor é: " + soma);
    }

    public void calcularSomaDosElementos(double elementos[]) {
        double soma = 0;
        for (int x = 0; x < elementos.length; x++) {
            soma += elementos[x];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }

   
    public void visualizarVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        mensagem = "abobrinha";
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " || ");
            //vet [i] = vet[1] * 2;
        }
        System.out.println();
        
    

    }

}
