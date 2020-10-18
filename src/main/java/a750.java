import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a750 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split("\\s+");
        int tasks = Integer.parseInt(strings[0]);
        int countTime = Integer.parseInt(strings[1]);
        int countTasks = 0;

        while (countTime <= 240) {
            if (countTasks + 1 > tasks) break;
            if (countTime + (5 * (countTasks + 1)) > 240) break;
            countTasks++;
            countTime += ((countTasks) * 5);
        }

        System.out.println(countTasks);
        reader.close();
    }
}
