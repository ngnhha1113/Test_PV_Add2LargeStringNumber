import org.example.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyBigNumberTest {

    private MyBigNumber myBigNumber = new MyBigNumber();

    @Test
    public void testSumWithNormalNumbers() {
        assertEquals("2131", myBigNumber.sum("1234", "897"));
    }

    @Test
    public void testSumWithCarry() {
        assertEquals("1000", myBigNumber.sum("999", "1"));
    }

    @Test
    public void testSumWithEmptyString() {
        assertEquals("1234", myBigNumber.sum("", "1234"));
        assertEquals("1234", myBigNumber.sum("1234", ""));
    }

    @Test
    public void testSumWithZeros() {
        assertEquals("0", myBigNumber.sum("0", "0"));
    }

    @Test
    public void testSumWithLargeNumbers() {
        assertEquals("10000", myBigNumber.sum("9999", "1"));
    }
}
