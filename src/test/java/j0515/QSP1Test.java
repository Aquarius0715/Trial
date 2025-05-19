package j0515;

import j0515.QSP1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QSP1Test {
    @Test
    public void GPA_GradeD_Test() {
        // 境界値
        assertThat(QSP1.getGPA(0)).isEqualTo("D");
        assertThat(QSP1.getGPA(59)).isEqualTo("D");

        // 代表値
        assertThat(QSP1.getGPA(55)).isEqualTo("D");
    }

    @Test
    public void GPA_GradeC_Test() {
        // 境界値
        assertThat(QSP1.getGPA(60)).isEqualTo("C");
        assertThat(QSP1.getGPA(69)).isEqualTo("C");


        // 代表値
        assertThat(QSP1.getGPA(67)).isEqualTo("C");
    }

    @Test
    public void GPA_GradeB_Test() {
        // 境界値
        assertThat(QSP1.getGPA(70)).isEqualTo("B");
        assertThat(QSP1.getGPA(79)).isEqualTo("B");

        // 代表値
        assertThat(QSP1.getGPA(71)).isEqualTo("B");
    }

    @Test
    public void GPA_GradeA_Test() {
        // 境界値
        assertThat(QSP1.getGPA(80)).isEqualTo("A");
        assertThat(QSP1.getGPA(89)).isEqualTo("A");

        // 代表値
        assertThat(QSP1.getGPA(83)).isEqualTo("A");
    }

    @Test
    public void GPA_GradeS_Test() {
        // 境界値
        assertThat(QSP1.getGPA(90)).isEqualTo("S");
        assertThat(QSP1.getGPA(100)).isEqualTo("S");

        // 代表値
        assertThat(QSP1.getGPA(99)).isEqualTo("S");
    }

    @Test
    public void GPA_Error_Test() {
        assertThat(QSP1.getGPA(-1)).isEqualTo("Error");
        assertThat(QSP1.getGPA(101)).isEqualTo("Error");

        // 代表値
        assertThat(QSP1.getGPA(-10)).isEqualTo("Error");
        assertThat(QSP1.getGPA(120)).isEqualTo("Error");
    }
}


