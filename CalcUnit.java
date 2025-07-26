import java.io.IOException;
import java.util.Scanner;

public class CalcUnit {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros do produto: ");

        int numberProductOne = sc.nextInt();

        int numberProductTwo = sc.nextInt();

        int amountProductOne = sc.nextInt();

        int amountProductTwo = sc.nextInt();

        double unitValueOne = sc.nextDouble();

        double unitValueTwo = sc.nextDouble();

        double amountProductTotalOne = amountProductOne * unitValueOne;

        double amountProductTotalTwo = amountProductTwo * unitValueTwo;

        double amountToBePaid = amountProductTotalOne + amountProductTotalTwo;

        System.out.printf("A PAGAR: R$ %.2f\n", amountToBePaid);
        sc.close();
    }
}
