import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[8][8];
        for (int r = 0; r < 8; r++) {
            String s = sc.next();
            for (int c = 0; c < 8; c++) {
                map[r][c] = s.charAt(c);
            }
        } // 체스판 상태 입력

        int cnt = 0; // 흰 칸 위 말의 개수 cnt
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if ((r % 2 == 0 && c % 2 == 0) || (r % 2 == 1 && c % 2 == 1)) {
                    if (map[r][c] == 'F') cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}