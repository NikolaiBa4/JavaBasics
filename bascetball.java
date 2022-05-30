import java.util.Scanner;

public class bascetball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fee = Integer.parseInt(scan.nextLine());
        double snikers = fee - (fee * 0.40);
        double suit = snikers - (snikers * 0.20);
        double ball = suit / 4;
        double acsesoaries = ball / 5;
        System.out.println(snikers + suit + ball + acsesoaries + fee);

    }
}
