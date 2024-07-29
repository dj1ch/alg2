import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original interest rate: ");
        double r = scanner.nextDouble();

        double interest = interest(r);
        System.out.println("Monthly interest rate: " + interest);
    }

    /**
     * Calculates monthly interest rate
     * @param r Original interest rate
     * @return Monthly interest rate
     */
    public static double interest(double r) {
       return r / 12;
    }
}
