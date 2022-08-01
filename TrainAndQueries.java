import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TrainAndQueries {
    static class Pair {
        int min, max;

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) throws IOException {
        // List<String> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 0; t < T; t++) {
            sc.nextLine();
            int stations, queries;
            stations = sc.nextInt();
            queries = sc.nextInt();
            sc.nextLine();
            // int route[] = new int[stations];
            HashMap<Integer, Pair> route = new HashMap<>();
            for (int i = 0; i < stations; i++) {
                int station = sc.nextInt();
                if (route.containsKey(station)) {
                    Pair p = route.get(station);
                    p.min = Math.min(p.min, i);
                    p.max = Math.max(p.max, i);
                    route.put(station, p);
                }
                // if (route.get(station) == null)
                else
                    route.put(station, new Pair(i, i));
            }
            sc.nextLine();
            for (int i = 0; i < queries; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                sc.nextLine();

                if (!route.containsKey(start) || !route.containsKey(end) || route.get(start).min > route.get(end).max)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
        sc.close();
        // for (int i = 0; i < ans.size(); i++)
        // System.out.println(ans.get(i));
    }
}
