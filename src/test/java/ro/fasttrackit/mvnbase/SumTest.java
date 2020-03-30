package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumTest {
    Sum sum;

    @BeforeEach
    void setup() {
        sum = new Sum();
    }

    @Test
    @DisplayName("sum(1)=1")
    void sum1() {
        assertThat(sum.sum(1));
    }

    @Test
    @DisplayName("sum(0)=0")
    void sum0() {
        assertThat(sum.sum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("sum(2)=3")
    void sum2() {
        assertThat(sum.sum(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("sum(33)=561")
    void sum33() {
        assertThat(sum.sum(33)).isEqualTo(561);
    }

    @Test
    @DisplayName("sum(-10)=exception")
    void sumNegative() {
        var exception = assertThrows(IllegalArgumentException.class, () -> sum.sum(-10));
        assertThat(exception.getMessage()).isEqualTo("n should be positive!");
    }

    @Test
    @DisplayName("factorial(10)=3628800")
    void factorial19() {
        assertThat(sum.factorial(10)).isEqualTo(3628800);
    }

    @Test
    @DisplayName("sumArray({3,5,6,19})=33")
    void sumArray() {
        assertThat(sum.sumArray(new int[]{3, 5, 6, 19})).isEqualTo(33);
    }

    @Test
    @DisplayName("sumArrayMiddle({3,5,6,19})=33")
    void sumArrayMiddle() {
        assertThat(sum.sumArrayMiddle(new int[]{3, 5, 6, 19})).isEqualTo(33);
    }

    @Test
    @DisplayName("sumArrayStart({3,5,6,19})=33")
    void sumArrayStart() {
        assertThat(sum.sumArrayStart(new int[]{3, 5, 6, 19})).isEqualTo(33);
    }

    @Test
    @DisplayName("fib(40)=102334155")
    void fibonacci() {
        assertThat(sum.fib(40)).isEqualTo(102334155);
    }

    @Test
    @DisplayName("reverse(mere)=erem")
    void reverse(){
        assertThat(sum.reverse("mere")).isEqualTo("erem");
    }
}
