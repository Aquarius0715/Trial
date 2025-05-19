package j0519;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("正の整数Nを入力してください。");
        int n = scn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println("1から" + n + "までの3乗の和=" + sum);
    }
}
