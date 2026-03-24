public class TSPComPoda {

    static int N = 4;
    static int[][] distancias = new int[N][N];
    static int menorCusto = Integer.MAX_VALUE;
    static long  rotasTestadas = 0;

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                distancias[i][j] = (i == j) ? 0 : (int) (Math.random() * 100) + 1;
            }
        }
        boolean[] visitado = new boolean[N];
        visitado[0] = true;
    }

}
