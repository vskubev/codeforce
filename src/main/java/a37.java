import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a37 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String[] lengthArray = reader.readLine().split(" ");
        int max = 1, resultMax = 1, numTowers = 1;
        Arrays.parallelSort(lengthArray);

        for (int i = 1; i < number; i++) {
            if (lengthArray[i].equals(lengthArray[i - 1])) {
                max++;
                if (max > resultMax) resultMax = max;
            } else {
                numTowers++;
                if (max > resultMax) resultMax = max;
                max = 1;
            }
        }
        System.out.println(resultMax + " " + numTowers);
        reader.close();
    }
}
