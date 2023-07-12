public class Fließkommazahlen {
    public static void main(String[] args) {
        float x = 1;

        x = x / 10;
        System.out.println("x = " + x);
        if (x == 0.1)
            System.out.println("Gleich!!");
        else
            System.out.println("Sorry, nicht gleich :(");
    }
}
