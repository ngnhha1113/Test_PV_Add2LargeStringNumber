import org.example.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyBigNumberTest {

    private MyBigNumber myBigNumber = new MyBigNumber();

    
    @Test
    public void testSumWithCarry() {
        assertEquals("14264788", myBigNumber.sum("9482394", "4782394"));
    }

   
    @Test
    public void testSumWithZeros() {
        assertEquals("0", myBigNumber.sum("0", "0"));
    }
    @Test
    public void testSumWithEmptyString() {
        assertEquals("124", myBigNumber.sum("", "124"));
        assertEquals("124", myBigNumber.sum("124", ""));
    }

   
}

