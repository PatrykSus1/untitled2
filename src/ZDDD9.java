import java.util.Scanner;

public class ZDDD9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char kontynuuj;

        do {
            System.out.print("Wprowadź pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Wprowadź drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double suma = liczba1 + liczba2;
            System.out.println("Suma: " + suma);

            System.out.print("Czy chcesz kontynuować (T/N)? ");
            kontynuuj = scanner.next().charAt(0);
        } while (kontynuuj == 'T' || kontynuuj == 't');

        System.out.println("Koniec programu.");
    }
}