package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StaticRangeSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
		int a[] = new int[N];
		st = new StringTokenizer(bf.readLine().trim());
		for (int i = 0; i < N; i++) {
			if (i == 0)
				a[i] = Integer.parseInt(st.nextToken());
			else
				a[i] = a[i - 1] + Integer.parseInt(st.nextToken());
		}
		System.out.println(Arrays.toString(a));
		for (int q = 0; q < Q; q++) {
			st = new StringTokenizer(bf.readLine().trim());
			int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			System.out.println(a[Math.min(e, a.length - 1)] - a[Math.max(0, s - 1)]);
		}
		bf.close();
	}

}
