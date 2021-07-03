package org.example.coding;

import com.sun.tools.javac.util.StringUtils;

public class StringEnhance {


    /**
     * 给定字符串进行+1再输出字符串
     * @param digital
     * @return
     */
    public static String computeDigital(String digital) {
        //todo 判断是不是数字


        char[] strArray = digital.toCharArray();
        for (int j = strArray.length - 1; j >= 0; j--) {
            if(strArray[j] == '9'){
                strArray[j] = '0';
                continue;
            }

            int i = Integer.parseInt(String.valueOf(strArray[j]));
            i++;
            strArray[j] = Character.forDigit(i, 10);
            break;
        }

        System.out.println(String.valueOf(strArray));
        return String.valueOf(strArray);

    }

    public static boolean isNumber(String number) {
        boolean isNumber = true;
        if (number == null) {
            return false;
        }

        char[] strChar = number.toCharArray();
        for (char c : strChar) {
            if(!Character.isDigit(c)){
                isNumber = false;
                break;
            }
        }

        return isNumber;
    }

    public static boolean isNumber2(String number) {
        boolean isNumber = true;
        if (number == null) {
            return false;
        }

        String regex = "^[1-9]+[0-9]*$";
        return true;
    }



    public static void main(String[] args) {
        System.out.println(StringEnhance.computeDigital("2599"));

        char x = '1';

    }





}
