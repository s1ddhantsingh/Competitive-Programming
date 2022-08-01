import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PolycarpWritesAStringFromMemory {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            HashSet<Character> map = new HashSet<>();
            for (int i = 0; i < s.length(); i++)
                map.add(s.charAt(i));
            System.out.println((map.size() % 3 + map.size() / 3));
        }
        sc.close();
    }
}