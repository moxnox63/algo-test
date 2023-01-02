import java.util.Scanner;

public class Main {
    static long N, B, C;
    static long[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        num = new long[(int)N];
        for (int i = 0; i < N; i++) num[i] = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
        long ans = N;

        for (int i = 0; i < N; i++) {
            if(num[i]-B < 0) continue;
            if((num[i]-B) % C != 0) ans += (num[i] - B) / C + 1;
            else ans += (num[i] - B) / C;
        }
        System.out.println(ans);
        sc.close();
    }
}