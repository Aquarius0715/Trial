package j0519;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class QSP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int[] days  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("2025N月からM月までの日数を求めます。");
        System.out.println("正の整数Nを入力してください。");
        int n = sc.nextInt();
        System.out.println("正の整数Mを入力してください。");
        int m = sc.nextInt();

        int sum = IntStream.rangeClosed(n, m)
                .map(s -> days[s - 1])
                .sum();

        System.out.println("2025年" + n + "月から" + m + "月までは" + sum + "日です。");

    }
}
