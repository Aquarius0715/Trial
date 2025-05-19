package j0515;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QSP2Test {
    @Test
    public void 月の日数_Test() {
        assertThat(QSP2.getSeizafromDate(1)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(2)).isEqualTo(28);
        assertThat(QSP2.getSeizafromDate(3)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(4)).isEqualTo(30);
        assertThat(QSP2.getSeizafromDate(5)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(6)).isEqualTo(30);
        assertThat(QSP2.getSeizafromDate(7)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(8)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(9)).isEqualTo(30);
        assertThat(QSP2.getSeizafromDate(10)).isEqualTo(31);
        assertThat(QSP2.getSeizafromDate(11)).isEqualTo(30);
        assertThat(QSP2.getSeizafromDate(12)).isEqualTo(31);
    }

    @Test
    public void Error_Test() {
        assertThat(QSP2.getSeizafromDate(0)).isEqualTo(0);
        assertThat(QSP2.getSeizafromDate(13)).isEqualTo(0);

        assertThat(QSP2.getSeizafromDate(20)).isEqualTo(0);
        assertThat(QSP2.getSeizafromDate(0)).isEqualTo(0);
    }

}


