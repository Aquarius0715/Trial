package j0515;

import java.util.Scanner;

public class QSP2 {
    public static int getSeizafromDate(int month){
        if (month < 1 || month > 12) {
            return 0;
        }
        final int[] days  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month-1];
    }
}
