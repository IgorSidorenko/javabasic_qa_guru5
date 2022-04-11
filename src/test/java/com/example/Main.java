package com.example;

public class Main {

    public static void main(String[] args) {

        char aChar = 's';
        boolean aBoolean = true;
        byte aByte = 16;
        short aShort = 30000;
        int anInt = 657893;
        long aLong = 12345678L;
        float aFloat = 3.24F;
        double aDouble = 12.423434;
        char[][] array = new char[][]{{'w', 'a', 's'}};
        String aString = "Vasya";
        String Two = "Petya";


        System.out.println("Результат сложения aByte и anInt = " + (aByte + anInt));
        System.out.println("Результат вычитания varInt из varByte = " + (aByte - anInt));
        System.out.println("Результат умножения anInt на aLong = " + (anInt * aLong));
        System.out.println("Результат деления aLong на aFloat = " + (aLong / aFloat));
        System.out.println("Результат остатка от деления aLong на aFloat = " + (aLong % aFloat));
        System.out.println("Результат сложения anInt и aString = " + (anInt + aString));
        System.out.print(aString);

        anInt = Integer.MIN_VALUE - 10;
        System.out.println("переполнения int в min сторону " + anInt);
        anInt = Integer.MAX_VALUE + 10;
        System.out.println("переполнения int в max сторону " + anInt);

        int amount = 15;
        if (amount > 30)
            System.out.println("Большое количество");
        else {
            if (amount > 10 && amount <= 25)
                System.out.println("Cреднее количество");
            else {
                if (amount > 0)
                    System.out.println("Мало");
                else
                    System.out.println("Ничего нет");
            }
        }

        switch (aString) {
            case "Vasya":
                System.out.println("Hi, " + aString);
                break;
            case "Petya":
                System.out.println("Hi, " + aString);
                break;
        }


    }
}
