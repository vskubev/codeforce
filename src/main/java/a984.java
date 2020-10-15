import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a984 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int midValue;

        reader.readLine();
        String[] strings = reader.readLine().trim().split("\\s+");
        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        if (array.length % 2 != 0) midValue = array[(array.length / 2)];
        else midValue = array[array.length / 2 - 1];

        System.out.println(midValue);
    }
}
