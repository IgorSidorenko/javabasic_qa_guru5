package com.example;

public class Main {

    char aChar = 's';
    boolean aBoolean = true;
    byte aByte = 16;
    short aShort = 30000;
    int anInt = 657893;
    long aLong = 12345678L;
    float aFloat = 3.24F;
    double aDouble = 12.423434;
    String aString = "Vasya";
    String Two = "Petya";

    System.out.println("Result summary "+aByte +" and "+aByte +" is "+ sum(aByte, aShort));
    System.out.println("Result difference "+aShort +" and "+aByte +" is "+ diff(aShort, aByte));
    System.out.println("Result product "+aShort +" and "+aByte +" is "+ prod(aShort, aByte));
    System.out.println("Result quotient "+aLong +" and "+aShort +" is "+ quot((int) aLong,aShort));
    System.out.println("Result remainder of division "+anInt +" and "+aShort +" is "+ rem(anInt, aShort));
    System.out.println("Result summary with dot "+aFloat +" and "+aDouble +" is "+ sum(aFloat, aDouble));

    System.out.print(aString);

    int amount = 15;
        if (amount > 30)
            System.out.println("Большое количество");
        else {
        if (amount > 10 && amount<=25)
            System.out.println("Cреднее количество");
        else {
            if (amount > 0)
                System.out.println("Мало");
            else
                System.out.println("Ничего нет");
        }
    }

    switch(aString)

    {
        case "Vasya":
            System.out.println("Hi, " + aString);
            break;
        case "Petya":
            System.out.println("Hi, " + aString);
            break;

        int arrayInt[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer array[][][] = new Integer[3][2][1];


        static int sum ( int a, int b){
        return a + b;
    }

        static int diff ( int a, int b){
        return a - b;
    }

        static int prod ( int a, int b){
        return a * b;
    }

        static int quot ( int a, int b){
        return a / b;
    }

        static int rem ( int a, int b){
        return a % b;
    }

        static double sum ( double a, double b){
        return a + b;
    }

    }
