public class mortgage {
    public static void main(String[] args) {
        double mortgage = mortgage(273600, 0.002625, 360);
        System.out.println(mortgage);
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
}
