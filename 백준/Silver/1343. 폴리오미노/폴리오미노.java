import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        res = process(s);
        System.out.println(res);
        sc.close();
    }

    private static String process(String s) {
        String ans = "";
        String AA = "AAAA", BB = "BB";
        s = s.replaceAll("XXXX", AA);
        ans = s.replaceAll("XX", BB);
        if(ans.contains("X")) {
            ans = "-1";
        }
        return ans;
    }
}