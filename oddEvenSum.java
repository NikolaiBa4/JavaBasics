import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                sum1 += value;
            } else {
                sum2 += value;
            }
        }
        int diff = sum1 - sum2;
        if (sum1 == sum2) {
            System.out.printf("Yes%nSum = %d", sum1);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(diff));
        }
    }
}
