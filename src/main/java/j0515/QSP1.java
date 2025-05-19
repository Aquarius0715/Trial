package j0515;

import java.util.Scanner;

public class QSP1 {

    
    public static String getGPA(int score) {
        String GPA = "";

        if (score < 0 ||  score > 100) {
            GPA = "Error";
        }
        if (score >= 0 && score < 60) {
            GPA = "D";
        } else if (score >= 60 && score < 70) {
            GPA = "C";
        } else if (score >= 70 && score < 80) {
            GPA = "B";
        }  else if (score >= 80 && score < 90) {
            GPA = "A";
        } else if (score >= 90 && score <= 100) {
            GPA = "S";
        }
        return GPA;
    }
}
