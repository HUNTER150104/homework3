package com.company;

public class Main {

    public static void main(String[] args) {
        String[] stringcode = {"Value1", "Value2"};
        System.out.println(stringcode[1]);

        double code[] = new double[15];
        double car = 0;
        code[0] = 1.5;
        code[1] = 2.5;
        code[2] = -1.3;
        code[3] = -7.5;
        code[4] = 1.6;
        code[5] = -1.5;
        code[6] = -99.5;
        code[7] = -3.5;
        code[8] = 4.5;
        code[9] = -6.5;
        code[10] = 11.5;
        code[11] = -25.5;
        code[12] = 33.5;
        code[13] = -24.5;
        code[14] = 27.5;
        boolean isNegativeNum = false;
        double result = 0;
        int counter = 0;

        for (double monkey : code) {
            if (monkey  < 0) {
                isNegativeNum = true;
            }


            if (isNegativeNum) {
                if (monkey < 0) ;
                result += monkey;
                counter++;

            }



        }
        System.out.println("Сумма массива =" + result);
        System.out.println("Среднее арифметическое массива " + result / counter);


    }
}
