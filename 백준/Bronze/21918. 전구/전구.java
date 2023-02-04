import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 전구 개수
        int M = sc.nextInt(); // 명령어 개수
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt(); // 수행해야 하는 명령
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (num) {
                case 1:
                    arr[a-1] = b;
                    break;
                case 2:
                    for (int j = a-1; j < b; j++) {
                        if (arr[j] == 0) arr[j] = 1;
                        else arr[j] = 0;
                    }
                    break;
                case 3:
                    for (int j = a-1; j < b; j++) arr[j] = 0;
                    break;
                case 4:
                    for (int j = a-1; j < b; j++) arr[j] = 1;
                    break;
            }
        }
        for (int res: arr) {
            System.out.print(res + " ");
        }
        sc.close();
    }
}