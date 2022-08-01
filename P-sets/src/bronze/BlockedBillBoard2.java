package bronze;

import java.util.Scanner;

public class BlockedBillBoard2 {

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

		public Square(int coordinates[]) {
			this(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		}

		public boolean satisfies(Square other) {
			return (y0 <= other.y0 && yf >= other.yf && (xf >= other.xf || x0 <= other.x0))
					|| (x0 <= other.x0 && xf >= other.xf && (yf >= other.yf || y0 <= other.y0));
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
		int bad[] = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.nextLine();
		int good[] = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.nextLine();

		Square g = new Square(good), b = new Square(bad);
		if (g.satisfies(b))
			System.out.println(b.area - b.intersect(g));
		else
			System.out.println(b.area);

		sc.close();
	}

}
