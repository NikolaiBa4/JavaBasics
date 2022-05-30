import java.util.Scanner;

public class lihva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int monts = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double interestpermont = deposit * (interest / 100) / 12;
        double total = interestpermont * monts + deposit;
        System.out.println(total);
    }
}
