import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int r = 1; r <= N; r++) {
            for (int c = 0; c < r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int r = N-1; r > 0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}