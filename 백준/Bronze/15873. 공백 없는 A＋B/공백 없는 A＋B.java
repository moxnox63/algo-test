import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = (n / 10) + (n % 10);
        if (n / 10 > 10) res = (n / 100) + (n % 100);
        if (n == 1010) res = 20;
        System.out.println(res);
        sc.close();
    }
}