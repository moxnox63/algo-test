import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        System.out.println(N * (N + 1) * (N - 1) / 2);
        sc.close();
    }
}