import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int temp = i;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}