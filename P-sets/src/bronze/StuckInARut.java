package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StuckInARut {
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
	}

	public static class Cow {
		Pair<Integer, Integer> c;
		int v;
		boolean crossable = false;
		
		public Cow(Pair<Integer, Integer> c, int v) {
			this.c = c;
			this.v = v;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		List<Cow> cows = new ArrayList<>();
		List<Integer> moves = new ArrayList<>();

		int N = Integer.parseInt(bf.readLine().trim());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine().trim());
			if (st.nextToken().equals("N"))
				moves.add(1);
			else
				moves.add(2);

			Cow c = new Cow(
					new Pair<>(Integer.parseInt(st.nextToken().trim()), Integer.parseInt(st.nextToken().trim())), 0);
			cows.add(c);
		}
		
		for (int i = 0; i < cows.size(); i++) {
			for (int j = 0; j < cows.size(); j++) {
				if (i == j) continue;
				
			}
		}
		
		bf.close();
	}

}
