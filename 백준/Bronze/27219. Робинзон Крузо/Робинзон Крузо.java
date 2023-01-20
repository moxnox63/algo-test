import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/5; i++) sb.append("V");
        for (int i = 0; i < n%5; i++) sb.append("I");
        System.out.println(sb.toString());
        sc.close();
    }
}