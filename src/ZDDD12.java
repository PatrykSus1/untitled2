public class ZDDD12 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 30; i++) {
            sum += i / (31.0 - i);
        }
        System.out.println("Suma ciągu wynosi: " + sum);
    }
}
