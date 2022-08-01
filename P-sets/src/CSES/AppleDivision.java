package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AppleDivision {

	static long max = Long.MAX_VALUE;
	static long total = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		int v[] = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		for (int i = 0; i < N; i++) {
			v[i] = Integer.parseInt(st.nextToken().trim());
			total += v[i];
		}

		search(v, 0, N, 0);
		System.out.println(max);
	}

	public static void search(int v[], int i, int N, long sum) {
		if (i == N) {
			max = Math.min(max, Math.abs((total - sum) - sum));
		} else {
			search(v, i + 1, N, sum);
			sum += v[i];
			search(v, i + 1, N, sum);
			sum -= v[i];
		}
	}
}
//		int v[] = new int[N], pre[] = new int[N];
//		int total = 0;
//		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
//		for (int i = 0; i < N; i++) {
//			v[i] = Integer.parseInt(st.nextToken());
//			total += v[i];
//			if (i == 0)
//				pre[i] = v[i];
//			else
//				pre[i] = v[i-1] + v[i];
//		}
//		Arrays.sort(v);
//		for (int i = 0; i < N; i++) {
//			if (i == 0)
//				pre[i] = v[i];
//			else
//				pre[i] = v[i-1] + v[i];
//		}
//		int out = total;
//		for (int i = 0; i < N; i++) {
//			out = Math.min(out, total - pre[i]);
//		}
//		System.out.println(out);
//		bf.close();
//	}

//}
