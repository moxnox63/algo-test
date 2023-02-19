import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) System.out.printf("%d is even\n", num);
            else System.out.printf("%d is odd\n", num);
        }
        sc.close();
    }
}