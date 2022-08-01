package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CowGymnastics {

	public static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<Pair<K, V>> {
		K k;
		V v;

		public Pair(K k, V v) {
			this.k = k;
			this.v = v;
		}

		@Override
		public int compareTo(Pair<K, V> o) {
			// TODO Auto-generated method stub
			return this.compareTo(o);
		}

		@Override
		public String toString() {
			return "(" + k.toString() + ", " + v.toString() + ")";
		}
		
		@Override
		public int hashCode() {
			return (k.toString()+v.toString()).hashCode();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public boolean equals(Object o) {
			Pair<K, V> other = (Pair<K, V>) o;
			return (this.k.equals(other.k) && this.v.equals(other.v));
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashSet<Pair<Integer, Integer>> set = new HashSet<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		boolean first = true;
		while (K-- > 0) {
			st = new StringTokenizer(bf.readLine().trim());
			int order[] = new int[N];
			for (int i = 0; i < N; i++)
				order[i] = Integer.parseInt(st.nextToken());
			if (first) {
				for (int i = 0; i < N; i++)
					for (int j = i + 1; j < N; j++)
						set.add(new Pair<>(order[i], order[j]));
				first = false;
			} else {
				HashSet<Pair<Integer, Integer>> c = new HashSet<>(), t = new HashSet<>();
				for (int i = 0; i < N; i++)
					for (int j = i + 1; j < N; j++)
						c.add(new Pair<>(order[i], order[j]));

				for (Pair<Integer, Integer> p : c) {
					if (set.contains(p))
						t.add(p);
				}
				set = t;
			}
//			System.out.println(set.toString());
		}
		System.out.println(set.size());

	}
	// K--;
////		int size = N * (N - 1) / 2;
//		for (int i = 0; i < N - 1; i++) {
//			for (int j = i; j < N - 1; j++) {
//				if (i == j)
//					continue;
//				set.add(new Pair<>(order[i], order[j]));
//			}
//		}
//
//		for (; K > 0; K--) {
//			st = new StringTokenizer(bf.readLine().trim());
//			order = new int[N];
//			HashSet<Pair<Integer, Integer>> next = new HashSet<>(), temp = new HashSet<>();
//			for (int i = 0; i < N; i++)
//				order[i] = Integer.parseInt(st.nextToken());
//			for (int i = 0; i < N - 1; i++) {
//				for (int j = 0; j < N - 1; j++) {
//					if (i == j)
//						continue;
//					next.add(new Pair<>(order[i], order[j]));
//				}
//			}
//			for (Pair<Integer, Integer> p : next)
//				if (set.contains(p))
//					temp.add(p);
//
//			System.out.println(set + "\n" + next + "\n" + temp + "\n");
//			set = temp;
//		}
//
//		System.out.println(set.size());
//		bf.close();
	// }

}
