import java.util.Scanner;

public class sigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting index(k): ");
        double k = scanner.nextDouble();

        System.out.println("Number of terms(n): ");
        int n = scanner.nextInt();

        System.out.println("First term(a_1)(no fractions!): ");
        double a = scanner.nextDouble();

        System.out.println("Ratio of series(no fractions!): ");
        double r = scanner.nextDouble();

        System.out.println("What is the index(k) being subtracted by?: ");
        int x = scanner.nextInt();
        scanner.close();

        double[] answer = sigma(k, n, a, r, x);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    /**
     * Takes starting index(k), ending(n), a, and ratio(r),
     * then determines the next n terms in the series
     * @param k starting index
     * @param n number of terms to generate
     * @param a starting number
     * @param r ratio
     * @param x in case k is not being subtracted by 1
     * @return the full answer
     */
    public static double[] sigma(double k, int n, double a, double r, int x) {
        double[] answer = new double[n];
        for (int i = 0; i < n; i++) {
            answer[i] = a * Math.pow(r, (k + i) - x);
        }
        return answer;
    }
}
