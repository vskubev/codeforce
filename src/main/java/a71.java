import java.util.Scanner;

public class a71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            func(input.next());
        }
    }

    public static void func(String s) {
        if (s.length() < 11) {
            System.out.println(s);
        } else {
            char[] chars = s.toCharArray();
            System.out.println(chars[0] + String.valueOf(s.length() - 2) + chars[s.length() - 1]);
        }
    }
}
