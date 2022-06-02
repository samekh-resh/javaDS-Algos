package com.algorithms;
import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert.*;

public class BinaryConvertTest {

    @org.junit.Test
    public void testConvertFromBinary_shouldReturnValidDecimalOfValueGiven_whenGivenAString() {
        String[] testBinaryStringArray = {"10010", "10"};
        int[] decimalValyeArray = {18, 2};

        int decimalOfResult = BinaryConvert.convertFromBinary("100101");
        Assert.assertEquals(37, decimalOfResult);

        for(int i = 0; i < testBinaryStringArray.length; i++){
            int resultDecimalValue = BinaryConvert.convertFromBinary(testBinaryStringArray[i]);
            Assert.assertEquals(decimalValyeArray[i], resultDecimalValue);
        }

    }


}