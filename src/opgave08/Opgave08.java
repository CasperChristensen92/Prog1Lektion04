package opgave08;

import opgave07.Opgave07;

import java.util.Scanner;

public class Opgave08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal = scanner.nextInt();
        pallidromNumber(tal);


    }

    public static void pallidromNumber(int x) {
        int xReversed = Opgave07.numberReverser(x);
        if (xReversed == x) {
            System.out.println("Congratulations! " + x + " is a Pallidrom number");
        } else System.out.println(x + " is not a Pallidron number since " + x + " is not the same as " + xReversed);
    }
}
