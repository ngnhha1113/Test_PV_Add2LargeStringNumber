import org.example.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyBigNumberTest {

    private MyBigNumber myBigNumber = new MyBigNumber();

    @Test
    public void testSumWithNormalNumbers() {
        for(int i=1;i<=1000000;i++){
             myBigNumber.sum("999999999999999", "1111111111111111111111");
        }

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

