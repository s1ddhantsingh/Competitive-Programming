package bronze;

import java.util.Scanner;

public class LifeGuards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int sums[] = new int[1000];
		int total = 0;
		int pairs[][] = new int[N][2];
		for (int n = 0; n < N; n++) {
			pairs[n][0] = sc.nextInt();
			pairs[n][1] = sc.nextInt();
			sc.nextLine();
			for (int i = pairs[n][0]; i < pairs[n][1]; i++) {
				sums[i]++;
			}
		}
		for (int n = 0; n < 1000; n++)
			if (sums[n] >= 1)
				total++;
		int minoff = Integer.MAX_VALUE, temp = 0;
		for (int n = 0; n < N; n++) {
			for (int i = pairs[n][0]; i < pairs[n][1]; i++) {
				if (sums[i] - 1 <= 0)
					temp++;
			}
			minoff = Math.min(minoff, temp);
			temp = 0;
		}
		System.out.println(total - minoff);
		sc.close();
	}

}
