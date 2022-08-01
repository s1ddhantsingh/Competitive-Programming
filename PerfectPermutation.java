
// import java.util.Arrays;
import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(sc.nextLine().trim());
            if (n == 1) {
                System.out.println(1);
            } else {
                int N[] = new int[n];
                for (int i = 1; i <= n; i++)
                    N[i - 1] = i;
                int minPermutations = n;// Integer.MAX_VALUE;
                int calc = n;
                int ret[] = new int[n];
                for (int i = 0; i < n - 1;) {
                    // = calc(N);
                    if (calc < minPermutations) {
                        ret = N;
                        minPermutations = calc;
                    } else {
                        int temp = N[i];
                        N[i] = N[i + 1];
                        if (N[i] % (i + 1) != 0)
                            calc--;
                        N[i + 1] = temp;
                        if (N[i + 1] % (i + 2) != 0)
                            calc--;
                        i++;
                    }
                }
                print(ret);
            }
        }
        sc.close();
    }

    static int calc(int N[]) {
        int ret = 0;
        for (int i = 1; i < N.length; i++)
            if (N[i - 1] % i == 0)
                ret++;
        return ret;
    }

    static void print(int ret[]) {
        for (int i : ret)
            System.out.print(i + " ");
        System.out.println();
    }
}
