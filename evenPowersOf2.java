import java.util.Scanner;

public class evenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int step = 0; step <= n; step += 2) {
            System.out.printf("%.0f%n", Math.pow(2, step));
        }
    }
}
