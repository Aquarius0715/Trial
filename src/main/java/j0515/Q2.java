package j0515;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("何月の日数が知りたいですか？");
        final int month =  sc.nextInt();
        System.out.println(month + "月は" + days[month - 1] + "日まであります。");
    }
}
