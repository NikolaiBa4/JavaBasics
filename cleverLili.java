import java.util.Scanner;

public class cleverLili {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceOfLaundry = Double.parseDouble(scan.nextLine());
        int priceOfToys = Integer.parseInt(scan.nextLine());
        int money = 10;
        double sum = 0.0;
        int toysCount = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += money;
                money += 10;
                sum -= 1;
            } else {
                toysCount++;
            }
        }
        sum += toysCount * priceOfToys;
        if (sum >= priceOfLaundry) {
            System.out.printf("Yes! %.2f", sum - priceOfLaundry);
        } else {
            System.out.printf("No! %.2f", priceOfLaundry - sum);
        }
    }
}
