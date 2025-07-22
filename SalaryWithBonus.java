import java.io.IOException;
import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados totais do usuario: ");
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double salesAmount = scanner.nextDouble();
        double commissionPercent = 0.15;

        double comissionToBeReceive = salesAmount * commissionPercent;
        double totalToReceive = salary + comissionToBeReceive;

        System.out.println("O salario a receber total e de R$ " + totalToReceive);
    }
}
