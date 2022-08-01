package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class oceansAnti11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine().trim());
		while (T-- > 0) {
			System.out.println(fib(Integer.parseInt(bf.readLine().trim()) + 2));
		}
		bf.close();
	}

	static HashMap<Long, Long> memo;
	
	static {
		memo = new HashMap<>();
		memo.put(1L, 1L);
		memo.put(2L, 1L);
	}
	
	static long fib(long n) {
		if (n <= 1)
			return n;
		long a, b;
		a = (memo.containsKey(n - 1)) ? memo.get(n - 1) : fib(n - 1);
		b = (memo.containsKey(n - 2)) ? memo.get(n - 2) : fib(n - 2);
		memo.put(n, a + b);
		return a + b;
	}

}
