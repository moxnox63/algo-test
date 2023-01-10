import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a == 60 && a == b && b == c) System.out.println("Equilateral");
        else if(a + b + c == 180){
            if((a == b && b != c) || (a != b && b == c) || (a == c && a != b)) System.out.println("Isosceles");
            else System.out.println("Scalene");
        } else System.out.println("Error");
    }
}