package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        System.out.println("Tal fra 5 til 20");
        counting();
    }

    public static void counting() {
        int count = 5;
        while (count <= 20) {
            System.out.println(count);
            count++;
        }
    }
}
