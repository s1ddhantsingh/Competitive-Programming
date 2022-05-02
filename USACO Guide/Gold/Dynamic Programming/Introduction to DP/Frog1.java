// import java.util.Scanner;

public class Frog1 {
    public static void main(String[] args) {
        System.out.println(solve(4, new int[] { 10, 30, 40, 20 }));
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int[] dp = new int[N]; // heights
        // for (int i = 0; i < N; i++)
        // dp[i] = sc.nextInt();

        // sc.close();
    }

    public static int solve(int i, int[] dp) {
        if (i == dp.length)
            return 0;
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        if (i + 1 <= dp.length)
            a = Math.abs(dp[i + 1] - dp[i]) + solve(i + 1, dp);
        if (i + 2 <= dp.length)
            b = Math.abs(dp[i + 2] - dp[i]) + solve(i + 2, dp);

        return Math.min(a, b);
    }
}