package com.algorithms;

import org.junit.Assert;
import org.junit.Test;
public class BinaryConvertTest {

    @Test
    public void convertFromOctal_shouldReturnValueDecimalValue_givenOctalString_withNoDupNumbers() {
        String[] testOctalStringArray = {"254", "10", "44367"};
        int[] decimalValyeArray = {172, 8, 149431};


        for (int i = 0; i < testOctalStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctalStringArray[i]);
            Assert.assertEquals(decimalValyeArray[i], resultDecimalValue);

        }
    }


    @Test
    public void convertFromOctal_shouldReturnValidDecimalValueGiven_validOctalString_withDupes() {

        String[] testOctalStringArray = {"222", "111", "6666"};
        int[] decimalValyeArray = {146, 73, 3510};


        for (int i = 0; i < testOctalStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctalStringArray[i]);
            Assert.assertEquals(decimalValyeArray[i], resultDecimalValue);

        }
    }

    //need help
    @Test(expected = MyNumberFormatException.class)
    public void convertFromOctal_shouldThrowMyNumberFormatException_whenGivenOctalStringWithNonNumbers() {
        String testOctalString = "17a";

        try {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctalString);
        } catch (Exception e) {
            Assert.fail("Exception " + e);
        }

    }

    @Test(expected = com.algorithms.MyNumberFormatException.class)
    public void convertFromOctal_shouldReturnValue_whenGivenNegativeNumber() {
        String[] testOctalStringArray = {"-14", "157", "-31"};
        int[] decimalValyeArray = {-12, -111, -25};


        for (int i = 0; i < testOctalStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctalStringArray[i]);
            Assert.assertEquals(decimalValyeArray[i], resultDecimalValue);
        }
    }
}