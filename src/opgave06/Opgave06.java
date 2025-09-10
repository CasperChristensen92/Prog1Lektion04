package opgave06;

import java.util.Scanner;

public class Opgave06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want the digit sum of");
        System.out.println("The digitsum of your number is: " + digitSum(scanner.nextInt()));
    }

    public static int digitSum(int number) {
        int sum = 0;
        while (0 < number) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
