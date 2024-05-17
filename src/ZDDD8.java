import java.util.Scanner;

public class ZDDD8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double product = 0.0;

        while (product < 100.0) {
            System.out.print("Wprowadź liczbę: ");
            double liczba = scanner.nextDouble();
            product = liczba * 10.0;
        }

        System.out.println("Wartość produktu przekroczyła 100!");
    }
}