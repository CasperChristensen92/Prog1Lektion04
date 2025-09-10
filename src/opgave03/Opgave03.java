package opgave03;

public class Opgave03 {
    public static void main(String[] args){
        int[] numbersForTabel= {1,2,3,4,5,6,7,8,9,10};
        lilleTabel(numbersForTabel);
    }
    public static void lilleTabel (int[] arrayTal) {
        int counter = 1;
        while (counter <=10){
            for (int tabelNumbers : arrayTal) {
                System.out.print(tabelNumbers * counter + " ");
            }
            System.out.println(" ");
            counter++;
        }
    }

}
