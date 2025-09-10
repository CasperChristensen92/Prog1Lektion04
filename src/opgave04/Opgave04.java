package opgave04;

public class Opgave04 {
    public static void main(String[] args){
        System.out.println(powerOf(2, 31));

    }
    public static double powerOf (double number, double power){
        double numberToThePower=number;
        while (0<power){
            numberToThePower=numberToThePower*number;
            power = power -1;
        }
        return numberToThePower;
    }
}
