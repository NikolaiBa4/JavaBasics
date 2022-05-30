import java.util.Scanner;

public class oze {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        double pricelWithoutDiscount = area * 7.61 * 1.0;
        double discount = pricelWithoutDiscount * 0.18;
        double totalPrice = pricelWithoutDiscount - discount;
        System.out.println("The final price is :" + " " + totalPrice + " " + "lv.");
        System.out.println("The discount is :" + " " + discount + " " + "lv.");
    }
}


