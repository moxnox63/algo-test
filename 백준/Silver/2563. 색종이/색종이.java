import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] black = new boolean[100][100];
		int cnt = 0;
		for (int n = 0; n < N; n++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			for (int r = row; r < row+10; r++) {
				for (int c = col; c < col+10; c++) {
					if(black[r][c] == false) {
						black[r][c] = true;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}