import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String name2 = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String citi = scan.nextLine();
        System.out.println("You are " + name + " " + name2 + ", a " + age + "-years old person from " + citi + ".");

    }
}
