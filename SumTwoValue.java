import java.io.IOException;
import java.util.Scanner;

public class SumTwoValue {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);
        scanner.close();

    }
}
