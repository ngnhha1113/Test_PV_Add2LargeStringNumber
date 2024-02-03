package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// Driver test function
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber();

        String number1 = "12339883094";
        String number2 = "8834578";

        
        String result = myBigNumber.sum(number1, number2);
        logger.info("Result: {}", result);
    }
}
