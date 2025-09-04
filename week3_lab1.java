
// Lab 01 - Campus Utilities Suite (Will Fardig, 9/2/2025)

import java.util.Scanner;

public class week3_lab1 {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        final double TAX_RATE = 0.07;
        final int BOILING_F = 212;
        final int SCORE1 = 100;
        final int SCORE2 = 95;
        final int NUMBER = 2;

        while (true) {
            System.out.println("== CS 358 Utilities ==\n1) Profile\n2) Gross Pay\n3) Checkout\n4) Sphere Calculator\n5) MPG\n0) Exit\nChoose:");
            int menuNav = choose.nextInt();
            if (menuNav == 0) {
                break;
            }
            switch (menuNav) {
                case 1:
                    System.out.print("Please print your first name: ");
                    String fname = choose.nextLine();
                    fname = choose.nextLine();
                    System.out.print("And now print your last name: ");
                    String lname = choose.nextLine();
                    
                    System.out.printf("Full name: %s\nName Length: %s\n", fname.toUpperCase() + lname.toUpperCase(), (fname.length() + lname.length()));
                    System.out.printf("The average of %s and %s is %.2s%n", SCORE1, SCORE2, ((SCORE1 + SCORE2) / 2));
                    System.out.printf("The boiling point of %s Fahrenheit as Celsius is %.2s%n", BOILING_F, ((BOILING_F - 32) * (5/9)));

                    break;

                case 2:
                    System.out.print("Please print the hours worked:");
                    double hours = choose.nextDouble();
                    System.out.print("And now print the rate of pay:");
                    double rate = choose.nextDouble();
                    System.out.printf("Your gross pay is $%.2f%n", (hours <= 40) ? (hours*rate) : (40 * rate + (hours - 40) * 1.5 * rate));
                    break;

                case 3:
                    System.out.print("Please print the item's name:");
                    String item = choose.nextLine();
                    item = choose.nextLine();
                    System.out.print("And now print the item's price:");
                    double price = choose.nextDouble();        
                    System.out.printf("The tax for " + item + " is $%.2f%, coming to a total of $%.2f%n", price * TAX_RATE, price * (TAX_RATE + 1));
                    break;

                case 4:
                    System.out.print("Please print the diameter of your orb:");
                    double diam = choose.nextDouble();
                    System.out.printf("The volume of your orb is %.5f%n", ((4.0/3.0) * 3.1415926 * Math.pow(diam/2, 3)));
                    break;

                case 5:
                    System.out.print("Please print the number of miles: ");
                    double miles = choose.nextDouble();
                    System.out.print("And now print the number of gallons: ");
                    double gallons = choose.nextDouble();
                    if (miles > 0) {
                        System.out.printf("The MPG of your vehicle is %.2f%n", miles/gallons);
                    } else {
                        System.out.print("You must input a positive number of miles!\n");
                    }
                    break;
                    
                default:
                    System.out.println("Please input something that's actually on the menu...");
                    break;
            }
        }  
    }
}