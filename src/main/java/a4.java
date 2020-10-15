import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        separateWatermelon(input.nextInt());
    }

    private static void separateWatermelon(int w) {
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");;
        } else {
            System.out.println("NO");
        }
    }
}
