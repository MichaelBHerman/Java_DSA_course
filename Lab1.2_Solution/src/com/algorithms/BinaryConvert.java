package com.algorithms;

public class BinaryConvert {
    public static final int OCTAL_NUMBER_BASE = 8;

    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertOctalToDecimal("170");
        System.out.println("Number for octal 170: " + number);
    }

    public static int convertFromBinary(String binary){
        int conversion = 1;
        int result = 0;
/*        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertOctalToDecimal(String octalString) {
        int conversion = 1;
        int resultDecimalValue = 0;
        for (int i = octalString.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            int num = convertOctalStringToIntegerValue(octalString, i);
            resultDecimalValue += num*conversion;
            System.out.println(resultDecimalValue);
            conversion *= OCTAL_NUMBER_BASE;

        }
        return resultDecimalValue;
    }

    private static int convertOctalStringToIntegerValue(String octalString, int i) {
        return Integer.parseInt(Character.toString(octalString.charAt(i)));
    }
}
