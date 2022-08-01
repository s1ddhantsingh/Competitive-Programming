package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowGymnasticsSimplified {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		int count[][] = new int[N][N];
		for (int k = 0; k < K; k++) {
			int options[] = new int[N];
			st = new StringTokenizer(bf.readLine().trim());	
			for (int i = 0; i < N; i++) 
				options[i] = Integer.parseInt(st.nextToken())-1;
			for (int i = 0; i < N; i++) {
				for (int j = i; j < N; j++) {
					if (i == j) continue;
					count[options[i]][options[j]]++;
				}
			}
		}
		int c = 0;
		for (int i[] : count) 
			for (int v : i)
				if (v == K)
					c++;
		
		System.out.println(c);
		bf.close();
	}

}
