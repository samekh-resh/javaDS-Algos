package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
//        int number = convertFromBinary("100101");
//        System.out.println("Number for binary 100101: " + number);
        int number = convertFromBinary2("100101");
        System.out.println("With Second, Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary){
// return calculated decimal int converted from String binary
        int conversion = 1;
        int result = 0;

        for (int i = 1; i <= binary.length(); i++){
            // binary.length() - i is taking the i for the current loop and subtracting it from the length of the string, basically iterating backwards
            if(binary.charAt(binary.length() - i) =='1')
                //this if statement doesn't need a code block because it's only running one piece of logic underneath, anything after that one line will be in a new scope
                result += conversion;
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromBinary2(String binary){
        int result = 0;
        int conversion = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
//            System.out.println("printing the index "+i);
//            System.out.println("the character at the binary"+binary.charAt(i));
            if(binary.charAt(i) == '1')
                result += conversion;
//            System.out.println("the result: "+result);

            conversion *=2;
//            System.out.println("the conversion: "+conversion);
        }
        System.out.println("this is the result being sent out: " + result);
        return result;
    }

}
