import java.util.Scanner;

public class fullMortgage {

    /**
     * Uses interest, mortgage, down payment, etc to determine the costs.
     * @param args Java default stuff ig
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original interest rate: ");
        double r = scanner.nextDouble();
        double i = r / 12;

        System.out.println("Cost of mortgage: ");
        double m = scanner.nextDouble();

        System.out.println("Percent down(as a decimal): ");
        double d = scanner.nextDouble();

        double downPayment = m * d;
        double P = m - downPayment;

        System.out.println("Number of months: ");
        double n = scanner.nextDouble();
        scanner.close();

        double monthly = (P * i) * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1);
        double monthlyMortgage = monthly * n;
        double total = monthlyMortgage + downPayment;
        double interestPaid = total - m;

        System.out.println("Monthly payment: " + monthly);
        System.out.println("Total paid: " + total);
        System.out.println("Total interest paid: " + interestPaid);
    }
}
