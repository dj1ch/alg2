import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original interest rate: ");
        double r = scanner.nextDouble();

        System.out.println("Number of months: ");
        double n = scanner.nextDouble();
        scanner.close();

        double interest = interest(r, n);
        System.out.println("Monthly interest rate: " + interest);
    }

    /**
     * Calculates monthly interest rate
     * @param r Original interest rate
     * @param n Number of months
     * @return Monthly interest rate
     */
    public static double interest(double r, double n) {
       return r / n;
    }

}
