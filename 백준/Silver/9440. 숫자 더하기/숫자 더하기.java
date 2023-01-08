import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt(); // 입력받을 숫자의 개수
            if (N == 0) break; // 0이 입력되면 test case 종료
            int[] arr = new int[N];
            int zero = 0; // 0의 개수 count
            for (int i = 0; i < N; i++) {
                int n = sc.nextInt();
                if (n == 0) zero++;
                arr[i] = n;
            }
            Arrays.sort(arr);

            // 작은 수부터 차근차근 번갈아 append
            // 0은 첫 번째 자리 append 후 우선적으로 사용
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            // 0의 개수를 제외하고 다음 순서부터 각 수의 첫째 자리
            sb1.append(arr[zero]);
            sb2.append(arr[zero+1]);

            // 0을 모두 사용
            // 0의 개수(zero)가 0일 경우, 실행 X
            for (int i = 0; i < zero; i++) {
                if (i % 2 == 0) sb1.append(0);
                else sb2.append(0);
            }

            for (int i = zero + 2; i < N; i++) { // 0의 개수 + sb1, 2에 각각 append한 첫 자리 수 이후
                if (sb1.length() == sb2.length()) sb1.append(arr[i]);
                else sb2.append(arr[i]);
            }

            System.out.println((Integer.parseInt(sb1.toString())) + Integer.parseInt(sb2.toString()));
        } // test case
        sc.close();
    }
}