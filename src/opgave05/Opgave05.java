package opgave05;

public class Opgave05 {
    public static void main(String[] args) {
        growingLeft(5);
        growingRight(5);
        decreasingLeft(5);
        decreasingRight(5);

        combinesAsterix(true, true, 5);
        combinesAsterix(false, true, 5);
        combinesAsterix(true, false, 5);
        combinesAsterix(false, false, 5);
    }

    public static void growingLeft(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            for (int j = howMany - i; j < howMany; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void growingRight(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            for (int j = i; j < howMany; j++) {
                System.out.print(" ");
            }
            for (int j = i; 0 < j; j = j - 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void decreasingLeft(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            for (int j = i - 1; j < howMany; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void decreasingRight(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            for (int j = howMany + 1 - i; j < howMany; j++) {
                System.out.print(" ");
            }
            for (int j = howMany + 1 - i; 0 < j; j = j - 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void combinesAsterix(boolean isLeft, boolean isGrowing, int howMany) {
        if (isLeft) {
            if (isGrowing) {
                growingLeft(howMany);
            } else {
                decreasingLeft(howMany);

            }
        } else {
            if (isGrowing) {
                growingRight(howMany);
            } else {
                decreasingRight(howMany);
            }
        }
    }

}
