package bronze;

import java.util.Scanner;

public class BucketBrigade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int farm[][] = new int[10][10];
		// B = 0, L = lake,
		Scanner sc = new Scanner(System.in);
		int b[] = new int[2], r[] = new int[2], l[] = new int[2]; // x, y
		for (int i = 0; i < 10; i++) {
			String in = sc.nextLine().toLowerCase().trim();
			for (int j = 0; j < in.length(); j++)
				if (in.charAt(j) != '.') {
					if (in.charAt(j) == 'b') {
						b[0] = i; 
						b[1] = j;
					}
					else if (in.charAt(j) == 'r') {
						r[0] = i;
						r[1] = j;
					}
					else {
						l[0] = i;
						l[1] = j;
					}
				}
		}
		int out = Math.abs(l[1] - b[1]) + Math.abs(l[0] - b[0]) - 1;
		if (b[0] == r[0] && r[0] == l[0]
				&& ((r[1] > b[1] && r[1] < l[1]) || (r[1] < b[1] && r[1] > l[1]))) 
			out += 2;//out = Math.abs(l[0] - b[0]) - 1 + 3;
		else if (b[1] == r[1] && r[1] == l[1]
				&& ((r[0] > b[0] && r[0] < l[0]) || (r[0] < b[0] && r[0] > l[0])))  
			out += 2;//out = Math.abs(l[1] - b[1]) - 1 + 3;
		else {}
		System.out.println(out+"\n");
		sc.close();
	}
}