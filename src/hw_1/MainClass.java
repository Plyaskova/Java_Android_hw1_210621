package hw_1;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {

        byte i = -2;
        short g = 10;
        int a = 5;
        long l = 1000L;
        float f = 2.33f;
        double b = 33.333;
        char ch = 'A';
        boolean x = false;
        String str = "июнь";
    }
        public static float calc (float a, float b, float c, float d){
            return a * (b + (c / d));
        }

        public static boolean sumCheck (int a, int b){
            boolean result = true;
            int sum = a + b;
            if (sum >= 10 && sum <= 20)
                result = true;
            else
                result = false;

            return result;
        }

        public static  void  isPlus (int a){
            String message;
            if (a >= 0)
                message = "Число положительное";
            else
                message = "Число отрицательное";

            System.out.println(message);
        }

        public static  boolean isTrue (int a){
        boolean res;
        if (a >= 0 )
            res = false;
        else
            res = true;
        return res;
        }

        public static void hello (String name){
            System.out.println("Привет, " + name + "!");
        }

        static void findYear ( int year){


        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0)))
            System.out.println(year + " год не високосный");
        else
            System.out.println(year + " год високосный");
            }

//        boolean specialYr;
//            if(year % 4 == 0){
//        if (year % 100 == 0)
//        {
//            if (year % 400 == 0)
//                specialYr = true;
//            else
//                specialYr = false;
//        }
//        else
//            specialYr = true;
    }

