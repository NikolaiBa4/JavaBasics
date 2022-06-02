import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int timeToRead = pages / pagesPerHour;
        int hoursNeed = timeToRead / days;
        System.out.println(hoursNeed);
    }
}
