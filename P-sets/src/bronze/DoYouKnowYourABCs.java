package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class DoYouKnowYourABCs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int l[] = new int[7];
		for (int i = 0; i < 7; i++)
			l[i] = sc.nextInt();
		sc.nextLine();
		Arrays.sort(l);
		a = l[0];
		b = l[1];
		c = l[6] - (a + b);
		
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}

}
