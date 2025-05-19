package j0515;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("あなたの成績を入力してください");
        final int point =  sc.nextInt();
        char GPA = ' ';
        if (point >= 0 && point < 60) {
            GPA = 'D';
        } else if (point >= 60 && point < 70) {
            GPA = 'C';
        } else if (point >= 70 && point < 80) {
            GPA = 'B';
        }  else if (point >= 80 && point < 90) {
            GPA = 'A';
        } else if (point >= 90 && point < 100) {
            GPA = 'S';
        }
        System.out.println("GPAは「" + GPA + "」です。");
    }
}
