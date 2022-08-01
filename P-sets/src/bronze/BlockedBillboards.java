package bronze;

import java.util.Scanner;

public class BlockedBillboards {

	static class Square {
		int x0, y0, xf, yf;
		int area;

		public Square(int x0, int y0, int xf, int yf) {
			this.x0 = x0;
			this.xf = xf;
			this.y0 = y0;
			this.yf = yf;

			this.area = (xf - x0) * (yf - y0);
		}

		public int intersect(Square other) {
			int y = Math.max(0, Math.min(other.yf, yf) - Math.max(other.y0, y0));
			int x = Math.max(0, Math.min(other.xf, xf) - Math.max(other.x0, x0));
			return x * y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Square goodOne = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.nextLine();
		Square goodTwo = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.nextLine();
		Square bad = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.nextLine();

		System.out.println(goodOne.area + goodTwo.area - goodOne.intersect(bad) - goodTwo.intersect(bad));
		sc.close();
	}
}
