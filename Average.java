import java.io.IOException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = ((3.5 * nota1) + (7.5 * nota2) / 11);

        System.out.printf("MEDIA = %.5f\n", media);
        sc.close();
    }
}
