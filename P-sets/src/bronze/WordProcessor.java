package bronze;

import java.util.Scanner;

public class WordProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = sc.nextInt();
		sc.nextLine();
		
		String in[] = sc.nextLine().trim().split("\\s+");
		int count = 0;
		String currentPrint = "";
		for (String s : in) {
			if (count+s.length() > max) {
				System.out.println(currentPrint.trim());
				count = s.length();
				currentPrint = s;
			}
			else {
				count += s.length();
				currentPrint += " " + s;
			}
		}
		System.out.println(currentPrint);
		
		sc.close();
	}

}
