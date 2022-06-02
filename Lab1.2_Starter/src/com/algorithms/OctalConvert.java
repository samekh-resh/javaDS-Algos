package com.algorithms;

class OctalConvert {

    public static final int OCTAL_NUMBER_BASE = 8;

    public static void main(String[] args) {
//        int number = convertFromBinary("100101");
//        System.out.println("Number for binary 100101: " + number);
        int number = convertFromOctalToInt("100101");
        System.out.println("With Second, Number for binary 100101: " + number);
        number = convertFromOctalToDecimal("17");
        System.out.println("With Second, octal  to a number: " + number);
    }

    public static int convertFromOctalToInt(String input) {

        Integer octal = Integer.parseInt(input);
        //Declaring variable to store decimal number
        int decimal = 0;
        //Declaring variable to use in power
        int n = 0;
        //writing logic
        while (true) {
            //the condition to break the loop
            if (octal == 0) {
                break;
            } else {

                int temp = octal % 10;
                decimal += temp * Math.pow(8, n);
                octal = octal / 10;
                n++;
            }
        }
        return decimal;
    }


    public static int convertFromOctalToDecimal(String octalString){
        int resultDecimalValue = 0;
        int conversion = 1;
        //this lets us know we're starting from the bottom of the string or reverse iterating
        for(int i = octalString.length() - 1; i >= 0; i--){
            char charAt = octalString.charAt(i);
            System.out.println(charAt);
            int parsedInt = Integer.parseInt(Character.toString(charAt), OCTAL_NUMBER_BASE);
            resultDecimalValue += parsedInt * conversion;
            conversion *= conversion * OCTAL_NUMBER_BASE;
        }

        return resultDecimalValue;
    }
}