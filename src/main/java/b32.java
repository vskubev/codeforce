import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b32 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = reader.readLine();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char c1 = 0;
            if (i < (chars.length - 1)) c1 = chars[i+1];

            if (("" + c + c1).equals("-.")) {
                builder.append("1");
                i++;
            } else if (("" + c + c1).equals("--")) {
                builder.append("2");
                i++;
            } else if (String.valueOf(c).equals(".")) {
                builder.append("0");
            }
        }

        System.out.println(builder);
        reader.close();
    }
}
