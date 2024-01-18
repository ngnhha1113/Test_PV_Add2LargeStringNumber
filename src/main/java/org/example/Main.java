package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber();

        String number1 = "1234";
        String number2 = "897";

        // Gọi phương thức sum và in kết quả
        String result = myBigNumber.sum(number1, number2);
        logger.info("Kết quả cuối cùng: {}", result);
    }
}
