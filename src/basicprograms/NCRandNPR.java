import java.util.Scanner;

public class NCRandNPR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n and r
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter value of r: ");
        int r = scanner.nextInt();

        // Check if r is greater than n
        if (r > n) {
            System.out.println("Invalid input: r should not be greater than n.");
        } else {
            // Calculate factorial of n, r and (n - r)
            int fact_n = 1;
            int fact_r = 1;
            int fact_n_r = 1;

            for (int i = 1; i <= n; i++) {
                fact_n *= i;
                if (i == r) {
                    fact_r = fact_n; // we already calculated i!
                }
                if (i == (n - r)) {
                    fact_n_r = fact_n;
                }
            }

            // Calculate nCr and nPr
            int nCr = fact_n / (fact_r * fact_n_r);
            int nPr = fact_n / fact_n_r;

            // Output results
            System.out.println("nCr = " + nCr);
            System.out.println("nPr = " + nPr);
        }

        scanner.close();
    }
}
