package CodeforcesContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Virus {

	static class Pair {
		int k;
		int v;

		public Pair(int k, int v) {
			this.k = k;
			this.v = v;
		}

		@Override
		public String toString() {
			return String.format("(%s, %s)", k, v);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine().trim());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine().trim());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			boolean v[] = new boolean[n];
			st = new StringTokenizer(bf.readLine().trim());
			for (int i = 0; i < m; i++) {
				int index = Integer.parseInt(st.nextToken()) - 1;
				v[index] = true; // infected
			}
			List<Pair> list = new ArrayList<>();
			/*
			 * Sort list by size descending (big to small) Create a multiplier that changes
			 * each time If the multiplier is greater than the list element then we add the
			 * size of all remaining elements...
			 */
			System.out.println(Arrays.toString(v));
			int start = 0;
			for (int i = 0; i < n; i++) {
				if (v[i]) {
					if (i != 0 && start < i && start < n)
						list.add(new Pair(start, i - 1));
					start = i + 1;
				}
				if (i == n - 1 && !v[i])
					list.add(new Pair(start, i));
			}
			if (list.get(list.size() - 1).v == v.length - 1 && list.get(0).k == 0) {
				start = list.get(list.size() - 1).k;
				list.remove(list.size() - 1);
				list.get(0).k = start;
			}
//			System.out.println(list.toString());
			list.sort((a, b) -> (compare(list.size(), a, b)) ? 1 : -1);
//			System.out.println(list.toString());
			while (true) {
				
			}
		}
		bf.close();
	}
	public static boolean compare(int n, Pair a, Pair b) {
		int as = 0, bs = 0;
		if (a.k > a.v) {
			as = n - a.k + a.v;
		} else {
			as = a.v - a.k;
		}
		
		if (b.k > b.v) {
			bs = n - b.k + b.v;
		} else {
			bs = b.v - b.k;
		}
		
		return as > bs;
	}
}
