package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        System.out.println("The sum of all numbers between 2 and 100 is: " + evenNumbers(2, 100));
        System.out.println("The sum of all qubic numbers between 1 and 100 is: " + qubicNumbers(100));
        System.out.println("The sum of all qubic numbers between 1 and 200 is: " + qubicNumbers(200));
    }

    public static int evenNumbers(int startTal, int slutTal) {
        int sum = 0;
        while (startTal <= slutTal) {
            sum += startTal;
            startTal += 2;
        }
        return sum;
    }

    public static int qubicNumbers(int slutTal) {
        int startTal = 0;
        int sumQubicNumbers=0;
        while (Math.pow(startTal,2) < slutTal){
            startTal++;
            sumQubicNumbers += (int) Math.pow(startTal,2);
        }
            return sumQubicNumbers;

    }
}
