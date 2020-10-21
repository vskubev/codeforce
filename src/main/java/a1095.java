import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String encryptString = reader.readLine();
        StringBuilder result = new StringBuilder();
        int symbols = 0, sum = 0;

        for (int i = 1; sum < n; i++) {
            symbols++;
            sum+= i;
        }

        for (; symbols > 0; symbols--) {
            result.append(encryptString, n - 1, n);
            n = n - symbols;
        }

        result.reverse();
        System.out.println(result);
        reader.close();
    }
}
