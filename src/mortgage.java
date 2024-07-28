import java.util.Scanner;

public class mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Monthly loan: ");
        double P = scanner.nextDouble();

        System.out.println("Monthly interest: ");
        double i = scanner.nextDouble();

        System.out.println("Number of months: ");
        double n = scanner.nextDouble();

        System.out.println("Down payment: ");
        double dp = scanner.nextDouble();

        System.out.println("Original mortgage: ");
        double om = scanner.nextDouble();

        // peak variable naming
        double mortgage = mortgage(P, i, n);
        double monthly = monthly(P, i, n);
        double totalCost = totalCost(mortgage, dp);
        double totalInterest = totalInterest(totalCost, om);

        System.out.println("Monthly payment: " + monthly);
        System.out.println("Monthly mortgage/total cost: " + mortgage);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total paid in interest: " + totalInterest);
    }

    /**
     * Calculates mortgage for when you're too lazy to use desmos or something.
     * @param P Monthly loan
     * @param i Rate (per month)
     * @param n Number of months
     * @return (P * i) * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1) full formula ig
     */
    public static double mortgage(double P, double i, double n) {
        double monthly = (P * i) * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1);
        return monthly * n;
    }

    /**
     * Calculates monthly payment
     * @param P Monthly loan
     * @param i Rate (per month)
     * @param n Number of months
     * @return (P * i) * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1) full formula ig
     */
    public static double monthly(double P, double i, double n) {
        return (P * i) * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1);
    }

    /**
     * Calculates total cost of whatever we're calculating
     * @param m Monthly mortgage
     * @param dp Down payment
     * @return Total Cost
     */
    public static double totalCost(double m, double dp) {
        return m + dp;
    }

    /**
     * Calculates total interest given the total cost
     * @param m Monthly mortgage
     * @param om Original mortgage/total mortgage
     * @return Total interest
     */
    public static double totalInterest(double m, double om) {
        return m - om;
    }
}
