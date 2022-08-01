package bronze;

import java.util.Scanner;

public class CowSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
		sc.nextLine();
		String out = "";
		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			String temp = "";
			for (int j = 0; j < n; j++) {
				temp += (s.substring(j, j + 1).repeat(k));
			}
			temp += "\n";
			out += temp.repeat(k);
		}
		System.out.println(out.trim());
		sc.close();
	}

}
