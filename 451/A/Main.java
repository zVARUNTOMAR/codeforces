import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(solve(n, m));

		sc.close();
	}

	static String solve(int n, int m) {
		return (Math.min(n, m) % 2 == 0) ? "Malvika" : "Akshat";
	}
}
