import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scan.nextLine());
            sum += value;
        }
        System.out.println(sum);
    }
}
