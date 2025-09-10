package opgave07;

import java.util.Scanner;

public class Opgave07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want the reverse number of");
        System.out.println("The reverse of your number is: " + numberReverser(scanner.nextInt()));
    }

    public static int numberReverser(int number) {
        int reversedNumber = 0;
        int i = 0;
        while (0 < number) {
            int currentNumber = number;
            int j = 0;
            while (currentNumber / 10 != 0) {
                currentNumber = currentNumber / 10;
                j++;
            }
            reversedNumber = reversedNumber + (int) (currentNumber * Math.pow(10, i));
            number = (int) (number - currentNumber * Math.pow(10, j));
            i++;

        }
        return reversedNumber;
    }
}