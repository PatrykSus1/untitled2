import java.util.Scanner;

public class ZDDD3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odpowiedz;

        while (true) {
            System.out.print("Wpisz 'Tak' lub 'Nie': ");
            odpowiedz = scanner.nextLine().toLowerCase();

            if (odpowiedz.equals("tak")) {
                System.out.println("Dziękuję za potwierdzenie!");
                break;
            } else if (odpowiedz.equals("nie")) {
                System.out.println("Dziękuję za informację!");
                break;
            } else {
                System.out.println("Proszę wpisać tylko 'Tak' lub 'Nie'.");
            }
        }
    }
}
