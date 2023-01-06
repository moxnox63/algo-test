import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 300초, 60초, 10초
        int T = sc.nextInt(); // 요리시간 T
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            if(i == 0) {
                arr[i] = T / 300;
                T %= 300;
            } else if(i == 1) {
                arr[i] = T / 60;
                T %= 60;
            } else {
                arr[i] = T / 10;
                T %= 10;
            }
        }
        if(T != 0) System.out.println(-1);
        else {
            for (int n: arr) System.out.print(n + " ");
        }
        sc.close();
    }
}