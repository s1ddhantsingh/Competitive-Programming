package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MixingMilk {

	public static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<Pair<K, V>> {
		K k;
		V v;

		public Pair(K k, V v) {
			this.k = k;
			this.v = v;
		}

		@Override
		public String toString() {
			return "(" + k.toString() + ": " + v.toString() + ")";
		}

		@Override
		public int compareTo(Pair<K, V> o) {
			// TODO Auto-generated method stub
			return this.k.compareTo(o.k);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Pair<Integer, Integer>> bts = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine().trim(), " ");
			bts.add(new Pair<>(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		for (int i = 0; i < 100; i++) {
			if (bts.get((i+1)%3).v + bts.get(i%3).v > bts.get((i+1)%3).k) {
				bts.get(i%3).v = bts.get(i%3).v - bts.get((i+1)%3).k + bts.get((i+1)%3).v;
				bts.get((i+1)%3).v = bts.get((i+1)%3).k;
			}
			else {
				bts.get((i+1)%3).v += bts.get(i%3).v;
				bts.get(i%3).v = 0;
			}
			// bts.get(i%3) 		// first
			// bts.get((i+1)%3) 	// next
		}
		
		System.out.println(bts.get(0).v + "\n" + bts.get(1).v + "\n" + bts.get(2).v);
		bf.close();
	}

}
