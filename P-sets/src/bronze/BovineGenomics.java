package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BovineGenomics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		List<HashSet<String>> spot = new ArrayList<>(M), plain = new ArrayList<>(M);
		for (int i = 0; i < N; i++) {
			String s = bf.readLine().trim();
			int index = 0;
			for (char c : s.toCharArray()) {
				spot.add(new HashSet<String>());
				spot.get(index).add("" + c);
				index++;
			}
		}
		for (int i = 0; i < N; i++) {
			String s = bf.readLine().trim();
			int index = 0;
			for (char c : s.toCharArray()) {
				plain.add(new HashSet<String>());
				plain.get(index).add("" + c);
				index++;
			}
		}

		int out = 0;
		for (int i = 0; i < M; i++) {
			if (spot.get(i).size() <= plain.get(i).size()) {
				Iterator<String> it = spot.get(i).iterator();
				boolean contained = false;
				while (it.hasNext()) {
					String v = it.next();
					if (plain.get(i).contains(v)) {
						contained = true;
						break;
					}

				}
				if (!contained)
					out++;
			} else {
				Iterator<String> it = plain.get(i).iterator();
				boolean contained = false;
				while (it.hasNext()) {
					String v = it.next();
					if (spot.get(i).contains(v)) {
						contained = true;
						break;
					}

				}
				if (!contained)
					out++;
			}
		}
		System.out.println(out);
		bf.close();
	}

}
