public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(series[0] + ", " + series[1] + ", ");
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
            System.out.print(series[i] + ", ");
        }
    }
}
