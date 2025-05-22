package j0522;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] scores = {
                76, 80, 68, 81, 72, 80, 70, 69, 86, 85,
                82, 78, 74, 93, 80, 92, 79, 76, 78, 67,
                86, 74, 88, 84, 68, 85, 94, 98, 81, 80,
                65, 80, 85, 80, 78, 90, 90, 79, 81, 95
        };

        System.out.println("検索する得点を入力してください。");
        int score = scn.nextInt();

        int sum = 0;
        for (int i : scores) {
            if (i == score) {
                sum ++;
            }
        }
        System.out.println(score + "点の人は" + sum + "人いました。");
    }
}
