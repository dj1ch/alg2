import java.util.Scanner;

public class downPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cost of mortgage: ");
        double m = scanner.nextDouble();

        System.out.println("Percent down(as a decimal): ");
        double d = scanner.nextDouble();
        scanner.close();

        double downPayment = downPayment(m, d);
        double loan = loan(m, downPayment);
        System.out.println("Down payment: " + downPayment);
        System.out.println("Loan: " + loan);
    }

    /**
     * Calculates down payment
     * @param m Cost of mortgage
     * @param d Percent put down
     * @return total down payment
     */
    public static double downPayment(double m, double d) {
        return m * d;
    }


    public static double loan(double m, double dp) {
        return m - dp;
    }
}
