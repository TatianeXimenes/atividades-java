
import java.util.Arrays;

public class Jacobi {
    public static void main(String[] args) {
        questaoA();
        questaoB();
        questaoC();
    }
    public static void questaoA() {
        double[][] A = {{3, 1, 1}, {1, -1, 1}, {3, 1, 2}};
        double[] b = {3, 1, 9};
        double[] x0 = {0, 0, 0};
        int maxIteracoes = 100;
        double tolerancia = 1e-6;
        boolean converge = verificaConvergenciaJacobi(A, b, x0, maxIteracoes, tolerancia);
        if (converge) {
            System.out.println("O sistema converge para a solução.");
        } else {
            System.out.println("O sistema não converge para a solução.");
        }
    }
    public static void questaoB() {
        double[][] A = {{5, 1, 1}, {3, 4, 1}, {3, 1, 2}};
        double[] b = {5, 1, 9};
        double[] x0 = {0, 0, 0};
        int maxIteracoes = 100;
        double tolerancia = 1e-6;
        boolean converge = verificaConvergenciaJacobi(A, b, x0, maxIteracoes, tolerancia);
        if (converge) {
            System.out.println("O sistema converge para a solução.");
        } else {
            System.out.println("O sistema não converge para a solução.");
        }
    }
    public static void questaoC() {
        double[][] A = {{4, 1, 2}, {1, 4, 2}, {2, 1, 4}};
        double[] b = {1, 1, 1};
        double[] x0 = {0, 2, 0};
        int maxIteracoes = 100;
        double tolerancia = 1e-6;
        boolean converge = verificaConvergenciaJacobi(A, b, x0, maxIteracoes, tolerancia);
        if (converge) {
            System.out.println("O sistema converge para a solução.");
        } else {
            System.out.println("O sistema não converge para a solução.");
        }
    }

    public static boolean verificaConvergenciaJacobi(double[][] A, double[] b, double[] x0, int maxIteracoes, double tolerancia) {
        int n = A.length;
        double[] x = Arrays.copyOf(x0, n);

        for (int iteracao = 1; iteracao <= maxIteracoes; iteracao++) {
            double[] novoX = new double[n];
            for (int i = 0; i < n; i++) {
                double soma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        soma += A[i][j] * x[j];
                    }
                }
                novoX[i] = (b[i] - soma) / A[i][i];
            }
            double[] residuo = new double[n];
            for (int i = 0; i < n; i++) {
                double soma = 0.0;
                for (int j = 0; j < n; j++) {
                    soma += A[i][j] * novoX[j];
                }
                residuo[i] = b[i] - soma;
            }
            double precisao = normaEuclidiana(residuo);
            if (precisao < tolerancia) {
                return true;
            }

            x = Arrays.copyOf(novoX, n);
        }
        return false;
    }

    public static double normaEuclidiana(double[] vetor) {
        double somaQuadrados = 0.0;
        for (double valor : vetor) {
            somaQuadrados += valor * valor;
        }
        return Math.sqrt(somaQuadrados);
    }
}
