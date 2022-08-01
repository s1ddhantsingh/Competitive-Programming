package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SpringBoards {

	static class C {
		int x;
		int y;

		public C(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			C c = (C) o;
			return x == c.x && y == c.y;
		}

		@Override
		public int hashCode() {
			return ("" + x + "" + y).hashCode();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken());
		/*
		 * Want to reach N, N Spring board points (x1, y1) -> (x2, y2)
		 */
		HashMap<C, C> spring = new HashMap<>();
		for (int i = 0; i < P; i++) {
			st = new StringTokenizer(bf.readLine());
			C start = new C(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			C end = new C(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			spring.put(start, end);
		}
		int out = Search(spring, 0, 0, N, 0);
		System.out.println(out);
		bf.close();
	}

	public static int Search(HashMap<C, C> spring, int x, int y, int N, int count) {
		if (x == N && y == N)
			return count;
		else if (x > N || y > N)
			return Integer.MAX_VALUE;
		else {
			int dx = x + 1;
			int dy = y + 1;
			C dcx = new C(dx, y), dcy = new C(x, dy);
			int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE, d = Integer.MAX_VALUE;
			if (spring.containsKey(dcx))
				a = Math.min(a, Search(spring, spring.get(dcx).x, spring.get(dcx).y, N, count + 1));
			if (spring.containsKey(dcy))
				b = Math.min(b, Search(spring, spring.get(dcy).x, spring.get(dcy).y, N, count + 1));
			c = Math.min(c, Search(spring, dx, y, N, count + 1));
			d = Math.min(d, Search(spring, x, dy, N, count + 1));
			return Math.min(a, Math.min(b, Math.min(c, d)));
		}
	}
}
