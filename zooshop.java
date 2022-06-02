import java.util.Scanner;

public class zooshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int cats = Integer.parseInt(scan.nextLine());
        double price = (dogs * 2.50) + (cats * 4.0);
        System.out.println(price);
    }
}
