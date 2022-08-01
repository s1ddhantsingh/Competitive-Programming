package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class ShellGame {

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

//		Pair<Integer, String> p = new Pair<>(5, "abcde");
//		Pair<Integer, String> p2 = new Pair<>(5, "bcdea");
//		Pair<Integer, String> p3 = new Pair<>(10, "cdeab");
//		Pair<Integer, String> p4 = new Pair<>(-42, "deabc");
//		Pair<String, String> p5 = new Pair<>("test", "eabcd");
//		Pair<String, String> p6 = new Pair<>("tesu", "eabcd");
//
//		System.out.println(p.compareTo(p2));
//		System.out.println(p.compareTo(p3));
//		System.out.println(p.compareTo(p4));
//		System.out.println(p5.compareTo(p6));

//		List<Pair<Integer, String>> l = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			l.add(new Pair<>(10-i, ""+i));
//		}
//		System.out.println(l.toString());
//		
//		Collections.sort(l);
//		
//		System.out.println("-".repeat(10) + "\n" + l.toString());

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine().trim());
		String in[] = new String[T];
		int i = 0;
		while (T-- > 0) {
			in[i++] = bf.readLine().trim().replaceAll("\\s", "");
//			StringTokenizer st = new StringTokenizer(bf.readLine().trim(), " ");
//			Iterator<Object> it = st.asIterator();
//			while (it.hasNext())
//				in[i++] = (it.next().toString().trim());
		}
		// starting config, in[], out=> int
		System.out.println(Math.max(solve("100", in), Math.max(solve("010", in), solve("001", in))));
		bf.close();

	}

	public static int solve(String start, String in[]) {
		int r = 0;
		for (int i = 0; i < in.length; i++) {
			int a = Integer.parseInt("" + in[i].charAt(0)) - 1;
			int b = Integer.parseInt("" + in[i].charAt(1)) - 1;
			int g = Integer.parseInt("" + in[i].charAt(2)) - 1;
			String tf = "";
			String temp = "";
			for (int j = 0; j < start.length(); j++) {
				if (j == a && a < b) {
					temp = "" + start.charAt(a);
					tf += "" + start.charAt(b);
				} else if (j == a && a > b) {
					tf += temp;
				} else if (j == b && b < a) {
					temp = "" + start.charAt(b);
					tf += "" + start.charAt(a);
				} else if (j == b && b > a) {
					tf += temp;
				} else
					tf += "" + start.charAt(j);
			}
			start = tf;
			if (start.charAt(g) == '1')
				r++;
		}
		return r;
	}

}
