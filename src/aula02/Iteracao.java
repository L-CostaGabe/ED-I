public class Iteracao {
    
    static int iteracao = 0;
    public static void main(String[] args) {
        int n = 50;
        System.out.println("O Fibonacci de " + n + " é: " + CalcularFibonacci(n));
    }
    public static int CalcularFibonacci(int n) {
        iteracao++;
        if (n <= 1) {
            return n;
        }
        System.out.println("Calculando Iteração: " + iteracao);
        return CalcularFibonacci(n - 1) + CalcularFibonacci(n - 2);
    }
    
}
