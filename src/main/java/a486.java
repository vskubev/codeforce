import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a486 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long result = 0;

        if (n % 2 == 0) result = n / 2;
        else result = - (n / 2 + 1);

        System.out.println(result);

        reader.close();
    }
}
