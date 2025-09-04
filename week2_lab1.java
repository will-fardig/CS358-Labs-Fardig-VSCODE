import java.util.Scanner;

public class week2_lab1 {
    public static void main(String[] args) {
        Scanner whatYouSay = new Scanner(System.in);
        
        // Part A - Echo Input
        System.out.print("Enter something: ");
        String userInput = whatYouSay.nextLine();
        System.out.println("You entered: " + userInput);

        // Part B - Celsius to Fahrenheit Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = whatYouSay.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        
        // Part C - 1 to N Sum Loop
        System.out.print("Enter a positive integer N: ");
        int N = whatYouSay.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        } 
        System.out.print(sum + " is your total cumulative number from 1 to " + N);
    }
}