public class sum {
    public static void main(String[] args) {
        double answer = sum(7, 5, 5);
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
