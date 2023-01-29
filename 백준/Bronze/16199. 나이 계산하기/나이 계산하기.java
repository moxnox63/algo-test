import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int y1 = sc.nextInt();
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int y2 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            int yy1 = 0;
            if (m1 < m2) yy1 = y2 - y1;
            else if (m1 == m2 && d1 <= d2) yy1 = y2 - y1;
            else yy1 = y2 - y1 - 1;
            int yy2 = y2 - y1 + 1;
            int yy3 = y2 - y1;
            System.out.printf("%d\n%d\n%d", yy1, yy2, yy3);
            sc.close();
        }
}