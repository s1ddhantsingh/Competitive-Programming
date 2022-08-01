import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        while ((T--) > 0) {
            String word = sc.nextLine().trim();
            if (word.length() > 10)
                word = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
            System.out.println(word);
        }
        sc.close();
    }
}
