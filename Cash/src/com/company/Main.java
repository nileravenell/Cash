package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Change owed:");
        double change = input.nextDouble();

        while (change <=0 || change ==(' '))
        {
            System.out.print("Must enter a number higher than 0:");
            change = input.nextDouble();
        }

        int cents = (int) Math.round(change * 100);
        int coinCount= 0;

        while (cents >= 25)
        { coinCount++;
            cents -= 25;
        }
        while (cents >= 10)
        { coinCount++;
            cents -= 10;
        }
        while (cents >= 5)
        { coinCount++;
            cents -= 5;
        }
        while (cents >= 1)
        { coinCount++;
            cents -= 1;
        }

        System.out.println( "You get " + coinCount + " coins.");
    }
}
