package j0522;

import java.util.Arrays;

public class QSP2 {
    public static void main(String[] args) {
        int[] scores = {
                76, 80, 68, 81, 72, 80, 70, 69, 86, 85,
                82, 78, 74, 93, 80, 92, 79, 76, 78, 67,
                86, 74, 88, 84, 68, 85, 94, 98, 81, 80,
                65, 80, 85, 80, 78, 90, 90, 79, 81, 95
        };

        double avg = (double) Arrays.stream(scores)
                        .sum() / scores.length;

        System.out.println("平均点は[" + avg + "]点です。");
    }
}
