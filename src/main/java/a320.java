import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1,14,144
//900
public class a320 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String output = input.replaceAll("144", "a")
                .replaceAll("14", "a")
                .replaceAll("1", "a")
                .replaceAll("a", "");
        String result = output.isEmpty() ? "YES" : "NO";
        System.out.println(result);
        reader.close();
    }
}