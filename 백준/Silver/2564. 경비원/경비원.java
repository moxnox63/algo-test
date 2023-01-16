import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); // 가로 길이
		int R = sc.nextInt(); // 세로 길이
		int n = sc.nextInt(); // 상점 개수
		int[][] arr = new int[n][2];
		for (int r = 0; r < n; r++) { // 위치 저장
			for (int c = 0; c < 2; c++) { // 거리 저장
				arr[r][c] = sc.nextInt();
			}
		}
		int dir = sc.nextInt(); // 동근이 위치
		int dis = sc.nextInt(); // 동근이 거리
		sc.close();

		int total = 0; // 최단 거리의 합
		int a, b;
		for (int r = 0; r < n; r++) {
			switch (arr[r][0]) {
			case 1:
				if (dir == 1) {
					total += Math.abs(dis - arr[r][1]);
				} else if (dir == 2) {
					total += R;
					a = dis + arr[r][1];
					b = (C - dis) + (C - arr[r][1]);
					total += Math.min(a, b);
				} else if (dir == 3) {
					total += dis + arr[r][1];
				} else {
					total += dis + (C - arr[r][1]);
				}
				break;
			case 2:
				if (dir == 1) {
					total += R;
					a = dis + arr[r][1];
					b = (C - dis) + (C - arr[r][1]);
					total += Math.min(a, b);
				} else if (dir == 2) {
					total += Math.abs(dis - arr[r][1]);
				} else if (dir == 3) {
					total += (R - dis) + arr[r][1];
				} else {
					total += (R - dis) + (C - arr[r][1]);
				}
				break;
			case 3:
				if (dir == 1) {
					total += dis + arr[r][1];
				} else if (dir == 2) {
					total += dis + (R - arr[r][1]);
				} else if (dir == 3) {
					total += Math.abs(dis - arr[r][1]);
				} else {
					total += C;
					a = dis + arr[r][1];
					b = (R - dis) + (R - arr[r][1]);
					total += Math.min(a, b);
				}
				break;
			case 4:
				if (dir == 1) {
					total += (C - dis) + arr[r][1];
				} else if (dir == 2) {
					total += (C - dis) + (R - arr[r][1]);
				} else if (dir == 3) {
					total += C;
					a = dis + arr[r][1];
					b = (R - dis) + (R - arr[r][1]);
					total += Math.min(a, b);
				} else {
					total += Math.abs(dis - arr[r][1]);
				}
				break;
			}
		}
		System.out.println(total);
	}
}