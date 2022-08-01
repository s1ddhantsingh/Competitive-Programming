package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularBarn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		int cows = 0;
		int n[] = new int[N];
		for (int i = 0; i < N; i++) {
			n[i] = Integer.parseInt(bf.readLine().trim());
			cows += n[i];
		}

		int m = Integer.MAX_VALUE;
		for (int k = 0; k < N; k++) {
			int c = cows, v = 0;
			for (int i = 0; i < N; i++) {
				c -= n[(i + k) % N];
				if (c != 0)
					v += c;
			}
			m = Math.min(m, v);
		}
		
		System.out.println(m);
		
		bf.close();
	}

}
