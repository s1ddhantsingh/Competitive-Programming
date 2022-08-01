import java.util.*;
import java.io.*;

public class RoundDownThePrice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            int val = sc.nextInt();
            int valLen = ("" + val).length() - 1;
            sc.nextLine();
            int removed = (int) (val - Math.pow((double) 10, (double) valLen));
            System.out.println(removed);
        }
        sc.close();
    }
}