import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 6 * sc.nextInt() + 3 * sc.nextInt() + 2 * sc.nextInt() + sc.nextInt() + 2 * sc.nextInt();
        int b = 6 * sc.nextInt() + 3 * sc.nextInt() + 2 * sc.nextInt() + sc.nextInt() + 2 * sc.nextInt();
        System.out.println(a + " " + b);
        sc.close();
    }
}