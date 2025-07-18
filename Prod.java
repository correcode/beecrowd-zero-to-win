import java.io.IOException;
import java.util.Scanner;

public class Prod {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores dos produtos : ");
        int produto1 = scanner.nextInt();
        int produto2 = scanner.nextInt();

        int PROD = produto1 * produto2;

        System.out.println("PROD = " + PROD);
        scanner.close();

    }
}
