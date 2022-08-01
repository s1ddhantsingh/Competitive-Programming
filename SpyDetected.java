
import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int t = 0; t < T; t++) {
            int Q = in.nextInt();
            in.nextLine();

            int i = 1, past = in.nextInt();
            boolean incremementedEnd = false;
            for (int q = 0; q < Q - 1; q++) {
                int c = in.nextInt();
                if (past != c) {
                    incremementedEnd = true;
                    i = q + 1;
                }
                past = c;
                // if (!stopIncrementing)
                // i++;
            }
            if (!incremementedEnd)
                i = Q;
            System.out.println(i + ", " + incremementedEnd);
            in.nextLine();
        }
        in.close();
    }
}
