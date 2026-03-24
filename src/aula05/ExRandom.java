package aula05;

public class ExRandom {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100) + 1;
        System.out.println("Número aleatório entre 1 e 100: " + numero);
    }
}
