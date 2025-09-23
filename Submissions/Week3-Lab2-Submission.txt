// Lab 02 - Good Old Pizza App (Will Fardig, 9/2/2025)

import java.util.Scanner;

public class week3_lab2 {

    static int clampFunc(int v, int lo, int hi) {
            if (v < lo) {
                System.out.printf("Defaulted to minimum of %s\n", lo);
                return lo;
            }
            if (v > hi) {
                System.out.printf("Defaulted to maximum of %s\n", hi);
                return hi;
            }
            return v;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.07;
        final double DELIVERY_FEE = 3.5;
        final double PRICE_S = 110.00; // don't make us make a small pizza
        final double PRICE_M = 90.00;
        final double PRICE_L = 100.00;
        final double PRICE_TOPP = 1.25;
        final int PIZZA_CLAMP = 10;
        final int TOPP_CLAMP = 7;

        char[] sizeArr = new char[3];
        sizeArr[0] = 'S';
        sizeArr[1] = 'M';
        sizeArr[2] = 'L';

        int[] toppCount = new int[PIZZA_CLAMP - 1];
        double[] pizzaPrice = new double[PIZZA_CLAMP - 1];

        double subtotal, grandtotal;
        int pizzaCount = 0;

        while (true) {
            System.out.println("=== Pizza App for Rich Folks ===\n1) Add Pizza\n2) View Cart\n3) Checkout\n0) Exit :(\nChoose: ");
            int menu = scanner.nextInt();
            if (menu == 0) {break;}
            switch (menu) {
                case 1 -> {
                    if (pizzaCount == PIZZA_CLAMP) {
                        System.out.println("You have the maximum number of pizzas dude, please stop.");
                        break;
                    }
                    System.out.println("Please choose the size of your pizza:\nS): $110\nM) $90\nL) $100\nChoose:");
                    char size = scanner.next().charAt(0);
                    if (size == sizeArr[0] || size == sizeArr[1] || size == sizeArr[2]) {
                        switch (size) {
                            case 'S' -> pizzaPrice[pizzaCount] += PRICE_S;
                            case 'M' -> pizzaPrice[pizzaCount] += PRICE_M;
                            case 'L' -> pizzaPrice[pizzaCount] += PRICE_L;
                        }

                        System.out.println("How many toppings would you like?");
                        toppCount[pizzaCount] = scanner.nextInt();
                        toppCount[pizzaCount] = clampFunc(toppCount[pizzaCount], 0, TOPP_CLAMP);
                        pizzaPrice[pizzaCount] += toppCount[pizzaCount] * PRICE_TOPP;

                        System.out.printf("Pizza with %s toppings added: $%.2f\n", toppCount[pizzaCount], pizzaPrice[pizzaCount]);
                        pizzaCount ++;
                    } else {
                        System.out.println("STOP PLAYING AROUND AND INPUT AN EXISTING SIZE NEXT TIME");
                    }
                }
                case 2 -> {
                    for (int i = 0; i < pizzaCount; i++) {
                        System.out.printf("Pizza %s: $%.2f (%s toppings)\n", i + 1, pizzaPrice[i], toppCount[i]);
                    }
                    subtotal = 0;
                    for (int i = 0; i < pizzaCount; i++) {
                        subtotal += pizzaPrice[i];
                    }
                    System.out.printf("-----------------------\nSubtotal: $%.2f\n", subtotal);
                }
                case 3 -> {
                    subtotal = 0;
                    for (int i = 0; i < pizzaCount; i++) {
                        subtotal += pizzaPrice[i];
                    }
                    grandtotal = subtotal + subtotal * TAX_RATE + DELIVERY_FEE;
                    System.out.printf("Pizza Cost: $%.2f\nDelivery Fee: $%.2f\nTax: $%.2f\n-----------------------\nTotal Price: $%.2f\n", subtotal, DELIVERY_FEE, subtotal * TAX_RATE, grandtotal);
                }
                default -> System.out.println("INPUT SOMETHING THAT'S ON THE MENU BRO!");
            }
        }
    }
        
}