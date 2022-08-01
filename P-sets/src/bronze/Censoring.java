package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Censoring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder S = new StringBuilder(bf.readLine().trim());
		String T = bf.readLine().trim();
		bf.close();
		int n = S.indexOf(T);
		while (n != -1) {
			S.replace(n, n+T.length(), "");
			n = S.indexOf(T, Math.max(0, n - T.length()));
		}
		System.out.println(S);
	}

}