package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;

public class CreatingStrings {

//	public static HashSet<String> map;
	public static ArrayList<String> work = new ArrayList<>();
	public static String in;
	public static char all[] = new char[26];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		map = new HashSet<>();
		in = bf.readLine().trim();
		for (char c : in.toCharArray())
			all[(int)(c) - 97]++;
		search("");
		System.out.println(work.size());
		Iterator<String> it = work.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		bf.close();
	}

	private static void search(String in) {
		// TODO Auto-generated method stub
		if (in.length() == CreatingStrings.in.length()) {
			work.add(in);
		} else {
			for (int i = 0; i < 26; i++) {
				if (all[i] > 0) {
					all[i]--;
					search(in + (char) (i + 97));
					all[i]++;
				}
			}
		}
	}
}
