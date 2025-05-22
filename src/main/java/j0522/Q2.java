package j0522;

public class Q2 {
    public static void main(String[] args) {
        int[] scores = {
                76, 80, 68, 81, 72, 80, 70, 69, 86, 85,
                82, 78, 74, 93, 80, 92, 79, 76, 78, 67,
                86, 74, 88, 84, 68, 85, 94, 98, 81, 80,
                65, 80, 85, 80, 78, 90, 90, 79, 81, 95
        };

        double sum = 0;
        for (int i: scores) {
            sum += i;
        }
        double avg =  sum / scores.length;

        System.out.println("平均点は[" + avg + "]点です。");
    }
}
