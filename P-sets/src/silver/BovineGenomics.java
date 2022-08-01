package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BovineGenomics {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		int T = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		String spots[] = new String[T], plain[] = new String[T];
		for (int i = 0; i < T; i++)
			spots[i] = bf.readLine().trim();
		for (int i = 0; i < T; i++)
			plain[i] = bf.readLine().trim();
		int valid = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					HashSet<String> s = new HashSet<>(), p = new HashSet<>();
					for (String str : spots)
						s.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
					for (String str : plain)
						p.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
					Iterator<String> it = s.iterator();
					boolean contains = false;
					while (it.hasNext())
						if (p.contains(it.next())) {
							contains = true;
							break;
						}
					if (!contains)
						valid++;
				}
			}
		}

		System.out.println(valid);
		bf.close();
	}
}
