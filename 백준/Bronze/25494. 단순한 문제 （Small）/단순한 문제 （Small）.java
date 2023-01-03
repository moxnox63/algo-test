import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test-case
        
        // 주어진 수의 값이 작으므로 4중 for문으로 해결
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt(); // 1st num
            int b = sc.nextInt(); // 2nd num
            int c = sc.nextInt(); // 3rd num
            int cnt = 0; // 문제의 조건에 맞는 경우의 수 count
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        if(x%y == y%z && y%z == z%x) cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
