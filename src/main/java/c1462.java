import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c1462 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] outputArray = new int[size];

        for (int i = 0; i < size; i++) {
            int input = Integer.parseInt(reader.readLine());
            if (0 < input && input < 10) {
                outputArray[i] = input;
            } else {
                String maxValue = "123456789";
                String thisValue = "9";
                for (int j = 8; !thisValue.equals(maxValue); j--) {
                    thisValue = j + thisValue;
                    int sumOfResultChars = thisValue.chars().map(Character::getNumericValue).sum();
                    if (sumOfResultChars >= input) {
                        int thisValueWithoutFirstSymbolSum = thisValue.substring(1).chars().map(Character::getNumericValue).sum();
                        int firstSymbol = input - thisValueWithoutFirstSymbolSum;
                        String result = firstSymbol + "" + thisValue.substring(1);
                        outputArray[i] = Integer.parseInt(result);
                        thisValue = maxValue;
                    }
                }
                if (outputArray[i] == 0) {
                    outputArray[i] = -1;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(outputArray[i]);
        }
        reader.close();
    }
}
