package com.company;
public class Main {

    public static void main(String[] args1) {
        System.out.println("Hello World!");
        int x = 1 + 1;
        x = x + 1 + 2;
        while( x % 2 != 0)
            x += 1;
        x += 1;



        int x;
        x = 5;
        if (x % 2 == 0)
            x = x + 1;
        else
            x += 2;


        int x = 5;
        x += x % 2 == 0 ? 1 : 2;



        int x = 5;
        switch (x % 2){
            case 0:
                x += 1;
                break;
            default:
                x += 2;
        }


        int x = 1 + 1;
        x = x + 1 + 2;
        while(x % 2 != 0)
            x += 1;
        x += 1;
    }

}

