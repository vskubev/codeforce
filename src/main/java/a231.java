import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a231 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] answers = reader.readLine().trim().split("\\s+");
            int[] array = Arrays.stream(answers).mapToInt(Integer::parseInt).toArray();
            if (Arrays.stream(array).sum() >= 2) count++;
        }

        System.out.println(count);
    }
}
