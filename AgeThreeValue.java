import java.io.IOException;
import java.util.Scanner;

public class AgeThreeValue {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();

        double media = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
        scanner.close();
    }
}
