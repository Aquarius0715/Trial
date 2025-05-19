package j0519;

import java.util.Scanner;
import java.util.stream.IntStream;

public class QSP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("正の整数Nを入力してください");
        int n = sc.nextInt();
        int pow3 = IntStream.rangeClosed(1, n)
                .map(s -> s * s * s)
                .sum();

        System.out.println("1から" + n + "までの3乗の和=" + pow3);
    }
}
