import java.util.Scanner;

public class arhittekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int hours = projects * 3;
        System.out.println("The architect " + name + " will need" + " " + hours + " " + "hours to complete" + " " + projects + " project/s.");
    }
}
