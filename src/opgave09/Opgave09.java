package opgave09;

import java.util.Scanner;

public class Opgave09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal led til approximering a pi: ");
        int led = scanner.nextInt();
        System.out.println("pi approximeret ved formlen med " + led + " led er: " + approximatePi(led));

    }

    public static double approximatePi(int x) {
        int i = 1;
        double piCoefficiant = 0;
        while (i <= x) {
            piCoefficiant = piCoefficiant + Math.pow((-1), i + 1) / (2 * i - 1);
            i++;
        }

        return 4 * piCoefficiant;
    }
}
