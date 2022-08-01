package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class GuessTheAnimal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String, Integer> questionIndex = new HashMap<>();
		List<List<Integer>> matrix = new ArrayList<>(100);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		int characteristicIndex = 0;
		for (int n = 0; n < N; n++) {
			List<Integer> l = new ArrayList<>(100);
			StringTokenizer st = new StringTokenizer(bf.readLine().trim());
			st.nextToken();
			for (int i = 0; i < 100; i++)
				l.add(0);
			int i = Integer.parseInt(st.nextToken())-1;
			for (; i >= 0; i--) {
				String s = st.nextToken();
				if (questionIndex.containsKey(s))
					l.set(questionIndex.get(s), 1);
				else {
					questionIndex.put(s, characteristicIndex);
					characteristicIndex++;
					l.set(questionIndex.get(s), 1);
				}
			}
			matrix.add(l);
		}
		int out = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int common = 0;
				for (int c = 0; c < 100; c++) {
					if (matrix.get(i).get(c) == 1 && matrix.get(j).get(c) == matrix.get(i).get(c))
						common++;
				}
				out = Math.max(out, common);
			}
		}	
		System.out.println(out + 1);
		bf.close();
	}

}
