package j0515;

import java.util.Scanner;

public class QSP3 {

    public static void main(String[] args) {
        String[] seizaList = {"みずがめ座", "うお座", "おひつじ座", "おうし座", "ふたご座", "かに座", "しし座", "おとめ座", "てんびん座", "さそり座", "いて座", "やぎ座"};
        Scanner sc = new Scanner(System.in);
        System.out.println("あなたの誕生日は何月ですか？");
        final int month =   sc.nextInt();
        System.out.println("あなたの誕生日は何日ですか？");
        final int day =   sc.nextInt();


        System.out.println("あなたは「" +  seizaList[getSeizafromDate(month, day)] + "」です。");
    }

    public static int getSeizafromDate(int month, int day) {
        if (month < 1 || month > 12 ||  day < 1 || day > 31) {
            return -1;
        }
        if (QSP2.getSeizafromDate(month) < day) {
            return -1;
        }

        final int birthdayData = month * 100 + day;

        if (birthdayData >= 120 &&  birthdayData <= 218) {
            return 1;
        } else if (birthdayData >= 219 && birthdayData <= 320) {
            return 2;
        } else if (birthdayData >= 321 &&  birthdayData <= 419) {
            return 3;
        } else if (birthdayData >= 420 && birthdayData <= 520) {
            return 4;
        } else if (birthdayData >= 521 &&  birthdayData <= 621) {
            return 5;
        } else if (birthdayData >= 622 &&  birthdayData <= 722) {
            return 6;
        } else if (birthdayData >= 723 &&  birthdayData <= 822) {
            return 7;
        } else if (birthdayData >= 823 &&  birthdayData <= 922) {
            return 8;
        } else if (birthdayData >= 923 &&  birthdayData <= 1023) {
            return 9;
        } else  if (birthdayData >= 1024 &&  birthdayData <= 1122) {
            return 10;
        } else if (birthdayData >= 1123 &&  birthdayData <= 1221) {
            return 11;
        } else {
            return 12;
        }
    }

}
