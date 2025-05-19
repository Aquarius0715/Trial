package j0515;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("あなたの誕生日は何月ですか？");
        final int month =   sc.nextInt();
        System.out.println("あなたの誕生日は何日ですか？");
        final int day =   sc.nextInt();
        final int birthdayData = month * 100 + day;

        String seiza = "";

        if (birthdayData >= 120 &&  birthdayData <= 218) {
            seiza = "みずがめ座";
        } else if (birthdayData >= 219 && birthdayData <= 320) {
            seiza = "うお座";
        } else if (birthdayData >= 321 &&  birthdayData <= 419) {
            seiza = "おひつじ座";
        } else if (birthdayData >= 420 && birthdayData <= 520) {
            seiza = "おうし座";
        } else if (birthdayData >= 521 &&  birthdayData <= 621) {
            seiza = "ふたご座";
        } else if (birthdayData >= 622 &&  birthdayData <= 722) {
            seiza = "かに座";
        } else if (birthdayData >= 723 &&  birthdayData <= 822) {
            seiza = "しし座";
        } else if (birthdayData >= 823 &&  birthdayData <= 922) {
            seiza = "おとめ座";
        } else if (birthdayData >= 923 &&  birthdayData <= 1023) {
            seiza = "てんびん座";
        } else  if (birthdayData >= 1024 &&  birthdayData <= 1122) {
            seiza = "さそり座";
        } else if (birthdayData >= 1123 &&  birthdayData <= 1221) {
            seiza = "いて座";
        } else {
            seiza = "やぎ座";
        }

        System.out.println("あなたは「" +  seiza + "」です。");
    }
}
