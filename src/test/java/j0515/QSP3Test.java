package j0515;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QSP3Test {
    @Test
    public void みずがめ座_test() {
        // 境界値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(1, 20)).isEqualTo(1);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(2, 18)).isEqualTo(1);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(2, 4)).isEqualTo(1);
    }

    @Test
    public void うお座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(2, 19)).isEqualTo(2);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(3, 20)).isEqualTo(2);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(3, 6)).isEqualTo(2);
    }

    @Test
    public void おひつじ座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(3, 21)).isEqualTo(3);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(4, 19)).isEqualTo(3);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(4, 10)).isEqualTo(3);
    }

    @Test
    public void おうし座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(4, 20)).isEqualTo(4);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(5,20)).isEqualTo(4);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(5,4)).isEqualTo(4);
    }

    @Test
    public void ふたご座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(5,21)).isEqualTo(5);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(6,21)).isEqualTo(5);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(6,9)).isEqualTo(5);
    }

    @Test
    public void かに座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(6,22)).isEqualTo(6);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(7,22)).isEqualTo(6);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(7,4)).isEqualTo(6);
    }

    @Test
    public void しし座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(7,23)).isEqualTo(7);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(8,22)).isEqualTo(7);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(8,10)).isEqualTo(7);
    }

    @Test
    public void おとめ座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(8,23)).isEqualTo(8);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(9,22)).isEqualTo(8);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(9,10)).isEqualTo(8);
    }

    @Test
    public void てんびん座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(9,23)).isEqualTo(9);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(10,23)).isEqualTo(9);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(10,11)).isEqualTo(9);
    }

    @Test
    public void さそり座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(10,24)).isEqualTo(10);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(11,22)).isEqualTo(10);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(11,10)).isEqualTo(10);
    }

    @Test
    public void いて座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(11,23)).isEqualTo(11);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,21)).isEqualTo(11);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,20)).isEqualTo(11);
    }

    @Test
    public void やぎ座_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(1,19)).isEqualTo(12);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,22)).isEqualTo(12);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,31)).isEqualTo(12);
    }

    @Test
    public void Error_test() {
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(0,19)).isEqualTo(-1);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(13,19)).isEqualTo(-1);

        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,0)).isEqualTo(-1);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(12,32)).isEqualTo(-1);

        // 代表値
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(13,32)).isEqualTo(-1);
        AssertionsForClassTypes.assertThat(QSP3.getSeizafromDate(0,0)).isEqualTo(-1);

    }

}
