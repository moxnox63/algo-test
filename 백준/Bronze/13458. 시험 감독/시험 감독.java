import java.util.Scanner;

public class Main {
    static long N, B, C;
    static long[] num;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong(); // 시험장의 개수
        num = new long[(int)N]; // 각 시험장의 응시자 수를 저장하는 배열
        for (int i = 0; i < N; i++) num[i] = sc.nextLong();
        B = sc.nextLong(); // 총감독관 감시 응시자 수
        C = sc.nextLong(); // 부감독관 감시 응시자 수
        long ans = N; // 각 시험장에 총감독관이 반드시 1명 입실

        for (int i = 0; i < N; i++) {
            // 총감독관으로 감시가 충분한 경우
            if(num[i]-B < 0) continue;
            
            // 부감독관이 추가로 배치되어야 하는 경우
            if((num[i]-B) % C != 0) ans += (num[i] - B) / C + 1;
            else ans += (num[i] - B) / C;
        }
        System.out.println(ans);
        sc.close();
    }
}
