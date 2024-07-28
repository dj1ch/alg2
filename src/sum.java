import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First term(a_1)(no fractions!): ");
        double a = scanner.nextDouble();

        System.out.println("Ratio of series(no fractions!): ");
        double r = scanner.nextDouble();

        System.out.println("Number of terms(n): ");
        int n = scanner.nextInt();
        scanner.close();

        double answer = sum(a, r, n);
        System.out.println(answer);
    }

    /**
     * Uses the formula S_n = a(1-r^n)/(1-r)
     * Only applies to a geometric series
     * @param a number to use as a_1/first number
     * @param r ratio to use in series
     * @param n number of terms to generate
     * @return full answer
     */
    public static double sum(double a, double r, double n) {
        return a * (1 - Math.pow(r, n)) / (1 - r);
    }
}
