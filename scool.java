import java.util.Scanner;

public class scool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPacets = Integer.parseInt(scanner.nextLine());
        int markerPacets = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double totalWithouthDiscount = penPacets * 5.80 + markerPacets * 7.20 + boardCleaner * 1.20;
        double total = totalWithouthDiscount - (discount / 100) * totalWithouthDiscount;
        System.out.println(total);
    }
}
