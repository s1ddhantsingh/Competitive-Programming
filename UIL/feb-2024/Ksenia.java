import java.util.*;

public class Ksenia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        for (int t = 0; t < T; t++) {
            Scanner in = new Scanner(sc.nextLine().trim());
            Scanner in2 = new Scanner(sc.nextLine().trim());
            int a = in.nextInt(), b = in.nextInt();
            in.close();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++)
                arr[i] = in2.nextInt();
            in2.close();
            for (int k = 0; k <= b; k++) {
                int index = 0;
                for (int i = 0; i < a - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        index = i;
                        break;
                    }
                }
                int bb = index + 1;
                while (bb < arr.length && arr[index] > arr[bb]) {
                    int temp = arr[index];
                    arr[index] = arr[bb];
                    arr[bb] = temp;
                    bb += 1;
                    index = bb - 1;
                }
            }

            System.out.print("Test case " + (t + 1) + " pass " + b + ": ");
            for (int i = 0; i < a; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
