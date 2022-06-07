import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int number = 1; number <= 2 * n; number++) {
            int value = Integer.parseInt(scan.nextLine());
            if (number <= n) {
                sum1 += value;
            } else if (number <= 2 * n) {
                sum2 += value;
            }
        }
        int diff = sum1 - sum2;
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(diff));
        }
    }
}