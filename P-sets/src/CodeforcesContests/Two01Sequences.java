package CodeforcesContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Two01Sequences {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine().trim());
		while ((T--) > 0) {
//			StringTokenizer st = new StringTokenizer(bf.readLine().trim());
//			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			bf.readLine();
			String a = bf.readLine().trim(), b = bf.readLine().trim();
			System.out.println(Search(a, b) ? "YES" : "NO");
		}
		bf.close();
	}

	public static boolean Search(String a, String b) {
		if (a.equals(b)) {
			return true;
		} else if (a.length() < b.length()) {
			return false;
		} else {
			if (a.length() < 2) {
				return a.equals(b);
			}
			if (a.charAt(0) == a.charAt(1)) {
				return Search(a.substring(1), b);
			} else {
				return Search(a.charAt(0) + a.substring(2), b) || Search(a.charAt(1) + a.substring(2), b);
			}
		}
	}

}
