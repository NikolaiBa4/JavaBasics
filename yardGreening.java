import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double priceWithoutDiscount = area * 7.61;
        double discount = priceWithoutDiscount * 0.18;
        double finalPrice = priceWithoutDiscount - discount;
        System.out.println("The final price is:" + " " + finalPrice + " " + "lv.");
        System.out.println(" The discount is:" + " " + discount + " " + "lv.");
    }
}
