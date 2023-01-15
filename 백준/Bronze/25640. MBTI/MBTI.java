import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti = sc.next();
        int n = sc.nextInt();
        String[] s = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (s[i].equals(mbti)) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}