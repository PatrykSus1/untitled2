import java.util.Scanner;

public class ZDDD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.println("Wpisz 'T' 't' 'N' lub 'n': ");
            input = scanner.next().charAt(0);
        } while (input != 'T' && input != 't' && input != 'N' && input != 'n');

        System.out.println("Poprawne dane wejściowe: " + input);
    }
}
