package j0519;

import java.util.Scanner;
import java.util.stream.IntStream;

public class QSP1 {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("正の整数Nを入力してください。");
        int n = scn.nextInt();

        int evenSum = IntStream.rangeClosed(1, n)
                .filter(s -> s % 2 == 0)
                .sum();
        int oddSum = IntStream.rangeClosed(1, n)
                .filter(s -> s % 2 == 1)
                .sum();

        System.out.println("1から" + n + "までの偶数の和="  + evenSum);
        System.out.println("1から" + n + "までの奇数の和="  + oddSum);
    }
}
