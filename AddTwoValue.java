import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoValue {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int A, B, X;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());

        X = A + B;

        System.out.printf("X = %d\n", X);
    }

}
