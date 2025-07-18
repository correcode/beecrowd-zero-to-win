import java.io.IOException;
import java.util.Scanner;

public class CirclePi {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio : \n");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.6f\n", area);
        scanner.close();
    }
}
