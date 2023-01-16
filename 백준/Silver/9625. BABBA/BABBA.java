import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 버튼을 누르는 횟수
        sc.close();

        // A는 B로, B는 BA로 변환
        int[] arr = new int[2]; // arr[0]에는 A 개수가, arr[1]에는 B 개수가 저장
        arr[0] = 1; // 처음에는 A가 1개인 채로 시작
        for (int i = 0; i < K; i++) {
            int tmp = arr[1];
            arr[1] += arr[0]; // A는 모두 B로 바뀌므로 원래 A의 개수를 B의 개수에 +
            arr[0] = tmp; // B가 BA로 바뀌며 새롭게 A가 생겨나므로 원래 B의 개수를 A에 저장
        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}