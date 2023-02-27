import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		System.out.println(Factorial(N));
        sc.close();
	}
	
	public static long Factorial(long n) {
		if(n == 0) return 1;
		else return n *= Factorial(n-1);
	}
}