import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a1278 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPairs = Integer.parseInt(reader.readLine());
        List<String> result = new ArrayList<>();
        String hashCode;
        List<String> hashCodeChars;
        int passwordSize;
        List<String> passwordChars;

        for (int j = 0; j < numberOfPairs; j++) {
            result.add("NO");
            passwordChars = Arrays.asList(reader.readLine().split(""));
            hashCode = reader.readLine();
            Collections.sort(passwordChars);
            passwordSize = passwordChars.size();
            for (int i = 0; i <= (hashCode.length() - passwordSize); i++) {
                hashCodeChars = Arrays.asList(hashCode.substring(i, i + passwordSize).split(""));
                Collections.sort(hashCodeChars);
                if (passwordChars.equals(hashCodeChars)) {
                    result.set(j, "YES");
                    break;
                }
            }
        }

        result.forEach(System.out::println);

        reader.close();
    }
}
