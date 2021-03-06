import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(solve(n, r));
        }

        sc.close();
    }

    static long solve(int n, int r) {
        int maxMultiLineLength = Math.min(n - 1, r);

        return maxMultiLineLength * (maxMultiLineLength + 1L) / 2 + ((r != maxMultiLineLength) ? 1 : 0);
    }
}