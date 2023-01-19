import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) set.add(sc.nextInt());
        int L = set.size();
        Object[] arr = new Object[L];
        arr = set.toArray();
        Arrays.sort(arr);
        for (Object num: arr) System.out.print(num + " ");
        sc.close();
    }
}