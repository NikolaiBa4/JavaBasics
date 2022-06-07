import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (max < number) {
                max = number;
            }
        }
        int sumWithoutMax = sum - max;
        if (sumWithoutMax == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            int diff = max - sumWithoutMax;
            System.out.printf("No%nDiff = %d", Math.abs(diff));
        }
    }
}
