package j0515;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelperTest {
    @Test
    public void 数4で割れる場合() {
        boolean result = Helper.isLeapYear(1964);
        assertThat(result).isTrue();
    }
    @Test
    public void 数4で割り切れる場合() {
        boolean result1= Helper.isLeapYear(1996);
        assertThat(result1).isTrue();
        boolean result2= Helper.isLeapYear(2004);
        assertThat(result2).isTrue();
    }
    @Test
    public void 数400で割れる場合() {
        boolean result = Helper.isLeapYear(2000);
        assertThat(result).isTrue();
    }
    @Test
    public void 数100で割れる場合() {
        boolean result1 = Helper.isLeapYear(1900);
        assertThat(result1).isFalse();
        boolean result2= Helper.isLeapYear(2100);
        assertThat(result2).isFalse();
    }
    @Test
    public void 数4で割れ切れない場合() {
        boolean result1 = Helper.isLeapYear(1999);
        assertThat(result1).isFalse();
        boolean result2= Helper.isLeapYear(2001);
        assertThat(result2).isFalse();
    }
}