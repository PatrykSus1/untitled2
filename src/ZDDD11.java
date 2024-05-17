import java.util.Scanner;

public class ZDDD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Wprowadź liczbę: ");
            double liczba = scanner.nextDouble();
            suma += liczba;
        }

        System.out.println("Suma wprowadzonych liczb: " + suma);
    }
}