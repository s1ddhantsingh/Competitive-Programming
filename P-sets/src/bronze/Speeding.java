package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Speeding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int N = Integer.parseInt(st.nextToken().trim()), M = Integer.parseInt(st.nextToken().trim());
		int lim[] = new int[100], act[] = new int[100];
		int j = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine().trim());
			int n = Integer.parseInt(st.nextToken().trim());
			int v = Integer.parseInt(st.nextToken().trim());
			int temp = j;
			for (; j < temp + n; j++)
				lim[j] = v;
		}
		j = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine().trim());
			int n = Integer.parseInt(st.nextToken().trim());
			int v = Integer.parseInt(st.nextToken().trim());
			int temp = j;
			for (; j < temp + n; j++)
				act[j] = v;
		}		
		int out = 0;
		for (int i = 0; i < 100; i++) 
			out = Math.max(act[i] - lim[i], out);
		System.out.println(out);
		bf.close();
	}

}
