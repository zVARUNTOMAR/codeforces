import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = readArray(sc, n);
		int[] b = readArray(sc, k);
		System.out.println(solve(a, b) ? "Yes" : "No");

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static boolean solve(int[] a, int[] b) {
		if (b.length != 1) {
			return true;
		}

		for (int i = 0;; i++) {
			if (a[i] == 0) {
				a[i] = b[0];
				break;
			}
		}

		return IntStream.range(0, a.length - 1).anyMatch(i -> a[i] > a[i + 1]);
	}
}
