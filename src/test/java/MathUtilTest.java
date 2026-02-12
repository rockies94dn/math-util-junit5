import com.dtoan.labs.MathUtil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathUtilTest {

    public static Stream<Arguments> initData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnsWell(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }

//    @Test
//    public void testFactorialGivenRightArgumentReturnsGoodResult() {
//        assertEquals(120, MathUtil.getFactorial(5));
//        assertEquals(720, MathUtil.getFactorial(6));
//    }

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
//        Executable negativeF = new  Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtil.getFactorial(-12);
//            }
//        };

        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-1));
    }

}
