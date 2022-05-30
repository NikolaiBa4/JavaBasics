import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hegth = Integer.parseInt(scan.nextLine());
        int leght = Integer.parseInt(scan.nextLine());
        int weght = Integer.parseInt(scan.nextLine());
        double sand = Double.parseDouble(scan.nextLine());
        double percentSand = sand / 100;
        int allCapacity = hegth * leght * weght;
        double allCapacityInLiters = allCapacity * 0.001;
        double realCapacity = allCapacityInLiters - (allCapacityInLiters * percentSand);
        System.out.println(realCapacity);
    }
}
