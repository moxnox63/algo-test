import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = Integer.MAX_VALUE;
        min = Math.min(x, y);
        min = Math.min(w-x, min);
        min = Math.min(h-y, min);
        System.out.println(min);
        sc.close();
    }
}