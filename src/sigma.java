import java.util.Arrays;

public class sigma {
    public static void main(String[] args) {
        double[] answer = sigma(3, 8, 7, 5, 3);
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
