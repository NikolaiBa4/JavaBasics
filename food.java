import java.util.Scanner;

public class food {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vegetarian = Integer.parseInt(scan.nextLine());
        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;
        double desert = (chickenPrice + fishPrice + vegetarianPrice) * 0.20;
        double total = desert + chickenPrice + fishPrice + vegetarianPrice + 2.50;
        System.out.println(total);

    }
}
