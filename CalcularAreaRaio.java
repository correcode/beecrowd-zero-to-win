import java.io.IOException;
import java.util.Scanner;

public class CalcularAreaRaio {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Area para calculo: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f", area);
    }
}
