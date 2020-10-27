import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int taskCount = 0;

        int n = Integer.parseInt(reader.readLine());
        String[] strings = reader.readLine().trim().split("\\s+");
        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        for (int i = 0; i < n;) {
            if (array[i] < array[i+1]) {
                while (array[i] < array[i+1]) {
                    array[i] = array[i] + 1;
                    taskCount++;
                }
            } else {
                i+=2;
            }
        }
        System.out.println(taskCount);
        reader.close();
    }
}
