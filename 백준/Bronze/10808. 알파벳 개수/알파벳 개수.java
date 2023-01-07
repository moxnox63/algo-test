import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int[] c = new int[26];
        for (int i = 0; i < s.length; i++) {
            // s배열의 i번째 문자가 c배열의 몇 번째 idx에 해당하는지 찾고
            // 해당 idx의 c배열 값을 +1
            c[s[i] - 'a']++;
        }
        for (int num : c) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}