package j0519;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("正の整数Nを入力してください。");
        int n = scn.nextInt();
        int evenSum = 0,  oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("1から" + n + "までの偶数の和="  + evenSum);
        System.out.println("1から" + n + "までの奇数の和="  + oddSum);

    }
}
