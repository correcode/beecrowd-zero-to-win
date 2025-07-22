import java.io.IOException;
import java.util.Scanner;

public class AmountNumber {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numberEmployee = scanner.nextInt();
        double timeWorked = scanner.nextDouble();
        double amountPerHour = scanner.nextDouble();

        double salary = timeWorked * amountPerHour;

        System.out.println("NUMBER = " + numberEmployee);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scanner.close();
    }
}
