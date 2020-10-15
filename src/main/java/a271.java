import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class a271 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        int year = Integer.parseInt(reader.readLine()) + 1;

        while (true) {
            char[] values = ("" + year).toCharArray();;
            for (char value : values) {
                set.add(value);
            }
            if (set.size() == 4) {
                System.out.println(year);
                return;
            } else {
                set.clear();
                year = ++year;
            }
        }
    }
}
