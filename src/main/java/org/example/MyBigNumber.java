package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBigNumber {
    private static final Logger logger = LogManager.getLogger(MyBigNumber.class);
    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        int length1 = stn1.length();
        int length2 = stn2.length();
        int maxLength = Math.max(length1, length2);
        int carry = 0;
        int digit1, digit2, sum;

        for (int i = 0; i < maxLength; i++) {
            digit1 = i < length1 ? stn1.charAt(length1 - 1 - i) - '0' : 0;
            digit2 = i < length2 ? stn2.charAt(length2 - 1 - i) - '0' : 0;
            sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);

            logger.info("Step {}: Take {} add {} we hvae {}. Save {} into result {}.",
                    i + 1, digit1, digit2, sum, sum % 10, carry);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}
