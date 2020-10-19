import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String name = reader.readLine();
        int count = 0;

        while (true) {
            if (name.contains("xxx")) {
                name = name.replaceFirst("xxx", "xx");
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
        reader.close();
    }
}
