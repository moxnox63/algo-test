import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int num = L * P;
        for (int i = 0; i < 5; i++) {
            int comp = sc.nextInt();
            System.out.print(comp - num + " ");
        }
        sc.close();
    }
}