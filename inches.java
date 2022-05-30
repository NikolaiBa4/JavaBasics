import java.util.Scanner;

public class inches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inches = Double.parseDouble(scan.nextLine());
        double total = inches * 2.54;
        System.out.println(total);
    }
}
