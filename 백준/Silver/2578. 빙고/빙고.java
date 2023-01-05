import java.util.Scanner;

public class Main {
	static int[][] map;
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[5][5];
		cnt = 0;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				map[r][c] = sc.nextInt();
			}
		}
		for (int i = 1; i <= 25; i++) {
			int num = sc.nextInt();

			for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if(map[r][c] == num) map[r][c] = 0;
				}
			}
			rCheck();
			cCheck();
			leftCheck();
			rightCheck();

			if(cnt >= 3) {
				System.out.println(i);
				break;
			}
			cnt = 0;
		}
		sc.close();
	}

	public static void rCheck() {
		for (int i = 0; i < 5; i++) {
			int zeroCount = 0;
			for (int j = 0; j < 5; j++) {
				if(map[i][j] == 0) zeroCount++;
			}
			if(zeroCount == 5) cnt++;
		}
	}

	public static void cCheck() {
		for (int i = 0; i < 5; i++) {
			int zeroCount = 0;
			for (int j = 0; j < 5; j++) {
				if(map[j][i] == 0) zeroCount++;
			}
			if(zeroCount == 5) cnt++;
		}
	}

	public static void leftCheck() {
		int zeroCount = 0;
		for (int i = 0; i < 5; i++) {
			if(map[i][i] == 0) zeroCount++;
		}
		if(zeroCount == 5) cnt++;
	}

	public static void rightCheck() {
		int zeroCount = 0;
		for (int i = 0; i < 5; i++) {
			if(map[i][4-i] == 0) zeroCount++;
		}
		if(zeroCount == 5) cnt++;
	}
}