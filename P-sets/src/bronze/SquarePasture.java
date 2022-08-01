package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;


public class SquarePasture {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());	
		Iterator<Object> it = st.asIterator();
		int sq1[] = new int[4], sq2[] = new int[4];
		int index = 0;
		while(it.hasNext()) sq1[index++] = Integer.parseInt((String) it.next());
		st = new StringTokenizer(in.readLine());
		it = st.asIterator();
		index = 0;
		while(it.hasNext()) sq2[index++] = Integer.parseInt((String) it.next());
		
		int area = 
			(int) Math.pow(
				Math.max(
					Math.max(sq1[2], sq2[2]) - Math.min(sq1[0], sq2[0]),
					Math.max(sq1[3], sq2[3]) - Math.min(sq1[1], sq2[1])), 2);
		
		System.out.println(area);
		
		in.close();
	}
}
