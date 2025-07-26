import java.io.IOException;
import java.util.Scanner;

public class SomaDoisValores {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de A e B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);
    }
}
